
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.maketendo.forgedreactor.block.PalladiumOreBlock;
import net.maketendo.forgedreactor.block.DeepslatePalladiumOreBlock;
import net.maketendo.forgedreactor.block.ArmorWithdrawerBlock;
import net.maketendo.forgedreactor.block.ArmorConfiguratorBlock;
import net.maketendo.forgedreactor.ForgedReactorMod;

public class ForgedReactorModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ForgedReactorMod.MODID);
	public static final RegistryObject<Block> ARMOR_CONFIGURATOR = REGISTRY.register("armor_configurator", () -> new ArmorConfiguratorBlock());
	public static final RegistryObject<Block> ARMOR_WITHDRAWER = REGISTRY.register("armor_withdrawer", () -> new ArmorWithdrawerBlock());
	public static final RegistryObject<Block> PALLADIUM_ORE = REGISTRY.register("palladium_ore", () -> new PalladiumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_PALLADIUM_ORE = REGISTRY.register("deepslate_palladium_ore", () -> new DeepslatePalladiumOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
