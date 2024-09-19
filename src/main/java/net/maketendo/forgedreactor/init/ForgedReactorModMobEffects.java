
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.maketendo.forgedreactor.potion.ArmorWeightMobEffect;
import net.maketendo.forgedreactor.ForgedReactorMod;

public class ForgedReactorModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ForgedReactorMod.MODID);
	public static final RegistryObject<MobEffect> ARMOR_WEIGHT = REGISTRY.register("armor_weight", () -> new ArmorWeightMobEffect());
}
