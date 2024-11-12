package dev.andrew.realmmod.datagen;

import dev.andrew.realmmod.block.InitBlocks;
import dev.andrew.realmmod.item.InitItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class RealmModModModelProvider  extends FabricModelProvider {
    public RealmModModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool realmGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.MITHRIL_STONE);
        BlockStateModelGenerator.BlockTexturePool angbandGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.ANGBAND_STONE);
        BlockStateModelGenerator.BlockTexturePool crystalGarnetPool = blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.CRYSTAL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MITHRIL_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ANGBAND_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MORDOR_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MORDOR_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.OSCINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.GREEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ELF_WOOD);



        realmGarnetPool.slab(InitBlocks.MITHRIL_SLAB);
        angbandGarnetPool.slab(InitBlocks.ANGBAND_SLAB);
        realmGarnetPool.fence(InitBlocks.MITHRIL_FENCE);
        angbandGarnetPool.fence(InitBlocks.ANGBAND_FENCE);
        crystalGarnetPool.fence(InitBlocks.CRYSTAL_FENCE);
        crystalGarnetPool.slab(InitBlocks.CRYSTAL_SLAB);




        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTAL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MITHRIL_LEAVES);



        blockStateModelGenerator.registerLog(InitBlocks.DARKELF_LOG)
                        .log(InitBlocks.DARKELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.MITHRIL_LOG)
                .log(InitBlocks.MITHRIL_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BLUECRYSTAL_LOG)
                .log(InitBlocks.BLUECRYSTAL_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.PINE)
                .log(InitBlocks.PINE);
        blockStateModelGenerator.registerLog(InitBlocks.ELF_LOG)
                .log(InitBlocks.ELF_LOG);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(InitItems.SUNELF_ITEM, Models.GENERATED);
        itemModelGenerator.register(InitItems.MORDOR_ITEM, Models.GENERATED);
        itemModelGenerator.register(InitItems.GREENBLUE_ITEM, Models.GENERATED);
        itemModelGenerator.register(InitItems.MITHRIL_ITEM, Models.GENERATED);
        itemModelGenerator.register(InitItems.CRYSTAL_ITEM, Models.GENERATED);
        itemModelGenerator.register(InitItems.ANGBAND_ITEM, Models.GENERATED);
        itemModelGenerator.register(InitItems.DWARFIRON_ITEM, Models.GENERATED);
        itemModelGenerator.register(InitItems.GREEN_ITEM,Models.GENERATED);
        itemModelGenerator.register(InitItems.WAND, Models.GENERATED);
        itemModelGenerator.register(InitItems.CORN, Models.GENERATED);
        itemModelGenerator.register(InitItems.DWARF_MITHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(InitItems.ORC_PICKAXE, Models.HANDHELD);

        }
}
