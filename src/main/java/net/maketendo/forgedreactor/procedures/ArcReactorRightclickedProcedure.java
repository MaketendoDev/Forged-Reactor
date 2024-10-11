package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.entity.Entity;

import net.maketendo.forgedreactor.network.ForgedReactorModVariables;

public class ArcReactorRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Arc_Reactor = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}