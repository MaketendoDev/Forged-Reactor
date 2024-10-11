package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.entity.Entity;

import net.maketendo.forgedreactor.network.ForgedReactorModVariables;

public class PalladiumPoisoningEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Palladium_Poisoning = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
