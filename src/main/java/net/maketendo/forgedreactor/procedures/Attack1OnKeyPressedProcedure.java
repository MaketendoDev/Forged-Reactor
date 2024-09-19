package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.maketendo.forgedreactor.init.ForgedReactorModItems;

public class Attack1OnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_1_IRON_ARMOR_HELMET.get()) {
			for (int index0 = 0; index0 < 20; index0++) {
				entity.setDeltaMovement(new Vec3(0, 50, 0));
			}
		}
	}
}
