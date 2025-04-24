
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lighttouch.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lighttouch.item.TungstenSwordItem;
import net.mcreator.lighttouch.item.TungstenShovelItem;
import net.mcreator.lighttouch.item.TungstenRawItem;
import net.mcreator.lighttouch.item.TungstenPickaxeItem;
import net.mcreator.lighttouch.item.TungstenIngotItem;
import net.mcreator.lighttouch.item.TungstenHoeItem;
import net.mcreator.lighttouch.item.TungstenAxeItem;
import net.mcreator.lighttouch.item.TungstenArmorItem;
import net.mcreator.lighttouch.LighttouchMod;

import java.util.function.Function;

public class LighttouchModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LighttouchMod.MODID);
	public static final DeferredItem<Item> TUNGSTEN_INGOT = register("tungsten_ingot", TungstenIngotItem::new);
	public static final DeferredItem<Item> TUNGSTEN_ORE = block(LighttouchModBlocks.TUNGSTEN_ORE);
	public static final DeferredItem<Item> TUNGSTEN_BLOCK = block(LighttouchModBlocks.TUNGSTEN_BLOCK);
	public static final DeferredItem<Item> TUNGSTEN_RAW = register("tungsten_raw", TungstenRawItem::new);
	public static final DeferredItem<Item> TUNGSTEN_PICKAXE = register("tungsten_pickaxe", TungstenPickaxeItem::new);
	public static final DeferredItem<Item> TUNGSTEN_AXE = register("tungsten_axe", TungstenAxeItem::new);
	public static final DeferredItem<Item> TUNGSTEN_SWORD = register("tungsten_sword", TungstenSwordItem::new);
	public static final DeferredItem<Item> TUNGSTEN_SHOVEL = register("tungsten_shovel", TungstenShovelItem::new);
	public static final DeferredItem<Item> TUNGSTEN_HOE = register("tungsten_hoe", TungstenHoeItem::new);
	public static final DeferredItem<Item> TUNGSTEN_ARMOR_HELMET = register("tungsten_armor_helmet", TungstenArmorItem.Helmet::new);
	public static final DeferredItem<Item> TUNGSTEN_ARMOR_CHESTPLATE = register("tungsten_armor_chestplate", TungstenArmorItem.Chestplate::new);
	public static final DeferredItem<Item> TUNGSTEN_ARMOR_LEGGINGS = register("tungsten_armor_leggings", TungstenArmorItem.Leggings::new);
	public static final DeferredItem<Item> TUNGSTEN_ARMOR_BOOTS = register("tungsten_armor_boots", TungstenArmorItem.Boots::new);
	public static final DeferredItem<Item> MAPLE_WOOD = block(LighttouchModBlocks.MAPLE_WOOD);
	public static final DeferredItem<Item> MAPLE_LOG = block(LighttouchModBlocks.MAPLE_LOG);
	public static final DeferredItem<Item> MAPLE_PLANKS = block(LighttouchModBlocks.MAPLE_PLANKS);
	public static final DeferredItem<Item> MAPLE_LEAVES = block(LighttouchModBlocks.MAPLE_LEAVES);
	public static final DeferredItem<Item> MAPLE_STAIRS = block(LighttouchModBlocks.MAPLE_STAIRS);
	public static final DeferredItem<Item> MAPLE_SLAB = block(LighttouchModBlocks.MAPLE_SLAB);
	public static final DeferredItem<Item> MAPLE_FENCE = block(LighttouchModBlocks.MAPLE_FENCE);
	public static final DeferredItem<Item> MAPLE_FENCE_GATE = block(LighttouchModBlocks.MAPLE_FENCE_GATE);
	public static final DeferredItem<Item> MAPLE_PRESSURE_PLATE = block(LighttouchModBlocks.MAPLE_PRESSURE_PLATE);
	public static final DeferredItem<Item> MAPLE_BUTTON = block(LighttouchModBlocks.MAPLE_BUTTON);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
