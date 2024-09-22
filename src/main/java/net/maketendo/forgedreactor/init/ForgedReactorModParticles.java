
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.maketendo.forgedreactor.client.particle.RefinedFlameParticle;
import net.maketendo.forgedreactor.client.particle.ElectricitySparkParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgedReactorModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(ForgedReactorModParticleTypes.REFINED_FLAME.get(), RefinedFlameParticle::provider);
		event.registerSpriteSet(ForgedReactorModParticleTypes.ELECTRICITY_SPARK.get(), ElectricitySparkParticle::provider);
	}
}
