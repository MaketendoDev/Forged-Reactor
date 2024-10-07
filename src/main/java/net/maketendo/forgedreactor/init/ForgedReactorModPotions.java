
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;

import net.maketendo.forgedreactor.ForgedReactorMod;

public class ForgedReactorModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ForgedReactorMod.MODID);
	public static final RegistryObject<Potion> CHLOROPHYLL = REGISTRY.register("chlorophyll", () -> new Potion());
}
