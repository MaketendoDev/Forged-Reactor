
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.maketendo.forgedreactor.entity.WindBoostEntity;
import net.maketendo.forgedreactor.entity.RepulsorBeamEntity;
import net.maketendo.forgedreactor.entity.Mk7SummoningPodEntity;
import net.maketendo.forgedreactor.entity.FireblastEntity;
import net.maketendo.forgedreactor.ForgedReactorMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgedReactorModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ForgedReactorMod.MODID);
	public static final RegistryObject<EntityType<FireblastEntity>> FIREBLAST = register("fireblast",
			EntityType.Builder.<FireblastEntity>of(FireblastEntity::new, MobCategory.MISC).setCustomClientFactory(FireblastEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RepulsorBeamEntity>> REPULSOR_BEAM = register("repulsor_beam",
			EntityType.Builder.<RepulsorBeamEntity>of(RepulsorBeamEntity::new, MobCategory.MISC).setCustomClientFactory(RepulsorBeamEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WindBoostEntity>> WIND_BOOST = register("wind_boost", EntityType.Builder.<WindBoostEntity>of(WindBoostEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(WindBoostEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Mk7SummoningPodEntity>> MK_7_SUMMONING_POD = register("mk_7_summoning_pod", EntityType.Builder.<Mk7SummoningPodEntity>of(Mk7SummoningPodEntity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(Mk7SummoningPodEntity::new).fireImmune().sized(0.6f, 1.95f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WindBoostEntity.init();
			Mk7SummoningPodEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WIND_BOOST.get(), WindBoostEntity.createAttributes().build());
		event.put(MK_7_SUMMONING_POD.get(), Mk7SummoningPodEntity.createAttributes().build());
	}
}
