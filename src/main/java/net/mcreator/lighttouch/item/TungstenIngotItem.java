
package net.mcreator.lighttouch.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TungstenIngotItem extends Item {
	public TungstenIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
