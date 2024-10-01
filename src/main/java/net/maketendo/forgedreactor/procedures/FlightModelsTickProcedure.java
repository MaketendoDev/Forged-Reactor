package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FlightModelsTickProcedure {
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
		if (entity.getPersistentData().getDouble("FlightFireModel") == 0) {
			entity.getPersistentData().putDouble("FlightFireModel", 50);
		} else {
			entity.getPersistentData().putDouble("FlightFireModel", (entity.getPersistentData().getDouble("FlightFireModel") - 1));
		}
		if (entity.getPersistentData().getDouble("FlightFireModel") == 0) {
			entity.getPersistentData().putDouble("Model", (entity.getPersistentData().getDouble("Model") + 1));
		}
	}
}
