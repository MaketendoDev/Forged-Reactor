package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

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
