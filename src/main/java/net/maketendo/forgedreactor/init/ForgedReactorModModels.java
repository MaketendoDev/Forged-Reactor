
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.maketendo.forgedreactor.client.model.Modelopen_mk1_helmet;
import net.maketendo.forgedreactor.client.model.Modelmk3_armor;
import net.maketendo.forgedreactor.client.model.Modelmk2_armor;
import net.maketendo.forgedreactor.client.model.Modelmk1_armor;
import net.maketendo.forgedreactor.client.model.Modelflight_test_armor_thin;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ForgedReactorModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelflight_test_armor_thin.LAYER_LOCATION, Modelflight_test_armor_thin::createBodyLayer);
		event.registerLayerDefinition(Modelmk3_armor.LAYER_LOCATION, Modelmk3_armor::createBodyLayer);
		event.registerLayerDefinition(Modelopen_mk1_helmet.LAYER_LOCATION, Modelopen_mk1_helmet::createBodyLayer);
		event.registerLayerDefinition(Modelmk2_armor.LAYER_LOCATION, Modelmk2_armor::createBodyLayer);
		event.registerLayerDefinition(Modelmk1_armor.LAYER_LOCATION, Modelmk1_armor::createBodyLayer);
	}
}
