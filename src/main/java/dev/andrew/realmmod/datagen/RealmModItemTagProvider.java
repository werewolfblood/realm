package dev.andrew.realmmod.datagen;

import dev.andrew.realmmod.block.InitBlocks;
import dev.andrew.realmmod.item.InitItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class RealmModItemTagProvider extends FabricTagProvider<Item> {
    public RealmModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.IRON_ORES)
                .add(InitBlocks.GREEN_ORE.asItem())
                .add(InitBlocks.CRYSTAL_ORE.asItem())
                .add(InitBlocks.MITHRIL_ORE.asItem());


        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(InitItems.DWARF_MITHRIL_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(InitBlocks.ELF_LOG.asItem())
                .add(InitBlocks.PINE.asItem())
                .add(InitBlocks.DARKELF_LOG.asItem())
                .add(InitBlocks.MITHRIL_LOG.asItem())
                .add(InitBlocks.BLUECRYSTAL_LOG.asItem());
        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(InitBlocks.CRYSTAL_SLAB.asItem())
                .add(InitBlocks.ANGBAND_SLAB.asItem())
                .add(InitBlocks.MITHRIL_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(InitBlocks.CRYSTAL_FENCE.asItem())
                .add(InitBlocks.ANGBAND_FENCE.asItem())
                .add(InitBlocks.MITHRIL_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(InitBlocks.ELF_LOG.asItem())
                .add(InitBlocks.PINE.asItem())
                .add(InitBlocks.BLUECRYSTAL_LOG.asItem())
                .add(InitBlocks.MITHRIL_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(InitBlocks.MITHRIL_LEAVES.asItem())
                .add(InitBlocks.CRYSTAL_LEAVES.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(InitBlocks.DWARF_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.DIAMOND_ORES)
                .add(InitBlocks.OSCINE_ORE.asItem());












    }
}
