
package net.mcreator.lighttouch.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TungstenHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("lighttouch:tungsten_hoe_repair_items")));

	public TungstenHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, -1f, properties);
	}
}
