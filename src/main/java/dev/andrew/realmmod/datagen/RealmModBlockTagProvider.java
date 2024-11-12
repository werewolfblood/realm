package dev.andrew.realmmod.datagen;

import dev.andrew.realmmod.block.InitBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class RealmModBlockTagProvider extends FabricTagProvider.BlockTagProvider{
    public RealmModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(InitBlocks.GREEN_ORE)
                .add(InitBlocks.CRYSTAL_ORE)
                .add(InitBlocks.OSCINE_ORE)
                .add(InitBlocks.MITHRIL_ORE);


        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(InitBlocks.PINE)
                .add(InitBlocks.DARKELF_LOG)
                .add(InitBlocks.BLUECRYSTAL_LOG)
                .add(InitBlocks.MITHRIL_LOG);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(InitBlocks.ELF_LOG)
                .add(InitBlocks.ELF_WOOD)
                .add(InitBlocks.PINE)
                .add(InitBlocks.DWARF_PLANKS)
                .add(InitBlocks.DARKELF_LOG)
                .add(InitBlocks.BLUECRYSTAL_LOG)
                .add(InitBlocks.MITHRIL_LOG);
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(InitBlocks.MITHRIL_LEAVES)
                .add(InitBlocks.CRYSTAL_LEAVES);
       getOrCreateTagBuilder(BlockTags.SLABS)
               .add(InitBlocks.CRYSTAL_SLAB)
               .add(InitBlocks.ANGBAND_SLAB)
               .add(InitBlocks.MITHRIL_SLAB);
       getOrCreateTagBuilder(BlockTags.FENCES)
               .add(InitBlocks.CRYSTAL_FENCE)
               .add(InitBlocks.ANGBAND_FENCE)
               .add(InitBlocks.MITHRIL_FENCE);
       getOrCreateTagBuilder(BlockTags.PLANKS)
               .add(InitBlocks.DWARF_PLANKS);


        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(InitBlocks.MITHRIL_STONE)
                .add(InitBlocks.CRYSTAL_STONE)
                .add(InitBlocks.CRYSTAL_ORE)
                .add(InitBlocks.MITHRIL_BRICK)
                .add(InitBlocks.CRYSTAL_BRICK)
                .add(InitBlocks.ANGBAND_STONE)
                .add(InitBlocks.ANGBAND_BRICK)
                .add(InitBlocks.CRYSTAL_SLAB)
                .add(InitBlocks.CRYSTAL_FENCE)
                .add(InitBlocks.ANGBAND_FENCE)
                .add(InitBlocks.ANGBAND_SLAB)
                .add(InitBlocks.MITHRIL_FENCE)
                .add(InitBlocks.MORDOR_STONE)
                .add(InitBlocks.MORDOR_BRICK)
                .add(InitBlocks.MITHRIL_ORE);



    }
}
