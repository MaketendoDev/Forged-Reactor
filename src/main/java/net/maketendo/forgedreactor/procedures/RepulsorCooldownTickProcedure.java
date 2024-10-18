package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RepulsorCooldownTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("repulsedcooldowned") == true) {
			if (entity.getPersistentData().getDouble("repulsedcooldown") == 0) {
				entity.getPersistentData().putDouble("repulsedcooldown", 100);
				entity.getPersistentData().putBoolean("repulsedcooldowned", false);
			} else {
				entity.getPersistentData().putDouble("repulsedcooldown", (entity.getPersistentData().getDouble("repulsedcooldown") - 1));
			}
		}
	}
}
