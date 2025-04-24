
package net.mcreator.lighttouch.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TungstenPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1800, 7.5f, 0, 12, TagKey.create(Registries.ITEM, ResourceLocation.parse("lighttouch:tungsten_pickaxe_repair_items")));

	public TungstenPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, -2f, properties);
	}
}
