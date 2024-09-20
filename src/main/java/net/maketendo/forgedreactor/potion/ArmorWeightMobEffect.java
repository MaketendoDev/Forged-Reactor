
package net.maketendo.forgedreactor.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.maketendo.forgedreactor.procedures.ArmorWeightActiveTickConditionProcedure;

public class ArmorWeightMobEffect extends MobEffect {
	public ArmorWeightMobEffect() {
		super(MobEffectCategory.HARMFUL, -13421773);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ArmorWeightActiveTickConditionProcedure.execute(entity, amplifier);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
