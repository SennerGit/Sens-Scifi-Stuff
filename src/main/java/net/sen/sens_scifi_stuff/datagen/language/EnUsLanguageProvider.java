package net.sen.sens_scifi_stuff.datagen.language;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;
import net.sen.sens_scifi_stuff.tabs.ModCreativeTabs;
import net.sen.sens_scifi_stuff.tags.ModTags;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.function.Supplier;

public class EnUsLanguageProvider extends LanguageProviderHelper {
    public EnUsLanguageProvider(PackOutput output) {
        super(output, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Items
        this.addItem(ModItems.OMNI_WRENCH_ITEM, "Omni Wrench");
        this.addItem(ModItems.PESTLE_ITEM, "Pestle");
        this.addItem(ModItems.MORTAR_ITEM, "Mortar");

        //Blocks
        this.addBlock(ModBlocks.WORKBENCH_BLOCK, "Workbench");
        this.addBlock(ModBlocks.GRINDER_BLOCK, "Grinder");
        this.addBlock(ModBlocks.ORE_WASHER_BLOCK, "Ore Washer");
        this.addBlock(ModBlocks.FLUX_GROWER_BLOCK, "Flux Grower");
        this.addBlock(ModBlocks.RIPPERDOC_CHAIR_BLOCK, "Ripperdoc Chair");
        this.addBlock(ModBlocks.BIO_REACTOR_TANK_BLOCK, "Bio Reactor Tank");
        this.addBlock(ModBlocks.INCUBATION_CHAMBER_TANK_BLOCK, "Incubation Chamber Tank");
        this.addBlock(ModBlocks.CLONING_TANK_BLOCK, "Cloning Tank");
        this.addBlock(ModBlocks.STIRLING_GENERATOR_BLOCK, "Stirling Generator");
        this.addBlock(ModBlocks.ENERGY_PIPE_BLOCK, "Energy Pipes");
        this.addBlock(ModBlocks.POWER_CELL_BLOCK, "Power Cell");

        /*
        Tech Stuff
         */
        this.addItem(ModItems.LLAMARADA_CRYSTAL_ITEM, "Llamarada Crystal");
        this.addItem(ModItems.QUARTZ_POWDER_ITEM, "Quartz Powder");
        this.addItem(ModItems.CRYSTAL_STARTER_ITEM, "Crystal Starter");
        this.addItem(ModItems.AHOGAR_CRYSTAL_ITEM, "Ahogar Crystal");
        this.addItem(ModItems.CIELO_CRYSTAL_ITEM, "Cielo Crystal");
        this.addItem(ModItems.TIERRA_CRYSTAL_ITEM, "Tierra Crystal");
        this.addItem(ModItems.NOCHE_CRYSTAL_ITEM, "Noche Crystal");
        this.addItem(ModItems.LUZ_CRYSTAL_ITEM, "Luz Crystal");
        this.addItem(ModItems.FUERZA_CORE_ITEM, "Fuerza Core");
        this.addItem(ModItems.FUERZA_POWDER_ITEM, "Fuerza Powder");
        this.addItem(ModItems.FUERZA_CRYSTAL_ITEM, "Fuerza Crystal");

        /*
        Metals
         */
        //Vanilla
        this.addItem(ModItems.IRON_DUST_ITEM, "Iron Dust");
        this.addItem(ModItems.COPPER_DUST_ITEM, "Copper Dust");
        this.addItem(ModItems.GOLD_DUST_ITEM, "Gold Dust");

        //Steel
        this.addItem(ModItems.RAW_STEEL_MIX_ITEM, "Raw Steel Mix");
        this.addItem(ModItems.STEEL_INGOT_ITEM, "Steel Ingot");
        this.addItem(ModItems.STEEL_NUGGET_ITEM, "Steel Nugget");
        this.addItem(ModItems.STEEL_DUST_ITEM, "Steel Dust");
        this.addBlock(ModBlocks.STEEL_BLOCK, "Steel Block");
        this.addItem(ModItems.STEEL_SWORD_ITEM, "Steel Sword");
        this.addItem(ModItems.STEEL_HOE_ITEM, "Steel Hoe");
        this.addItem(ModItems.STEEL_SHOVEL_ITEM, "Steel Shovel");
        this.addItem(ModItems.STEEL_AXE_ITEM, "Steel Axe");
        this.addItem(ModItems.STEEL_PICKAXE_ITEM, "Steel Pickaxe");
        this.addItem(ModItems.STEEL_SHIELD_ITEM, "Steel Shield");
        this.addItem(ModItems.STEEL_BOOTS_ITEM, "Steel Boots");
        this.addItem(ModItems.STEEL_LEGGINGS_ITEM, "Steel Leggings");
        this.addItem(ModItems.STEEL_CHESTPLATE_ITEM, "Steel Chestplate");
        this.addItem(ModItems.STEEL_HELMET_ITEM, "Steel Helmet");

        //Tin
        this.addItem(ModItems.RAW_TIN_ITEM, "Raw Tin");
        this.addItem(ModItems.TIN_DUST_ITEM, "Tin Dust");
        this.addItem(ModItems.TIN_INGOT_ITEM, "Tin Ingot");
        this.addItem(ModItems.TIN_NUGGET_ITEM, "Tin Nugget");
        this.addBlock(ModBlocks.ORE_TIN_BLOCK, "Ore Tin");
        this.addBlock(ModBlocks.RAW_TIN_BLOCK, "Raw Tin Block");
        this.addBlock(ModBlocks.TIN_BLOCK, "Tin Block");
        this.addItem(ModItems.TIN_SWORD_ITEM, "Tin Sword");
        this.addItem(ModItems.TIN_HOE_ITEM, "Tin Hoe");
        this.addItem(ModItems.TIN_SHOVEL_ITEM, "Tin Shovel");
        this.addItem(ModItems.TIN_AXE_ITEM, "Tin Axe");
        this.addItem(ModItems.TIN_PICKAXE_ITEM, "Tin Pickaxe");
        this.addItem(ModItems.TIN_SHIELD_ITEM, "Tin Shield");
        this.addItem(ModItems.TIN_BOOTS_ITEM, "Tin Boots");
        this.addItem(ModItems.TIN_LEGGINGS_ITEM, "Tin Leggings");
        this.addItem(ModItems.TIN_CHESTPLATE_ITEM, "Tin Chestplate");
        this.addItem(ModItems.TIN_HELMET_ITEM, "Tin Helmet");

        //Zinc
        this.addItem(ModItems.RAW_ZINC_ITEM, "Raw Zinc");
        this.addItem(ModItems.ZINC_DUST_ITEM, "Zinc Dust");
        this.addItem(ModItems.ZINC_INGOT_ITEM, "Zinc Ingot");
        this.addItem(ModItems.ZINC_NUGGET_ITEM, "Zinc Nugget");
        this.addBlock(ModBlocks.ORE_ZINC_BLOCK, "Ore Zinc");
        this.addBlock(ModBlocks.RAW_ZINC_BLOCK, "Raw Zinc Block");
        this.addBlock(ModBlocks.ZINC_BLOCK, "Zinc Block");
        this.addItem(ModItems.ZINC_SWORD_ITEM, "Zinc Sword");
        this.addItem(ModItems.ZINC_HOE_ITEM, "Zinc Hoe");
        this.addItem(ModItems.ZINC_SHOVEL_ITEM, "Zinc Shovel");
        this.addItem(ModItems.ZINC_AXE_ITEM, "Zinc Axe");
        this.addItem(ModItems.ZINC_PICKAXE_ITEM, "Zinc Pickaxe");
        this.addItem(ModItems.ZINC_SHIELD_ITEM, "Zinc Shield");
        this.addItem(ModItems.ZINC_BOOTS_ITEM, "Zinc Boots");
        this.addItem(ModItems.ZINC_LEGGINGS_ITEM, "Zinc Leggings");
        this.addItem(ModItems.ZINC_CHESTPLATE_ITEM, "Zinc Chestplate");
        this.addItem(ModItems.ZINC_HELMET_ITEM, "Zinc Helmet");

        //Nickel
        this.addItem(ModItems.RAW_NICKEL_ITEM, "Raw Nickel");
        this.addItem(ModItems.NICKEL_DUST_ITEM, "Nickel Dust");
        this.addItem(ModItems.NICKEL_INGOT_ITEM, "Nickel Ingot");
        this.addItem(ModItems.NICKEL_NUGGET_ITEM, "Nickel Nugget");
        this.addBlock(ModBlocks.ORE_NICKEL_BLOCK, "Ore Nickel");
        this.addBlock(ModBlocks.RAW_NICKEL_BLOCK, "Raw Nickel Block");
        this.addBlock(ModBlocks.NICKEL_BLOCK, "Nickel Block");
        this.addItem(ModItems.NICKEL_SWORD_ITEM, "Nickel Sword");
        this.addItem(ModItems.NICKEL_HOE_ITEM, "Nickel Hoe");
        this.addItem(ModItems.NICKEL_SHOVEL_ITEM, "Nickel Shovel");
        this.addItem(ModItems.NICKEL_AXE_ITEM, "Nickel Axe");
        this.addItem(ModItems.NICKEL_PICKAXE_ITEM, "Nickel Pickaxe");
        this.addItem(ModItems.NICKEL_SHIELD_ITEM, "Nickel Shield");
        this.addItem(ModItems.NICKEL_BOOTS_ITEM, "Nickel Boots");
        this.addItem(ModItems.NICKEL_LEGGINGS_ITEM, "Nickel Leggings");
        this.addItem(ModItems.NICKEL_CHESTPLATE_ITEM, "Nickel Chestplate");
        this.addItem(ModItems.NICKEL_HELMET_ITEM, "Nickel Helmet");

        //Invar
        this.addItem(ModItems.RAW_INVAR_ITEM, "Raw Invar");
        this.addItem(ModItems.INVAR_DUST_ITEM, "Invar Dust");
        this.addItem(ModItems.INVAR_INGOT_ITEM, "Invar Ingot");
        this.addItem(ModItems.INVAR_NUGGET_ITEM, "Invar Nugget");
        this.addBlock(ModBlocks.ORE_INVAR_BLOCK, "Ore Invar");
        this.addBlock(ModBlocks.RAW_INVAR_BLOCK, "Raw Invar Block");
        this.addBlock(ModBlocks.INVAR_BLOCK, "Invar Block");
        this.addItem(ModItems.INVAR_SWORD_ITEM, "Invar Sword");
        this.addItem(ModItems.INVAR_HOE_ITEM, "Invar Hoe");
        this.addItem(ModItems.INVAR_SHOVEL_ITEM, "Invar Shovel");
        this.addItem(ModItems.INVAR_AXE_ITEM, "Invar Axe");
        this.addItem(ModItems.INVAR_PICKAXE_ITEM, "Invar Pickaxe");
        this.addItem(ModItems.INVAR_SHIELD_ITEM, "Invar Shield");
        this.addItem(ModItems.INVAR_BOOTS_ITEM, "Invar Boots");
        this.addItem(ModItems.INVAR_LEGGINGS_ITEM, "Invar Leggings");
        this.addItem(ModItems.INVAR_CHESTPLATE_ITEM, "Invar Chestplate");
        this.addItem(ModItems.INVAR_HELMET_ITEM, "Invar Helmet");

        //Lead
        this.addItem(ModItems.RAW_LEAD_ITEM, "Raw Lead");
        this.addItem(ModItems.LEAD_DUST_ITEM, "Lead Dust");
        this.addItem(ModItems.LEAD_INGOT_ITEM, "Lead Ingot");
        this.addItem(ModItems.LEAD_NUGGET_ITEM, "Lead Nugget");
        this.addBlock(ModBlocks.ORE_LEAD_BLOCK, "Ore Lead");
        this.addBlock(ModBlocks.RAW_LEAD_BLOCK, "Raw Lead Block");
        this.addBlock(ModBlocks.LEAD_BLOCK, "Lead Block");
        this.addItem(ModItems.LEAD_SWORD_ITEM, "Lead Sword");
        this.addItem(ModItems.LEAD_HOE_ITEM, "Lead Hoe");
        this.addItem(ModItems.LEAD_SHOVEL_ITEM, "Lead Shovel");
        this.addItem(ModItems.LEAD_AXE_ITEM, "Lead Axe");
        this.addItem(ModItems.LEAD_PICKAXE_ITEM, "Lead Pickaxe");
        this.addItem(ModItems.LEAD_BOOTS_ITEM, "Lead Boots");
        this.addItem(ModItems.LEAD_LEGGINGS_ITEM, "Lead Leggings");
        this.addItem(ModItems.LEAD_CHESTPLATE_ITEM, "Lead Chestplate");
        this.addItem(ModItems.LEAD_HELMET_ITEM, "Lead Helmet");

        //Silver
        this.addItem(ModItems.RAW_SILVER_ITEM, "Raw Silver");
        this.addItem(ModItems.SILVER_DUST_ITEM, "Silver Dust");
        this.addItem(ModItems.SILVER_INGOT_ITEM, "Silver Ingot");
        this.addItem(ModItems.SILVER_NUGGET_ITEM, "Silver Nugget");
        this.addBlock(ModBlocks.ORE_SILVER_BLOCK, "Ore Silver");
        this.addBlock(ModBlocks.RAW_SILVER_BLOCK, "Raw Silver Block");
        this.addBlock(ModBlocks.SILVER_BLOCK, "Silver Block");
        this.addItem(ModItems.SILVER_SWORD_ITEM, "Silver Sword");
        this.addItem(ModItems.SILVER_HOE_ITEM, "Silver Hoe");
        this.addItem(ModItems.SILVER_SHOVEL_ITEM, "Silver Shovel");
        this.addItem(ModItems.SILVER_AXE_ITEM, "Silver Axe");
        this.addItem(ModItems.SILVER_PICKAXE_ITEM, "Silver Pickaxe");
        this.addItem(ModItems.SILVER_SHIELD_ITEM, "Silver Shield");
        this.addItem(ModItems.SILVER_BOOTS_ITEM, "Silver Boots");
        this.addItem(ModItems.SILVER_LEGGINGS_ITEM, "Silver Leggings");
        this.addItem(ModItems.SILVER_CHESTPLATE_ITEM, "Silver Chestplate");
        this.addItem(ModItems.SILVER_HELMET_ITEM, "Silver Helmet");

        //Electrum
        this.addItem(ModItems.RAW_ELECTRUM_ITEM, "Raw Electrum");
        this.addItem(ModItems.ELECTRUM_DUST_ITEM, "Electrum Dust");
        this.addItem(ModItems.ELECTRUM_INGOT_ITEM, "Electrum Ingot");
        this.addItem(ModItems.ELECTRUM_NUGGET_ITEM, "Electrum Nugget");
        this.addBlock(ModBlocks.ORE_ELECTRUM_BLOCK, "Ore Electrum");
        this.addBlock(ModBlocks.RAW_ELECTRUM_BLOCK, "Raw Electrum Block");
        this.addBlock(ModBlocks.ELECTRUM_BLOCK, "Electrum Block");
        this.addItem(ModItems.ELECTRUM_SWORD_ITEM, "Electrum Sword");
        this.addItem(ModItems.ELECTRUM_HOE_ITEM, "Electrum Hoe");
        this.addItem(ModItems.ELECTRUM_SHOVEL_ITEM, "Electrum Shovel");
        this.addItem(ModItems.ELECTRUM_AXE_ITEM, "Electrum Axe");
        this.addItem(ModItems.ELECTRUM_PICKAXE_ITEM, "Electrum Pickaxe");
        this.addItem(ModItems.ELECTRUM_SHIELD_ITEM, "Electrum Shield");
        this.addItem(ModItems.ELECTRUM_BOOTS_ITEM, "Electrum Boots");
        this.addItem(ModItems.ELECTRUM_LEGGINGS_ITEM, "Electrum Leggings");
        this.addItem(ModItems.ELECTRUM_CHESTPLATE_ITEM, "Electrum Chestplate");
        this.addItem(ModItems.ELECTRUM_HELMET_ITEM, "Electrum Helmet");

        //Uranium
        this.addItem(ModItems.RAW_URANIUM_ITEM, "Raw Uranium");
        this.addItem(ModItems.URANIUM_DUST_ITEM, "Uranium Dust");
        this.addItem(ModItems.URANIUM_INGOT_ITEM, "Uranium Ingot");
        this.addItem(ModItems.URANIUM_NUGGET_ITEM, "Uranium Nugget");
        this.addBlock(ModBlocks.ORE_URANIUM_BLOCK, "Ore Uranium");
        this.addBlock(ModBlocks.RAW_URANIUM_BLOCK, "Raw Uranium Block");
        this.addBlock(ModBlocks.URANIUM_BLOCK, "Uranium Block");

        //Bronze
        this.addItem(ModItems.RAW_BRONZE_MIX_ITEM, "Raw Bronze Mix");
        this.addItem(ModItems.BRONZE_INGOT_ITEM, "Bronze Ingot");
        this.addItem(ModItems.BRONZE_NUGGET_ITEM, "Bronze Nugget");
        this.addItem(ModItems.BRONZE_DUST_ITEM, "Bronze Dust");
        this.addBlock(ModBlocks.BRONZE_BLOCK, "Bronze Block");
        this.addItem(ModItems.BRONZE_SWORD_ITEM, "Bronze Sword");
        this.addItem(ModItems.BRONZE_HOE_ITEM, "Bronze Hoe");
        this.addItem(ModItems.BRONZE_SHOVEL_ITEM, "Bronze Shovel");
        this.addItem(ModItems.BRONZE_AXE_ITEM, "Bronze Axe");
        this.addItem(ModItems.BRONZE_PICKAXE_ITEM, "Bronze Pickaxe");
        this.addItem(ModItems.BRONZE_SHIELD_ITEM, "Bronze Shield");
        this.addItem(ModItems.BRONZE_BOOTS_ITEM, "Bronze Boots");
        this.addItem(ModItems.BRONZE_LEGGINGS_ITEM, "Bronze Leggings");
        this.addItem(ModItems.BRONZE_CHESTPLATE_ITEM, "Bronze Chestplate");
        this.addItem(ModItems.BRONZE_HELMET_ITEM, "Bronze Helmet");

        //Brass
        this.addItem(ModItems.RAW_BRASS_MIX_ITEM, "Raw Brass Mix");
        this.addItem(ModItems.BRASS_INGOT_ITEM, "Brass Ingot");
        this.addItem(ModItems.BRASS_NUGGET_ITEM, "Brass Nugget");
        this.addItem(ModItems.BRASS_DUST_ITEM, "Brass Dust");
        this.addBlock(ModBlocks.BRASS_BLOCK, "Brass Block");
        this.addItem(ModItems.BRASS_SWORD_ITEM, "Brass Sword");
        this.addItem(ModItems.BRASS_HOE_ITEM, "Brass Hoe");
        this.addItem(ModItems.BRASS_SHOVEL_ITEM, "Brass Shovel");
        this.addItem(ModItems.BRASS_AXE_ITEM, "Brass Axe");
        this.addItem(ModItems.BRASS_PICKAXE_ITEM, "Brass Pickaxe");
        this.addItem(ModItems.BRASS_SHIELD_ITEM, "Brass Shield");
        this.addItem(ModItems.BRASS_BOOTS_ITEM, "Brass Boots");
        this.addItem(ModItems.BRASS_LEGGINGS_ITEM, "Brass Leggings");
        this.addItem(ModItems.BRASS_CHESTPLATE_ITEM, "Brass Chestplate");
        this.addItem(ModItems.BRASS_HELMET_ITEM, "Brass Helmet");

        /*
        PARTS
        */
        ///Speeder
        //Power Cell - Energy storage
        this.addItem(ModItems.SPEEDER_TESLA_MK1_POWER_CELL_ITEM, "Speeder Tesla MK1 Power Cell");
        this.addItem(ModItems.SPEEDER_TESLA_MK2_POWER_CELL_ITEM, "Speeder Tesla MK2 Power Cell");
        this.addItem(ModItems.SPEEDER_TESLA_MK3_POWER_CELL_ITEM, "Speeder Tesla MK3 Power Cell");
        this.addItem(ModItems.SPEEDER_TESLA_MK3XL_POWER_CELL_ITEM, "Speeder Tesla MK3XL Power Cell");
        this.addItem(ModItems.SPEEDER_TESLA_MK4_POWER_CELL_ITEM, "Speeder Tesla MK4 Power Cell");
        this.addItem(ModItems.SPEEDER_TESLA_MK4XL_POWER_CELL_ITEM, "Speeder Tesla MK4XL Power Cell");
        this.addItem(ModItems.SPEEDER_TESLA_ULT_POWER_CELL_ITEM, "Speeder Tesla ULT Power Cell");

        //Controller - Reduces energy usage among parts and devides the usage smartly
        this.addItem(ModItems.SPEEDER_TESLA_MK1_CONTROLLER_ITEM, "Speeder Tesla MK1 Controller");
        this.addItem(ModItems.SPEEDER_TESLA_MK2_CONTROLLER_ITEM, "Speeder Tesla MK2 Controller");
        this.addItem(ModItems.SPEEDER_TESLA_MK3_CONTROLLER_ITEM, "Speeder Tesla MK3 Controller");
        this.addItem(ModItems.SPEEDER_TESLA_MK3XL_CONTROLLER_ITEM, "Speeder Tesla MK3XL Controller");
        this.addItem(ModItems.SPEEDER_TESLA_MK4_CONTROLLER_ITEM, "Speeder Tesla MK4 Controller");
        this.addItem(ModItems.SPEEDER_TESLA_MK4XL_CONTROLLER_ITEM, "Speeder Tesla MK4XL Controller");
        this.addItem(ModItems.SPEEDER_TESLA_ULT_CONTROLLER_ITEM, "Speeder Tesla ULT Controller");

        //Coolent - Reduces energy usage among parts and devides the usage smartly
        this.addItem(ModItems.SPEEDER_TESLA_MK1_COOLENT_ITEM, "Speeder Tesla MK1 Coolent");
        this.addItem(ModItems.SPEEDER_TESLA_MK2_COOLENT_ITEM, "Speeder Tesla MK2 Coolent");
        this.addItem(ModItems.SPEEDER_TESLA_MK3_COOLENT_ITEM, "Speeder Tesla MK3 Coolent");
        this.addItem(ModItems.SPEEDER_TESLA_MK3XL_COOLENT_ITEM, "Speeder Tesla MK3XL Coolent");
        this.addItem(ModItems.SPEEDER_TESLA_MK4_COOLENT_ITEM, "Speeder Tesla MK4 Coolent");
        this.addItem(ModItems.SPEEDER_TESLA_MK4XL_COOLENT_ITEM, "Speeder Tesla MK4XL Coolent");
        this.addItem(ModItems.SPEEDER_TESLA_ULT_COOLENT_ITEM, "Speeder Tesla ULT Coolent");

        //Internal Engine - Speed of the speeder
        this.addItem(ModItems.SPEEDER_TESLA_MK1_INTERNAL_ENGINE_ITEM, "Speeder Tesla MK1 Internal Engine");
        this.addItem(ModItems.SPEEDER_TESLA_MK2_INTERNAL_ENGINE_ITEM, "Speeder Tesla MK2 Internal Engine");
        this.addItem(ModItems.SPEEDER_TESLA_MK3_INTERNAL_ENGINE_ITEM, "Speeder Tesla MK3 Internal Engine");
        this.addItem(ModItems.SPEEDER_TESLA_MK3XL_INTERNAL_ENGINE_ITEM, "Speeder Tesla MK3XL Internal Engine");
        this.addItem(ModItems.SPEEDER_TESLA_MK4_INTERNAL_ENGINE_ITEM, "Speeder Tesla MK4 Internal Engine");
        this.addItem(ModItems.SPEEDER_TESLA_MK4XL_INTERNAL_ENGINE_ITEM, "Speeder Tesla MK4XL Internal Engine");
        this.addItem(ModItems.SPEEDER_TESLA_ULT_INTERNAL_ENGINE_ITEM, "Speeder Tesla ULT Internal Engine");

        //Frame - For the stability of the booster
        this.addItem(ModItems.SPEEDER_TESLA_MK1_FRAME_ITEM, "Speeder Tesla MK1 Frame");
        this.addItem(ModItems.SPEEDER_TESLA_MK2_FRAME_ITEM, "Speeder Tesla MK2 Frame");
        this.addItem(ModItems.SPEEDER_TESLA_MK3_FRAME_ITEM, "Speeder Tesla MK3 Frame");
        this.addItem(ModItems.SPEEDER_TESLA_MK3XL_FRAME_ITEM, "Speeder Tesla MK3XL Frame");
        this.addItem(ModItems.SPEEDER_TESLA_MK4_FRAME_ITEM, "Speeder Tesla MK4 Frame");
        this.addItem(ModItems.SPEEDER_TESLA_MK4XL_FRAME_ITEM, "Speeder Tesla MK4XL Frame");
        this.addItem(ModItems.SPEEDER_TESLA_ULT_FRAME_ITEM, "Speeder Tesla ULT Frame");

        //Extra
//        this.addItem(ModItems.FLUID_REPULSOR_ITEM, "Fluid Repulsor");
//        this.addItem(ModItems.RADIO_ITEM, "Radio");
//        this.addItem(ModItems.SCANNER_ITEM, "Scanner");

        /*
        Vehicles
         */
        this.addItem(ModItems.SPEEDER_ITEM, "Speeder");

        //Tags
        this.add(ModTags.Blocks.TIN_ORES, "Tin Ores");
        this.add(ModTags.Blocks.ZINC_ORES, "Zinc Ores");
        this.add(ModTags.Blocks.NICKEL_ORES, "Nickel Ores");
        this.add(ModTags.Blocks.INVAR_ORES, "Invar Ores");
        this.add(ModTags.Blocks.LEAD_ORES, "Lead Ores");
        this.add(ModTags.Blocks.SILVER_ORES, "Silver Ores");
        this.add(ModTags.Blocks.ELECTRUM_ORES, "Electrum Ores");
        this.add(ModTags.Blocks.URANIUM_ORES, "Uranium Ores");

        this.add(ModTags.Items.TIN_ORES, "Tin Ores");
        this.add(ModTags.Items.ZINC_ORES, "Zinc Ores");
        this.add(ModTags.Items.NICKEL_ORES, "Nickel Ores");
        this.add(ModTags.Items.INVAR_ORES, "Invar Ores");
        this.add(ModTags.Items.LEAD_ORES, "Lead Ores");
        this.add(ModTags.Items.SILVER_ORES, "Silver Ores");
        this.add(ModTags.Items.ELECTRUM_ORES, "Electrum Ores");
        this.add(ModTags.Items.URANIUM_ORES, "Uranium Ores");

        this.add(ModTags.Items.RAW_STEEL, "Raw Steel");
        this.add(ModTags.Items.RAW_TIN, "Raw Tin");
        this.add(ModTags.Items.RAW_ZINC, "Raw Zinc");
        this.add(ModTags.Items.RAW_NICKEL, "Raw Nickel");
        this.add(ModTags.Items.RAW_INVAR, "Raw Invar");
        this.add(ModTags.Items.RAW_LEAD, "Raw Lead");
        this.add(ModTags.Items.RAW_SILVER, "Raw Silver");
        this.add(ModTags.Items.RAW_ELECTRUM, "Raw Electrum");
        this.add(ModTags.Items.RAW_URANIUM, "Raw Uranium");
        this.add(ModTags.Items.RAW_BRONZE, "Raw Bronze");
        this.add(ModTags.Items.RAW_BRASS, "Raw Brass");

        this.add(ModTags.Items.INGOTS_STEEL, "Ingot Steel");
        this.add(ModTags.Items.INGOTS_TIN, "Ingot Tin");
        this.add(ModTags.Items.INGOTS_ZINC, "Ingot Zinc");
        this.add(ModTags.Items.INGOTS_NICKEL, "Ingot Nickel");
        this.add(ModTags.Items.INGOTS_INVAR, "Ingot Invar");
        this.add(ModTags.Items.INGOTS_LEAD, "Ingot Lead");
        this.add(ModTags.Items.INGOTS_SILVER, "Ingot Silver");
        this.add(ModTags.Items.INGOTS_ELECTRUM, "Ingot Electrum");
        this.add(ModTags.Items.INGOTS_URANIUM, "Ingot Uranium");
        this.add(ModTags.Items.INGOTS_BRONZE, "Ingot Bronze");
        this.add(ModTags.Items.INGOTS_BRASS, "Ingot Brass");

        this.add(ModTags.Items.NUGGETS_STEEL, "Nugget Steel");
        this.add(ModTags.Items.NUGGETS_TIN, "Nugget Tin");
        this.add(ModTags.Items.NUGGETS_ZINC, "Nugget Zinc");
        this.add(ModTags.Items.NUGGETS_NICKEL, "Nugget Nickel");
        this.add(ModTags.Items.NUGGETS_INVAR, "Nugget Invar");
        this.add(ModTags.Items.NUGGETS_LEAD, "Nugget Lead");
        this.add(ModTags.Items.NUGGETS_SILVER, "Nugget Silver");
        this.add(ModTags.Items.NUGGETS_ELECTRUM, "Nugget Electrum");
        this.add(ModTags.Items.NUGGETS_URANIUM, "Nugget Uranium");
        this.add(ModTags.Items.NUGGETS_BRONZE, "Nugget Bronze");
        this.add(ModTags.Items.NUGGETS_BRASS, "Nugget Brass");

        this.add(ModTags.Items.DUST, "Dust");
        this.add(ModTags.Items.DUST_STEEL, "Dust Steel");
        this.add(ModTags.Items.DUST_TIN, "Dust Tin");
        this.add(ModTags.Items.DUST_ZINC, "Dust Zinc");
        this.add(ModTags.Items.DUST_NICKEL, "Dust Nickel");
        this.add(ModTags.Items.DUST_INVAR, "Dust Invar");
        this.add(ModTags.Items.DUST_LEAD, "Dust Lead");
        this.add(ModTags.Items.DUST_SILVER, "Dust Silver");
        this.add(ModTags.Items.DUST_ELECTRUM, "Dust Electrum");
        this.add(ModTags.Items.DUST_URANIUM, "Dust Uranium");
        this.add(ModTags.Items.DUST_BRONZE, "Dust Bronze");
        this.add(ModTags.Items.DUST_BRASS, "Dust Brass");

        //Creative Tabs
        this.addCreativeTab(ModCreativeTabs.SENSSCIFISTUFFCORETAB, "Sen's Scifi Stuff Core Tab");
        this.addCreativeTab(ModCreativeTabs.PARTSTAB, "Sen's Scifi Stuff Parts Tab");
        this.addCreativeTab(ModCreativeTabs.BASEVEHICLETAB, "Sen's Scifi Stuff Base Vehicle Tab");
        this.addCreativeTab(ModCreativeTabs.MACHINETAB, "Sen's Scifi Stuff Machine Tab");

        //Stuff
        this.add("tooltip." + ModUtils.getModId() + ".shift_down", "Hold §eShift§r For More Information...");
        this.add("tooltip." + ModUtils.getModId() + ".vehicle_types", "Vehicle Type");
        this.add("tooltip." + ModUtils.getModId() + ".vehicle_size", "Vehicle Size");
        this.add("tooltip." + ModUtils.getModId() + ".modules", "Modules");
        this.add("tooltip." + ModUtils.getModId() + ".cooling", "Cooling");
        this.add("tooltip." + ModUtils.getModId() + ".armour", "Armor");
        this.add("tooltip." + ModUtils.getModId() + ".engine_types", "Engine Type");
        this.add("tooltip." + ModUtils.getModId() + ".energy_usage", "Energy Usage");
        this.add("tooltip." + ModUtils.getModId() + ".speed", "Speed");
        this.add("tooltip." + ModUtils.getModId() + ".heat", "Heat");
        this.add("tooltip." + ModUtils.getModId() + ".vehicle_steering_strength", "Vehicle Steering Strength");
        this.add("tooltip." + ModUtils.getModId() + ".storage", "Energy Storage");
        this.add("tooltip." + ModUtils.getModId() + ".input", "Input");
        this.add("tooltip." + ModUtils.getModId() + ".output", "Output");
        this.add("tooltip." + ModUtils.getModId() + ".part_type", "Part Type");
        this.add("tooltip." + ModUtils.getModId() + ".low", "Low");
        this.add("tooltip." + ModUtils.getModId() + ".mid", "Mid");
        this.add("tooltip." + ModUtils.getModId() + ".high", "High");
        this.add("tooltip." + ModUtils.getModId() + ".small", "Small");
        this.add("tooltip." + ModUtils.getModId() + ".large", "Large");
        this.add("tooltip." + ModUtils.getModId() + ".internal", "Internal");
        this.add("tooltip." + ModUtils.getModId() + ".external", "External");
        this.add("tooltip." + ModUtils.getModId() + ".both", "Both");
        this.add("tooltip." + ModUtils.getModId() + ".frame", "Frame");
        this.add("tooltip." + ModUtils.getModId() + ".power_cell", "Power cell");
        this.add("tooltip." + ModUtils.getModId() + ".controller", "Controller");
        this.add("tooltip." + ModUtils.getModId() + ".coolent", "Coolent");
        this.add("tooltip." + ModUtils.getModId() + ".engine", "Engine");
        this.add("tooltip." + ModUtils.getModId() + ".weapon", "Weapon");
        this.add("tooltip." + ModUtils.getModId() + ".landing_repulsor", "Landing Repulsor");
        this.add("tooltip." + ModUtils.getModId() + ".speed_booster", "Speed Booster");
        this.add("tooltip." + ModUtils.getModId() + ".jump_booster", "Jump Booster");
        this.add("tooltip." + ModUtils.getModId() + ".extra", "Extra");
        this.add("tooltip." + ModUtils.getModId() + ".speeder", "Speeder");
    }
}
