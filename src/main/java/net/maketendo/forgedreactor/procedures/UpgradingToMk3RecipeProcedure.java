package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.maketendo.forgedreactor.init.ForgedReactorModItems;
import net.maketendo.forgedreactor.ForgedReactorMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class UpgradingToMk3RecipeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity armor_stand = null;
		{
			final Vec3 _center = new Vec3(x, (y + 1), z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ArmorStand) {
					armor_stand = entityiterator;
				}
			}
		}
		if ((armor_stand instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_2_IRON_ARMOR_BOOTS.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.RED_DYE) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.GOLD_INGOT) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == ForgedReactorModItems.BATTERY
							.get()) {
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
								Entity _entity = entity;
								if (_entity instanceof Player _player) {
									_player.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
									_player.getInventory().setChanged();
								} else if (_entity instanceof LivingEntity _living) {
									_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
								}
							}
							ForgedReactorMod.queueServerWork(2, () -> {
								{
									Entity _entity = entity;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(0, new ItemStack(ForgedReactorModItems.MK_3_IRON_ARMOR_BOOTS.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(ForgedReactorModItems.MK_3_IRON_ARMOR_BOOTS.get()));
									}
								}
							});
						}
					}
				}
			}
		}
	}
}
