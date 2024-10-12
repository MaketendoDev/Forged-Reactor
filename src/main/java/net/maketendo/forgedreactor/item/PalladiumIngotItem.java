
package net.maketendo.forgedreactor.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PalladiumIngotItem extends Item {
	public PalladiumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
