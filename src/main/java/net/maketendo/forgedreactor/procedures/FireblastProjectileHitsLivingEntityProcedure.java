package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.entity.Entity;

public class FireblastProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
