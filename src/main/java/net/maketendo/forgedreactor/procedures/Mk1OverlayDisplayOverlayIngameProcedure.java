package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

import net.maketendo.forgedreactor.init.ForgedReactorModItems;

public class Mk1OverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_1_IRON_ARMOR_HELMET.get()) {
			if (Minecraft.getInstance().options.getCameraType().isFirstPerson()) {
				return true;
			}
		}
		return false;
	}
}
