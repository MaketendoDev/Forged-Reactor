package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnDisplayForRepulsorRechargeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("repulsedcooldowned") == true) {
			return true;
		}
		return false;
	}
}
