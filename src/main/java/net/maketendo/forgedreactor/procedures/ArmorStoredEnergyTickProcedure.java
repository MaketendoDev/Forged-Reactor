package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class ArmorStoredEnergyTickProcedure {
	public static void execute(ItemStack itemstack) {
		String power = "";
		String maxPower = "";
		itemstack.getOrCreateTag().putDouble("maxPower", 3600);
		if (itemstack.is(ItemTags.create(new ResourceLocation("ironman:enableenergy")))) {
			if (itemstack.getOrCreateTag().getDouble("power") > 0) {
				itemstack.getOrCreateTag().putDouble("power", (itemstack.getOrCreateTag().getDouble("power") - 1));
			}
		}
	}
}
