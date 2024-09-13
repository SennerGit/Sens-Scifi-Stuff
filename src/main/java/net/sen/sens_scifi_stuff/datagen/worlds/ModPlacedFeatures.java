package net.sen.sens_scifi_stuff.datagen.worlds;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.List;

public class ModPlacedFeatures extends ModPlacedFeaturesHelper {
    public static final ResourceKey<PlacedFeature> PLACED_TIN_KEY = registerKey("placed_tin_key");
    public static final ResourceKey<PlacedFeature> PLACED_ZINC_KEY = registerKey("placed_zinc_key");
    public static final ResourceKey<PlacedFeature> PLACED_NICKEL_KEY = registerKey("placed_nickel_key");
    public static final ResourceKey<PlacedFeature> PLACED_INVAR_KEY = registerKey("placed_invar_key");
    public static final ResourceKey<PlacedFeature> PLACED_LEAD_KEY = registerKey("placed_lead_key");
    public static final ResourceKey<PlacedFeature> PLACED_SILVER_KEY = registerKey("placed_silver_key");
    public static final ResourceKey<PlacedFeature> PLACED_ELECTRUM_KEY = registerKey("placed_electrum_key");
    public static final ResourceKey<PlacedFeature> PLACED_URANIUM_KEY = registerKey("placed_uranium_key");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, PLACED_TIN_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIN_ORE_KEY), ModPlacedFeatures.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, PLACED_ZINC_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ZINC_ORE_KEY), ModPlacedFeatures.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, PLACED_NICKEL_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NICKEL_ORE_KEY), ModPlacedFeatures.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, PLACED_INVAR_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.INVAR_ORE_KEY), ModPlacedFeatures.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, PLACED_LEAD_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAD_ORE_KEY), ModPlacedFeatures.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, PLACED_SILVER_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY), ModPlacedFeatures.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, PLACED_ELECTRUM_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ELECTRUM_ORE_KEY), ModPlacedFeatures.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, PLACED_URANIUM_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.URANIUM_ORE_KEY), ModPlacedFeatures.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    }
}
