package net.sen.sens_scifi_stuff.datagen.loot_tables;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.LootTable;
import net.sen.sens_scifi_stuff.utils.ModUtils;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class ModEntityLootHelper extends EntityLootSubProvider {
    private final Set<EntityType<?>> knownEntities = new HashSet<>();

    protected ModEntityLootHelper(HolderLookup.Provider registries) {
        super(FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void add(EntityType<?> entityType, LootTable.Builder builder) {
        super.add(entityType, builder);
        knownEntities.add(entityType);
    }

    @Override
    public Stream<EntityType<?>> getKnownEntityTypes() {
        return this.knownEntities.stream();
    }

    @Override
    public void generate() {

    }
}
