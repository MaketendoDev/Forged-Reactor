package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.entity.Entity;

public class Attack1OnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		JumpBoostProcedure.execute(entity);
		ActivateFlightProcedure.execute(entity);
	}
}
