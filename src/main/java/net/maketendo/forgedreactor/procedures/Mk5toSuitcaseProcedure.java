package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
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
import net.maketendo.forgedreactor.ForgedReactorMod;

public class Mk5toSuitcaseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randomtimer = 0;
		ForgedReactorMod.queueServerWork(20, () -> {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_5_IRON_ARMOR_BOOTS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_5_IRON_ARMOR_LEGGINGS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_5_IRON_ARMOR_CHESTPLATE.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_5_IRON_ARMOR_HELMET.get()) {
				ForgedReactorMod.queueServerWork(10, () -> {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.open")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.open")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2, false);
						}
					}
					ForgedReactorMod.queueServerWork(5, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.piston.contract")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.piston.contract")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2, false);
							}
						}
						ForgedReactorMod.queueServerWork(2, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.redstone_torch.burnout")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.redstone_torch.burnout")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2, false);
								}
							}
						});
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2, false);
							}
						}
						ForgedReactorMod.queueServerWork(5, () -> {
							ForgedReactorMod.queueServerWork(5, () -> {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.open")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.open")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2, false);
									}
								}
							});
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.piston.extend")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.piston.extend")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2, false);
								}
							}
						});
					});
					ForgedReactorMod.queueServerWork(10, () -> {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.close")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.close")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2, false);
							}
						}
						ForgedReactorMod.queueServerWork(10, () -> {
							{
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.close")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.close")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2, false);
								}
							}
							ForgedReactorMod.queueServerWork(10, () -> {
								{
									Entity _entity = entity;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(2, new ItemStack(Blocks.AIR));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Blocks.AIR));
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.close")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.close")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2, false);
									}
								}
								ForgedReactorMod.queueServerWork(5, () -> {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(ForgedReactorModItems.MK_5_SUITCASE.get()).copy();
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.open")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.open")), SoundSource.NEUTRAL, (float) 0.2, (float) 0.2, false);
										}
									}
								});
							});
						});
					});
				});
			} else {
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
		});
	}
}
