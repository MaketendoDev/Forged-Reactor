package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.entity.Entity;

public class RedYLevelDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getY() > 171) {
			return true;
		}
		return false;
	}
}
