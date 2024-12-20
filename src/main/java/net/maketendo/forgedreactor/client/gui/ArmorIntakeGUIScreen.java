package net.maketendo.forgedreactor.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.maketendo.forgedreactor.world.inventory.ArmorIntakeGUIMenu;
import net.maketendo.forgedreactor.procedures.PlayerHUDRendererProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ArmorIntakeGUIScreen extends AbstractContainerScreen<ArmorIntakeGUIMenu> {
	private final static HashMap<String, Object> guistate = ArmorIntakeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();

	public ArmorIntakeGUIScreen(ArmorIntakeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 185;
	}

	private static final ResourceLocation texture = new ResourceLocation("forged_reactor:textures/screens/armor_intake_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (PlayerHUDRendererProcedure.execute(entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 51, this.topPos + 86, 30, 0f + (float) Math.atan((this.leftPos + 51 - mouseX) / 40.0), (float) Math.atan((this.topPos + 37 - mouseY) / 40.0), livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("forged_reactor:textures/screens/armor_intake_gui_overlay.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 185, 176, 185);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.forged_reactor.armor_intake_gui.label_armor_intake"), 5, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
