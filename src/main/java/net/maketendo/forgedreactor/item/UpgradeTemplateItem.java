
package net.maketendo.forgedreactor.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UpgradeTemplateItem extends Item {
	public UpgradeTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
