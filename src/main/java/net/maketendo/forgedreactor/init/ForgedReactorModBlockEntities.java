
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.maketendo.forgedreactor.block.entity.ArmorWithdrawerBlockEntity;
import net.maketendo.forgedreactor.ForgedReactorMod;

public class ForgedReactorModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ForgedReactorMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ARMOR_WITHDRAWER = register("armor_withdrawer", ForgedReactorModBlocks.ARMOR_WITHDRAWER, ArmorWithdrawerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
