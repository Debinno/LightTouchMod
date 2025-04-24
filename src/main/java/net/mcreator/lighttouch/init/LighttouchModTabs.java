
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lighttouch.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.lighttouch.LighttouchMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class LighttouchModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LighttouchMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LIGHT_TOUCH_MINERALS = REGISTRY.register("light_touch_minerals",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lighttouch.light_touch_minerals")).icon(() -> new ItemStack(LighttouchModItems.TUNGSTEN_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LighttouchModItems.TUNGSTEN_INGOT.get());
				tabData.accept(LighttouchModBlocks.TUNGSTEN_ORE.get().asItem());
				tabData.accept(LighttouchModBlocks.TUNGSTEN_BLOCK.get().asItem());
				tabData.accept(LighttouchModItems.TUNGSTEN_RAW.get());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LIGHT_TOUCH_TOOLS = REGISTRY.register("light_touch_tools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lighttouch.light_touch_tools")).icon(() -> new ItemStack(LighttouchModItems.TUNGSTEN_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LighttouchModItems.TUNGSTEN_PICKAXE.get());
				tabData.accept(LighttouchModItems.TUNGSTEN_AXE.get());
				tabData.accept(LighttouchModItems.TUNGSTEN_SWORD.get());
			}).withTabsBefore(LIGHT_TOUCH_MINERALS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LIGHT_TOUCH = REGISTRY.register("light_touch",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lighttouch.light_touch")).icon(() -> new ItemStack(LighttouchModBlocks.MAPLE_PLANKS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LighttouchModBlocks.MAPLE_WOOD.get().asItem());
				tabData.accept(LighttouchModBlocks.MAPLE_LOG.get().asItem());
				tabData.accept(LighttouchModBlocks.MAPLE_PLANKS.get().asItem());
				tabData.accept(LighttouchModBlocks.MAPLE_LEAVES.get().asItem());
				tabData.accept(LighttouchModBlocks.MAPLE_STAIRS.get().asItem());
				tabData.accept(LighttouchModBlocks.MAPLE_SLAB.get().asItem());
				tabData.accept(LighttouchModBlocks.MAPLE_FENCE.get().asItem());
				tabData.accept(LighttouchModBlocks.MAPLE_FENCE_GATE.get().asItem());
				tabData.accept(LighttouchModBlocks.MAPLE_PRESSURE_PLATE.get().asItem());
				tabData.accept(LighttouchModBlocks.MAPLE_BUTTON.get().asItem());
			}).withTabsBefore(LIGHT_TOUCH_TOOLS.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(LighttouchModItems.TUNGSTEN_INGOT.get());
			tabData.accept(LighttouchModItems.TUNGSTEN_RAW.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(LighttouchModBlocks.TUNGSTEN_ORE.get().asItem());
			tabData.accept(LighttouchModBlocks.TUNGSTEN_BLOCK.get().asItem());
			tabData.accept(LighttouchModBlocks.MAPLE_WOOD.get().asItem());
			tabData.accept(LighttouchModBlocks.MAPLE_LOG.get().asItem());
			tabData.accept(LighttouchModBlocks.MAPLE_PLANKS.get().asItem());
			tabData.accept(LighttouchModBlocks.MAPLE_STAIRS.get().asItem());
			tabData.accept(LighttouchModBlocks.MAPLE_SLAB.get().asItem());
			tabData.accept(LighttouchModBlocks.MAPLE_FENCE.get().asItem());
			tabData.accept(LighttouchModBlocks.MAPLE_FENCE_GATE.get().asItem());
			tabData.accept(LighttouchModBlocks.MAPLE_PRESSURE_PLATE.get().asItem());
			tabData.accept(LighttouchModBlocks.MAPLE_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LighttouchModItems.TUNGSTEN_PICKAXE.get());
			tabData.accept(LighttouchModItems.TUNGSTEN_AXE.get());
			tabData.accept(LighttouchModItems.TUNGSTEN_SHOVEL.get());
			tabData.accept(LighttouchModItems.TUNGSTEN_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(LighttouchModItems.TUNGSTEN_SWORD.get());
			tabData.accept(LighttouchModItems.TUNGSTEN_ARMOR_HELMET.get());
			tabData.accept(LighttouchModItems.TUNGSTEN_ARMOR_CHESTPLATE.get());
			tabData.accept(LighttouchModItems.TUNGSTEN_ARMOR_LEGGINGS.get());
			tabData.accept(LighttouchModItems.TUNGSTEN_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(LighttouchModBlocks.MAPLE_LEAVES.get().asItem());
		}
	}
}
