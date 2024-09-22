
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.maketendo.forgedreactor.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.maketendo.forgedreactor.item.Mk3IronArmorItem;
import net.maketendo.forgedreactor.item.Mk2IronArmorItem;
import net.maketendo.forgedreactor.item.Mk1IronArmorItem;
import net.maketendo.forgedreactor.item.FlightTestArmorItem;
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
	// Start of user code block custom items
	// End of user code block custom items
}
