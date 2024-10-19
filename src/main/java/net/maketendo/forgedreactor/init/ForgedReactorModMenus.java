
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.maketendo.forgedreactor.world.inventory.ArmorIntakeGUIMenu;
import net.maketendo.forgedreactor.world.inventory.ArmorConfiguratorGUIMenu;
import net.maketendo.forgedreactor.ForgedReactorMod;

public class ForgedReactorModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ForgedReactorMod.MODID);
	public static final RegistryObject<MenuType<ArmorIntakeGUIMenu>> ARMOR_INTAKE_GUI = REGISTRY.register("armor_intake_gui", () -> IForgeMenuType.create(ArmorIntakeGUIMenu::new));
	public static final RegistryObject<MenuType<ArmorConfiguratorGUIMenu>> ARMOR_CONFIGURATOR_GUI = REGISTRY.register("armor_configurator_gui", () -> IForgeMenuType.create(ArmorConfiguratorGUIMenu::new));
}
