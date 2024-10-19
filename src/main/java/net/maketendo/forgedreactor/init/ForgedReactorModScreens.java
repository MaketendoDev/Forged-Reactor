
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.maketendo.forgedreactor.client.gui.ArmorIntakeGUIScreen;
import net.maketendo.forgedreactor.client.gui.ArmorConfiguratorGUIScreen;
import net.maketendo.forgedreactor.client.gui.ArmorConfiguratorGUINoArmorStandScreen;
import net.maketendo.forgedreactor.client.gui.ArmorConfiguratorGUIArmorUpgradePageScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgedReactorModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ForgedReactorModMenus.ARMOR_INTAKE_GUI.get(), ArmorIntakeGUIScreen::new);
			MenuScreens.register(ForgedReactorModMenus.ARMOR_CONFIGURATOR_GUI.get(), ArmorConfiguratorGUIScreen::new);
			MenuScreens.register(ForgedReactorModMenus.ARMOR_CONFIGURATOR_GUI_NO_ARMOR_STAND.get(), ArmorConfiguratorGUINoArmorStandScreen::new);
			MenuScreens.register(ForgedReactorModMenus.ARMOR_CONFIGURATOR_GUI_ARMOR_UPGRADE_PAGE.get(), ArmorConfiguratorGUIArmorUpgradePageScreen::new);
		});
	}
}
