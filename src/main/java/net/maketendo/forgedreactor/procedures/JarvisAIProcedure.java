package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.maketendo.forgedreactor.network.ForgedReactorModVariables;
import net.maketendo.forgedreactor.init.ForgedReactorModItems;
import net.maketendo.forgedreactor.ForgedReactorMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class JarvisAIProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent event) {
		execute(event, event.getPlayer().level(), event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(), event.getRawText());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		execute(null, world, x, y, z, entity, text);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_2_IRON_ARMOR_HELMET.get()) {
			ForgedReactorMod.queueServerWork(10, () -> {
				if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName) && text.endsWith("are you my pookie")) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(
								Component.literal(
										("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> I'mma blow ur ggoofy ahh buttocks off")),
								false);
					ForgedReactorMod.queueServerWork(60, () -> {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 30, Level.ExplosionInteraction.TNT);
					});
				} else {
					if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
							&& (text.endsWith("time?") || text.endsWith("what is the time?") || text.endsWith("what time is it") || text.endsWith("what time is it?") || text.endsWith("give me the time") || text.endsWith("tell me the time"))) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
									+ "> The time is " + new java.text.DecimalFormat("##.##").format(world.dayTime()) + "sir.")), false);
					} else {
						if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
								&& (text.endsWith("who am I?") || text.endsWith("who am i?") || text.endsWith("who am I") || text.endsWith("who am i") || text.endsWith("what is my name") || text.endsWith("what is my name?"))) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
										+ "> You are " + entity.getDisplayName().getString() + " sir.")), false);
						} else {
							if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName) && (text.endsWith("what is the time")
									|| text.endsWith("what is the time?") || text.endsWith("what time is it") || text.endsWith("what time is it?") || text.endsWith("give me the time") || text.endsWith("time") || text.endsWith("tell me the time"))) {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
											+ "> The time is " + new java.text.DecimalFormat("##.##").format(world.dayTime()) + "sir.")), false);
							} else {
								if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " say")) {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
												+ "> " + text.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " say", ""))), false);
								} else {
									if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " Say")) {
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(
													Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> "
															+ text.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " Say", ""))),
													false);
									} else {
										if (ModList.get().isLoaded("ait")) {
											if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " Link to ")) {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal(("<"
															+ (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + ">I have linked to.. "
															+ text.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " Link to ", "")
															+ " sir.")), false);
												{
													String _setval = text.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " Link to ",
															"");
													entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.LinkedTARDISID = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
											} else {
												if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " link to ")) {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal(("<"
																+ (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> I have linked to.. "
																+ text.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " link to ", "")
																+ " sir.")), false);
													{
														String _setval = text
																.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " link to ", "");
														entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.LinkedTARDISID = _setval;
															capability.syncPlayerVariables(entity);
														});
													}
												} else {
													if (((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID).equals("")) {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(
																	Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
																			+ "> if you want to connect your TARDIS sir, you have to say \"jarvis link to <TARDIS ID>\"")),
																	false);
													} else {
														if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
																&& text.endsWith("summon my tardis")) {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(
																		Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
																				+ "> Summoning your TARDIS sir.")),
																		false);
															{
																Entity _ent = entity;
																if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																	_ent.getServer().getCommands().performPrefixedCommand(
																			new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
																					_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																			("ait summon " + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID));
																}
															}
														} else {
															if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
																	&& text.endsWith("unlock my tardis")) {
																if (entity instanceof Player _player && !_player.level().isClientSide())
																	_player.displayClientMessage(Component
																			.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
																					+ "> Unlocked your TARDIS sir.")),
																			false);
																if (world instanceof ServerLevel _level)
																	_level.getServer().getCommands().performPrefixedCommand(
																			new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																			("ait lock " + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID
																					+ " false"));
															} else {
																if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
																		&& text.endsWith("lock my tardis")) {
																	if (entity instanceof Player _player && !_player.level().isClientSide())
																		_player.displayClientMessage(Component
																				.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
																						+ "> Locked your TARDIS sir.")),
																				false);
																	if (world instanceof ServerLevel _level)
																		_level.getServer().getCommands().performPrefixedCommand(
																				new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																				("ait lock " + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID
																						+ " true"));
																} else {
																	if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
																			&& text.endsWith("boomboom protocal")) {
																		if (entity instanceof Player _player && !_player.level().isClientSide())
																			_player.displayClientMessage(Component.literal(
																					("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
																							+ "> Loading Protocal sir.")),
																					false);
																		if (world instanceof ServerLevel _level)
																			_level.getServer().getCommands().performPrefixedCommand(
																					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																					("ait remove " + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																							.orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID));
																	}
																	if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
																			&& text.endsWith("activate siege mode")) {
																		if (entity instanceof Player _player && !_player.level().isClientSide())
																			_player.displayClientMessage(Component.literal(
																					("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
																							+ "> Siege mode active sir.")),
																					false);
																		if (world instanceof ServerLevel _level)
																			_level.getServer().getCommands().performPrefixedCommand(
																					new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																					("ait siege"
																							+ (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID
																							+ " true"));
																	} else {
																		if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
																				&& text.endsWith("deactivate siege mode")) {
																			if (entity instanceof Player _player && !_player.level().isClientSide())
																				_player.displayClientMessage(Component.literal(
																						("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
																								+ "> Siege mode deactivated sir.")),
																						false);
																			if (world instanceof ServerLevel _level)
																				_level.getServer().getCommands().performPrefixedCommand(
																						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
																						("ait siege" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																								.orElse(new ForgedReactorModVariables.PlayerVariables())).LinkedTARDISID + " false"));
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
								}
							}
						}
					}
				}
			});
		}
	}
}
