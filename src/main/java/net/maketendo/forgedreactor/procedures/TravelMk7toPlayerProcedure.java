package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.forgedreactor.init.ForgedReactorModItems;
import net.maketendo.forgedreactor.ForgedReactorMod;

import java.util.List;
import java.util.Comparator;

public class TravelMk7toPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean armorequiped = false;
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tp @s ~ ~ ~ facing entity @e[tag=sum,limit=1]");
			}
		}
		entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.9), (entity.getLookAngle().y * 0.9), (entity.getLookAngle().z * 0.9)));
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
					{
						Entity _ent = entity;
						_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
					}
					if ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
							&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
							&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
							&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
						ForgedReactorMod.queueServerWork(20, () -> {
							{
								Entity _entity = entityiterator;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(2, new ItemStack(ForgedReactorModItems.MK_7_IRON_ARMOR_CHESTPLATE.get()));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ForgedReactorModItems.MK_7_IRON_ARMOR_CHESTPLATE.get()));
								}
							}
							ForgedReactorMod.queueServerWork(20, () -> {
								{
									Entity _entity = entityiterator;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(1, new ItemStack(ForgedReactorModItems.MK_7_IRON_ARMOR_LEGGINGS.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ForgedReactorModItems.MK_7_IRON_ARMOR_LEGGINGS.get()));
									}
								}
								{
									Entity _entity = entityiterator;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(0, new ItemStack(ForgedReactorModItems.MK_7_IRON_ARMOR_BOOTS.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ForgedReactorModItems.MK_7_IRON_ARMOR_BOOTS.get()));
									}
								}
								ForgedReactorMod.queueServerWork(10, () -> {
									{
										Entity _entity = entityiterator;
										if (_entity instanceof Player _player) {
											_player.getInventory().armor.set(3, new ItemStack(ForgedReactorModItems.MK_7_IRON_ARMOR_HELMET.get()));
											_player.getInventory().setChanged();
										} else if (_entity instanceof LivingEntity _living) {
											_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ForgedReactorModItems.MK_7_IRON_ARMOR_HELMET.get()));
										}
									}
								});
							});
						});
					} else {
						if (!entity.level().isClientSide())
							entity.discard();
					}
					ForgedReactorMod.queueServerWork(50, () -> {
						if (!entity.level().isClientSide())
							entity.discard();
					});
				}
			}
		}
	}
}
