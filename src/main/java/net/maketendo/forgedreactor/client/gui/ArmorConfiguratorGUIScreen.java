package net.maketendo.forgedreactor.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.maketendo.forgedreactor.world.inventory.ArmorConfiguratorGUIMenu;
import net.maketendo.forgedreactor.procedures.ArmorStandGUIReturnProcedure;
import net.maketendo.forgedreactor.network.ArmorConfiguratorGUIButtonMessage;
import net.maketendo.forgedreactor.ForgedReactorMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ArmorConfiguratorGUIScreen extends AbstractContainerScreen<ArmorConfiguratorGUIMenu> {
	private final static HashMap<String, Object> guistate = ArmorConfiguratorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	Button button_configure;
	Button button_empty;

	public ArmorConfiguratorGUIScreen(ArmorConfiguratorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("forged_reactor:textures/screens/armor_configurator_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (ArmorStandGUIReturnProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 144, this.topPos + 76, 30, 0f, 0, livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("forged_reactor:textures/screens/armor_config_overlay.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.forged_reactor.armor_configurator_gui.label_armor_configurator"), 5, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.forged_reactor.armor_configurator_gui.label_stark_corp"), 19, 72, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_configure = Button.builder(Component.translatable("gui.forged_reactor.armor_configurator_gui.button_configure"), e -> {
			if (true) {
				ForgedReactorMod.PACKET_HANDLER.sendToServer(new ArmorConfiguratorGUIButtonMessage(0, x, y, z, textstate));
				ArmorConfiguratorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		}).bounds(this.leftPos + 6, this.topPos + 49, 72, 20).build();
		guistate.put("button:button_configure", button_configure);
		this.addRenderableWidget(button_configure);
		button_empty = Button.builder(Component.translatable("gui.forged_reactor.armor_configurator_gui.button_empty"), e -> {
			if (true) {
				ForgedReactorMod.PACKET_HANDLER.sendToServer(new ArmorConfiguratorGUIButtonMessage(1, x, y, z, textstate));
				ArmorConfiguratorGUIButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		}).bounds(this.leftPos + 79, this.topPos + 49, 35, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
