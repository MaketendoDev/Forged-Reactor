
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

public class ArmorConfiguratorTypeRecipeCategory implements IRecipeCategory<ArmorConfiguratorTypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("forged_reactor", "armor_configurator_type");
	public final static ResourceLocation TEXTURE = new ResourceLocation("forged_reactor", "textures/screens/jei_armor_config.png");
	private final IDrawable background;
	private final IDrawable icon;

	public ArmorConfiguratorTypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 58, 27);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ForgedReactorModItems.MK_3_IRON_ARMOR_HELMET.get()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<ArmorConfiguratorTypeRecipe> getRecipeType() {
		return ForgedReactorModJeiPlugin.ArmorConfiguratorType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Armor Configurator");
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
	public void setRecipe(IRecipeLayoutBuilder builder, ArmorConfiguratorTypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 2, 0).addIngredients(recipe.getIngredients().get(0));
	}
}
