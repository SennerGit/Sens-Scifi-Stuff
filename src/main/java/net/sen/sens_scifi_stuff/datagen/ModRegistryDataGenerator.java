package net.sen.sens_scifi_stuff.datagen;

import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.sen.sens_scifi_stuff.SensScifiStuff;
import net.sen.sens_scifi_stuff.datagen.worlds.ModConfiguredFeatures;
import net.sen.sens_scifi_stuff.datagen.worlds.ModPlacedFeatures;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModRegistryDataGenerator extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            ;

    public ModRegistryDataGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, BUILDER, Set.of(ModUtils.getMinecraftId(), ModUtils.getModId()));
    }
}
