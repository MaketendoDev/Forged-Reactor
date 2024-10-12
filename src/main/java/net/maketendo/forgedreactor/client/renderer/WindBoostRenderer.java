
package net.maketendo.forgedreactor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.maketendo.forgedreactor.entity.WindBoostEntity;
import net.maketendo.forgedreactor.client.model.Modelwind_blast;

public class WindBoostRenderer extends MobRenderer<WindBoostEntity, Modelwind_blast<WindBoostEntity>> {
	public WindBoostRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwind_blast(context.bakeLayer(Modelwind_blast.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WindBoostEntity entity) {
		return new ResourceLocation("forged_reactor:textures/entities/wind_blast.png");
	}
}
