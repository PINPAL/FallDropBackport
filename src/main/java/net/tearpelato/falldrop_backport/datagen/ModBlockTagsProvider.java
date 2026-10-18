package net.tearpelato.falldrop_backport.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.tearpelato.falldrop_backport.init.ModBlocks;
import net.tearpelato.falldrop_backport.init.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.LOGS)
                .add(ModBlocks.POPLAR_LOG.builtInRegistryHolder().key())
                .add(ModBlocks.POPLAR_WOOD.builtInRegistryHolder().key())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.builtInRegistryHolder().key())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.builtInRegistryHolder().key());

        tag(BlockTags.LEAVES)
                .add(ModBlocks.RED_POPLAR_LEAVES.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_POPLAR_LEAVES.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_POPLAR_LEAVES.builtInRegistryHolder().key());


        tag(BlockTags.STAIRS)
                .add(ModBlocks.POPLAR_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.WHITE_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.RED_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.WHITE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_STAIRS.builtInRegistryHolder().key());


        tag(BlockTags.SLABS)
                .add(ModBlocks.POPLAR_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.WHITE_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.RED_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.WHITE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_SLAB.builtInRegistryHolder().key());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.WHITE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.WHITE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_SLAB.builtInRegistryHolder().key());
        

        tag(BlockTags.FENCES).add(ModBlocks.POPLAR_FENCE.builtInRegistryHolder().key());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.POPLAR_FENCE_GATE.builtInRegistryHolder().key());
        tag(BlockTags.DOORS).add(ModBlocks.POPLAR_DOOR.builtInRegistryHolder().key());
        tag(BlockTags.WOODEN_SHELVES).add(ModBlocks.POPLAR_SHELF.builtInRegistryHolder().key());

        tag(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POPLAR_SAPLING_POTTED.builtInRegistryHolder().key())
                .add(ModBlocks.RED_SHRUB_POTTED.builtInRegistryHolder().key());

        tag(BlockTags.WOODEN_BUTTONS).add(ModBlocks.POPLAR_BUTTON.builtInRegistryHolder().key());
        tag(BlockTags.WOODEN_DOORS).add(ModBlocks.POPLAR_DOOR.builtInRegistryHolder().key());
        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.POPLAR_FENCE.builtInRegistryHolder().key());
        tag(BlockTags.WOODEN_SLABS).add(ModBlocks.POPLAR_SLAB.builtInRegistryHolder().key());
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.POPLAR_PRESSURE_PLATE.builtInRegistryHolder().key());
        tag(BlockTags.WOODEN_STAIRS).add(ModBlocks.POPLAR_STAIRS.builtInRegistryHolder().key());
        tag(BlockTags.WOODEN_TRAPDOORS).add(ModBlocks.POPLAR_TRAPDOOR.builtInRegistryHolder().key());
        tag(BlockTags.SIGNS)
                .add(ModBlocks.POPLAR_SIGN.builtInRegistryHolder().key())
                .add(ModBlocks.POPLAR_WALL_SIGN.builtInRegistryHolder().key());
        tag(BlockTags.WALL_SIGNS).add(ModBlocks.POPLAR_WALL_SIGN.builtInRegistryHolder().key());
        tag(BlockTags.STANDING_SIGNS).add(ModBlocks.POPLAR_SIGN.builtInRegistryHolder().key());

        tag(BlockTags.ALL_HANGING_SIGNS)
                .add(ModBlocks.POPLAR_HANGING_SIGN.builtInRegistryHolder().key())
                .add(ModBlocks.POPLAR_WALL_HANGING_SIGN.builtInRegistryHolder().key());

        tag(BlockTags.WOOL)
                .add(ModBlocks.WHITE_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.RED_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_WOOL_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.WHITE_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.RED_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_WOOL_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_WOOL_SLAB.builtInRegistryHolder().key());

        tag(ModTags.Blocks.CUSHION_USES_COLLISION_SHAPE)
                .add(Blocks.CAULDRON.builtInRegistryHolder().key())
                .add(Blocks.WATER_CAULDRON.builtInRegistryHolder().key())
                .add(Blocks.LAVA_CAULDRON.builtInRegistryHolder().key())
                .add(Blocks.POWDER_SNOW_CAULDRON.builtInRegistryHolder().key())
                .add(Blocks.HOPPER.builtInRegistryHolder().key())
                .add(Blocks.COMPOSTER.builtInRegistryHolder().key());
        
        

    }
}