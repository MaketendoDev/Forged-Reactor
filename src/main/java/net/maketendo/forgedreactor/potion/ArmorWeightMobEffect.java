
package net.maketendo.forgedreactor.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.maketendo.forgedreactor.procedures.ArmorWeightEffectExpiresProcedure;
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
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ArmorWeightEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
