package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class DisplayStoredEnergyTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		String power = "";
		String maxPower = "";
		if (itemstack.is(ItemTags.create(new ResourceLocation("ironman:enableenergy")))) {
			power = "" + itemstack.getOrCreateTag().getDouble("power");
			maxPower = "" + itemstack.getOrCreateTag().getDouble("maxPower");
			power = power.replace(".0", "");
			maxPower = maxPower.replace(".0", "");
			if (itemstack.getOrCreateTag().getDouble("power") >= (itemstack.getOrCreateTag().getDouble("maxPower") / 3) * 2) {
				tooltip.add(Component.literal(("SE: (" + power + " / " + maxPower + ")")));
			} else if (itemstack.getOrCreateTag().getDouble("power") >= itemstack.getOrCreateTag().getDouble("maxPower") / 3) {
				tooltip.add(Component.literal(("SE: (" + power + " / " + maxPower + ")")));
			} else {
				tooltip.add(Component.literal(("SE: (" + power + " / " + maxPower + ")")));
			}
		}
	}
}
