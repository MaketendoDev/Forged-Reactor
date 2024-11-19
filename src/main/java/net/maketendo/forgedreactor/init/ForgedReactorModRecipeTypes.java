package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.maketendo.forgedreactor.jei_recipes.ArmorConfiguratorTypeRecipe;
import net.maketendo.forgedreactor.ForgedReactorMod;

@Mod.EventBusSubscriber(modid = ForgedReactorMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgedReactorModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "forged_reactor");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("armor_configurator_type", () -> ArmorConfiguratorTypeRecipe.Serializer.INSTANCE);
		});
	}
}
