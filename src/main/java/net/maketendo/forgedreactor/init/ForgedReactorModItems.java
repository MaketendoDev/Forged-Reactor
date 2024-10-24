
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.maketendo.forgedreactor.item.UpgradeTemplateItem;
import net.maketendo.forgedreactor.item.RawPalladiumItem;
import net.maketendo.forgedreactor.item.PalladiumIngotItem;
import net.maketendo.forgedreactor.item.MoltenIronItem;
import net.maketendo.forgedreactor.item.MoltenIron3Item;
import net.maketendo.forgedreactor.item.MoltenIron2Item;
import net.maketendo.forgedreactor.item.MoltenIron1Item;
import net.maketendo.forgedreactor.item.Mk9IronArmorItem;
import net.maketendo.forgedreactor.item.Mk8IronArmorItem;
import net.maketendo.forgedreactor.item.Mk7IronArmorItem;
import net.maketendo.forgedreactor.item.Mk6IronArmorItem;
import net.maketendo.forgedreactor.item.Mk5SuitcaseItem;
import net.maketendo.forgedreactor.item.Mk5IronArmorItem;
import net.maketendo.forgedreactor.item.Mk4IronArmorItem;
import net.maketendo.forgedreactor.item.Mk3IronArmorItem;
import net.maketendo.forgedreactor.item.Mk2IronArmorItem;
import net.maketendo.forgedreactor.item.Mk1IronArmorItem;
import net.maketendo.forgedreactor.item.Mk1IronArmorHelmetOpenItem;
import net.maketendo.forgedreactor.item.HeatedMoltenIron3Item;
import net.maketendo.forgedreactor.item.HeatedMoltenIron2Item;
import net.maketendo.forgedreactor.item.HammerItem;
import net.maketendo.forgedreactor.item.FlightTestArmorItem;
import net.maketendo.forgedreactor.item.BatteryItem;
import net.maketendo.forgedreactor.item.ArcReactorItem;
import net.maketendo.forgedreactor.ForgedReactorMod;

