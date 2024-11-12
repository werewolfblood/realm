package dev.andrew.realmmod.datagen;

import dev.andrew.realmmod.block.InitBlocks;
import dev.andrew.realmmod.item.InitItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RealmModRecipeProvider extends FabricRecipeProvider {
    public RealmModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> REALM_SMELTABLES = List.of(InitItems.MITHRIL_ITEM, InitBlocks.MITHRIL_ORE,
                InitBlocks.CRYSTAL_ORE);
        offerSmelting(exporter, REALM_SMELTABLES, RecipeCategory.MISC, InitItems.MITHRIL_ITEM, 0.25f, 200, "realm");
        offerBlasting(exporter, REALM_SMELTABLES, RecipeCategory.MISC, InitItems.CRYSTAL_ITEM, 0.25f, 100, "realm");






        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, InitItems.MITHRIL_ITEM, 9)
                .pattern("RR")
                .input('R', InitBlocks.MITHRIL_STONE)
                .criterion(hasItem(InitBlocks.MITHRIL_STONE), conditionsFromItem(InitBlocks.MITHRIL_STONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, InitBlocks.MITHRIL_BRICK)
                .pattern("RR")
                .pattern("RR")
                .input('R', InitBlocks.MITHRIL_STONE)
                .criterion(hasItem(InitBlocks.MITHRIL_STONE), conditionsFromItem(InitBlocks.MITHRIL_STONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, InitItems.CRYSTAL_ITEM, 9)
                .pattern("RR")
                .input('R', InitBlocks.CRYSTAL_STONE)
                .criterion(hasItem(InitBlocks.CRYSTAL_STONE), conditionsFromItem(InitBlocks.CRYSTAL_STONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, InitBlocks.CRYSTAL_BRICK)
                .pattern("RR")
                .pattern("RR")
                .input('R', InitBlocks.CRYSTAL_STONE)
                .criterion(hasItem(InitBlocks.CRYSTAL_STONE), conditionsFromItem(InitBlocks.CRYSTAL_STONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, InitItems.ANGBAND_ITEM, 8)
                .pattern("RR")
                .input('R', InitBlocks.ANGBAND_STONE)
                .criterion(hasItem(InitBlocks.ANGBAND_STONE), conditionsFromItem(InitBlocks.ANGBAND_STONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, InitBlocks.ANGBAND_STONE)
                .pattern("RR")
                .pattern("RR")
                .input('R', InitItems.ANGBAND_ITEM)
                .criterion(hasItem(InitItems.ANGBAND_ITEM), conditionsFromItem(InitItems.ANGBAND_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, InitBlocks.ANGBAND_BRICK)
                .pattern("RR")
                .input('R', InitBlocks.ANGBAND_STONE)
                .criterion(hasItem(InitBlocks.ANGBAND_STONE), conditionsFromItem(InitBlocks.ANGBAND_STONE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, InitBlocks.GREEN_ORE)
                .pattern("RR")
                .input('R', InitItems.GREEN_ITEM)
                .criterion(hasItem(InitItems.GREEN_ITEM), conditionsFromItem(InitItems.GREEN_ITEM))
                .offerTo(exporter);
    }
}