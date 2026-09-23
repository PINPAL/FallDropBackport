package net.tearpelato.falldrop_backport.init;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeTabs {

	public static void registerVanillaTabs() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
			entries.insertAfter(Blocks.PALE_OAK_BUTTON,
			  ModBlocks.POPLAR_LOG,
			  ModBlocks.POPLAR_WOOD,
			  ModBlocks.STRIPPED_POPLAR_LOG,
			  ModBlocks.STRIPPED_POPLAR_WOOD,
			  ModBlocks.POPLAR_PLANKS,
			  ModBlocks.POPLAR_STAIRS,
			  ModBlocks.POPLAR_SLAB,
			  ModBlocks.POPLAR_FENCE,
			  ModBlocks.POPLAR_FENCE_GATE,
			  ModBlocks.POPLAR_DOOR,
			  ModBlocks.POPLAR_TRAPDOOR,
			  ModBlocks.POPLAR_PRESSURE_PLATE,
			  ModBlocks.POPLAR_BUTTON
			);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> {
			entries.insertAfter(Blocks.WOOL.pink(),
			  ModBlocks.WHITE_WOOL_STAIRS,
			  ModBlocks.LIGHT_GRAY_WOOL_STAIRS,
			  ModBlocks.GRAY_WOOL_STAIRS,
			  ModBlocks.BLACK_WOOL_STAIRS,
			  ModBlocks.BROWN_WOOL_STAIRS,
			  ModBlocks.RED_WOOL_STAIRS,
			  ModBlocks.ORANGE_WOOL_STAIRS,
			  ModBlocks.YELLOW_WOOL_STAIRS,
			  ModBlocks.LIME_WOOL_STAIRS,
			  ModBlocks.GREEN_WOOL_STAIRS,
			  ModBlocks.CYAN_WOOL_STAIRS,
			  ModBlocks.LIGHT_BLUE_WOOL_STAIRS,
			  ModBlocks.BLUE_WOOL_STAIRS,
			  ModBlocks.PURPLE_WOOL_STAIRS,
			  ModBlocks.MAGENTA_WOOL_STAIRS,
			  ModBlocks.PINK_WOOL_STAIRS,
			  ModBlocks.WHITE_WOOL_SLAB,
			  ModBlocks.LIGHT_GRAY_WOOL_SLAB,
			  ModBlocks.GRAY_WOOL_SLAB,
			  ModBlocks.BLACK_WOOL_SLAB,
			  ModBlocks.BROWN_WOOL_SLAB,
			  ModBlocks.RED_WOOL_SLAB,
			  ModBlocks.ORANGE_WOOL_SLAB,
			  ModBlocks.YELLOW_WOOL_SLAB,
			  ModBlocks.LIME_WOOL_SLAB,
			  ModBlocks.GREEN_WOOL_SLAB,
			  ModBlocks.CYAN_WOOL_SLAB,
			  ModBlocks.LIGHT_BLUE_WOOL_SLAB,
			  ModBlocks.BLUE_WOOL_SLAB,
			  ModBlocks.PURPLE_WOOL_SLAB,
			  ModBlocks.MAGENTA_WOOL_SLAB,
			  ModBlocks.PINK_WOOL_SLAB
			);
			entries.insertAfter(Blocks.CONCRETE.pink(),
			  ModBlocks.WHITE_CONCRETE_STAIRS,
			  ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS,
			  ModBlocks.GRAY_CONCRETE_STAIRS,
			  ModBlocks.BLACK_CONCRETE_STAIRS,
			  ModBlocks.BROWN_CONCRETE_STAIRS,
			  ModBlocks.RED_CONCRETE_STAIRS,
			  ModBlocks.ORANGE_CONCRETE_STAIRS,
			  ModBlocks.YELLOW_CONCRETE_STAIRS,
			  ModBlocks.LIME_CONCRETE_STAIRS,
			  ModBlocks.GREEN_CONCRETE_STAIRS,
			  ModBlocks.CYAN_CONCRETE_STAIRS,
			  ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS,
			  ModBlocks.BLUE_CONCRETE_STAIRS,
			  ModBlocks.PURPLE_CONCRETE_STAIRS,
			  ModBlocks.MAGENTA_CONCRETE_STAIRS,
			  ModBlocks.PINK_CONCRETE_STAIRS,
			  ModBlocks.WHITE_CONCRETE_SLAB,
			  ModBlocks.LIGHT_GRAY_CONCRETE_SLAB,
			  ModBlocks.GRAY_CONCRETE_SLAB,
			  ModBlocks.BLACK_CONCRETE_SLAB,
			  ModBlocks.BROWN_CONCRETE_SLAB,
			  ModBlocks.RED_CONCRETE_SLAB,
			  ModBlocks.ORANGE_CONCRETE_SLAB,
			  ModBlocks.YELLOW_CONCRETE_SLAB,
			  ModBlocks.LIME_CONCRETE_SLAB,
			  ModBlocks.GREEN_CONCRETE_SLAB,
			  ModBlocks.CYAN_CONCRETE_SLAB,
			  ModBlocks.LIGHT_BLUE_CONCRETE_SLAB,
			  ModBlocks.BLUE_CONCRETE_SLAB,
			  ModBlocks.PURPLE_CONCRETE_SLAB,
			  ModBlocks.MAGENTA_CONCRETE_SLAB,
			  ModBlocks.PINK_CONCRETE_SLAB
			);
			entries.insertAfter(
			  Blocks.BED.pink(),
//			  ModItems.CUSHION.asList().toArray(ItemLike[]::new)
			  ModItems.CUSHION.white(),
			  ModItems.CUSHION.lightGray(),
			  ModItems.CUSHION.gray(),
			  ModItems.CUSHION.black(),
			  ModItems.CUSHION.brown(),
			  ModItems.CUSHION.red(),
			  ModItems.CUSHION.orange(),
			  ModItems.CUSHION.yellow(),
			  ModItems.CUSHION.lime(),
			  ModItems.CUSHION.green(),
			  ModItems.CUSHION.cyan(),
			  ModItems.CUSHION.lightBlue(),
			  ModItems.CUSHION.blue(),
			  ModItems.CUSHION.purple(),
			  ModItems.CUSHION.magenta(),
			  ModItems.CUSHION.pink()
			);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(entries -> {
			entries.insertAfter(Blocks.PALE_OAK_LOG, ModBlocks.POPLAR_LOG);
			entries.insertAfter(Blocks.PALE_OAK_LEAVES,
			                    ModBlocks.RED_POPLAR_LEAVES, ModBlocks.ORANGE_POPLAR_LEAVES, ModBlocks.YELLOW_POPLAR_LEAVES);
			entries.insertAfter(Blocks.PALE_OAK_SAPLING, ModBlocks.POPLAR_SAPLING);
			entries.insertAfter(Blocks.RED_MUSHROOM,ModBlocks.SHELF_MUSHROOM);
			entries.insertAfter(Blocks.BUSH,ModBlocks.RED_SHRUB);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> {
			entries.insertAfter(Blocks.PALE_OAK_SHELF, ModBlocks.POPLAR_SHELF);
			entries.insertAfter(Blocks.PALE_OAK_HANGING_SIGN,
			                    ModItems.POPLAR_SIGN,
			                    ModItems.POPLAR_HANGING_SIGN);
			entries.insertAfter(Blocks.BED.pink(), ModBlocks.STRAW_BED);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> {
			entries.insertAfter(Items.PALE_OAK_CHEST_BOAT,
			                    ModItems.POPLAR_BOAT, ModItems.POPLAR_CHEST_BOAT);
		});
	}
}