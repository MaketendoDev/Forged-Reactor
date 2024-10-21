package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.maketendo.forgedreactor.init.ForgedReactorModItems;
import net.maketendo.forgedreactor.ForgedReactorMod;

import java.util.function.Supplier;
import java.util.Map;

public class UpgradingToMk6RecipeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity armor_stand = null;
		if ((GetArmorStandReturnProcedure.execute(world, x, y, z) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_5_IRON_ARMOR_BOOTS.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == ForgedReactorModItems.PALLADIUM_INGOT
					.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_BOOTS) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
								.getItem() == ForgedReactorModItems.UPGRADE_TEMPLATE.get()) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(0)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(1)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(2)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(3)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							{
								Entity _entity = GetArmorStandReturnProcedure.execute(world, x, y, z);
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
								}
							}
							ForgedReactorMod.queueServerWork(1, () -> {
								{
									Entity _entity = GetArmorStandReturnProcedure.execute(world, x, y, z);
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(0, new ItemStack(ForgedReactorModItems.MK_6_IRON_ARMOR_BOOTS.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ForgedReactorModItems.MK_6_IRON_ARMOR_BOOTS.get()));
									}
								}
								FinishRepairingProcedure.execute(world, x, y, z);
								if (entity instanceof Player _player)
									_player.closeContainer();
							});
						}
					}
				}
			}
		}
		if ((GetArmorStandReturnProcedure.execute(world, x, y, z) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_5_IRON_ARMOR_LEGGINGS.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == ForgedReactorModItems.PALLADIUM_INGOT
					.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_LEGGINGS) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
								.getItem() == ForgedReactorModItems.UPGRADE_TEMPLATE.get()) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(0)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(1)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(2)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(3)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							{
								Entity _entity = GetArmorStandReturnProcedure.execute(world, x, y, z);
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
								}
							}
							ForgedReactorMod.queueServerWork(1, () -> {
								{
									Entity _entity = GetArmorStandReturnProcedure.execute(world, x, y, z);
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(1, new ItemStack(ForgedReactorModItems.MK_6_IRON_ARMOR_LEGGINGS.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(ForgedReactorModItems.MK_6_IRON_ARMOR_LEGGINGS.get()));
									}
								}
								FinishRepairingProcedure.execute(world, x, y, z);
								if (entity instanceof Player _player)
									_player.closeContainer();
							});
						}
					}
				}
			}
		}
		if ((GetArmorStandReturnProcedure.execute(world, x, y, z) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_5_IRON_ARMOR_CHESTPLATE.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == ForgedReactorModItems.PALLADIUM_INGOT
					.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_CHESTPLATE) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
								.getItem() == ForgedReactorModItems.UPGRADE_TEMPLATE.get()) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(0)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(1)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(2)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(3)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							{
								Entity _entity = GetArmorStandReturnProcedure.execute(world, x, y, z);
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(2, new ItemStack(Blocks.AIR));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Blocks.AIR));
								}
							}
							ForgedReactorMod.queueServerWork(1, () -> {
								{
									Entity _entity = GetArmorStandReturnProcedure.execute(world, x, y, z);
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(2, new ItemStack(ForgedReactorModItems.MK_6_IRON_ARMOR_CHESTPLATE.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(ForgedReactorModItems.MK_6_IRON_ARMOR_CHESTPLATE.get()));
									}
								}
								FinishRepairingProcedure.execute(world, x, y, z);
								if (entity instanceof Player _player)
									_player.closeContainer();
							});
						}
					}
				}
			}
		}
		if ((GetArmorStandReturnProcedure.execute(world, x, y, z) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_5_IRON_ARMOR_HELMET.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == ForgedReactorModItems.PALLADIUM_INGOT
					.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_HELMET) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
								.getItem() == ForgedReactorModItems.UPGRADE_TEMPLATE.get()) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(0)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(1)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(2)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(3)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							{
								Entity _entity = GetArmorStandReturnProcedure.execute(world, x, y, z);
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
								}
							}
							ForgedReactorMod.queueServerWork(1, () -> {
								{
									Entity _entity = GetArmorStandReturnProcedure.execute(world, x, y, z);
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(3, new ItemStack(ForgedReactorModItems.MK_6_IRON_ARMOR_HELMET.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(ForgedReactorModItems.MK_6_IRON_ARMOR_HELMET.get()));
									}
								}
								FinishRepairingProcedure.execute(world, x, y, z);
								if (entity instanceof Player _player)
									_player.closeContainer();
							});
						}
					}
				}
			}
		}
	}
}
