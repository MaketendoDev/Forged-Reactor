
package net.maketendo.forgedreactor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.WitchModel;

import net.maketendo.forgedreactor.entity.Mk7SummoningPodEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class Mk7SummoningPodRenderer extends MobRenderer<Mk7SummoningPodEntity, WitchModel<Mk7SummoningPodEntity>> {
	public Mk7SummoningPodRenderer(EntityRendererProvider.Context context) {
		super(context, new WitchModel(context.bakeLayer(ModelLayers.WITCH)), 0.5f);
	}

	@Override
	protected void scale(Mk7SummoningPodEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.02f, 1.02f, 1.02f);
	}

	@Override
	public ResourceLocation getTextureLocation(Mk7SummoningPodEntity entity) {
		return new ResourceLocation("forged_reactor:textures/entities/mk7_armor.png");
	}
}
