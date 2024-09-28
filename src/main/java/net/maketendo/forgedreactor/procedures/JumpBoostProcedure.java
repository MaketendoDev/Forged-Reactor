package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class JumpBoostProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean jumpboostcooldown = false;
		if (jumpboostcooldown == false) {
			jumpboostcooldown = true;
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "particle minecraft:campfire_cosy_smoke ~ ~0.5 ~ 0 0 0 0.4 100");
				}
			}
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 10), (entity.getLookAngle().y * 10), (entity.getLookAngle().z * 10)));
			while (jumpboostcooldown == true) {
				if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR)) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, x, (y + 1), z, 30, 3, 3, 3, 2);
					jumpboostcooldown = false;
					break;
				}
			}
		}
	}
}
