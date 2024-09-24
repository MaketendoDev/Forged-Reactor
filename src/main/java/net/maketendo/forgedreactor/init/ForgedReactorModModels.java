
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.maketendo.forgedreactor.client.model.Modelmk5_armor;
import net.maketendo.forgedreactor.client.model.Modelmk4_armor;
import net.maketendo.forgedreactor.client.model.Modelmk3_armor;
import net.maketendo.forgedreactor.client.model.Modelmk2_armor;
import net.maketendo.forgedreactor.client.model.Modelmk1_helmet_open;
import net.maketendo.forgedreactor.client.model.Modelmk1_armor;
import net.maketendo.forgedreactor.client.model.Modelflight_test_armor_thin;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ForgedReactorModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelflight_test_armor_thin.LAYER_LOCATION, Modelflight_test_armor_thin::createBodyLayer);
		event.registerLayerDefinition(Modelmk1_helmet_open.LAYER_LOCATION, Modelmk1_helmet_open::createBodyLayer);
		event.registerLayerDefinition(Modelmk3_armor.LAYER_LOCATION, Modelmk3_armor::createBodyLayer);
		event.registerLayerDefinition(Modelmk2_armor.LAYER_LOCATION, Modelmk2_armor::createBodyLayer);
		event.registerLayerDefinition(Modelmk5_armor.LAYER_LOCATION, Modelmk5_armor::createBodyLayer);
		event.registerLayerDefinition(Modelmk1_armor.LAYER_LOCATION, Modelmk1_armor::createBodyLayer);
		event.registerLayerDefinition(Modelmk4_armor.LAYER_LOCATION, Modelmk4_armor::createBodyLayer);
	}
}
