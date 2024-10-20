package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class ConfigurateArmorPage2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity armor_stand = null;
		UpgradingToMk3RecipeProcedure.execute(world, x, y, z, entity);
	}
}
