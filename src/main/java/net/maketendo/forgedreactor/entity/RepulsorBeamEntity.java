
package net.maketendo.forgedreactor.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.maketendo.forgedreactor.procedures.RepulsorBeamWhileProjectileFlyingTickProcedure;
import net.maketendo.forgedreactor.procedures.RepulsorBeamProjectileHitsPlayerProcedure;
import net.maketendo.forgedreactor.procedures.RepulsorBeamProjectileHitsLivingEntityProcedure;
import net.maketendo.forgedreactor.init.ForgedReactorModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class RepulsorBeamEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Blocks.AIR);

	public RepulsorBeamEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(ForgedReactorModEntities.REPULSOR_BEAM.get(), world);
	}

	public RepulsorBeamEntity(EntityType<? extends RepulsorBeamEntity> type, Level world) {
		super(type, world);
	}

	public RepulsorBeamEntity(EntityType<? extends RepulsorBeamEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public RepulsorBeamEntity(EntityType<? extends RepulsorBeamEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		RepulsorBeamProjectileHitsPlayerProcedure.execute(this.level(), entity);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		RepulsorBeamProjectileHitsLivingEntityProcedure.execute(this.level(), entityHitResult.getEntity());
	}

	@Override
	public void tick() {
		super.tick();
		RepulsorBeamWhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static RepulsorBeamEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 10f, 0, 2);
	}

	public static RepulsorBeamEntity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 10f, 0, 2);
	}

	public static RepulsorBeamEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		RepulsorBeamEntity entityarrow = new RepulsorBeamEntity(ForgedReactorModEntities.REPULSOR_BEAM.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static RepulsorBeamEntity shoot(LivingEntity entity, LivingEntity target) {
		RepulsorBeamEntity entityarrow = new RepulsorBeamEntity(ForgedReactorModEntities.REPULSOR_BEAM.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 10f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0);
		entityarrow.setKnockback(2);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
