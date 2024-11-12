package dev.andrew.realmmod.datagen;

import dev.andrew.realmmod.block.InitBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RealmModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public RealmModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(InitBlocks.MITHRIL_ORE);
        addDrop(InitBlocks.MITHRIL_LOG);
        addDrop(InitBlocks.CRYSTAL_ORE);
        addDrop(InitBlocks.MITHRIL_STONE);
        addDrop(InitBlocks.ANGBAND_STONE);
        addDrop(InitBlocks.CRYSTAL_STONE);
        addDrop(InitBlocks.MITHRIL_BRICK);
        addDrop(InitBlocks.CRYSTAL_BRICK);
        addDrop(InitBlocks.BLUECRYSTAL_LOG);
        addDrop(InitBlocks.ANGBAND_BRICK);
        addDrop(InitBlocks.MITHRIL_SLAB);
        addDrop(InitBlocks.MITHRIL_FENCE);
        addDrop(InitBlocks.ANGBAND_SLAB);
        addDrop(InitBlocks.ANGBAND_FENCE);
        addDrop(InitBlocks.MORDOR_STONE);
        addDrop(InitBlocks.MORDOR_BRICK);
        addDrop(InitBlocks.DARKELF_LOG);
        addDrop(InitBlocks.CRYSTAL_LEAVES);
        addDrop(InitBlocks.MITHRIL_LEAVES);
        addDrop(InitBlocks.DWARF_PLANKS);
        addDrop(InitBlocks.PINE);
        addDrop(InitBlocks.OSCINE_ORE);
        addDrop(InitBlocks.GREEN_ORE);
        addDrop(InitBlocks.ELF_WOOD);
        addDrop(InitBlocks.ELF_LOG);



    }
}
