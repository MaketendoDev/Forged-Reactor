package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.maketendo.forgedreactor.network.ForgedReactorModVariables;
import net.maketendo.forgedreactor.client.model.Modelarc_reactor;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class ArcReactorDisplayProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).Arc_Reactor == true) {
			RenderLivingEvent _evt = (RenderLivingEvent) event;
			Minecraft mc = Minecraft.getInstance();
			EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
			EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
			Entity _evtEntity = _evt.getEntity();
			PlayerRenderer _pr = null;
			PoseStack poseStack = _evt.getPoseStack();
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png");
				com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer emptyRenderer = new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context,
						(_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getModelName().equals("slim") : false), _texture);
				_pr = emptyRenderer;
				emptyRenderer.clearLayers();
				emptyRenderer.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
			}
			if ((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).Palladium_Poisoning == 0) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("forged_reactor:textures/entities/arc_reactor.png") != null) {
						_texture = new ResourceLocation("forged_reactor:textures/entities/arc_reactor.png");
					}
					Modelarc_reactor newModel = new Modelarc_reactor(context.bakeLayer(Modelarc_reactor.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			} else if ((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).Palladium_Poisoning == 1) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("forged_reactor:textures/entities/arc_reactor_1.png") != null) {
						_texture = new ResourceLocation("forged_reactor:textures/entities/arc_reactor_1.png");
					}
					Modelarc_reactor newModel = new Modelarc_reactor(context.bakeLayer(Modelarc_reactor.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			} else if ((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).Palladium_Poisoning == 2) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("forged_reactor:textures/entities/arc_reactor_2.png") != null) {
						_texture = new ResourceLocation("forged_reactor:textures/entities/arc_reactor_2.png");
					}
					Modelarc_reactor newModel = new Modelarc_reactor(context.bakeLayer(Modelarc_reactor.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			} else if ((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).Palladium_Poisoning == 3) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("forged_reactor:textures/entities/arc_reactor_3.png") != null) {
						_texture = new ResourceLocation("forged_reactor:textures/entities/arc_reactor_3.png");
					}
					Modelarc_reactor newModel = new Modelarc_reactor(context.bakeLayer(Modelarc_reactor.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			} else {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("forged_reactor:textures/entities/arc_reactor_3.png") != null) {
						_texture = new ResourceLocation("forged_reactor:textures/entities/arc_reactor_3.png");
					}
					Modelarc_reactor newModel = new Modelarc_reactor(context.bakeLayer(Modelarc_reactor.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
		}
	}
}
