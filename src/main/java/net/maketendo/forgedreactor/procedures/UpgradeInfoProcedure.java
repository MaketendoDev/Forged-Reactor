package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import net.maketendo.forgedreactor.init.ForgedReactorModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class UpgradeInfoProcedure {
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
		if (itemstack.getItem() == ForgedReactorModItems.UPGRADE_TEMPLATE.get()) {
			if (!Screen.hasShiftDown()) {
				tooltip.add(Component.literal("Press Shift for more information"));
			}
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("The Upgrade Template Item is your"));
				tooltip.add(Component.literal("gateway to upgrade your very own"));
				tooltip.add(Component.literal("Iron Armor to it's full potential!"));
			}
		}
	}
}
