package net.sen.sens_scifi_stuff.datagen.worlds;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.List;

public class ModConfiguredFeatures extends ModConfiguredFeaturesHelper {
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZINC_ORE_KEY = registerKey("zinc_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NICKEL_ORE_KEY = registerKey("nickel_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> INVAR_ORE_KEY = registerKey("invar_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE_KEY = registerKey("lead_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ELECTRUM_ORE_KEY = registerKey("electrum_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> URANIUM_ORE_KEY = registerKey("uranium_ore_key");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        configureOverworldOre(context, TIN_ORE_KEY, ModBlocks.ORE_TIN_BLOCK, ModBlocks.ORE_TIN_BLOCK, 10);
        configureOverworldOre(context, ZINC_ORE_KEY, ModBlocks.ORE_ZINC_BLOCK, ModBlocks.ORE_ZINC_BLOCK, 10);
        configureOverworldOre(context, NICKEL_ORE_KEY, ModBlocks.ORE_NICKEL_BLOCK, ModBlocks.ORE_NICKEL_BLOCK, 10);
        configureOverworldOre(context, INVAR_ORE_KEY, ModBlocks.ORE_INVAR_BLOCK, ModBlocks.ORE_INVAR_BLOCK, 10);
        configureOverworldOre(context, LEAD_ORE_KEY, ModBlocks.ORE_LEAD_BLOCK, ModBlocks.ORE_LEAD_BLOCK, 10);
        configureOverworldOre(context, SILVER_ORE_KEY, ModBlocks.ORE_SILVER_BLOCK, ModBlocks.ORE_SILVER_BLOCK, 10);
        configureOverworldOre(context, ELECTRUM_ORE_KEY, ModBlocks.ORE_ELECTRUM_BLOCK, ModBlocks.ORE_ELECTRUM_BLOCK, 10);
        configureOverworldOre(context, URANIUM_ORE_KEY, ModBlocks.ORE_URANIUM_BLOCK, ModBlocks.ORE_URANIUM_BLOCK, 10);
    }
}
