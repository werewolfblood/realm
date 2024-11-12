package dev.andrew.realmmod;

import dev.andrew.realmmod.block.InitBlocks;
import dev.andrew.realmmod.item.InitGroups;
import dev.andrew.realmmod.item.InitItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealmMod implements ModInitializer {
	public static final String MOD_ID = "realmmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
	public void onInitialize() {
		InitItems.registerModItems();
		InitBlocks.registerModBlocks();
		InitGroups.registerItemGroups();
		LOGGER.info("realm_fantasy!");




	}
}