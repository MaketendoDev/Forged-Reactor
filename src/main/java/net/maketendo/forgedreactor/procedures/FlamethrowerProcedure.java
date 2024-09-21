package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

import net.maketendo.forgedreactor.init.ForgedReactorModEntities;
import net.maketendo.forgedreactor.entity.FireblastEntity;

public class FlamethrowerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double raytrace_distance = 0;
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level();
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new FireblastEntity(ForgedReactorModEntities.FIREBLAST.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setSecondsOnFire(100);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