public class ForgedReactorModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ForgedReactorMod.MODID);
	public static final RegistryObject<Item> MK_1_IRON_ARMOR_HELMET = REGISTRY.register("mk_1_iron_armor_helmet", () -> new Mk1IronArmorItem.Helmet());
	public static final RegistryObject<Item> MK_1_IRON_ARMOR_CHESTPLATE = REGISTRY.register("mk_1_iron_armor_chestplate", () -> new Mk1IronArmorItem.Chestplate());
	public static final RegistryObject<Item> MK_1_IRON_ARMOR_LEGGINGS = REGISTRY.register("mk_1_iron_armor_leggings", () -> new Mk1IronArmorItem.Leggings());
	public static final RegistryObject<Item> MK_1_IRON_ARMOR_BOOTS = REGISTRY.register("mk_1_iron_armor_boots", () -> new Mk1IronArmorItem.Boots());
	public static final RegistryObject<Item> MK_2_IRON_ARMOR_HELMET = REGISTRY.register("mk_2_iron_armor_helmet", () -> new Mk2IronArmorItem.Helmet());
	public static final RegistryObject<Item> MK_2_IRON_ARMOR_CHESTPLATE = REGISTRY.register("mk_2_iron_armor_chestplate", () -> new Mk2IronArmorItem.Chestplate());
	public static final RegistryObject<Item> MK_2_IRON_ARMOR_LEGGINGS = REGISTRY.register("mk_2_iron_armor_leggings", () -> new Mk2IronArmorItem.Leggings());
	public static final RegistryObject<Item> MK_2_IRON_ARMOR_BOOTS = REGISTRY.register("mk_2_iron_armor_boots", () -> new Mk2IronArmorItem.Boots());
	public static final RegistryObject<Item> MK_3_IRON_ARMOR_HELMET = REGISTRY.register("mk_3_iron_armor_helmet", () -> new Mk3IronArmorItem.Helmet());
	public static final RegistryObject<Item> MK_3_IRON_ARMOR_CHESTPLATE = REGISTRY.register("mk_3_iron_armor_chestplate", () -> new Mk3IronArmorItem.Chestplate());
	public static final RegistryObject<Item> MK_3_IRON_ARMOR_LEGGINGS = REGISTRY.register("mk_3_iron_armor_leggings", () -> new Mk3IronArmorItem.Leggings());
	public static final RegistryObject<Item> MK_3_IRON_ARMOR_BOOTS = REGISTRY.register("mk_3_iron_armor_boots", () -> new Mk3IronArmorItem.Boots());
	public static final RegistryObject<Item> FLIGHT_TEST_ARMOR_CHESTPLATE = REGISTRY.register("flight_test_armor_chestplate", () -> new FlightTestArmorItem.Chestplate());
	public static final RegistryObject<Item> FLIGHT_TEST_ARMOR_BOOTS = REGISTRY.register("flight_test_armor_boots", () -> new FlightTestArmorItem.Boots());
	public static final RegistryObject<Item> ARMOR_CONFIGURATOR = block(ForgedReactorModBlocks.ARMOR_CONFIGURATOR);
	public static final RegistryObject<Item> MK_1_IRON_ARMOR_HELMET_OPEN_HELMET = REGISTRY.register("mk_1_iron_armor_helmet_open_helmet", () -> new Mk1IronArmorHelmetOpenItem.Helmet());
	public static final RegistryObject<Item> MK_4_IRON_ARMOR_HELMET = REGISTRY.register("mk_4_iron_armor_helmet", () -> new Mk4IronArmorItem.Helmet());
	public static final RegistryObject<Item> MK_4_IRON_ARMOR_CHESTPLATE = REGISTRY.register("mk_4_iron_armor_chestplate", () -> new Mk4IronArmorItem.Chestplate());
	public static final RegistryObject<Item> MK_4_IRON_ARMOR_LEGGINGS = REGISTRY.register("mk_4_iron_armor_leggings", () -> new Mk4IronArmorItem.Leggings());
	public static final RegistryObject<Item> MK_4_IRON_ARMOR_BOOTS = REGISTRY.register("mk_4_iron_armor_boots", () -> new Mk4IronArmorItem.Boots());
	public static final RegistryObject<Item> MK_5_IRON_ARMOR_HELMET = REGISTRY.register("mk_5_iron_armor_helmet", () -> new Mk5IronArmorItem.Helmet());
	public static final RegistryObject<Item> MK_5_IRON_ARMOR_CHESTPLATE = REGISTRY.register("mk_5_iron_armor_chestplate", () -> new Mk5IronArmorItem.Chestplate());
	public static final RegistryObject<Item> MK_5_IRON_ARMOR_LEGGINGS = REGISTRY.register("mk_5_iron_armor_leggings", () -> new Mk5IronArmorItem.Leggings());
	public static final RegistryObject<Item> MK_5_IRON_ARMOR_BOOTS = REGISTRY.register("mk_5_iron_armor_boots", () -> new Mk5IronArmorItem.Boots());
	public static final RegistryObject<Item> MK_5_SUITCASE = REGISTRY.register("mk_5_suitcase", () -> new Mk5SuitcaseItem());
	public static final RegistryObject<Item> MK_6_IRON_ARMOR_HELMET = REGISTRY.register("mk_6_iron_armor_helmet", () -> new Mk6IronArmorItem.Helmet());
	public static final RegistryObject<Item> MK_6_IRON_ARMOR_CHESTPLATE = REGISTRY.register("mk_6_iron_armor_chestplate", () -> new Mk6IronArmorItem.Chestplate());
	public static final RegistryObject<Item> MK_6_IRON_ARMOR_LEGGINGS = REGISTRY.register("mk_6_iron_armor_leggings", () -> new Mk6IronArmorItem.Leggings());
	public static final RegistryObject<Item> MK_6_IRON_ARMOR_BOOTS = REGISTRY.register("mk_6_iron_armor_boots", () -> new Mk6IronArmorItem.Boots());
	public static final RegistryObject<Item> UPGRADE_TEMPLATE = REGISTRY.register("upgrade_template", () -> new UpgradeTemplateItem());
	public static final RegistryObject<Item> MK_7_IRON_ARMOR_HELMET = REGISTRY.register("mk_7_iron_armor_helmet", () -> new Mk7IronArmorItem.Helmet());
	public static final RegistryObject<Item> MK_7_IRON_ARMOR_CHESTPLATE = REGISTRY.register("mk_7_iron_armor_chestplate", () -> new Mk7IronArmorItem.Chestplate());
	public static final RegistryObject<Item> MK_7_IRON_ARMOR_LEGGINGS = REGISTRY.register("mk_7_iron_armor_leggings", () -> new Mk7IronArmorItem.Leggings());
	public static final RegistryObject<Item> MK_7_IRON_ARMOR_BOOTS = REGISTRY.register("mk_7_iron_armor_boots", () -> new Mk7IronArmorItem.Boots());
	public static final RegistryObject<Item> MK_8_IRON_ARMOR_HELMET = REGISTRY.register("mk_8_iron_armor_helmet", () -> new Mk8IronArmorItem.Helmet());
	public static final RegistryObject<Item> MK_8_IRON_ARMOR_CHESTPLATE = REGISTRY.register("mk_8_iron_armor_chestplate", () -> new Mk8IronArmorItem.Chestplate());
	public static final RegistryObject<Item> MK_8_IRON_ARMOR_LEGGINGS = REGISTRY.register("mk_8_iron_armor_leggings", () -> new Mk8IronArmorItem.Leggings());
	public static final RegistryObject<Item> MK_8_IRON_ARMOR_BOOTS = REGISTRY.register("mk_8_iron_armor_boots", () -> new Mk8IronArmorItem.Boots());
	public static final RegistryObject<Item> MK_9_IRON_ARMOR_HELMET = REGISTRY.register("mk_9_iron_armor_helmet", () -> new Mk9IronArmorItem.Helmet());
	public static final RegistryObject<Item> MK_9_IRON_ARMOR_CHESTPLATE = REGISTRY.register("mk_9_iron_armor_chestplate", () -> new Mk9IronArmorItem.Chestplate());
	public static final RegistryObject<Item> MK_9_IRON_ARMOR_LEGGINGS = REGISTRY.register("mk_9_iron_armor_leggings", () -> new Mk9IronArmorItem.Leggings());
	public static final RegistryObject<Item> MK_9_IRON_ARMOR_BOOTS = REGISTRY.register("mk_9_iron_armor_boots", () -> new Mk9IronArmorItem.Boots());
	public static final RegistryObject<Item> ARMOR_WITHDRAWER = block(ForgedReactorModBlocks.ARMOR_WITHDRAWER);
	public static final RegistryObject<Item> BATTERY = REGISTRY.register("battery", () -> new BatteryItem());
	public static final RegistryObject<Item> MOLTEN_IRON = REGISTRY.register("molten_iron", () -> new MoltenIronItem());
	public static final RegistryObject<Item> MOLTEN_IRON_1 = REGISTRY.register("molten_iron_1", () -> new MoltenIron1Item());
	public static final RegistryObject<Item> MOLTEN_IRON_2 = REGISTRY.register("molten_iron_2", () -> new MoltenIron2Item());
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> ARC_REACTOR = REGISTRY.register("arc_reactor", () -> new ArcReactorItem());
	public static final RegistryObject<Item> WIND_BOOST_SPAWN_EGG = REGISTRY.register("wind_boost_spawn_egg", () -> new ForgeSpawnEggItem(ForgedReactorModEntities.WIND_BOOST, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> HEATED_MOLTEN_IRON_2 = REGISTRY.register("heated_molten_iron_2", () -> new HeatedMoltenIron2Item());
	public static final RegistryObject<Item> MOLTEN_IRON_3 = REGISTRY.register("molten_iron_3", () -> new MoltenIron3Item());
	public static final RegistryObject<Item> HEATED_MOLTEN_IRON_3 = REGISTRY.register("heated_molten_iron_3", () -> new HeatedMoltenIron3Item());
	public static final RegistryObject<Item> RAW_PALLADIUM = REGISTRY.register("raw_palladium", () -> new RawPalladiumItem());
	public static final RegistryObject<Item> PALLADIUM_INGOT = REGISTRY.register("palladium_ingot", () -> new PalladiumIngotItem());
	public static final RegistryObject<Item> PALLADIUM_ORE = block(ForgedReactorModBlocks.PALLADIUM_ORE);
	public static final RegistryObject<Item> DEEPSLATE_PALLADIUM_ORE = block(ForgedReactorModBlocks.DEEPSLATE_PALLADIUM_ORE);
	public static final RegistryObject<Item> MK_7_SUMMONING_POD_SPAWN_EGG = REGISTRY.register("mk_7_summoning_pod_spawn_egg", () -> new ForgeSpawnEggItem(ForgedReactorModEntities.MK_7_SUMMONING_POD, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
