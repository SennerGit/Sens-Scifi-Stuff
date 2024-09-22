package net.sen.sens_scifi_stuff.datagen.loot_tables;

import net.minecraft.core.HolderLookup;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;

public class ModBlockLootTables extends ModBlockLootHelper {
    public ModBlockLootTables(HolderLookup.Provider registries) {
        super(registries);
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.STEEL_BLOCK);
        this.ore(ModBlocks.ORE_TIN_BLOCK, ModItems.RAW_TIN_ITEM);
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK);
        this.dropSelf(ModBlocks.TIN_BLOCK);
        this.ore(ModBlocks.ORE_ZINC_BLOCK, ModItems.RAW_ZINC_ITEM);
        this.dropSelf(ModBlocks.RAW_ZINC_BLOCK);
        this.dropSelf(ModBlocks.ZINC_BLOCK);
        this.ore(ModBlocks.ORE_NICKEL_BLOCK, ModItems.RAW_NICKEL_ITEM);
        this.dropSelf(ModBlocks.RAW_NICKEL_BLOCK);
        this.dropSelf(ModBlocks.NICKEL_BLOCK);
        this.ore(ModBlocks.ORE_LEAD_BLOCK, ModItems.RAW_LEAD_ITEM);
        this.dropSelf(ModBlocks.RAW_LEAD_BLOCK);
        this.dropSelf(ModBlocks.LEAD_BLOCK);
        this.ore(ModBlocks.ORE_INVAR_BLOCK, ModItems.RAW_INVAR_ITEM);
        this.dropSelf(ModBlocks.RAW_INVAR_BLOCK);
        this.dropSelf(ModBlocks.INVAR_BLOCK);
        this.ore(ModBlocks.ORE_SILVER_BLOCK, ModItems.RAW_SILVER_ITEM);
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK);
        this.dropSelf(ModBlocks.SILVER_BLOCK);
        this.ore(ModBlocks.ORE_ELECTRUM_BLOCK, ModItems.RAW_ELECTRUM_ITEM);
        this.dropSelf(ModBlocks.RAW_ELECTRUM_BLOCK);
        this.dropSelf(ModBlocks.ELECTRUM_BLOCK);
        this.ore(ModBlocks.ORE_URANIUM_BLOCK, ModItems.RAW_URANIUM_ITEM);
        this.dropSelf(ModBlocks.RAW_URANIUM_BLOCK);
        this.dropSelf(ModBlocks.URANIUM_BLOCK);
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
