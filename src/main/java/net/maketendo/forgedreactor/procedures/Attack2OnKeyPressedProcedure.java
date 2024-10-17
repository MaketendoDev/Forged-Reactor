package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class Attack2OnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		FlamethrowerProcedure.execute(world, entity);
		RepulsorProcedure.execute(entity);
	}
}
