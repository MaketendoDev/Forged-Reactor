package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.entity.Entity;

public class SpeedReturnProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format(
				Math.round(Math.sqrt(entity.getDeltaMovement().x() * entity.getDeltaMovement().x() + entity.getDeltaMovement().y() * entity.getDeltaMovement().y() + entity.getDeltaMovement().z() * entity.getDeltaMovement().z()) * 20)) + " m/s";
	}
}
