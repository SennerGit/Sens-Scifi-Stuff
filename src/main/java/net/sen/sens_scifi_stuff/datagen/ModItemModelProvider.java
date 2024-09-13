package net.sen.sens_scifi_stuff.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.loaders.ItemLayerModelBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sen.sens_scifi_stuff.SensScifiStuff;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.function.Supplier;

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
        //Iron
        this.basicItem(ModItems.IRON_DUST_ITEM);
        this.basicItem(ModItems.PURE_RAW_IRON_ITEM);
        this.basicItem(ModItems.REFINED_IRON_INGOT_ITEM);
        this.basicItem(ModItems.REFINED_IRON_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_IRON_DUST_ITEM);
        this.handheldItem(ModItems.REFINED_IRON_SWORD_ITEM);
        this.handheldItem(ModItems.REFINED_IRON_HOE_ITEM);
        this.handheldItem(ModItems.REFINED_IRON_SHOVEL_ITEM);
        this.handheldItem(ModItems.REFINED_IRON_AXE_ITEM);
        this.handheldItem(ModItems.REFINED_IRON_PICKAXE_ITEM);
        this.handheldItem(ModItems.REFINED_IRON_SHIELD_ITEM);
        this.createArmourSet(ModItems.REFINED_IRON_BOOTS_ITEM, ModItems.REFINED_IRON_LEGGINGS_ITEM, ModItems.REFINED_IRON_CHESTPLATE_ITEM, ModItems.REFINED_IRON_HELMET_ITEM);

        //Copper
        this.basicItem(ModItems.COPPER_DUST_ITEM);
        this.basicItem(ModItems.PURE_RAW_COPPER_ITEM);
        this.basicItem(ModItems.REFINED_COPPER_INGOT_ITEM);
        this.basicItem(ModItems.REFINED_COPPER_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_COPPER_DUST_ITEM);
        this.handheldItem(ModItems.REFINED_COPPER_SWORD_ITEM);
        this.handheldItem(ModItems.REFINED_COPPER_HOE_ITEM);
        this.handheldItem(ModItems.REFINED_COPPER_SHOVEL_ITEM);
        this.handheldItem(ModItems.REFINED_COPPER_AXE_ITEM);
        this.handheldItem(ModItems.REFINED_COPPER_PICKAXE_ITEM);
        this.handheldItem(ModItems.REFINED_COPPER_SHIELD_ITEM);
        this.createArmourSet(ModItems.REFINED_COPPER_BOOTS_ITEM, ModItems.REFINED_COPPER_LEGGINGS_ITEM, ModItems.REFINED_COPPER_CHESTPLATE_ITEM, ModItems.REFINED_COPPER_HELMET_ITEM);

        //Gold
        this.basicItem(ModItems.GOLD_DUST_ITEM);
        this.basicItem(ModItems.PURE_RAW_GOLD_ITEM);
        this.basicItem(ModItems.REFINED_GOLD_INGOT_ITEM);
        this.basicItem(ModItems.REFINED_GOLD_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_GOLD_DUST_ITEM);
        this.handheldItem(ModItems.REFINED_GOLD_SWORD_ITEM);
        this.handheldItem(ModItems.REFINED_GOLD_HOE_ITEM);
        this.handheldItem(ModItems.REFINED_GOLD_SHOVEL_ITEM);
        this.handheldItem(ModItems.REFINED_GOLD_AXE_ITEM);
        this.handheldItem(ModItems.REFINED_GOLD_PICKAXE_ITEM);
        this.handheldItem(ModItems.REFINED_GOLD_SHIELD_ITEM);
        this.createArmourSet(ModItems.REFINED_GOLD_BOOTS_ITEM, ModItems.REFINED_GOLD_LEGGINGS_ITEM, ModItems.REFINED_GOLD_CHESTPLATE_ITEM, ModItems.REFINED_GOLD_HELMET_ITEM);

        //Steel
        this.basicItem(ModItems.RAW_STEEL_MIX_ITEM);
        this.basicItem(ModItems.STEEL_INGOT_ITEM);
        this.basicItem(ModItems.STEEL_NUGGET_ITEM);
        this.basicItem(ModItems.STEEL_DUST_ITEM);
        this.handheldItem(ModItems.STEEL_SWORD_ITEM);
        this.handheldItem(ModItems.STEEL_HOE_ITEM);
        this.handheldItem(ModItems.STEEL_SHOVEL_ITEM);
        this.handheldItem(ModItems.STEEL_AXE_ITEM);
        this.handheldItem(ModItems.STEEL_PICKAXE_ITEM);
        this.handheldItem(ModItems.STEEL_SHIELD_ITEM);
        this.createArmourSet(ModItems.STEEL_BOOTS_ITEM, ModItems.STEEL_LEGGINGS_ITEM, ModItems.STEEL_CHESTPLATE_ITEM, ModItems.STEEL_HELMET_ITEM);

        //Tin
        this.basicItem(ModItems.RAW_TIN_ITEM);
        this.basicItem(ModItems.PURE_RAW_TIN_ITEM);
        this.basicItem(ModItems.TIN_DUST_ITEM);
        this.basicItem(ModItems.TIN_INGOT_ITEM);
        this.basicItem(ModItems.TIN_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_TIN_INGOT_ITEM);
        this.basicItem(ModItems.REFINED_TIN_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_TIN_DUST_ITEM);
        this.handheldItem(ModItems.TIN_SWORD_ITEM);
        this.handheldItem(ModItems.TIN_HOE_ITEM);
        this.handheldItem(ModItems.TIN_SHOVEL_ITEM);
        this.handheldItem(ModItems.TIN_AXE_ITEM);
        this.handheldItem(ModItems.TIN_PICKAXE_ITEM);
        this.handheldItem(ModItems.TIN_SHIELD_ITEM);
        this.createArmourSet(ModItems.TIN_BOOTS_ITEM, ModItems.TIN_LEGGINGS_ITEM, ModItems.TIN_CHESTPLATE_ITEM, ModItems.TIN_HELMET_ITEM);
        this.handheldItem(ModItems.REFINED_TIN_SWORD_ITEM);
        this.handheldItem(ModItems.REFINED_TIN_HOE_ITEM);
        this.handheldItem(ModItems.REFINED_TIN_SHOVEL_ITEM);
        this.handheldItem(ModItems.REFINED_TIN_AXE_ITEM);
        this.handheldItem(ModItems.REFINED_TIN_PICKAXE_ITEM);
        this.handheldItem(ModItems.REFINED_TIN_SHIELD_ITEM);
        this.createArmourSet(ModItems.REFINED_TIN_BOOTS_ITEM, ModItems.REFINED_TIN_LEGGINGS_ITEM, ModItems.REFINED_TIN_CHESTPLATE_ITEM, ModItems.REFINED_TIN_HELMET_ITEM);

        //Zinc
        this.basicItem(ModItems.RAW_ZINC_ITEM);
        this.basicItem(ModItems.PURE_RAW_ZINC_ITEM);
        this.basicItem(ModItems.ZINC_DUST_ITEM);
        this.basicItem(ModItems.ZINC_INGOT_ITEM);
        this.basicItem(ModItems.ZINC_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_ZINC_INGOT_ITEM);
        this.basicItem(ModItems.REFINED_ZINC_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_ZINC_DUST_ITEM);
        this.handheldItem(ModItems.ZINC_SWORD_ITEM);
        this.handheldItem(ModItems.ZINC_HOE_ITEM);
        this.handheldItem(ModItems.ZINC_SHOVEL_ITEM);
        this.handheldItem(ModItems.ZINC_AXE_ITEM);
        this.handheldItem(ModItems.ZINC_PICKAXE_ITEM);
        this.handheldItem(ModItems.ZINC_SHIELD_ITEM);
        this.createArmourSet(ModItems.ZINC_BOOTS_ITEM, ModItems.ZINC_LEGGINGS_ITEM, ModItems.ZINC_CHESTPLATE_ITEM, ModItems.ZINC_HELMET_ITEM);
        this.handheldItem(ModItems.REFINED_ZINC_SWORD_ITEM);
        this.handheldItem(ModItems.REFINED_ZINC_HOE_ITEM);
        this.handheldItem(ModItems.REFINED_ZINC_SHOVEL_ITEM);
        this.handheldItem(ModItems.REFINED_ZINC_AXE_ITEM);
        this.handheldItem(ModItems.REFINED_ZINC_PICKAXE_ITEM);
        this.handheldItem(ModItems.REFINED_ZINC_SHIELD_ITEM);
        this.createArmourSet(ModItems.REFINED_ZINC_BOOTS_ITEM, ModItems.REFINED_ZINC_LEGGINGS_ITEM, ModItems.REFINED_ZINC_CHESTPLATE_ITEM, ModItems.REFINED_ZINC_HELMET_ITEM);

        //Nickel
        this.basicItem(ModItems.RAW_NICKEL_ITEM);
        this.basicItem(ModItems.PURE_RAW_NICKEL_ITEM);
        this.basicItem(ModItems.NICKEL_DUST_ITEM);
        this.basicItem(ModItems.NICKEL_INGOT_ITEM);
        this.basicItem(ModItems.NICKEL_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_NICKEL_INGOT_ITEM);
        this.basicItem(ModItems.REFINED_NICKEL_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_NICKEL_DUST_ITEM);
        this.handheldItem(ModItems.NICKEL_SWORD_ITEM);
        this.handheldItem(ModItems.NICKEL_HOE_ITEM);
        this.handheldItem(ModItems.NICKEL_SHOVEL_ITEM);
        this.handheldItem(ModItems.NICKEL_AXE_ITEM);
        this.handheldItem(ModItems.NICKEL_PICKAXE_ITEM);
        this.handheldItem(ModItems.NICKEL_SHIELD_ITEM);
        this.createArmourSet(ModItems.NICKEL_BOOTS_ITEM, ModItems.NICKEL_LEGGINGS_ITEM, ModItems.NICKEL_CHESTPLATE_ITEM, ModItems.NICKEL_HELMET_ITEM);
        this.handheldItem(ModItems.REFINED_NICKEL_SWORD_ITEM);
        this.handheldItem(ModItems.REFINED_NICKEL_HOE_ITEM);
        this.handheldItem(ModItems.REFINED_NICKEL_SHOVEL_ITEM);
        this.handheldItem(ModItems.REFINED_NICKEL_AXE_ITEM);
        this.handheldItem(ModItems.REFINED_NICKEL_PICKAXE_ITEM);
        this.handheldItem(ModItems.REFINED_NICKEL_SHIELD_ITEM);
        this.createArmourSet(ModItems.REFINED_NICKEL_BOOTS_ITEM, ModItems.REFINED_NICKEL_LEGGINGS_ITEM, ModItems.REFINED_NICKEL_CHESTPLATE_ITEM, ModItems.REFINED_NICKEL_HELMET_ITEM);

        //Invar
        this.basicItem(ModItems.RAW_INVAR_ITEM);
        this.basicItem(ModItems.PURE_RAW_INVAR_ITEM);
        this.basicItem(ModItems.INVAR_DUST_ITEM);
        this.basicItem(ModItems.INVAR_INGOT_ITEM);
        this.basicItem(ModItems.INVAR_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_INVAR_INGOT_ITEM);
        this.basicItem(ModItems.REFINED_INVAR_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_INVAR_DUST_ITEM);
        this.handheldItem(ModItems.INVAR_SWORD_ITEM);
        this.handheldItem(ModItems.INVAR_HOE_ITEM);
        this.handheldItem(ModItems.INVAR_SHOVEL_ITEM);
        this.handheldItem(ModItems.INVAR_AXE_ITEM);
        this.handheldItem(ModItems.INVAR_PICKAXE_ITEM);
        this.handheldItem(ModItems.INVAR_SHIELD_ITEM);
        this.createArmourSet(ModItems.INVAR_BOOTS_ITEM, ModItems.INVAR_LEGGINGS_ITEM, ModItems.INVAR_CHESTPLATE_ITEM, ModItems.INVAR_HELMET_ITEM);
        this.handheldItem(ModItems.REFINED_INVAR_SWORD_ITEM);
        this.handheldItem(ModItems.REFINED_INVAR_HOE_ITEM);
        this.handheldItem(ModItems.REFINED_INVAR_SHOVEL_ITEM);
        this.handheldItem(ModItems.REFINED_INVAR_AXE_ITEM);
        this.handheldItem(ModItems.REFINED_INVAR_PICKAXE_ITEM);
        this.handheldItem(ModItems.REFINED_INVAR_SHIELD_ITEM);
        this.createArmourSet(ModItems.REFINED_INVAR_BOOTS_ITEM, ModItems.REFINED_INVAR_LEGGINGS_ITEM, ModItems.REFINED_INVAR_CHESTPLATE_ITEM, ModItems.REFINED_INVAR_HELMET_ITEM);

        //Lead
        this.basicItem(ModItems.RAW_LEAD_ITEM);
        this.basicItem(ModItems.PURE_RAW_LEAD_ITEM);
        this.basicItem(ModItems.LEAD_DUST_ITEM);
        this.basicItem(ModItems.LEAD_INGOT_ITEM);
        this.basicItem(ModItems.LEAD_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_LEAD_INGOT_ITEM);
        this.basicItem(ModItems.REFINED_LEAD_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_LEAD_DUST_ITEM);
        this.handheldItem(ModItems.LEAD_SWORD_ITEM);
        this.handheldItem(ModItems.LEAD_HOE_ITEM);
        this.handheldItem(ModItems.LEAD_SHOVEL_ITEM);
        this.handheldItem(ModItems.LEAD_AXE_ITEM);
        this.handheldItem(ModItems.LEAD_PICKAXE_ITEM);
        this.createArmourSet(ModItems.LEAD_BOOTS_ITEM, ModItems.LEAD_LEGGINGS_ITEM, ModItems.LEAD_CHESTPLATE_ITEM, ModItems.LEAD_HELMET_ITEM);
        this.handheldItem(ModItems.REFINED_LEAD_SWORD_ITEM);
        this.handheldItem(ModItems.REFINED_LEAD_HOE_ITEM);
        this.handheldItem(ModItems.REFINED_LEAD_SHOVEL_ITEM);
        this.handheldItem(ModItems.REFINED_LEAD_AXE_ITEM);
        this.handheldItem(ModItems.REFINED_LEAD_PICKAXE_ITEM);
        this.handheldItem(ModItems.REFINED_LEAD_SHIELD_ITEM);
        this.createArmourSet(ModItems.REFINED_LEAD_BOOTS_ITEM, ModItems.REFINED_LEAD_LEGGINGS_ITEM, ModItems.REFINED_LEAD_CHESTPLATE_ITEM, ModItems.REFINED_LEAD_HELMET_ITEM);

        //Silver
        this.basicItem(ModItems.RAW_SILVER_ITEM);
        this.basicItem(ModItems.PURE_RAW_SILVER_ITEM);
        this.basicItem(ModItems.SILVER_DUST_ITEM);
        this.basicItem(ModItems.SILVER_INGOT_ITEM);
        this.basicItem(ModItems.SILVER_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_SILVER_INGOT_ITEM);
        this.basicItem(ModItems.REFINED_SILVER_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_SILVER_DUST_ITEM);
        this.handheldItem(ModItems.SILVER_SWORD_ITEM);
        this.handheldItem(ModItems.SILVER_HOE_ITEM);
        this.handheldItem(ModItems.SILVER_SHOVEL_ITEM);
        this.handheldItem(ModItems.SILVER_AXE_ITEM);
        this.handheldItem(ModItems.SILVER_PICKAXE_ITEM);
        this.handheldItem(ModItems.SILVER_SHIELD_ITEM);
        this.createArmourSet(ModItems.SILVER_BOOTS_ITEM, ModItems.SILVER_LEGGINGS_ITEM, ModItems.SILVER_CHESTPLATE_ITEM, ModItems.SILVER_HELMET_ITEM);
        this.handheldItem(ModItems.REFINED_SILVER_SWORD_ITEM);
        this.handheldItem(ModItems.REFINED_SILVER_HOE_ITEM);
        this.handheldItem(ModItems.REFINED_SILVER_SHOVEL_ITEM);
        this.handheldItem(ModItems.REFINED_SILVER_AXE_ITEM);
        this.handheldItem(ModItems.REFINED_SILVER_PICKAXE_ITEM);
        this.handheldItem(ModItems.REFINED_SILVER_SHIELD_ITEM);
        this.createArmourSet(ModItems.REFINED_SILVER_BOOTS_ITEM, ModItems.REFINED_SILVER_LEGGINGS_ITEM, ModItems.REFINED_SILVER_CHESTPLATE_ITEM, ModItems.REFINED_SILVER_HELMET_ITEM);

        //Electrum
        this.basicItem(ModItems.RAW_ELECTRUM_ITEM);
        this.basicItem(ModItems.PURE_RAW_ELECTRUM_ITEM);
        this.basicItem(ModItems.ELECTRUM_DUST_ITEM);
        this.basicItem(ModItems.ELECTRUM_INGOT_ITEM);
        this.basicItem(ModItems.ELECTRUM_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_ELECTRUM_INGOT_ITEM);
        this.basicItem(ModItems.REFINED_ELECTRUM_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_ELECTRUM_DUST_ITEM);
        this.handheldItem(ModItems.ELECTRUM_SWORD_ITEM);
        this.handheldItem(ModItems.ELECTRUM_HOE_ITEM);
        this.handheldItem(ModItems.ELECTRUM_SHOVEL_ITEM);
        this.handheldItem(ModItems.ELECTRUM_AXE_ITEM);
        this.handheldItem(ModItems.ELECTRUM_PICKAXE_ITEM);
        this.handheldItem(ModItems.ELECTRUM_SHIELD_ITEM);
        this.createArmourSet(ModItems.ELECTRUM_BOOTS_ITEM, ModItems.ELECTRUM_LEGGINGS_ITEM, ModItems.ELECTRUM_CHESTPLATE_ITEM, ModItems.ELECTRUM_HELMET_ITEM);
        this.handheldItem(ModItems.REFINED_ELECTRUM_SWORD_ITEM);
        this.handheldItem(ModItems.REFINED_ELECTRUM_HOE_ITEM);
        this.handheldItem(ModItems.REFINED_ELECTRUM_SHOVEL_ITEM);
        this.handheldItem(ModItems.REFINED_ELECTRUM_AXE_ITEM);
        this.handheldItem(ModItems.REFINED_ELECTRUM_PICKAXE_ITEM);
        this.handheldItem(ModItems.REFINED_ELECTRUM_SHIELD_ITEM);
        this.createArmourSet(ModItems.REFINED_ELECTRUM_BOOTS_ITEM, ModItems.REFINED_ELECTRUM_LEGGINGS_ITEM, ModItems.REFINED_ELECTRUM_CHESTPLATE_ITEM, ModItems.REFINED_ELECTRUM_HELMET_ITEM);

        //Uranium
        this.basicItem(ModItems.RAW_URANIUM_ITEM);
        this.basicItem(ModItems.PURE_RAW_URANIUM_ITEM);
        this.basicItem(ModItems.URANIUM_DUST_ITEM);
        this.basicItem(ModItems.URANIUM_INGOT_ITEM);
        this.basicItem(ModItems.URANIUM_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_URANIUM_INGOT_ITEM);
        this.basicItem(ModItems.REFINED_URANIUM_NUGGET_ITEM);
        this.basicItem(ModItems.REFINED_URANIUM_DUST_ITEM);

        //Bronze
        this.basicItem(ModItems.RAW_BRONZE_MIX_ITEM);
        this.basicItem(ModItems.BRONZE_INGOT_ITEM);
        this.basicItem(ModItems.BRONZE_NUGGET_ITEM);
        this.basicItem(ModItems.BRONZE_DUST_ITEM);
        this.handheldItem(ModItems.BRONZE_SWORD_ITEM);
        this.handheldItem(ModItems.BRONZE_HOE_ITEM);
        this.handheldItem(ModItems.BRONZE_SHOVEL_ITEM);
        this.handheldItem(ModItems.BRONZE_AXE_ITEM);
        this.handheldItem(ModItems.BRONZE_PICKAXE_ITEM);
        this.handheldItem(ModItems.BRONZE_SHIELD_ITEM);
        this.createArmourSet(ModItems.BRONZE_BOOTS_ITEM, ModItems.BRONZE_LEGGINGS_ITEM, ModItems.BRONZE_CHESTPLATE_ITEM, ModItems.BRONZE_HELMET_ITEM);

        //Brass
        this.basicItem(ModItems.RAW_BRASS_MIX_ITEM);
        this.basicItem(ModItems.BRASS_INGOT_ITEM);
        this.basicItem(ModItems.BRASS_NUGGET_ITEM);
        this.basicItem(ModItems.BRASS_DUST_ITEM);
        this.handheldItem(ModItems.BRASS_SWORD_ITEM);
        this.handheldItem(ModItems.BRASS_HOE_ITEM);
        this.handheldItem(ModItems.BRASS_SHOVEL_ITEM);
        this.handheldItem(ModItems.BRASS_AXE_ITEM);
        this.handheldItem(ModItems.BRASS_PICKAXE_ITEM);
        this.handheldItem(ModItems.BRASS_SHIELD_ITEM);
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
        this.basicItem(ModItems.IRON_DUST_ITEM);
        this.basicItem(ModItems.COPPER_DUST_ITEM);
        this.basicItem(ModItems.GOLD_DUST_ITEM);

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

        //Iron
        this.generateBlockItem(ModBlocks.PURE_RAW_IRON_BLOCK);
        this.generateBlockItem(ModBlocks.REFINED_IRON_BLOCK);

        //Copper
        this.generateBlockItem(ModBlocks.PURE_RAW_COPPER_BLOCK);
        this.generateBlockItem(ModBlocks.REFINED_COPPER_BLOCK);

        //Gold
        this.generateBlockItem(ModBlocks.PURE_RAW_GOLD_BLOCK);
        this.generateBlockItem(ModBlocks.REFINED_GOLD_BLOCK);

        //Steel
        this.generateBlockItem(ModBlocks.STEEL_BLOCK);

        //Tin
        this.generateBlockItem(ModBlocks.ORE_TIN_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_TIN_BLOCK);
        this.generateBlockItem(ModBlocks.PURE_RAW_TIN_BLOCK);
        this.generateBlockItem(ModBlocks.TIN_BLOCK);
        this.generateBlockItem(ModBlocks.REFINED_TIN_BLOCK);

        //Zinc
        this.generateBlockItem(ModBlocks.ORE_ZINC_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_ZINC_BLOCK);
        this.generateBlockItem(ModBlocks.PURE_RAW_ZINC_BLOCK);
        this.generateBlockItem(ModBlocks.ZINC_BLOCK);
        this.generateBlockItem(ModBlocks.REFINED_ZINC_BLOCK);

        //Nickel
        this.generateBlockItem(ModBlocks.ORE_NICKEL_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_NICKEL_BLOCK);
        this.generateBlockItem(ModBlocks.PURE_RAW_NICKEL_BLOCK);
        this.generateBlockItem(ModBlocks.NICKEL_BLOCK);
        this.generateBlockItem(ModBlocks.REFINED_NICKEL_BLOCK);

        //Invar
        this.generateBlockItem(ModBlocks.ORE_INVAR_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_INVAR_BLOCK);
        this.generateBlockItem(ModBlocks.PURE_RAW_INVAR_BLOCK);
        this.generateBlockItem(ModBlocks.INVAR_BLOCK);
        this.generateBlockItem(ModBlocks.REFINED_INVAR_BLOCK);

        //Lead
        this.generateBlockItem(ModBlocks.ORE_LEAD_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_LEAD_BLOCK);
        this.generateBlockItem(ModBlocks.PURE_RAW_LEAD_BLOCK);
        this.generateBlockItem(ModBlocks.LEAD_BLOCK);
        this.generateBlockItem(ModBlocks.REFINED_LEAD_BLOCK);

        //Silver
        this.generateBlockItem(ModBlocks.ORE_SILVER_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_SILVER_BLOCK);
        this.generateBlockItem(ModBlocks.PURE_RAW_SILVER_BLOCK);
        this.generateBlockItem(ModBlocks.SILVER_BLOCK);
        this.generateBlockItem(ModBlocks.REFINED_SILVER_BLOCK);

        //Electrum
        this.generateBlockItem(ModBlocks.ORE_ELECTRUM_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_ELECTRUM_BLOCK);
        this.generateBlockItem(ModBlocks.PURE_RAW_ELECTRUM_BLOCK);
        this.generateBlockItem(ModBlocks.ELECTRUM_BLOCK);
        this.generateBlockItem(ModBlocks.REFINED_ELECTRUM_BLOCK);

        //Uranium
        this.generateBlockItem(ModBlocks.ORE_URANIUM_BLOCK);
        this.generateBlockItem(ModBlocks.RAW_URANIUM_BLOCK);
        this.generateBlockItem(ModBlocks.PURE_RAW_URANIUM_BLOCK);
        this.generateBlockItem(ModBlocks.URANIUM_BLOCK);
        this.generateBlockItem(ModBlocks.REFINED_URANIUM_BLOCK);

        //Bronze
        this.generateBlockItem(ModBlocks.BRONZE_BLOCK);

        //Brass
        this.generateBlockItem(ModBlocks.BRASS_BLOCK);
    }
}
