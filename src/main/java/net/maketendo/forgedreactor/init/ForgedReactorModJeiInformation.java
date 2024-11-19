
package net.maketendo.forgedreactor.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class ForgedReactorModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("forged_reactor:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(ForgedReactorModItems.MK_1_IRON_ARMOR_HELMET.get()), new ItemStack(ForgedReactorModItems.MK_1_IRON_ARMOR_CHESTPLATE.get()),
				new ItemStack(ForgedReactorModItems.MK_1_IRON_ARMOR_LEGGINGS.get()), new ItemStack(ForgedReactorModItems.MK_1_IRON_ARMOR_BOOTS.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.forged_reactor.mk_1_armor_information"));
		registration.addIngredientInfo(List.of(new ItemStack(ForgedReactorModItems.MK_2_IRON_ARMOR_HELMET.get()), new ItemStack(ForgedReactorModItems.MK_2_IRON_ARMOR_CHESTPLATE.get()),
				new ItemStack(ForgedReactorModItems.MK_2_IRON_ARMOR_LEGGINGS.get()), new ItemStack(ForgedReactorModItems.MK_2_IRON_ARMOR_BOOTS.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.forged_reactor.mk_2_armor_information"));
		registration.addIngredientInfo(List.of(new ItemStack(ForgedReactorModItems.MK_3_IRON_ARMOR_HELMET.get()), new ItemStack(ForgedReactorModItems.MK_3_IRON_ARMOR_CHESTPLATE.get()),
				new ItemStack(ForgedReactorModItems.MK_3_IRON_ARMOR_LEGGINGS.get()), new ItemStack(ForgedReactorModItems.MK_3_IRON_ARMOR_BOOTS.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.forged_reactor.mk_3_armor_information"));
	}
}
