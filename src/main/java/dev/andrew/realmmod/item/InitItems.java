package dev.andrew.realmmod.item;

import dev.andrew.realmmod.RealmMod;
import dev.andrew.realmmod.item.custom.WandItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class InitItems {
    public static final Item MITHRIL_ITEM = registerItem("mithril_item", new Item(new Item.Settings()));
    public static final Item ANGBAND_ITEM = registerItem("angband_item", new Item(new Item.Settings()));
    public static final Item DWARFIRON_ITEM = registerItem("dwarfiron_item", new Item(new Item.Settings()));
    public static final Item GREEN_ITEM = registerItem("green_item", new Item(new Item.Settings()));
    public static final Item GREENBLUE_ITEM = registerItem("greenblue_item", new Item(new Item.Settings()));
    public static final Item MORDOR_ITEM = registerItem("mordor_item", new Item(new Item.Settings()));
    public static final Item SUNELF_ITEM = registerItem("sunelf_item", new Item(new Item.Settings()));
    public static final Item CRYSTAL_ITEM = registerItem("crystal_item", new Item(new Item.Settings()));
    public static final Item WAND = registerItem("wand", new WandItem(new Item.Settings().maxDamage(32)));
    public static final Item CORN = registerItem("corn", new Item(new Item.Settings().food(InitFoodComponents.CORN)));
    public static final Item DWARF_MITHRIL_PICKAXE = registerItem("dwarf_mithril_pickaxe",
    new PickaxeItem(MithrilToolMaterials.MITHRIL_ITEM, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(MithrilToolMaterials.MITHRIL_ITEM, 0, -3f))));
    public static final Item ORC_PICKAXE = registerItem("orc_pickaxe",
            new PickaxeItem(AngbandToolMaterials.ANGBAND_ITEM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(AngbandToolMaterials.ANGBAND_ITEM, 0, -3f))));
    public static final Item MORDOR_PICKAXE = registerItem("mordor_pickaxe",
            new PickaxeItem(MordorToolMaterials.MORDOR_ITEM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(MordorToolMaterials.MORDOR_ITEM, 0, -3f))));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RealmMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RealmMod.LOGGER.info("Registering Mod Items for " + RealmMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SUNELF_ITEM);
            entries.add(MITHRIL_ITEM);
            entries.add(CRYSTAL_ITEM);
            entries.add(ANGBAND_ITEM);
            entries.add(GREEN_ITEM);
            entries.add(DWARFIRON_ITEM);
            entries.add(GREENBLUE_ITEM);
            entries.add(CORN);
            entries.add(WAND);
            entries.add(DWARF_MITHRIL_PICKAXE);



        });

    }
}

