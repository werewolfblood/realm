package dev.andrew.realmmod.block;

import dev.andrew.realmmod.RealmMod;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;


import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.minecraft.util.Identifier;

public class InitBlocks {
    public static final Block MITHRIL_ORE =registerBlock("mithril_ore",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block CRYSTAL_ORE =registerBlock("crystal_ore",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MITHRIL_STONE =registerBlock("mithril_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MORDOR_STONE =registerBlock("mordor_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MITHRIL_SLAB = registerBlock("mithril_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block ELF_WOOD = registerBlock("elf_wood",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MITHRIL_FENCE = registerBlock("mithril_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block ANGBAND_FENCE = registerBlock("angband_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block CRYSTAL_FENCE = registerBlock("crystal_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MORDOR_BRICK = registerBlock("mordor_brick",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block CRYSTAL_SLAB = registerBlock("crystal_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MITHRIL_BRICK =registerBlock("mithril_brick",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block ANGBAND_STONE =registerBlock("angband_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block ANGBAND_SLAB = registerBlock("angband_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block ANGBAND_BRICK =registerBlock("angband_brick",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block CRYSTAL_BRICK =registerBlock("crystal_brick",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block CRYSTAL_STONE =registerBlock("crystal_stone",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MITHRIL_LOG = registerBlock("mithril_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block MITHRIL_LEAVES = registerBlock("mithril_leaves",
            new LeavesBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().nonOpaque().luminance(state -> 8)));
    public static final Block CRYSTAL_LEAVES = registerBlock("crystal_leaves",
            new LeavesBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().nonOpaque().luminance(state -> 8)));
    public static final Block BLUECRYSTAL_LOG = registerBlock("bluecrystal_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block DARKELF_LOG = registerBlock("darkelf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block ELF_LOG = registerBlock("elf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block DWARF_PLANKS = registerBlock("dwarf_planks",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block PINE = registerBlock("pine",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block OSCINE_ORE = registerBlock("oscine_ore",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));
    public static final Block GREEN_ORE = registerBlock("green_ore",
            new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F).requiresTool().luminance(state -> 8)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RealmMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RealmMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        RealmMod.LOGGER.info("Registering Mod Blocks for " + RealmMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(InitBlocks.MITHRIL_ORE);
            entries.add(InitBlocks.CRYSTAL_ORE);
            entries.add(InitBlocks.MITHRIL_STONE);
            entries.add(InitBlocks.MITHRIL_BRICK);
            entries.add(InitBlocks.CRYSTAL_BRICK);
            entries.add(InitBlocks.BLUECRYSTAL_LOG);
            entries.add(InitBlocks.ANGBAND_STONE);
            entries.add(InitBlocks.ANGBAND_BRICK);
            entries.add(InitBlocks.MITHRIL_SLAB);
            entries.add(InitBlocks.MITHRIL_FENCE);
            entries.add(InitBlocks.ANGBAND_SLAB);
            entries.add(InitBlocks.ANGBAND_FENCE);
            entries.add(InitBlocks.CRYSTAL_FENCE);
            entries.add(InitBlocks.CRYSTAL_SLAB);
            entries.add(InitBlocks.MORDOR_STONE);
            entries.add(InitBlocks.MORDOR_BRICK);
            entries.add(InitBlocks.DARKELF_LOG);
            entries.add(InitBlocks.CRYSTAL_LEAVES);
            entries.add(InitBlocks.MITHRIL_LEAVES);
            entries.add(InitBlocks.DWARF_PLANKS);
            entries.add(InitBlocks.PINE);
            entries.add(InitBlocks.OSCINE_ORE);
            entries.add(InitBlocks.ELF_WOOD);
            entries.add(InitBlocks.ELF_LOG);

        });
    }
}