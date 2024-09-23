
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.maketendo.forgedreactor.ForgedReactorMod;

public class ForgedReactorModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForgedReactorMod.MODID);
	public static final RegistryObject<CreativeModeTab> IRON_ARMOR_TAB = REGISTRY.register("iron_armor_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.forged_reactor.iron_armor_tab")).icon(() -> new ItemStack(Items.IRON_HELMET)).displayItems((parameters, tabData) -> {
				tabData.accept(ForgedReactorModItems.MK_1_IRON_ARMOR_HELMET.get());
				tabData.accept(ForgedReactorModItems.MK_1_IRON_ARMOR_CHESTPLATE.get());
				tabData.accept(ForgedReactorModItems.MK_1_IRON_ARMOR_LEGGINGS.get());
				tabData.accept(ForgedReactorModItems.MK_1_IRON_ARMOR_BOOTS.get());
				tabData.accept(ForgedReactorModItems.MK_2_IRON_ARMOR_HELMET.get());
				tabData.accept(ForgedReactorModItems.MK_2_IRON_ARMOR_CHESTPLATE.get());
				tabData.accept(ForgedReactorModItems.MK_2_IRON_ARMOR_LEGGINGS.get());
				tabData.accept(ForgedReactorModItems.MK_2_IRON_ARMOR_BOOTS.get());
				tabData.accept(ForgedReactorModItems.MK_3_IRON_ARMOR_HELMET.get());
				tabData.accept(ForgedReactorModItems.MK_3_IRON_ARMOR_CHESTPLATE.get());
				tabData.accept(ForgedReactorModItems.MK_3_IRON_ARMOR_LEGGINGS.get());
				tabData.accept(ForgedReactorModItems.MK_3_IRON_ARMOR_BOOTS.get());
				tabData.accept(ForgedReactorModItems.FLIGHT_TEST_ARMOR_CHESTPLATE.get());
				tabData.accept(ForgedReactorModItems.FLIGHT_TEST_ARMOR_BOOTS.get());
				tabData.accept(ForgedReactorModItems.MK_1_IRON_ARMOR_HELMET_OPEN_HELMET.get());
			}).withSearchBar().build());
}
