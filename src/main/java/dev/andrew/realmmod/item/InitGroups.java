package dev.andrew.realmmod.item;

import dev.andrew.realmmod.RealmMod;
import dev.andrew.realmmod.block.InitBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class InitGroups {
    public static final ItemGroup REALM_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RealmMod.MOD_ID, "realm_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(InitItems.MITHRIL_ITEM))
                    .displayName(Text.translatable("itemgroup.realm.realm.items"))
                    .entries((displayContext, entries) -> {
                        entries.add(InitItems.SUNELF_ITEM);
                        entries.add(InitItems.MORDOR_ITEM);
                        entries.add(InitItems.GREENBLUE_ITEM);
                        entries.add(InitItems.MITHRIL_ITEM);
                        entries.add(InitItems.CRYSTAL_ITEM);
                        entries.add(InitItems.ANGBAND_ITEM);
                        entries.add(InitItems.DWARFIRON_ITEM);
                        entries.add(InitItems.GREEN_ITEM);
                        entries.add(InitItems.WAND);
                        entries.add(InitItems.CORN);
                        entries.add(InitItems.DWARF_MITHRIL_PICKAXE);
                        entries.add(InitItems.ORC_PICKAXE);
                    }).build());


    public static final ItemGroup REALM_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RealmMod.MOD_ID, "realm_ore"),
            FabricItemGroup.builder().icon(() -> new ItemStack(InitBlocks.MITHRIL_ORE))
                    .displayName(Text.translatable("itemgroup.realm.mithril_ore"))
                    .entries((displayContext, entries) -> {
                        entries.add(InitBlocks.MITHRIL_ORE);
                        entries.add(InitBlocks.CRYSTAL_ORE);
                        entries.add(InitBlocks.MITHRIL_STONE);
                        entries.add(InitBlocks.CRYSTAL_STONE);
                        entries.add(InitBlocks.MITHRIL_BRICK);
                        entries.add(InitBlocks.CRYSTAL_BRICK);
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
                        entries.add(InitBlocks.OSCINE_ORE);
                        entries.add(InitBlocks.GREEN_ORE);

                    }).build());

    public static final ItemGroup REALM_LOGS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RealmMod.MOD_ID, "realm_log"),
            FabricItemGroup.builder().icon(() -> new ItemStack(InitBlocks.MITHRIL_LOG))
                    .displayName(Text.translatable("itemgroup.realm.mithril_logs"))
                    .entries((displayContext, entries) -> {
                        entries.add(InitBlocks.MITHRIL_LOG);
                        entries.add(InitBlocks.BLUECRYSTAL_LOG);
                        entries.add(InitBlocks.MITHRIL_LEAVES);
                        entries.add(InitBlocks.CRYSTAL_LEAVES);
                        entries.add(InitBlocks.DWARF_PLANKS);
                        entries.add(InitBlocks.ELF_WOOD);
                        entries.add(InitBlocks.ELF_LOG);
                        entries.add(InitBlocks.PINE);
                    }).build());

    public static void registerItemGroups() {
        RealmMod.LOGGER.info("Registering Item Groups for " + RealmMod.MOD_ID);
    }
}