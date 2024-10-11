package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.entity.Entity;

public class ArcReactorRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("Arc Reactor", true);
	}
}
