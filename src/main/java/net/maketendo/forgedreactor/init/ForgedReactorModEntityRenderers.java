
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.maketendo.forgedreactor.client.renderer.WindBoostRenderer;
import net.maketendo.forgedreactor.client.renderer.Mk7SummoningPodRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgedReactorModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ForgedReactorModEntities.FIREBLAST.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ForgedReactorModEntities.REPULSOR_BEAM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ForgedReactorModEntities.WIND_BOOST.get(), WindBoostRenderer::new);
		event.registerEntityRenderer(ForgedReactorModEntities.MK_7_SUMMONING_POD.get(), Mk7SummoningPodRenderer::new);
	}
}
