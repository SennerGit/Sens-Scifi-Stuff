package net.sen.sens_scifi_stuff.datagen.loot_tables;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;

public class ModEntityLootHelper extends EntityLootSubProvider {
    protected ModEntityLootHelper(HolderLookup.Provider registries) {
        super(FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    public void generate() {

    }
}
