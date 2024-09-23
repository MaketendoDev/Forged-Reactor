package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.maketendo.forgedreactor.init.ForgedReactorModParticleTypes;
import net.maketendo.forgedreactor.init.ForgedReactorModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RandomSparkTimerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randomtimer = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.FLIGHT_TEST_ARMOR_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.FLIGHT_TEST_ARMOR_BOOTS.get()) {
			if (entity.getPersistentData().getDouble("SparkTimer") == 0) {
				randomtimer = Mth.nextInt(RandomSource.create(), 0, 200);
				entity.getPersistentData().putDouble("SparkTimer", randomtimer);
			} else {
				entity.getPersistentData().putDouble("SparkTimer", (entity.getPersistentData().getDouble("SparkTimer") - 1));
			}
			if (entity.getPersistentData().getDouble("SparkTimer") == 0) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ForgedReactorModParticleTypes.ELECTRICITY_SPARK.get()), (x + Mth.nextInt(RandomSource.create(), (int) (-0.5), (int) 0.5)), (y + Mth.nextInt(RandomSource.create(), (int) 0.1, 1)),
							(z + Mth.nextInt(RandomSource.create(), (int) (-0.5), (int) 0.5)), Mth.nextInt(RandomSource.create(), 1, 7), 0, 0, 0, 0.2);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forged_reactor:flighttest_armor_spark")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forged_reactor:flighttest_armor_spark")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5, false);
					}
				}
			}
		}
	}
}
