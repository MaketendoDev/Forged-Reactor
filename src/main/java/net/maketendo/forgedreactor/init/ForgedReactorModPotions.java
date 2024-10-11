
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.maketendo.forgedreactor.ForgedReactorMod;

public class ForgedReactorModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ForgedReactorMod.MODID);
	public static final RegistryObject<Potion> CHLOROPHYLL = REGISTRY.register("chlorophyll",
			() -> new Potion(new MobEffectInstance(ForgedReactorModMobEffects.CHLOROPHYLL_EFFECT.get(), 3600, 0, false, false), new MobEffectInstance(ForgedReactorModMobEffects.CHLOROPHYLL_EFFECT.get(), 5623, 0, false, false)));
}
