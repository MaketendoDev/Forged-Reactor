
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.maketendo.forgedreactor.ForgedReactorMod;

public class ForgedReactorModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ForgedReactorMod.MODID);
	public static final RegistryObject<SimpleParticleType> REFINED_FLAME = REGISTRY.register("refined_flame", () -> new SimpleParticleType(true));
}
