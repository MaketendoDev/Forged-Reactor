
package net.maketendo.forgedreactor.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.Minecraft;

import net.maketendo.forgedreactor.procedures.YLevelReturnProcedure;
import net.maketendo.forgedreactor.procedures.SpeedReturnProcedure;
import net.maketendo.forgedreactor.procedures.PlayerHUDRendererProcedure;
import net.maketendo.forgedreactor.procedures.Mk2OverlayDisplayOverlayInGameProcedure;
import net.maketendo.forgedreactor.procedures.GetIFEntityHostileProcedure;
import net.maketendo.forgedreactor.procedures.GetEntityNameProcedure;
import net.maketendo.forgedreactor.procedures.GetEntityMaxHealthProcedure;
import net.maketendo.forgedreactor.procedures.GetEntityHealthProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class Mk2ArmorHUDOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (Mk2OverlayDisplayOverlayInGameProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("forged_reactor:textures/screens/ironman_hud_vision.png"), 0, 0, 0, 0, w, h, w, h);
			event.getGuiGraphics().blit(new ResourceLocation("forged_reactor:textures/screens/ylevel_hud_display.png"), 2, h / 2 + -132, 0, 0, 23, 256, 23, 256);

			event.getGuiGraphics().blit(new ResourceLocation("forged_reactor:textures/screens/top_hud_bar.png"), w / 2 + -652, 3, 0, 0, 2056, 3, 2056, 3);

			event.getGuiGraphics().blit(new ResourceLocation("forged_reactor:textures/screens/repulsors_icon_hud.png"), 32, h - 49, 0, 0, 43, 43, 43, 43);

			event.getGuiGraphics().blit(new ResourceLocation("forged_reactor:textures/screens/missile_icon_hud.png"), w - 60, h - 50, 0, 0, 43, 43, 43, 43);

			event.getGuiGraphics().blit(new ResourceLocation("forged_reactor:textures/screens/ironman_hud_info_box.png"), w - 104, 17, 0, 0, 101, 51, 101, 51);

			event.getGuiGraphics().blit(new ResourceLocation("forged_reactor:textures/screens/bar.png"), w / 2 + -91, 8, 0, 0, 182, 5, 182, 5);

			event.getGuiGraphics().blit(new ResourceLocation("forged_reactor:textures/screens/ylevel_hud_display.png"), 2, h / 2 + 116, 0, 0, 23, 256, 23, 256);

			event.getGuiGraphics().blit(new ResourceLocation("forged_reactor:textures/screens/ylevel_hud_display.png"), 2, h / 2 + -356, 0, 0, 23, 256, 23, 256);

			event.getGuiGraphics().blit(new ResourceLocation("forged_reactor:textures/screens/iron_hud_crosshair.png"), w / 2 + -8, h / 2 + -8, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					GetEntityNameProcedure.execute(world, entity), w - 100, 31, -1, false);
			if (GetIFEntityHostileProcedure.execute(world, entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						GetEntityNameProcedure.execute(world, entity), w - 100, 31, -6750208, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					GetEntityHealthProcedure.execute(world, entity), w - 100, 42, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					SpeedReturnProcedure.execute(entity), 27, 127, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					GetEntityMaxHealthProcedure.execute(world, entity), w - 100, 53, -1, false);
			if (GetIFEntityHostileProcedure.execute(world, entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						GetEntityMaxHealthProcedure.execute(world, entity), w - 100, 53, -6750208, false);
			if (GetIFEntityHostileProcedure.execute(world, entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						GetEntityHealthProcedure.execute(world, entity), w - 100, 42, -6750208, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					YLevelReturnProcedure.execute(entity), 27, h / 2 + -5, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.forged_reactor.mk_2_armor_hud.label_entity_data"), w - 100, 21, -1, false);
			if (PlayerHUDRendererProcedure.execute(entity) instanceof LivingEntity livingEntity) {
				InventoryScreen.renderEntityInInventoryFollowsAngle(event.getGuiGraphics(), w - 47, h / 2 + 55, 55, 0f, 0, livingEntity);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
