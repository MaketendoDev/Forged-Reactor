
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.maketendo.forgedreactor.ForgedReactorMod;

public class ForgedReactorModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ForgedReactorMod.MODID);
	public static final RegistryObject<SoundEvent> FLIGHTTEST_ARMOR_SPARK = REGISTRY.register("flighttest_armor_spark", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forged_reactor", "flighttest_armor_spark")));
	public static final RegistryObject<SoundEvent> REPULSOR_WARMUP = REGISTRY.register("repulsor_warmup", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forged_reactor", "repulsor_warmup")));
	public static final RegistryObject<SoundEvent> REPULSOR_SHOOT = REGISTRY.register("repulsor_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forged_reactor", "repulsor_shoot")));
}
