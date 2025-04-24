
package net.mcreator.lighttouch.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TungstenSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 250, 8.5f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("lighttouch:tungsten_sword_repair_items")));

	public TungstenSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 5f, -2f, properties);
	}
}
