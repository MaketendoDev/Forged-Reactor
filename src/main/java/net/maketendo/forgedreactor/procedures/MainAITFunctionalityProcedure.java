package net.maketendo.forgedreactor.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.forgedreactor.network.ForgedReactorModVariables;

public class MainAITFunctionalityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " Link to ")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> I have linked to.. "
						+ text.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " Link to ", "") + " sir.")), false);
			{
				String _setval = text.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " Link to ", "");
				entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.LinkedTARDISID = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " link to ")) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(
							Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> I have linked to.. "
									+ text.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " link to ", "") + " sir.")),
							false);
				{
					String _setval = text.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " link to ", "");
					entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.LinkedTARDISID = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if (((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID).equals("")) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
								+ "> if you want to connect your TARDIS sir, you have to say \"jarvis link to <TARDIS ID>\"")), false);
				} else {
					if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName) && text.endsWith("summon my tardis")) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(
									Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> Summoning your TARDIS sir.")),
									false);
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("ait summon " + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID));
							}
						}
					} else {
						if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName) && text.endsWith("unlock my tardis")) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(
										("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> Unlocked your TARDIS sir.")), false);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("ait lock " + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID + " false"));
						} else {
							if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName) && text.endsWith("lock my tardis")) {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(
											Component.literal(
													("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> Locked your TARDIS sir.")),
											false);
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											("ait lock " + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID + " true"));
							} else {
								if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName) && text.endsWith("boomboom protocal")) {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(
												Component.literal(
														("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> Loading Protocal sir.")),
												false);
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("ait remove " + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID));
								}
								if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName) && text.endsWith("activate siege mode")) {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(
												Component.literal(
														("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> Siege mode active sir.")),
												false);
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												("ait siege" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID + " true"));
								} else {
									if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
											&& text.endsWith("deactivate siege mode")) {
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal(
													("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> Siege mode deactivated sir.")),
													false);
										if (world instanceof ServerLevel _level)
											_level.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
													("ait siege" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID + " false"));
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
