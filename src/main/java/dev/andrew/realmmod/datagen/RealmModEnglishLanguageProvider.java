package dev.andrew.realmmod.datagen;

import dev.andrew.realmmod.RealmMod;
import dev.andrew.realmmod.block.InitBlocks;
import dev.andrew.realmmod.item.InitItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RealmModEnglishLanguageProvider extends FabricLanguageProvider {
    public RealmModEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            RealmMod.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(InitBlocks.MITHRIL_ORE, "mithril_ore");
        translationBuilder.add(InitBlocks.CRYSTAL_ORE,"crystal_ore");
        translationBuilder.add(InitItems.MITHRIL_ITEM,"mithril_item");
        translationBuilder.add(InitItems.CRYSTAL_ITEM, "crystal_item");
        translationBuilder.add(InitItems.WAND, "wand");
        translationBuilder.add(InitItems.CORN, "corn");
        translationBuilder.add(InitItems.DWARF_MITHRIL_PICKAXE, "dwarf_mithril_pickaxe");
        translationBuilder.add(InitBlocks.MITHRIL_LOG,"mithril_log");
        translationBuilder.add(InitBlocks.MITHRIL_STONE, "mithril_stone");
        translationBuilder.add(InitBlocks.CRYSTAL_STONE, "crystal_stone");
        translationBuilder.add(InitBlocks.MITHRIL_BRICK, "mithril_brick");
        translationBuilder.add(InitBlocks.CRYSTAL_BRICK, "crystal_brick");
        translationBuilder.add(InitBlocks.BLUECRYSTAL_LOG, "bluecrystal_log");
        translationBuilder.add(InitItems.ANGBAND_ITEM, "angband_item");
        translationBuilder.add(InitItems.DWARFIRON_ITEM, "dwarfiron_item");
        translationBuilder.add(InitBlocks.ANGBAND_STONE, "angband_tone");
        translationBuilder.add(InitBlocks.ANGBAND_BRICK, "angband_brick");
        translationBuilder.add(InitBlocks.MITHRIL_SLAB,"mithril_slab");
        translationBuilder.add(InitBlocks.MITHRIL_FENCE, "mithril_fence");
        translationBuilder.add(InitBlocks.ANGBAND_SLAB, "angband_slab");
        translationBuilder.add(InitBlocks.ANGBAND_FENCE, "angband_fence");
        translationBuilder.add(InitBlocks.CRYSTAL_FENCE, "crystal_fence");
        translationBuilder.add(InitBlocks.CRYSTAL_SLAB, "crystal_slab");
        translationBuilder.add(InitBlocks.MORDOR_STONE, "mordor_stone");
        translationBuilder.add(InitBlocks.MORDOR_BRICK, "mordor_brick");
        translationBuilder.add(InitBlocks.DARKELF_LOG, "darkelf_log");
        translationBuilder.add(InitBlocks.CRYSTAL_LEAVES, "crystal_leaves");
        translationBuilder.add(InitBlocks.MITHRIL_LEAVES, "mithril_leves");
        translationBuilder.add(InitBlocks.DWARF_PLANKS, "dwarf_planks");
        translationBuilder.add(InitBlocks.PINE, "pine");
        translationBuilder.add(InitBlocks.OSCINE_ORE, "oscine_ore");
        translationBuilder.add(InitBlocks.GREEN_ORE, "green_ore");
        translationBuilder.add(InitBlocks.ELF_WOOD, "elf_wood");
        translationBuilder.add(InitItems.SUNELF_ITEM, "sunelf_item");
        translationBuilder.add(InitItems.MORDOR_ITEM, "mordor_item");
        translationBuilder.add(InitItems.GREENBLUE_ITEM, "greenblue_item");


    }
}
