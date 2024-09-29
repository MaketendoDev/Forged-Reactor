package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class Attack3OnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		OpenCloseHelmetProcedure.execute(world, x, y, z, entity);
	}
}
