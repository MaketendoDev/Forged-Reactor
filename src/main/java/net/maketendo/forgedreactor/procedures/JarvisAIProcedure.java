package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.maketendo.forgedreactor.network.ForgedReactorModVariables;
import net.maketendo.forgedreactor.ForgedReactorMod;

import javax.annotation.Nullable;

import java.util.Calendar;

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
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("ironman:enablejarvis")))) {
			ForgedReactorMod.queueServerWork(10, () -> {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
				if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName) && text.endsWith("are you my pookie")) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> no sir.")),
								false);
				} else {
					if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
							&& (text.endsWith("time?") || text.endsWith("what is the time?") || text.endsWith("what time is it") || text.endsWith("what time is it?") || text.endsWith("give me the time") || text.endsWith("tell me the time"))) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
									+ "> The time is " + Calendar.getInstance().getTime().toString() + " sir.")), false);
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
											+ "> The time is " + new java.text.DecimalFormat("##.##").format(world.dayTime()) + " sir.")), false);
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
															+ text.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "Say", ""))),
													false);
									} else {
										if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " can i call you ")) {
											if (entity instanceof Player _player && !_player.level().isClientSide())
												_player.displayClientMessage(Component.literal(
														("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> Sure you can call me "
																+ text.replace(
																		(entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " can i call you ", "")
																+ " sir.")),
														false);
											{
												String _setval = text
														.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " can i call you ", "");
												entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.JarvisAIName = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " can I call you ")) {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal(
															("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + "> Sure you can call me "
																	+ text.replace(
																			(entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " can I call you ",
																			"")
																	+ " sir.")),
															false);
												{
													String _setval = text
															.replace((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName + " can I call you ", "");
													entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.JarvisAIName = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
											} else {
												if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
														&& (text.endsWith("hi") || text.endsWith("hello") || text.endsWith("Hi") || text.endsWith("Hello") || text.endsWith("hey") || text.endsWith("Hey") || text.endsWith("?"))) {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(
																Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
																		+ "> Hello there sir what may I be of use for?")),
																false);
												} else {
													if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
															&& (text.endsWith("how are you?") || text.endsWith("how are you") || text.endsWith("how r u?") || text.endsWith("how r u") || text.endsWith("u good?") || text.endsWith("u good?")
																	|| text.endsWith("you good") || text.endsWith("you good?"))) {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(
																	Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
																			+ "> I am good sir thank you for asking.")),
																	false);
													} else {
														if (text.startsWith((entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName)
																&& (text.endsWith("do u like me?") || text.endsWith("do u like me") || text.endsWith("do you like me") || text.endsWith("do you like me?") || text.endsWith("u like me")
																		|| text.endsWith("u like me?") || text.endsWith("you like me?") || text.endsWith("you like me"))) {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(
																		Component.literal(("<" + (entity.getCapability(ForgedReactorModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForgedReactorModVariables.PlayerVariables())).JarvisAIName
																				+ "> I love to be by your side sir.")),
																		false);
														} else {
															if (ModList.get().isLoaded("ait")) {
																MainAITFunctionalityProcedure.execute(world, x, y, z, entity, text);
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
