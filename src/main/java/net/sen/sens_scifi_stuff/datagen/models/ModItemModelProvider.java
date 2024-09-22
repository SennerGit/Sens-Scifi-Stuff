package net.sen.sens_scifi_stuff.datagen.models;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;

public class ModItemModelProvider extends ModItemModelHelper {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, existingFileHelper);
    }

    @Override
    protected void generateItems() {
        //Items
        this.basicItem(ModItems.OMNI_WRENCH_ITEM);
        this.basicItem(ModItems.PESTLE_ITEM);
        this.basicItem(ModItems.MORTAR_ITEM);

        /*
        Metals
         */
        //Vanilla
        this.basicItem(ModItems.IRON_DUST_ITEM);
        this.basicItem(ModItems.COPPER_DUST_ITEM);
        this.basicItem(ModItems.GOLD_DUST_ITEM);

        //Steel
        this.basicItem(ModItems.RAW_STEEL_MIX_ITEM);
        this.basicItem(ModItems.STEEL_INGOT_ITEM);
        this.basicItem(ModItems.STEEL_NUGGET_ITEM);
        this.basicItem(ModItems.STEEL_DUST_ITEM);
        this.createToolSet(ModItems.STEEL_SWORD_ITEM, ModItems.STEEL_PICKAXE_ITEM, ModItems.STEEL_AXE_ITEM, ModItems.STEEL_SHOVEL_ITEM, ModItems.STEEL_HOE_ITEM);
        this.createArmourSet(ModItems.STEEL_BOOTS_ITEM, ModItems.STEEL_LEGGINGS_ITEM, ModItems.STEEL_CHESTPLATE_ITEM, ModItems.STEEL_HELMET_ITEM);

        //Tin
        this.basicItem(ModItems.RAW_TIN_ITEM);
        this.basicItem(ModItems.TIN_DUST_ITEM);
        this.basicItem(ModItems.TIN_INGOT_ITEM);
        this.basicItem(ModItems.TIN_NUGGET_ITEM);
        this.createToolSet(ModItems.TIN_SWORD_ITEM, ModItems.TIN_PICKAXE_ITEM, ModItems.TIN_AXE_ITEM, ModItems.TIN_SHOVEL_ITEM, ModItems.TIN_HOE_ITEM);
        this.createArmourSet(ModItems.TIN_BOOTS_ITEM, ModItems.TIN_LEGGINGS_ITEM, ModItems.TIN_CHESTPLATE_ITEM, ModItems.TIN_HELMET_ITEM);

        //Zinc
        this.basicItem(ModItems.RAW_ZINC_ITEM);
        this.basicItem(ModItems.ZINC_DUST_ITEM);
        this.basicItem(ModItems.ZINC_INGOT_ITEM);
        this.basicItem(ModItems.ZINC_NUGGET_ITEM);
        this.createToolSet(ModItems.ZINC_SWORD_ITEM, ModItems.ZINC_PICKAXE_ITEM, ModItems.ZINC_AXE_ITEM, ModItems.ZINC_SHOVEL_ITEM, ModItems.ZINC_HOE_ITEM);
        this.createArmourSet(ModItems.ZINC_BOOTS_ITEM, ModItems.ZINC_LEGGINGS_ITEM, ModItems.ZINC_CHESTPLATE_ITEM, ModItems.ZINC_HELMET_ITEM);

        //Nickel
        this.basicItem(ModItems.RAW_NICKEL_ITEM);
        this.basicItem(ModItems.NICKEL_DUST_ITEM);
        this.basicItem(ModItems.NICKEL_INGOT_ITEM);
        this.basicItem(ModItems.NICKEL_NUGGET_ITEM);
        this.createToolSet(ModItems.NICKEL_SWORD_ITEM, ModItems.NICKEL_PICKAXE_ITEM, ModItems.NICKEL_AXE_ITEM, ModItems.NICKEL_SHOVEL_ITEM, ModItems.NICKEL_HOE_ITEM);
        this.createArmourSet(ModItems.NICKEL_BOOTS_ITEM, ModItems.NICKEL_LEGGINGS_ITEM, ModItems.NICKEL_CHESTPLATE_ITEM, ModItems.NICKEL_HELMET_ITEM);

        //Invar
        this.basicItem(ModItems.RAW_INVAR_ITEM);
        this.basicItem(ModItems.INVAR_DUST_ITEM);
        this.basicItem(ModItems.INVAR_INGOT_ITEM);
        this.basicItem(ModItems.INVAR_NUGGET_ITEM);
        this.createToolSet(ModItems.INVAR_SWORD_ITEM, ModItems.INVAR_PICKAXE_ITEM, ModItems.INVAR_AXE_ITEM, ModItems.INVAR_SHOVEL_ITEM, ModItems.INVAR_HOE_ITEM);
        this.createArmourSet(ModItems.INVAR_BOOTS_ITEM, ModItems.INVAR_LEGGINGS_ITEM, ModItems.INVAR_CHESTPLATE_ITEM, ModItems.INVAR_HELMET_ITEM);

        //Lead
        this.basicItem(ModItems.RAW_LEAD_ITEM);
        this.basicItem(ModItems.LEAD_DUST_ITEM);
        this.basicItem(ModItems.LEAD_INGOT_ITEM);
        this.basicItem(ModItems.LEAD_NUGGET_ITEM);
        this.createToolSet(ModItems.LEAD_SWORD_ITEM, ModItems.LEAD_PICKAXE_ITEM, ModItems.LEAD_AXE_ITEM, ModItems.LEAD_SHOVEL_ITEM, ModItems.LEAD_HOE_ITEM);
        this.handheldItem(ModItems.LEAD_PICKAXE_ITEM);
        this.createArmourSet(ModItems.LEAD_BOOTS_ITEM, ModItems.LEAD_LEGGINGS_ITEM, ModItems.LEAD_CHESTPLATE_ITEM, ModItems.LEAD_HELMET_ITEM);

        //Silver
        this.basicItem(ModItems.RAW_SILVER_ITEM);
        this.basicItem(ModItems.SILVER_DUST_ITEM);
        this.basicItem(ModItems.SILVER_INGOT_ITEM);
        this.basicItem(ModItems.SILVER_NUGGET_ITEM);
        this.createToolSet(ModItems.SILVER_SWORD_ITEM, ModItems.SILVER_PICKAXE_ITEM, ModItems.SILVER_AXE_ITEM, ModItems.SILVER_SHOVEL_ITEM, ModItems.SILVER_HOE_ITEM);
        this.createArmourSet(ModItems.SILVER_BOOTS_ITEM, ModItems.SILVER_LEGGINGS_ITEM, ModItems.SILVER_CHESTPLATE_ITEM, ModItems.SILVER_HELMET_ITEM);

        //Electrum
        this.basicItem(ModItems.RAW_ELECTRUM_ITEM);
        this.basicItem(ModItems.ELECTRUM_DUST_ITEM);
        this.basicItem(ModItems.ELECTRUM_INGOT_ITEM);
        this.basicItem(ModItems.ELECTRUM_NUGGET_ITEM);
        this.createToolSet(ModItems.ELECTRUM_SWORD_ITEM, ModItems.ELECTRUM_PICKAXE_ITEM, ModItems.ELECTRUM_AXE_ITEM, ModItems.ELECTRUM_SHOVEL_ITEM, ModItems.ELECTRUM_HOE_ITEM);
        this.createArmourSet(ModItems.ELECTRUM_BOOTS_ITEM, ModItems.ELECTRUM_LEGGINGS_ITEM, ModItems.ELECTRUM_CHESTPLATE_ITEM, ModItems.ELECTRUM_HELMET_ITEM);

        //Uranium
        this.basicItem(ModItems.RAW_URANIUM_ITEM);
        this.basicItem(ModItems.URANIUM_DUST_ITEM);
        this.basicItem(ModItems.URANIUM_INGOT_ITEM);
        this.basicItem(ModItems.URANIUM_NUGGET_ITEM);

        //Bronze
        this.basicItem(ModItems.RAW_BRONZE_MIX_ITEM);
        this.basicItem(ModItems.BRONZE_INGOT_ITEM);
        this.basicItem(ModItems.BRONZE_NUGGET_ITEM);
        this.basicItem(ModItems.BRONZE_DUST_ITEM);
        this.createToolSet(ModItems.BRONZE_SWORD_ITEM, ModItems.BRONZE_PICKAXE_ITEM, ModItems.BRONZE_AXE_ITEM, ModItems.BRONZE_SHOVEL_ITEM, ModItems.BRONZE_HOE_ITEM);
        this.createArmourSet(ModItems.BRONZE_BOOTS_ITEM, ModItems.BRONZE_LEGGINGS_ITEM, ModItems.BRONZE_CHESTPLATE_ITEM, ModItems.BRONZE_HELMET_ITEM);

        //Brass
        this.basicItem(ModItems.RAW_BRASS_MIX_ITEM);
        this.basicItem(ModItems.BRASS_INGOT_ITEM);
        this.basicItem(ModItems.BRASS_NUGGET_ITEM);
        this.basicItem(ModItems.BRASS_DUST_ITEM);
        this.createToolSet(ModItems.BRASS_SWORD_ITEM, ModItems.BRASS_PICKAXE_ITEM, ModItems.BRASS_AXE_ITEM, ModItems.BRASS_SHOVEL_ITEM, ModItems.BRASS_HOE_ITEM);
        this.createArmourSet(ModItems.BRASS_BOOTS_ITEM, ModItems.BRASS_LEGGINGS_ITEM, ModItems.BRASS_CHESTPLATE_ITEM, ModItems.BRASS_HELMET_ITEM);

        /*
        Tech Stuff
         */
        this.basicItem(ModItems.LLAMARADA_CRYSTAL_ITEM);
        this.basicItem(ModItems.QUARTZ_POWDER_ITEM);
        this.basicItem(ModItems.CRYSTAL_STARTER_ITEM);
        this.basicItem(ModItems.AHOGAR_CRYSTAL_ITEM);
        this.basicItem(ModItems.CIELO_CRYSTAL_ITEM);
        this.basicItem(ModItems.TIERRA_CRYSTAL_ITEM);
        this.basicItem(ModItems.NOCHE_CRYSTAL_ITEM);
        this.basicItem(ModItems.LUZ_CRYSTAL_ITEM);
        this.basicItem(ModItems.FUERZA_CORE_ITEM);
        this.basicItem(ModItems.FUERZA_POWDER_ITEM);
        this.basicItem(ModItems.FUERZA_CRYSTAL_ITEM);

        /*
        PARTS
        */
        ///Speeder
        //Power Cell - Energy storage
        this.basicItem(ModItems.SPEEDER_TESLA_MK1_POWER_CELL_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK2_POWER_CELL_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK3_POWER_CELL_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK3XL_POWER_CELL_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK4_POWER_CELL_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK4XL_POWER_CELL_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_ULT_POWER_CELL_ITEM);

        //Controller - Reduces energy usage among parts and devides the usage smartly
        this.basicItem(ModItems.SPEEDER_TESLA_MK1_CONTROLLER_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK2_CONTROLLER_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK3_CONTROLLER_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK3XL_CONTROLLER_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK4_CONTROLLER_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK4XL_CONTROLLER_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_ULT_CONTROLLER_ITEM);

        //Coolent - Reduces energy usage among parts and devides the usage smartly
        this.basicItem(ModItems.SPEEDER_TESLA_MK1_COOLENT_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK2_COOLENT_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK3_COOLENT_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK3XL_COOLENT_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK4_COOLENT_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK4XL_COOLENT_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_ULT_COOLENT_ITEM);

        //Internal Engine - Speed of the speeder
        this.basicItem(ModItems.SPEEDER_TESLA_MK1_INTERNAL_ENGINE_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK2_INTERNAL_ENGINE_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK3_INTERNAL_ENGINE_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK3XL_INTERNAL_ENGINE_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK4_INTERNAL_ENGINE_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK4XL_INTERNAL_ENGINE_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_ULT_INTERNAL_ENGINE_ITEM);

        //Frame - For the stability of the booster
        this.basicItem(ModItems.SPEEDER_TESLA_MK1_FRAME_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK2_FRAME_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK3_FRAME_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK3XL_FRAME_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK4_FRAME_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_MK4XL_FRAME_ITEM);
        this.basicItem(ModItems.SPEEDER_TESLA_ULT_FRAME_ITEM);

        //Extra
//        this.basicItem(ModItems.FLUID_REPULSOR_ITEM);
//        this.basicItem(ModItems.RADIO_ITEM);
//        this.basicItem(ModItems.SCANNER_ITEM);

        /*
        Vehicles
         */
        this.basicItem(ModItems.SPEEDER_ITEM);
    }

    @Override
    protected void generateBlocks() {
        //Block
        this.generateBlockItem(ModBlocks.WORKBENCH_BLOCK);
        this.generateBlockItem(ModBlocks.GRINDER_BLOCK);
        this.generateBlockItem(ModBlocks.ORE_WASHER_BLOCK);
        this.generateBlockItem(ModBlocks.FLUX_GROWER_BLOCK);
        this.generateBlockItem(ModBlocks.RIPPERDOC_CHAIR_BLOCK);
        this.generateBlockItem(ModBlocks.BIO_REACTOR_TANK_BLOCK);
        this.generateBlockItem(ModBlocks.INCUBATION_CHAMBER_TANK_BLOCK);
        this.generateBlockItem(ModBlocks.CLONING_TANK_BLOCK);
        this.generateBlockItem(ModBlocks.STIRLING_GENERATOR_BLOCK);
        this.generateBlockItem(ModBlocks.ENERGY_PIPE_BLOCK);
        this.generateBlockItem(ModBlocks.POWER_CELL_BLOCK);

        //Steel
        this.generateBlockItem(ModBlocks.STEEL_BLOCK);

        //Tin
        this.generateBlockItem(ModBlocks.ORE_TIN_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_TIN_BLOCK);
        this.generateBlockItem(ModBlocks.TIN_BLOCK);

        //Zinc
        this.generateBlockItem(ModBlocks.ORE_ZINC_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_ZINC_BLOCK);
        this.generateBlockItem(ModBlocks.ZINC_BLOCK);

        //Nickel
        this.generateBlockItem(ModBlocks.ORE_NICKEL_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_NICKEL_BLOCK);
        this.generateBlockItem(ModBlocks.NICKEL_BLOCK);

        //Invar
        this.generateBlockItem(ModBlocks.ORE_INVAR_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_INVAR_BLOCK);
        this.generateBlockItem(ModBlocks.INVAR_BLOCK);

        //Lead
        this.generateBlockItem(ModBlocks.ORE_LEAD_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_LEAD_BLOCK);
        this.generateBlockItem(ModBlocks.LEAD_BLOCK);

        //Silver
        this.generateBlockItem(ModBlocks.ORE_SILVER_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_SILVER_BLOCK);
        this.generateBlockItem(ModBlocks.SILVER_BLOCK);

        //Electrum
        this.generateBlockItem(ModBlocks.ORE_ELECTRUM_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_ELECTRUM_BLOCK);
        this.generateBlockItem(ModBlocks.ELECTRUM_BLOCK);

        //Uranium
        this.generateBlockItem(ModBlocks.ORE_URANIUM_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_URANIUM_BLOCK);
        this.generateBlockItem(ModBlocks.URANIUM_BLOCK);

        //Bronze
        this.generateBlockItem(ModBlocks.BRONZE_BLOCK);

        //Brass
        this.generateBlockItem(ModBlocks.BRASS_BLOCK);
    }
}
