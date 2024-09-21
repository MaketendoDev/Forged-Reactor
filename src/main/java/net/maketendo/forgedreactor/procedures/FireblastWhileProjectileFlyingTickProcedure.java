package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.maketendo.forgedreactor.init.ForgedReactorModParticleTypes;

public class FireblastWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ForgedReactorModParticleTypes.REFINED_FLAME.get()), x, y, z, 30, 0.1, 0.1, 0.1, 1);
	}
}
