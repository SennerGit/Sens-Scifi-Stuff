package net.sen.sens_scifi_stuff.datagen.language;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;
import net.sen.sens_scifi_stuff.tabs.ModCreativeTabs;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.function.Supplier;

public class EnUsLanguageProvider extends LanguageProvider {
    public EnUsLanguageProvider(PackOutput output) {
        super(output, ModUtils.getModId(), "en_us");
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
        //Iron
        this.addItem(ModItems.IRON_DUST_ITEM, "Iron Dust");
        this.addItem(ModItems.REFINED_IRON_INGOT_ITEM, "Refined Iron Ingot");
        this.addItem(ModItems.PURE_RAW_IRON_ITEM, "Pure Raw Iron");
        this.addItem(ModItems.REFINED_IRON_NUGGET_ITEM, "Refined Iron Nugget");
        this.addItem(ModItems.REFINED_IRON_DUST_ITEM, "Refined Iron Dust");
        this.addBlock(ModBlocks.PURE_RAW_IRON_BLOCK, "Pure Raw Iron Block");
        this.addBlock(ModBlocks.REFINED_IRON_BLOCK, "Refined Iron Block");
        this.addItem(ModItems.REFINED_IRON_SWORD_ITEM, "Refined Iron Sword");
        this.addItem(ModItems.REFINED_IRON_HOE_ITEM, "Refined Iron Hoe");
        this.addItem(ModItems.REFINED_IRON_SHOVEL_ITEM, "Refined Iron Shovel");
        this.addItem(ModItems.REFINED_IRON_AXE_ITEM, "Refined Iron Axe");
        this.addItem(ModItems.REFINED_IRON_PICKAXE_ITEM, "Refined Iron Pickaxe");
        this.addItem(ModItems.REFINED_IRON_SHIELD_ITEM, "Refined Iron Shield");
        this.addItem(ModItems.REFINED_IRON_BOOTS_ITEM, "Refined Iron Boots");
        this.addItem(ModItems.REFINED_IRON_LEGGINGS_ITEM, "Refined Iron Leggings");
        this.addItem(ModItems.REFINED_IRON_CHESTPLATE_ITEM, "Refined Iron Chestplate");
        this.addItem(ModItems.REFINED_IRON_HELMET_ITEM, "Refined Iron Helmet");

        //Copper
        this.addItem(ModItems.COPPER_DUST_ITEM, "Copper Dust");
        this.addItem(ModItems.PURE_RAW_COPPER_ITEM, "Pure Raw Copper");
        this.addItem(ModItems.REFINED_COPPER_INGOT_ITEM, "Refined Copper Ingot");
        this.addItem(ModItems.REFINED_COPPER_NUGGET_ITEM, "Refined Copper Nugget");
        this.addItem(ModItems.REFINED_COPPER_DUST_ITEM, "Refined Copper Dust");
        this.addBlock(ModBlocks.PURE_RAW_COPPER_BLOCK, "Pure Raw Copper Block");
        this.addBlock(ModBlocks.REFINED_COPPER_BLOCK, "Refined Copper Block");
        this.addItem(ModItems.REFINED_COPPER_SWORD_ITEM, "Refined Copper Sword");
        this.addItem(ModItems.REFINED_COPPER_HOE_ITEM, "Refined Copper Hoe");
        this.addItem(ModItems.REFINED_COPPER_SHOVEL_ITEM, "Refined Copper Shovel");
        this.addItem(ModItems.REFINED_COPPER_AXE_ITEM, "Refined Copper Axe");
        this.addItem(ModItems.REFINED_COPPER_PICKAXE_ITEM, "Refined Copper Pickaxe");
        this.addItem(ModItems.REFINED_COPPER_SHIELD_ITEM, "Refined Copper Shield");
        this.addItem(ModItems.REFINED_COPPER_BOOTS_ITEM, "Refined Copper Boots");
        this.addItem(ModItems.REFINED_COPPER_LEGGINGS_ITEM, "Refined Copper Leggings");
        this.addItem(ModItems.REFINED_COPPER_CHESTPLATE_ITEM, "Refined Copper Chestplate");
        this.addItem(ModItems.REFINED_COPPER_HELMET_ITEM, "Refined Copper Helmet");

        //Gold
        this.addItem(ModItems.GOLD_DUST_ITEM, "Gold Dust");
        this.addItem(ModItems.PURE_RAW_GOLD_ITEM, "Pure Raw Gold");
        this.addItem(ModItems.REFINED_GOLD_INGOT_ITEM, "Refined Gold Ingot");
        this.addItem(ModItems.REFINED_GOLD_NUGGET_ITEM, "Refined Gold Nugget");
        this.addItem(ModItems.REFINED_GOLD_DUST_ITEM, "Refined Gold Dust");
        this.addBlock(ModBlocks.PURE_RAW_GOLD_BLOCK, "Pure Raw Gold Block");
        this.addBlock(ModBlocks.REFINED_GOLD_BLOCK, "Refined Gold Block");
        this.addItem(ModItems.REFINED_GOLD_SWORD_ITEM, "Refined Gold Sword");
        this.addItem(ModItems.REFINED_GOLD_HOE_ITEM, "Refined Gold Hoe");
        this.addItem(ModItems.REFINED_GOLD_SHOVEL_ITEM, "Refined Gold Shovel");
        this.addItem(ModItems.REFINED_GOLD_AXE_ITEM, "Refined Gold Axe");
        this.addItem(ModItems.REFINED_GOLD_PICKAXE_ITEM, "Refined Gold Pickaxe");
        this.addItem(ModItems.REFINED_GOLD_SHIELD_ITEM, "Refined Gold Shield");
        this.addItem(ModItems.REFINED_GOLD_BOOTS_ITEM, "Refined Gold Boots");
        this.addItem(ModItems.REFINED_GOLD_LEGGINGS_ITEM, "Refined Gold Leggings");
        this.addItem(ModItems.REFINED_GOLD_CHESTPLATE_ITEM, "Refined Gold Chestplate");
        this.addItem(ModItems.REFINED_GOLD_HELMET_ITEM, "Refined Gold Helmet");

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
        this.addItem(ModItems.PURE_RAW_TIN_ITEM, "Pure Raw Tin");
        this.addItem(ModItems.TIN_DUST_ITEM, "Tin Dust");
        this.addItem(ModItems.TIN_INGOT_ITEM, "Tin Ingot");
        this.addItem(ModItems.TIN_NUGGET_ITEM, "Tin Nugget");
        this.addItem(ModItems.REFINED_TIN_INGOT_ITEM, "Refined Tin Ingot");
        this.addItem(ModItems.REFINED_TIN_NUGGET_ITEM, "Refined Tin Nugget");
        this.addItem(ModItems.REFINED_TIN_DUST_ITEM, "Refined Tin Dust");
        this.addBlock(ModBlocks.ORE_TIN_BLOCK, "Ore Tin");
        this.addBlock(ModBlocks.RAW_TIN_BLOCK, "Raw Tin Block");
        this.addBlock(ModBlocks.PURE_RAW_TIN_BLOCK, "Pure Raw Tin Block");
        this.addBlock(ModBlocks.TIN_BLOCK, "Tin Block");
        this.addBlock(ModBlocks.REFINED_TIN_BLOCK, "Refined Tin Block");
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
        this.addItem(ModItems.REFINED_TIN_SWORD_ITEM, "Refined Tin Sword");
        this.addItem(ModItems.REFINED_TIN_HOE_ITEM, "Refined Tin Hoe");
        this.addItem(ModItems.REFINED_TIN_SHOVEL_ITEM, "Refined Tin Shovel");
        this.addItem(ModItems.REFINED_TIN_AXE_ITEM, "Refined Tin Axe");
        this.addItem(ModItems.REFINED_TIN_PICKAXE_ITEM, "Refined Tin Pickaxe");
        this.addItem(ModItems.REFINED_TIN_SHIELD_ITEM, "Refined Tin Shield");
        this.addItem(ModItems.REFINED_TIN_BOOTS_ITEM, "Refined Tin Boots");
        this.addItem(ModItems.REFINED_TIN_LEGGINGS_ITEM, "Refined Tin Leggings");
        this.addItem(ModItems.REFINED_TIN_CHESTPLATE_ITEM, "Refined Tin Chestplate");
        this.addItem(ModItems.REFINED_TIN_HELMET_ITEM, "Refined Tin Helmet");

        //Zinc
        this.addItem(ModItems.RAW_ZINC_ITEM, "Raw Zinc");
        this.addItem(ModItems.PURE_RAW_ZINC_ITEM, "Pure Raw Zinc");
        this.addItem(ModItems.ZINC_DUST_ITEM, "Zinc Dust");
        this.addItem(ModItems.ZINC_INGOT_ITEM, "Zinc Ingot");
        this.addItem(ModItems.ZINC_NUGGET_ITEM, "Zinc Nugget");
        this.addItem(ModItems.REFINED_ZINC_INGOT_ITEM, "Refined Zinc Ingot");
        this.addItem(ModItems.REFINED_ZINC_NUGGET_ITEM, "Refined Zinc Nugget");
        this.addItem(ModItems.REFINED_ZINC_DUST_ITEM, "Refined Zinc Dust");
        this.addBlock(ModBlocks.ORE_ZINC_BLOCK, "Ore Zinc");
        this.addBlock(ModBlocks.RAW_ZINC_BLOCK, "Raw Zinc Block");
        this.addBlock(ModBlocks.PURE_RAW_ZINC_BLOCK, "Pure Raw Zinc Block");
        this.addBlock(ModBlocks.ZINC_BLOCK, "Zinc Block");
        this.addBlock(ModBlocks.REFINED_ZINC_BLOCK, "Refined Zinc Block");
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
        this.addItem(ModItems.REFINED_ZINC_SWORD_ITEM, "Refined Zinc Sword");
        this.addItem(ModItems.REFINED_ZINC_HOE_ITEM, "Refined Zinc Hoe");
        this.addItem(ModItems.REFINED_ZINC_SHOVEL_ITEM, "Refined Zinc Shovel");
        this.addItem(ModItems.REFINED_ZINC_AXE_ITEM, "Refined Zinc Axe");
        this.addItem(ModItems.REFINED_ZINC_PICKAXE_ITEM, "Refined Zinc Pickaxe");
        this.addItem(ModItems.REFINED_ZINC_SHIELD_ITEM, "Refined Zinc Sheild");
        this.addItem(ModItems.REFINED_ZINC_BOOTS_ITEM, "Refined Zinc Boots");
        this.addItem(ModItems.REFINED_ZINC_LEGGINGS_ITEM, "Refined Zinc Leggings");
        this.addItem(ModItems.REFINED_ZINC_CHESTPLATE_ITEM, "Refined Zinc Chestplate");
        this.addItem(ModItems.REFINED_ZINC_HELMET_ITEM, "Refined Zinc Helmet");

        //Nickel
        this.addItem(ModItems.RAW_NICKEL_ITEM, "Raw Nickel");
        this.addItem(ModItems.PURE_RAW_NICKEL_ITEM, "Pure Raw Nickel");
        this.addItem(ModItems.NICKEL_DUST_ITEM, "Nickel Dust");
        this.addItem(ModItems.NICKEL_INGOT_ITEM, "Nickel Ingot");
        this.addItem(ModItems.NICKEL_NUGGET_ITEM, "Nickel Nugget");
        this.addItem(ModItems.REFINED_NICKEL_INGOT_ITEM, "Refined Nickel Ingot");
        this.addItem(ModItems.REFINED_NICKEL_NUGGET_ITEM, "Refined Nickel Nugget");
        this.addItem(ModItems.REFINED_NICKEL_DUST_ITEM, "Refined Nickel Dust");
        this.addBlock(ModBlocks.ORE_NICKEL_BLOCK, "Ore Nickel");
        this.addBlock(ModBlocks.RAW_NICKEL_BLOCK, "Raw Nickel Block");
        this.addBlock(ModBlocks.PURE_RAW_NICKEL_BLOCK, "Pure Raw Nickel Block");
        this.addBlock(ModBlocks.NICKEL_BLOCK, "Nickel Block");
        this.addBlock(ModBlocks.REFINED_NICKEL_BLOCK, "Refined Nickel Block");
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
        this.addItem(ModItems.REFINED_NICKEL_SWORD_ITEM, "Refined Nickel Sword");
        this.addItem(ModItems.REFINED_NICKEL_HOE_ITEM, "Refined Nickel Hoe");
        this.addItem(ModItems.REFINED_NICKEL_SHOVEL_ITEM, "Refined Nickel Shovel");
        this.addItem(ModItems.REFINED_NICKEL_AXE_ITEM, "Refined Nickel Axe");
        this.addItem(ModItems.REFINED_NICKEL_PICKAXE_ITEM, "Refined Nickel Pickaxe");
        this.addItem(ModItems.REFINED_NICKEL_SHIELD_ITEM, "Refined Nickel Shield");
        this.addItem(ModItems.REFINED_NICKEL_BOOTS_ITEM, "Refined Nickel Boots");
        this.addItem(ModItems.REFINED_NICKEL_LEGGINGS_ITEM, "Refined Nickel Leggings");
        this.addItem(ModItems.REFINED_NICKEL_CHESTPLATE_ITEM, "Refined Nickel Chestplate");
        this.addItem(ModItems.REFINED_NICKEL_HELMET_ITEM, "Refined Nickel Helmet");

        //Invar
        this.addItem(ModItems.RAW_INVAR_ITEM, "Raw Invar");
        this.addItem(ModItems.PURE_RAW_INVAR_ITEM, "Pure Raw Invar");
        this.addItem(ModItems.INVAR_DUST_ITEM, "Invar Dust");
        this.addItem(ModItems.INVAR_INGOT_ITEM, "Invar Ingot");
        this.addItem(ModItems.INVAR_NUGGET_ITEM, "Invar Nugget");
        this.addItem(ModItems.REFINED_INVAR_INGOT_ITEM, "Refined Invar Ingot");
        this.addItem(ModItems.REFINED_INVAR_NUGGET_ITEM, "Refined Invar Nugget");
        this.addItem(ModItems.REFINED_INVAR_DUST_ITEM, "Refined Invar Dust");
        this.addBlock(ModBlocks.ORE_INVAR_BLOCK, "Ore Invar");
        this.addBlock(ModBlocks.RAW_INVAR_BLOCK, "Raw Invar Block");
        this.addBlock(ModBlocks.PURE_RAW_INVAR_BLOCK, "Pure Raw Invar Block");
        this.addBlock(ModBlocks.INVAR_BLOCK, "Invar Block");
        this.addBlock(ModBlocks.REFINED_INVAR_BLOCK, "Refined Invar Block");
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
        this.addItem(ModItems.REFINED_INVAR_SWORD_ITEM, "Refined Invar Sword");
        this.addItem(ModItems.REFINED_INVAR_HOE_ITEM, "Refined Invar Hoe");
        this.addItem(ModItems.REFINED_INVAR_SHOVEL_ITEM, "Refined Invar Shovel");
        this.addItem(ModItems.REFINED_INVAR_AXE_ITEM, "Refined Invar Axe");
        this.addItem(ModItems.REFINED_INVAR_PICKAXE_ITEM, "Refined Invar Pickaxe");
        this.addItem(ModItems.REFINED_INVAR_SHIELD_ITEM, "Refined Invar Shield");
        this.addItem(ModItems.REFINED_INVAR_BOOTS_ITEM, "Refined Invar Boots");
        this.addItem(ModItems.REFINED_INVAR_LEGGINGS_ITEM, "Refined Invar Leggings");
        this.addItem(ModItems.REFINED_INVAR_CHESTPLATE_ITEM, "Refined Invar Chestplate");
        this.addItem(ModItems.REFINED_INVAR_HELMET_ITEM, "Refined Invar Helmet");

        //Lead
        this.addItem(ModItems.RAW_LEAD_ITEM, "Raw Lead");
        this.addItem(ModItems.PURE_RAW_LEAD_ITEM, "Pure Raw Lead");
        this.addItem(ModItems.LEAD_DUST_ITEM, "Lead Dust");
        this.addItem(ModItems.LEAD_INGOT_ITEM, "Lead Ingot");
        this.addItem(ModItems.LEAD_NUGGET_ITEM, "Lead Nugget");
        this.addItem(ModItems.REFINED_LEAD_INGOT_ITEM, "Refined Lead Ingot");
        this.addItem(ModItems.REFINED_LEAD_NUGGET_ITEM, "Refined Lead Nugget");
        this.addItem(ModItems.REFINED_LEAD_DUST_ITEM, "Refined Lead Dust");
        this.addBlock(ModBlocks.ORE_LEAD_BLOCK, "Ore Lead");
        this.addBlock(ModBlocks.RAW_LEAD_BLOCK, "Raw Lead Block");
        this.addBlock(ModBlocks.PURE_RAW_LEAD_BLOCK, "Pure Raw Lead Block");
        this.addBlock(ModBlocks.LEAD_BLOCK, "Lead Block");
        this.addBlock(ModBlocks.REFINED_LEAD_BLOCK, "Refined Lead Block");
        this.addItem(ModItems.LEAD_SWORD_ITEM, "Lead Sword");
        this.addItem(ModItems.LEAD_HOE_ITEM, "Lead Hoe");
        this.addItem(ModItems.LEAD_SHOVEL_ITEM, "Lead Shovel");
        this.addItem(ModItems.LEAD_AXE_ITEM, "Lead Axe");
        this.addItem(ModItems.LEAD_PICKAXE_ITEM, "Lead Pickaxe");
        this.addItem(ModItems.LEAD_BOOTS_ITEM, "Lead Boots");
        this.addItem(ModItems.LEAD_LEGGINGS_ITEM, "Lead Leggings");
        this.addItem(ModItems.LEAD_CHESTPLATE_ITEM, "Lead Chestplate");
        this.addItem(ModItems.LEAD_HELMET_ITEM, "Lead Helmet");
        this.addItem(ModItems.REFINED_LEAD_SWORD_ITEM, "Refined Lead Sword");
        this.addItem(ModItems.REFINED_LEAD_HOE_ITEM, "Refined Lead Hoe");
        this.addItem(ModItems.REFINED_LEAD_SHOVEL_ITEM, "Refined Lead Shovel");
        this.addItem(ModItems.REFINED_LEAD_AXE_ITEM, "Refined Lead Axe");
        this.addItem(ModItems.REFINED_LEAD_PICKAXE_ITEM, "Refined Lead Pickaxe");
        this.addItem(ModItems.REFINED_LEAD_SHIELD_ITEM, "Refined Lead Shield");
        this.addItem(ModItems.REFINED_LEAD_BOOTS_ITEM, "Refined Lead Boots");
        this.addItem(ModItems.REFINED_LEAD_LEGGINGS_ITEM, "Refined Lead Leggings");
        this.addItem(ModItems.REFINED_LEAD_CHESTPLATE_ITEM, "Refined Lead Chestplate");
        this.addItem(ModItems.REFINED_LEAD_HELMET_ITEM, "Refined Lead Helmet");

        //Silver
        this.addItem(ModItems.RAW_SILVER_ITEM, "Raw Silver");
        this.addItem(ModItems.PURE_RAW_SILVER_ITEM, "Pure Raw Silver");
        this.addItem(ModItems.SILVER_DUST_ITEM, "Silver Dust");
        this.addItem(ModItems.SILVER_INGOT_ITEM, "Silver Ingot");
        this.addItem(ModItems.SILVER_NUGGET_ITEM, "Silver Nugget");
        this.addItem(ModItems.REFINED_SILVER_INGOT_ITEM, "Refined Silver Ingot");
        this.addItem(ModItems.REFINED_SILVER_NUGGET_ITEM, "Refined Silver Nugget");
        this.addItem(ModItems.REFINED_SILVER_DUST_ITEM, "Refined Silver Dust");
        this.addBlock(ModBlocks.ORE_SILVER_BLOCK, "Ore Silver");
        this.addBlock(ModBlocks.RAW_SILVER_BLOCK, "Raw Silver Block");
        this.addBlock(ModBlocks.PURE_RAW_SILVER_BLOCK, "Pure Raw Silver Block");
        this.addBlock(ModBlocks.SILVER_BLOCK, "Silver Block");
        this.addBlock(ModBlocks.REFINED_SILVER_BLOCK, "Refined Silver Block");
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
        this.addItem(ModItems.REFINED_SILVER_SWORD_ITEM, "Refined Silver Sword");
        this.addItem(ModItems.REFINED_SILVER_HOE_ITEM, "Refined Silver Hoe");
        this.addItem(ModItems.REFINED_SILVER_SHOVEL_ITEM, "Refined Silver Shovel");
        this.addItem(ModItems.REFINED_SILVER_AXE_ITEM, "Refined Silver Axe");
        this.addItem(ModItems.REFINED_SILVER_PICKAXE_ITEM, "Refined Silver Pickaxe");
        this.addItem(ModItems.REFINED_SILVER_SHIELD_ITEM, "Refined Silver Shield");
        this.addItem(ModItems.REFINED_SILVER_BOOTS_ITEM, "Refined Silver Boots");
        this.addItem(ModItems.REFINED_SILVER_LEGGINGS_ITEM, "Refined Silver Leggings");
        this.addItem(ModItems.REFINED_SILVER_CHESTPLATE_ITEM, "Refined Silver Chestplate");
        this.addItem(ModItems.REFINED_SILVER_HELMET_ITEM, "Refined Silver Helmet");

        //Electrum
        this.addItem(ModItems.RAW_ELECTRUM_ITEM, "Raw Electrum");
        this.addItem(ModItems.PURE_RAW_ELECTRUM_ITEM, "Pure Raw Electrum");
        this.addItem(ModItems.ELECTRUM_DUST_ITEM, "Electrum Dust");
        this.addItem(ModItems.ELECTRUM_INGOT_ITEM, "Electrum Ingot");
        this.addItem(ModItems.ELECTRUM_NUGGET_ITEM, "Electrum Nugget");
        this.addItem(ModItems.REFINED_ELECTRUM_INGOT_ITEM, "Refined Electrum Ingot");
        this.addItem(ModItems.REFINED_ELECTRUM_NUGGET_ITEM, "Refined Electrum Nugget");
        this.addItem(ModItems.REFINED_ELECTRUM_DUST_ITEM, "Refined Electrum Dust");
        this.addBlock(ModBlocks.ORE_ELECTRUM_BLOCK, "Ore Electrum");
        this.addBlock(ModBlocks.RAW_ELECTRUM_BLOCK, "Raw Electrum Block");
        this.addBlock(ModBlocks.PURE_RAW_ELECTRUM_BLOCK, "Pure Raw Electrum Block");
        this.addBlock(ModBlocks.ELECTRUM_BLOCK, "Electrum Block");
        this.addBlock(ModBlocks.REFINED_ELECTRUM_BLOCK, "Refined Electrum Block");
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
        this.addItem(ModItems.REFINED_ELECTRUM_SWORD_ITEM, "Refined Electrum Sword");
        this.addItem(ModItems.REFINED_ELECTRUM_HOE_ITEM, "Refined Electrum Hoe");
        this.addItem(ModItems.REFINED_ELECTRUM_SHOVEL_ITEM, "Refined Electrum Shovel");
        this.addItem(ModItems.REFINED_ELECTRUM_AXE_ITEM, "Refined Electrum Axe");
        this.addItem(ModItems.REFINED_ELECTRUM_PICKAXE_ITEM, "Refined Electrum Pickaxe");
        this.addItem(ModItems.REFINED_ELECTRUM_SHIELD_ITEM, "Refined Electrum Shield");
        this.addItem(ModItems.REFINED_ELECTRUM_BOOTS_ITEM, "Refined Electrum Boots");
        this.addItem(ModItems.REFINED_ELECTRUM_LEGGINGS_ITEM, "Refined Electrum Leggings");
        this.addItem(ModItems.REFINED_ELECTRUM_CHESTPLATE_ITEM, "Refined Electrum Chestplate");
        this.addItem(ModItems.REFINED_ELECTRUM_HELMET_ITEM, "Refined Electrum Helmet");

        //Uranium
        this.addItem(ModItems.RAW_URANIUM_ITEM, "Raw Uranium");
        this.addItem(ModItems.PURE_RAW_URANIUM_ITEM, "Pure Raw Uranium");
        this.addItem(ModItems.URANIUM_DUST_ITEM, "Uranium Dust");
        this.addItem(ModItems.URANIUM_INGOT_ITEM, "Uranium Ingot");
        this.addItem(ModItems.URANIUM_NUGGET_ITEM, "Uranium Nugget");
        this.addItem(ModItems.REFINED_URANIUM_INGOT_ITEM, "Refined Uranium Ingot");
        this.addItem(ModItems.REFINED_URANIUM_NUGGET_ITEM, "Refined Uranium Nugget");
        this.addItem(ModItems.REFINED_URANIUM_DUST_ITEM, "Refined Uranium Dust");
        this.addBlock(ModBlocks.ORE_URANIUM_BLOCK, "Ore Uranium");
        this.addBlock(ModBlocks.RAW_URANIUM_BLOCK, "Raw Uranium Block");
        this.addBlock(ModBlocks.PURE_RAW_URANIUM_BLOCK, "Pure Raw Uranium Block");
        this.addBlock(ModBlocks.URANIUM_BLOCK, "Uranium Block");
        this.addBlock(ModBlocks.REFINED_URANIUM_BLOCK, "Refined Uranium Block");

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

    private void addCreativeTab(Supplier<CreativeModeTab> creativeTab, String translation) {
        add("itemgroup." + (BuiltInRegistries.CREATIVE_MODE_TAB.getKey(creativeTab.get()).getPath()), translation);
    }
}
