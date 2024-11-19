
package net.maketendo.forgedreactor.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.maketendo.forgedreactor.jei_recipes.ArmorConfiguratorTypeRecipeCategory;
import net.maketendo.forgedreactor.jei_recipes.ArmorConfiguratorTypeRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class ForgedReactorModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<ArmorConfiguratorTypeRecipe> ArmorConfiguratorType_Type = new mezz.jei.api.recipe.RecipeType<>(ArmorConfiguratorTypeRecipeCategory.UID, ArmorConfiguratorTypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("forged_reactor:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new ArmorConfiguratorTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<ArmorConfiguratorTypeRecipe> ArmorConfiguratorTypeRecipes = recipeManager.getAllRecipesFor(ArmorConfiguratorTypeRecipe.Type.INSTANCE);
		registration.addRecipes(ArmorConfiguratorType_Type, ArmorConfiguratorTypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(ForgedReactorModBlocks.ARMOR_CONFIGURATOR.get().asItem()), ArmorConfiguratorType_Type);
	}
}
