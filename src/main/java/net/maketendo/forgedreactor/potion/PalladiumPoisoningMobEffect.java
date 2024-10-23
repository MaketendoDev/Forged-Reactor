
package net.maketendo.forgedreactor.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.maketendo.forgedreactor.procedures.PalladiumPoisoningOnEffectActiveTickProcedure;
import net.maketendo.forgedreactor.procedures.PalladiumPoisoningEffectExpiresProcedure;

public class PalladiumPoisoningMobEffect extends MobEffect {
	public PalladiumPoisoningMobEffect() {
		super(MobEffectCategory.HARMFUL, -13421773);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PalladiumPoisoningOnEffectActiveTickProcedure.execute(entity.level(), entity, amplifier);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		PalladiumPoisoningEffectExpiresProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}
