
package net.maketendo.forgedreactor.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class UpgradeTemplateItem extends Item {
	public UpgradeTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A78The Upgrade Template Item is your"));
		list.add(Component.literal("\u00A78gateway to upgrade your very own"));
		list.add(Component.literal("\u00A78Iron Armor to it's full potential!"));
	}
}
