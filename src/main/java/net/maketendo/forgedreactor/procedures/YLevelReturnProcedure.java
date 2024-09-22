package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.entity.Entity;

public class YLevelReturnProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##.##").format(entity.getY());
	}
}
