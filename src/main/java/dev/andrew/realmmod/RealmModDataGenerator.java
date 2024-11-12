package dev.andrew.realmmod;

import dev.andrew.realmmod.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class RealmModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(RealmModBlockTagProvider::new);
		pack.addProvider(RealmModModModelProvider::new);
		pack.addProvider(RealmModBlockLootTableProvider::new);
		pack.addProvider(RealmModEnglishLanguageProvider::new);
		pack.addProvider(RealmModItemTagProvider::new);
		pack.addProvider(RealmModRecipeProvider::new);

	}
}
