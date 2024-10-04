
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.maketendo.forgedreactor.network.Attack4Message;
import net.maketendo.forgedreactor.network.Attack3Message;
import net.maketendo.forgedreactor.network.Attack2Message;
import net.maketendo.forgedreactor.network.Attack1Message;
import net.maketendo.forgedreactor.ForgedReactorMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ForgedReactorModKeyMappings {
	public static final KeyMapping ATTACK_1 = new KeyMapping("key.forged_reactor.attack_1", GLFW.GLFW_KEY_B, "key.categories.ironarmor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ForgedReactorMod.PACKET_HANDLER.sendToServer(new Attack1Message(0, 0));
				Attack1Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ATTACK_2 = new KeyMapping("key.forged_reactor.attack_2", GLFW.GLFW_KEY_N, "key.categories.ironarmor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ForgedReactorMod.PACKET_HANDLER.sendToServer(new Attack2Message(0, 0));
				Attack2Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ATTACK_3 = new KeyMapping("key.forged_reactor.attack_3", GLFW.GLFW_KEY_M, "key.categories.ironarmor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ForgedReactorMod.PACKET_HANDLER.sendToServer(new Attack3Message(0, 0));
				Attack3Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ATTACK_4 = new KeyMapping("key.forged_reactor.attack_4", GLFW.GLFW_KEY_UNKNOWN, "key.categories.ironarmor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ForgedReactorMod.PACKET_HANDLER.sendToServer(new Attack4Message(0, 0));
				Attack4Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ATTACK_1);
		event.register(ATTACK_2);
		event.register(ATTACK_3);
		event.register(ATTACK_4);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				ATTACK_1.consumeClick();
				ATTACK_2.consumeClick();
				ATTACK_3.consumeClick();
				ATTACK_4.consumeClick();
			}
		}
	}
}
