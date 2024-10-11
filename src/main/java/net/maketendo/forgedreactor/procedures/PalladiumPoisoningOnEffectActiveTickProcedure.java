package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.maketendo.forgedreactor.network.ForgedReactorModVariables;
import net.maketendo.forgedreactor.init.ForgedReactorModMobEffects;

public class PalladiumPoisoningOnEffectActiveTickProcedure {
	public static void execute(Entity entity, double amplifier) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ForgedReactorModMobEffects.CHLOROPHYLL_EFFECT.get()))) {
			if (entity.getPersistentData().getDouble("PalladiumPoisoning") == 0) {
				entity.getPersistentData().putDouble("PalladiumPoisoning", 200);
			} else {
				entity.getPersistentData().putDouble("PalladiumPoisoning", (entity.getPersistentData().getDouble("FlightFireModel") - (1 + amplifier)));
			}
			if (entity.getPersistentData().getDouble("PalladiumPoisoning") == 0) {
				entity.getPersistentData().putDouble("Level", (entity.getPersistentData().getDouble("Level") + 1));
			}
			if (entity.getPersistentData().getDouble("Level") == 0) {
				{
					double _setval = 0;
					entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Palladium_Poisoning = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity.getPersistentData().getDouble("Level") == 1) {
				{
					double _setval = 1;
					entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Palladium_Poisoning = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity.getPersistentData().getDouble("Level") == 2) {
				{
					double _setval = 2;
					entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Palladium_Poisoning = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (entity.getPersistentData().getDouble("Level") >= 3) {
				{
					double _setval = 3;
					entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Palladium_Poisoning = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
