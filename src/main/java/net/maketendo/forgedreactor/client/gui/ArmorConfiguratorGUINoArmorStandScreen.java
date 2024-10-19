package net.maketendo.forgedreactor.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.maketendo.forgedreactor.world.inventory.ArmorConfiguratorGUINoArmorStandMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ArmorConfiguratorGUINoArmorStandScreen extends AbstractContainerScreen<ArmorConfiguratorGUINoArmorStandMenu> {
	private final static HashMap<String, Object> guistate = ArmorConfiguratorGUINoArmorStandMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_armor_configurator_gui_overlay;

	public ArmorConfiguratorGUINoArmorStandScreen(ArmorConfiguratorGUINoArmorStandMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("forged_reactor:textures/screens/armor_configurator_gui_no_armor_stand.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.forged_reactor.armor_configurator_gui_no_armor_stand.label_armor_configurator"), 18, 44, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.forged_reactor.armor_configurator_gui_no_armor_stand.label_only_work_if_a_armor_stand_is"), 12, 54, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.forged_reactor.armor_configurator_gui_no_armor_stand.label_on_top_of_the_block"), 37, 65, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.forged_reactor.armor_configurator_gui_no_armor_stand.label_armor_configurator1"), 5, 5, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_armor_configurator_gui_overlay = new ImageButton(this.leftPos + 0, this.topPos + 0, 176, 166, 0, 0, 166, new ResourceLocation("forged_reactor:textures/screens/atlas/imagebutton_armor_configurator_gui_overlay.png"), 176, 332,
				e -> {
				});
		guistate.put("button:imagebutton_armor_configurator_gui_overlay", imagebutton_armor_configurator_gui_overlay);
		this.addRenderableWidget(imagebutton_armor_configurator_gui_overlay);
	}
}
