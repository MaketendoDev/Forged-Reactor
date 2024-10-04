package net.maketendo.forgedreactor.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.maketendo.forgedreactor.entity.RepulsorBeamEntity;
import net.maketendo.forgedreactor.client.model.Modelmk3_armor;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RepulsorBeamRenderer extends EntityRenderer<RepulsorBeamEntity> {
	private static final ResourceLocation texture = new ResourceLocation("forged_reactor:textures/entities/mk4_armor.png");
	private final Modelmk3_armor model;

	public RepulsorBeamRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelmk3_armor(context.bakeLayer(Modelmk3_armor.LAYER_LOCATION));
	}

	@Override
	public void render(RepulsorBeamEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(RepulsorBeamEntity entity) {
		return texture;
	}
}
