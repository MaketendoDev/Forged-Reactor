package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.maketendo.forgedreactor.init.ForgedReactorModParticleTypes;

import java.util.List;
import java.util.Comparator;

public class FinishRepairingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomtimer = 0;
		{
			final Vec3 _center = new Vec3(x, (x + 1), z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ArmorStand) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ForgedReactorModParticleTypes.ELECTRICITY_SPARK.get()), (x + Mth.nextInt(RandomSource.create(), (int) (-0.5), (int) 0.5)), (y + Mth.nextInt(RandomSource.create(), (int) 0.1, 1)),
								(z + Mth.nextInt(RandomSource.create(), (int) (-0.5), (int) 0.5)), Mth.nextInt(RandomSource.create(), 1, 7), 0, 0, 0, 0.2);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forged_reactor:flighttest_armor_spark")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forged_reactor:flighttest_armor_spark")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ForgedReactorModParticleTypes.ELECTRICITY_SPARK.get()), (x + Mth.nextInt(RandomSource.create(), (int) (-0.5), (int) 0.5)), (y + Mth.nextInt(RandomSource.create(), (int) 0.1, 1)),
								(z + Mth.nextInt(RandomSource.create(), (int) (-0.5), (int) 0.5)), Mth.nextInt(RandomSource.create(), 1, 7), 0, 0, 0, 0.2);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forged_reactor:flighttest_armor_spark")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forged_reactor:flighttest_armor_spark")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ForgedReactorModParticleTypes.ELECTRICITY_SPARK.get()), (x + Mth.nextInt(RandomSource.create(), (int) (-0.5), (int) 0.5)), (y + Mth.nextInt(RandomSource.create(), (int) 0.1, 1)),
								(z + Mth.nextInt(RandomSource.create(), (int) (-0.5), (int) 0.5)), Mth.nextInt(RandomSource.create(), 1, 7), 0, 0, 0, 0.2);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forged_reactor:flighttest_armor_spark")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forged_reactor:flighttest_armor_spark")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (ForgedReactorModParticleTypes.ELECTRICITY_SPARK.get()), (x + Mth.nextInt(RandomSource.create(), (int) (-0.5), (int) 0.5)), (y + Mth.nextInt(RandomSource.create(), (int) 0.1, 1)),
								(z + Mth.nextInt(RandomSource.create(), (int) (-0.5), (int) 0.5)), Mth.nextInt(RandomSource.create(), 1, 7), 0, 0, 0, 0.2);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forged_reactor:flighttest_armor_spark")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forged_reactor:flighttest_armor_spark")), SoundSource.NEUTRAL, (float) 0.1, (float) 0.5, false);
						}
					}
				}
			}
		}
	}
}
