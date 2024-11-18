
package net.maketendo.forgedreactor.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.maketendo.forgedreactor.jei_recipes.UpgradeConfiguratorTypeRecipeCategory;
import net.maketendo.forgedreactor.jei_recipes.UpgradeConfiguratorTypeRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class ForgedReactorModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<UpgradeConfiguratorTypeRecipe> UpgradeConfiguratorType_Type = new mezz.jei.api.recipe.RecipeType<>(UpgradeConfiguratorTypeRecipeCategory.UID, UpgradeConfiguratorTypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("forged_reactor:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new UpgradeConfiguratorTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<UpgradeConfiguratorTypeRecipe> UpgradeConfiguratorTypeRecipes = recipeManager.getAllRecipesFor(UpgradeConfiguratorTypeRecipe.Type.INSTANCE);
		registration.addRecipes(UpgradeConfiguratorType_Type, UpgradeConfiguratorTypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
	}
}
