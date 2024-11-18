
package net.maketendo.forgedreactor.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.maketendo.forgedreactor.init.ForgedReactorModJeiPlugin;
import net.maketendo.forgedreactor.init.ForgedReactorModItems;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class UpgradeConfiguratorTypeRecipeCategory implements IRecipeCategory<UpgradeConfiguratorTypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("forged_reactor", "upgrade_configurator_type");
	public final static ResourceLocation TEXTURE = new ResourceLocation("forged_reactor", "textures/screens/armor_config_overlay.png");
	private final IDrawable background;
	private final IDrawable icon;

	public UpgradeConfiguratorTypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 166);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ForgedReactorModItems.MK_3_IRON_ARMOR_HELMET.get()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<UpgradeConfiguratorTypeRecipe> getRecipeType() {
		return ForgedReactorModJeiPlugin.UpgradeConfiguratorType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Upgrade Configurator Type");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, UpgradeConfiguratorTypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 7, 19).addIngredients(recipe.getIngredients().get(0));
	}
}
