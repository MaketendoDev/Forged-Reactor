package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class JumpBoostProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean jumpboostcooldown = false;
		if (jumpboostcooldown == false) {
			jumpboostcooldown = true;
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 10), (entity.getLookAngle().y * 8), (entity.getLookAngle().z * 10)));
			while (true) {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, x, (y + 1), z, 20, 0, 0, 0, 2);
					jumpboostcooldown = false;
					break;
				}
			}
		}
	}
}
