package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

public class Mk5OverlayDisplayOverlayInGameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		double e = 0;
		String power = "";
		String maxPower = "";
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("ironman:enableenergy")))) {
			if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("power") == 0)) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("ironman:enablemk5ironhud")))) {
					if (Minecraft.getInstance().options.getCameraType().isFirstPerson()) {
						return true;
					}
				}
			}
		} else {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("ironman:enablemk5ironhud")))) {
				if (Minecraft.getInstance().options.getCameraType().isFirstPerson()) {
					return true;
				}
			}
		}
		return false;
	}
}
