
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.maketendo.forgedreactor.client.model.Modelmk3_armor;
import net.maketendo.forgedreactor.client.model.Modelmk2_armor;
import net.maketendo.forgedreactor.client.model.Modelmk1_armor;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ForgedReactorModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmk3_armor.LAYER_LOCATION, Modelmk3_armor::createBodyLayer);
		event.registerLayerDefinition(Modelmk2_armor.LAYER_LOCATION, Modelmk2_armor::createBodyLayer);
		event.registerLayerDefinition(Modelmk1_armor.LAYER_LOCATION, Modelmk1_armor::createBodyLayer);
	}
}
