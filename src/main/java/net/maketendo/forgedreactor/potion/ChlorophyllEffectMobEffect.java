
package net.maketendo.forgedreactor.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ChlorophyllEffectMobEffect extends MobEffect {
	public ChlorophyllEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -15263977);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
