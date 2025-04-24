
package net.mcreator.lighttouch.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TungstenShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("lighttouch:tungsten_shovel_repair_items")));

	public TungstenShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, -1f, properties);
	}
}
