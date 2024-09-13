package net.sen.sens_scifi_stuff.datagen.loot_tables;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(ModBlockLootGenerator::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(ModChestLootSubProvider::new, LootContextParamSets.CHEST),
                new LootTableProvider.SubProviderEntry(ModEntityLootSubProvider::new, LootContextParamSets.ENTITY),
                new LootTableProvider.SubProviderEntry(ModArchaeologyLootSubProvider::new, LootContextParamSets.ARCHAEOLOGY),
                new LootTableProvider.SubProviderEntry(ModFishingLootSubProvider::new, LootContextParamSets.FISHING),
                new LootTableProvider.SubProviderEntry(ModShearingLootSubProvider::new, LootContextParamSets.SHEARING),
                new LootTableProvider.SubProviderEntry(ModSpecialLootSubProvider::new, LootContextParamSets.EMPTY)
        ), provider);
    }
}
