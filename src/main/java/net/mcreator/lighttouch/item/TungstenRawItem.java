
package net.mcreator.lighttouch.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TungstenRawItem extends Item {
	public TungstenRawItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
