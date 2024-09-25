
package net.maketendo.forgedreactor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.maketendo.forgedreactor.entity.Mk7SuitPodEntity;
import net.maketendo.forgedreactor.client.model.Modelmk4_armor;

import com.mojang.blaze3d.vertex.PoseStack;

public class Mk7SuitPodRenderer extends MobRenderer<Mk7SuitPodEntity, Modelmk4_armor<Mk7SuitPodEntity>> {
	public Mk7SuitPodRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmk4_armor(context.bakeLayer(Modelmk4_armor.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(Mk7SuitPodEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.02f, 1.02f, 1.02f);
	}

	@Override
	public ResourceLocation getTextureLocation(Mk7SuitPodEntity entity) {
		return new ResourceLocation("forged_reactor:textures/entities/mk7_armor.png");
	}
}
