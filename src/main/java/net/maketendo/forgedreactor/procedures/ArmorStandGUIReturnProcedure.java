package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.Entity;

import java.util.Comparator;

public class ArmorStandGUIReturnProcedure {
	public static Entity execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return null;
		if (((Entity) world.getEntitiesOfClass(ArmorStand.class, AABB.ofSize(new Vec3(x, (y + 1), z), 1, 1, 1), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, (y + 1), z)).findFirst().orElse(null)) == entity) {
			return entity;
		}
		return entity;
	}
}
