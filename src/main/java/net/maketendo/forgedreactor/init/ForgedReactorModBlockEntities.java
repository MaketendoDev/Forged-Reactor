
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.maketendo.forgedreactor.block.entity.ArmorIntakeBlockBlockEntity;
import net.maketendo.forgedreactor.ForgedReactorMod;

public class ForgedReactorModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ForgedReactorMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ARMOR_INTAKE_BLOCK = register("armor_intake_block", ForgedReactorModBlocks.ARMOR_INTAKE_BLOCK, ArmorIntakeBlockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
