package dev.andrew.realmmod.util;

import dev.andrew.realmmod.RealmMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class InitTags {
    public static class Blocks {
    public static final TagKey<Block> INCORRECT_DWARF_PICKAXE_TOOL = createTag("incorrect_dwarf_pickaxe_tool");
    public static final TagKey<Block>incorrect_for_angband_tool  = createTag("incorrect_for_angband_tool");

    private static TagKey<Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(RealmMod.MOD_ID, name));
    }
}

public static class Items {
    public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

    private static TagKey<Item> createTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(RealmMod.MOD_ID, name));
    }
}
}


