
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lighttouch.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.lighttouch.block.TungstenOreBlock;
import net.mcreator.lighttouch.block.TungstenBlockBlock;
import net.mcreator.lighttouch.block.MapleWoodBlock;
import net.mcreator.lighttouch.block.MapleStairsBlock;
import net.mcreator.lighttouch.block.MapleSlabBlock;
import net.mcreator.lighttouch.block.MaplePressurePlateBlock;
import net.mcreator.lighttouch.block.MaplePlanksBlock;
import net.mcreator.lighttouch.block.MapleLogBlock;
import net.mcreator.lighttouch.block.MapleLeavesBlock;
import net.mcreator.lighttouch.block.MapleFenceGateBlock;
import net.mcreator.lighttouch.block.MapleFenceBlock;
import net.mcreator.lighttouch.block.MapleButtonBlock;
import net.mcreator.lighttouch.LighttouchMod;

import java.util.function.Function;

public class LighttouchModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LighttouchMod.MODID);
	public static final DeferredBlock<Block> TUNGSTEN_ORE = register("tungsten_ore", TungstenOreBlock::new);
	public static final DeferredBlock<Block> TUNGSTEN_BLOCK = register("tungsten_block", TungstenBlockBlock::new);
	public static final DeferredBlock<Block> MAPLE_WOOD = register("maple_wood", MapleWoodBlock::new);
	public static final DeferredBlock<Block> MAPLE_LOG = register("maple_log", MapleLogBlock::new);
	public static final DeferredBlock<Block> MAPLE_PLANKS = register("maple_planks", MaplePlanksBlock::new);
	public static final DeferredBlock<Block> MAPLE_LEAVES = register("maple_leaves", MapleLeavesBlock::new);
	public static final DeferredBlock<Block> MAPLE_STAIRS = register("maple_stairs", MapleStairsBlock::new);
	public static final DeferredBlock<Block> MAPLE_SLAB = register("maple_slab", MapleSlabBlock::new);
	public static final DeferredBlock<Block> MAPLE_FENCE = register("maple_fence", MapleFenceBlock::new);
	public static final DeferredBlock<Block> MAPLE_FENCE_GATE = register("maple_fence_gate", MapleFenceGateBlock::new);
	public static final DeferredBlock<Block> MAPLE_PRESSURE_PLATE = register("maple_pressure_plate", MaplePressurePlateBlock::new);
	public static final DeferredBlock<Block> MAPLE_BUTTON = register("maple_button", MapleButtonBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
