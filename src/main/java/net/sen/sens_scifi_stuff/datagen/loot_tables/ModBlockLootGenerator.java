package net.sen.sens_scifi_stuff.datagen.loot_tables;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.loot.CanItemPerformAbility;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;

import java.util.Set;

public class ModBlockLootGenerator extends ModBlockLootSubProvider {
//    private static final float[] DEFAULT_SAPLING_DROP_RATES = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
//    private static final LootItemCondition.Builder HAS_SHEARS = CanItemPerformAbility.canItemPerformAbility(ItemAbilities.SHEARS_DIG);

    public ModBlockLootGenerator(HolderLookup.Provider registries) {
        super(registries);
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PURE_RAW_IRON_BLOCK);
        this.dropSelf(ModBlocks.REFINED_IRON_BLOCK);
        this.dropSelf(ModBlocks.PURE_RAW_COPPER_BLOCK);
        this.dropSelf(ModBlocks.REFINED_COPPER_BLOCK);
        this.dropSelf(ModBlocks.PURE_RAW_GOLD_BLOCK);
        this.dropSelf(ModBlocks.REFINED_GOLD_BLOCK);
        this.dropSelf(ModBlocks.STEEL_BLOCK);
        this.ore(ModBlocks.ORE_TIN_BLOCK, ModItems.RAW_TIN_ITEM);
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK);
        this.dropSelf(ModBlocks.PURE_RAW_TIN_BLOCK);
        this.dropSelf(ModBlocks.TIN_BLOCK);
        this.dropSelf(ModBlocks.REFINED_TIN_BLOCK);
        this.ore(ModBlocks.ORE_ZINC_BLOCK, ModItems.RAW_ZINC_ITEM);
        this.dropSelf(ModBlocks.RAW_ZINC_BLOCK);
        this.dropSelf(ModBlocks.PURE_RAW_ZINC_BLOCK);
        this.dropSelf(ModBlocks.ZINC_BLOCK);
        this.dropSelf(ModBlocks.REFINED_ZINC_BLOCK);
        this.ore(ModBlocks.ORE_NICKEL_BLOCK, ModItems.RAW_NICKEL_ITEM);
        this.dropSelf(ModBlocks.RAW_NICKEL_BLOCK);
        this.dropSelf(ModBlocks.PURE_RAW_NICKEL_BLOCK);
        this.dropSelf(ModBlocks.NICKEL_BLOCK);
        this.dropSelf(ModBlocks.REFINED_NICKEL_BLOCK);
        this.ore(ModBlocks.ORE_LEAD_BLOCK, ModItems.RAW_LEAD_ITEM);
        this.dropSelf(ModBlocks.RAW_LEAD_BLOCK);
        this.dropSelf(ModBlocks.PURE_RAW_LEAD_BLOCK);
        this.dropSelf(ModBlocks.LEAD_BLOCK);
        this.dropSelf(ModBlocks.REFINED_LEAD_BLOCK);
        this.ore(ModBlocks.ORE_INVAR_BLOCK, ModItems.RAW_INVAR_ITEM);
        this.dropSelf(ModBlocks.RAW_INVAR_BLOCK);
        this.dropSelf(ModBlocks.PURE_RAW_INVAR_BLOCK);
        this.dropSelf(ModBlocks.INVAR_BLOCK);
        this.dropSelf(ModBlocks.REFINED_INVAR_BLOCK);
        this.ore(ModBlocks.ORE_SILVER_BLOCK, ModItems.RAW_SILVER_ITEM);
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK);
        this.dropSelf(ModBlocks.PURE_RAW_SILVER_BLOCK);
        this.dropSelf(ModBlocks.SILVER_BLOCK);
        this.dropSelf(ModBlocks.REFINED_SILVER_BLOCK);
        this.ore(ModBlocks.ORE_ELECTRUM_BLOCK, ModItems.RAW_ELECTRUM_ITEM);
        this.dropSelf(ModBlocks.RAW_ELECTRUM_BLOCK);
        this.dropSelf(ModBlocks.PURE_RAW_ELECTRUM_BLOCK);
        this.dropSelf(ModBlocks.ELECTRUM_BLOCK);
        this.dropSelf(ModBlocks.REFINED_ELECTRUM_BLOCK);
        this.ore(ModBlocks.ORE_URANIUM_BLOCK, ModItems.RAW_URANIUM_ITEM);
        this.dropSelf(ModBlocks.RAW_URANIUM_BLOCK);
        this.dropSelf(ModBlocks.PURE_RAW_URANIUM_BLOCK);
        this.dropSelf(ModBlocks.URANIUM_BLOCK);
        this.dropSelf(ModBlocks.REFINED_URANIUM_BLOCK);
        this.dropSelf(ModBlocks.BRONZE_BLOCK);
        this.dropSelf(ModBlocks.BRASS_BLOCK);
        this.dropSelf(ModBlocks.WORKBENCH_BLOCK);
        this.dropSelf(ModBlocks.GRINDER_BLOCK);
        this.dropSelf(ModBlocks.ORE_WASHER_BLOCK);
        this.dropSelf(ModBlocks.FLUX_GROWER_BLOCK);
        this.dropSelf(ModBlocks.RIPPERDOC_CHAIR_BLOCK);
        this.dropSelf(ModBlocks.BIO_REACTOR_TANK_BLOCK);
        this.dropSelf(ModBlocks.INCUBATION_CHAMBER_TANK_BLOCK);
        this.dropSelf(ModBlocks.CLONING_TANK_BLOCK);
        this.dropSelf(ModBlocks.STIRLING_GENERATOR_BLOCK);
        this.dropSelf(ModBlocks.ENERGY_PIPE_BLOCK);
        this.dropSelf(ModBlocks.POWER_CELL_BLOCK);
    }
}
