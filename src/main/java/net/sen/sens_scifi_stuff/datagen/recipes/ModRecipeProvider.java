package net.sen.sens_scifi_stuff.datagen.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends ModRecipeHelper {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        this.oreCookingRecipe(output, Items.IRON_INGOT, ModItems.IRON_DUST_ITEM.get());
        this.oreCookingRecipe(output, Items.COPPER_INGOT, ModItems.COPPER_DUST_ITEM.get());
        this.oreCookingRecipe(output, Items.GOLD_INGOT, ModItems.GOLD_DUST_ITEM.get());

        this.metalRecipes(output, ModBlocks.ORE_TIN_BLOCK.get(), ModItems.RAW_TIN_ITEM.get(), ModBlocks.RAW_TIN_BLOCK.get(), ModItems.TIN_INGOT_ITEM.get(), ModBlocks.TIN_BLOCK.get(), ModItems.TIN_NUGGET_ITEM.get(), ModItems.TIN_DUST_ITEM.get(), ModItems.TIN_SWORD_ITEM.get(), ModItems.TIN_AXE_ITEM.get(), ModItems.TIN_SHOVEL_ITEM.get(), ModItems.TIN_PICKAXE_ITEM.get(), ModItems.TIN_HOE_ITEM.get(), ModItems.TIN_SHIELD_ITEM.get(), ModItems.TIN_BOOTS_ITEM.get(), ModItems.TIN_LEGGINGS_ITEM.get(), ModItems.TIN_CHESTPLATE_ITEM.get(), ModItems.TIN_HELMET_ITEM.get());
        this.metalRecipes(output, ModBlocks.ORE_ZINC_BLOCK.get(), ModItems.RAW_ZINC_ITEM.get(), ModBlocks.RAW_ZINC_BLOCK.get(), ModItems.ZINC_INGOT_ITEM.get(), ModBlocks.ZINC_BLOCK.get(), ModItems.ZINC_NUGGET_ITEM.get(), ModItems.ZINC_DUST_ITEM.get(), ModItems.ZINC_SWORD_ITEM.get(), ModItems.ZINC_AXE_ITEM.get(), ModItems.ZINC_SHOVEL_ITEM.get(), ModItems.ZINC_PICKAXE_ITEM.get(), ModItems.ZINC_HOE_ITEM.get(), ModItems.ZINC_SHIELD_ITEM.get(), ModItems.ZINC_BOOTS_ITEM.get(), ModItems.ZINC_LEGGINGS_ITEM.get(), ModItems.ZINC_CHESTPLATE_ITEM.get(), ModItems.ZINC_HELMET_ITEM.get());
        this.metalRecipes(output, ModBlocks.ORE_NICKEL_BLOCK.get(), ModItems.RAW_NICKEL_ITEM.get(), ModBlocks.RAW_NICKEL_BLOCK.get(), ModItems.NICKEL_INGOT_ITEM.get(), ModBlocks.NICKEL_BLOCK.get(), ModItems.NICKEL_NUGGET_ITEM.get(), ModItems.NICKEL_DUST_ITEM.get(), ModItems.NICKEL_SWORD_ITEM.get(), ModItems.NICKEL_AXE_ITEM.get(), ModItems.NICKEL_SHOVEL_ITEM.get(), ModItems.NICKEL_PICKAXE_ITEM.get(), ModItems.NICKEL_HOE_ITEM.get(), ModItems.NICKEL_SHIELD_ITEM.get(), ModItems.NICKEL_BOOTS_ITEM.get(), ModItems.NICKEL_LEGGINGS_ITEM.get(), ModItems.NICKEL_CHESTPLATE_ITEM.get(), ModItems.NICKEL_HELMET_ITEM.get());
        this.metalRecipes(output, ModBlocks.ORE_LEAD_BLOCK.get(), ModItems.RAW_LEAD_ITEM.get(), ModBlocks.RAW_LEAD_BLOCK.get(), ModItems.LEAD_INGOT_ITEM.get(), ModBlocks.LEAD_BLOCK.get(), ModItems.LEAD_NUGGET_ITEM.get(), ModItems.LEAD_DUST_ITEM.get(), ModItems.LEAD_SWORD_ITEM.get(), ModItems.LEAD_AXE_ITEM.get(), ModItems.LEAD_SHOVEL_ITEM.get(), ModItems.LEAD_PICKAXE_ITEM.get(), ModItems.LEAD_HOE_ITEM.get(), ModItems.LEAD_SHIELD_ITEM.get(), ModItems.LEAD_BOOTS_ITEM.get(), ModItems.LEAD_LEGGINGS_ITEM.get(), ModItems.LEAD_CHESTPLATE_ITEM.get(), ModItems.LEAD_HELMET_ITEM.get());
        this.metalRecipes(output, ModBlocks.ORE_INVAR_BLOCK.get(), ModItems.RAW_INVAR_ITEM.get(), ModBlocks.RAW_INVAR_BLOCK.get(), ModItems.INVAR_INGOT_ITEM.get(), ModBlocks.INVAR_BLOCK.get(), ModItems.INVAR_NUGGET_ITEM.get(), ModItems.INVAR_DUST_ITEM.get(), ModItems.INVAR_SWORD_ITEM.get(), ModItems.INVAR_AXE_ITEM.get(), ModItems.INVAR_SHOVEL_ITEM.get(), ModItems.INVAR_PICKAXE_ITEM.get(), ModItems.INVAR_HOE_ITEM.get(), ModItems.INVAR_SHIELD_ITEM.get(), ModItems.INVAR_BOOTS_ITEM.get(), ModItems.INVAR_LEGGINGS_ITEM.get(), ModItems.INVAR_CHESTPLATE_ITEM.get(), ModItems.INVAR_HELMET_ITEM.get());
        this.metalRecipes(output, ModBlocks.ORE_SILVER_BLOCK.get(), ModItems.RAW_SILVER_ITEM.get(), ModBlocks.RAW_SILVER_BLOCK.get(), ModItems.SILVER_INGOT_ITEM.get(), ModBlocks.SILVER_BLOCK.get(), ModItems.SILVER_NUGGET_ITEM.get(), ModItems.SILVER_DUST_ITEM.get(), ModItems.SILVER_SWORD_ITEM.get(), ModItems.SILVER_AXE_ITEM.get(), ModItems.SILVER_SHOVEL_ITEM.get(), ModItems.SILVER_PICKAXE_ITEM.get(), ModItems.SILVER_HOE_ITEM.get(), ModItems.SILVER_SHIELD_ITEM.get(), ModItems.SILVER_BOOTS_ITEM.get(), ModItems.SILVER_LEGGINGS_ITEM.get(), ModItems.SILVER_CHESTPLATE_ITEM.get(), ModItems.SILVER_HELMET_ITEM.get());
        this.metalRecipes(output, ModBlocks.ORE_ELECTRUM_BLOCK.get(), ModItems.RAW_ELECTRUM_ITEM.get(), ModBlocks.RAW_ELECTRUM_BLOCK.get(), ModItems.ELECTRUM_INGOT_ITEM.get(), ModBlocks.ELECTRUM_BLOCK.get(), ModItems.ELECTRUM_NUGGET_ITEM.get(), ModItems.ELECTRUM_DUST_ITEM.get(), ModItems.ELECTRUM_SWORD_ITEM.get(), ModItems.ELECTRUM_AXE_ITEM.get(), ModItems.ELECTRUM_SHOVEL_ITEM.get(), ModItems.ELECTRUM_PICKAXE_ITEM.get(), ModItems.ELECTRUM_HOE_ITEM.get(), ModItems.ELECTRUM_SHIELD_ITEM.get(), ModItems.ELECTRUM_BOOTS_ITEM.get(), ModItems.ELECTRUM_LEGGINGS_ITEM.get(), ModItems.ELECTRUM_CHESTPLATE_ITEM.get(), ModItems.ELECTRUM_HELMET_ITEM.get());
        this.metalRecipes(output, ModBlocks.ORE_URANIUM_BLOCK.get(), ModItems.RAW_URANIUM_ITEM.get(), ModBlocks.RAW_URANIUM_BLOCK.get(), ModItems.URANIUM_INGOT_ITEM.get(), ModBlocks.URANIUM_BLOCK.get(), ModItems.URANIUM_NUGGET_ITEM.get(), ModItems.URANIUM_DUST_ITEM.get());

        this.alloyRecipes(output, ModItems.RAW_STEEL_MIX_ITEM.get(), ModItems.STEEL_INGOT_ITEM.get(), ModBlocks.STEEL_BLOCK.get(), ModItems.STEEL_INGOT_ITEM.get(), ModItems.STEEL_DUST_ITEM.get(), ModItems.STEEL_SWORD_ITEM.get(), ModItems.STEEL_AXE_ITEM.get(), ModItems.STEEL_SHOVEL_ITEM.get(), ModItems.STEEL_PICKAXE_ITEM.get(), ModItems.STEEL_HOE_ITEM.get(), ModItems.STEEL_SHIELD_ITEM.get(), ModItems.STEEL_BOOTS_ITEM.get(), ModItems.STEEL_LEGGINGS_ITEM.get(), ModItems.STEEL_CHESTPLATE_ITEM.get(), ModItems.STEEL_HELMET_ITEM.get());
        this.alloyRecipes(output, ModItems.RAW_BRONZE_MIX_ITEM.get(), ModItems.BRONZE_INGOT_ITEM.get(), ModBlocks.BRONZE_BLOCK.get(), ModItems.BRONZE_INGOT_ITEM.get(), ModItems.BRONZE_DUST_ITEM.get(), ModItems.BRONZE_SWORD_ITEM.get(), ModItems.BRONZE_AXE_ITEM.get(), ModItems.BRONZE_SHOVEL_ITEM.get(), ModItems.BRONZE_PICKAXE_ITEM.get(), ModItems.BRONZE_HOE_ITEM.get(), ModItems.BRONZE_SHIELD_ITEM.get(), ModItems.BRONZE_BOOTS_ITEM.get(), ModItems.BRONZE_LEGGINGS_ITEM.get(), ModItems.BRONZE_CHESTPLATE_ITEM.get(), ModItems.BRONZE_HELMET_ITEM.get());
        this.alloyRecipes(output, ModItems.RAW_BRASS_MIX_ITEM.get(), ModItems.BRASS_INGOT_ITEM.get(), ModBlocks.BRASS_BLOCK.get(), ModItems.BRASS_INGOT_ITEM.get(), ModItems.BRASS_DUST_ITEM.get(), ModItems.BRASS_SWORD_ITEM.get(), ModItems.BRASS_AXE_ITEM.get(), ModItems.BRASS_SHOVEL_ITEM.get(), ModItems.BRASS_PICKAXE_ITEM.get(), ModItems.BRASS_HOE_ITEM.get(), ModItems.BRASS_SHIELD_ITEM.get(), ModItems.BRASS_BOOTS_ITEM.get(), ModItems.BRASS_LEGGINGS_ITEM.get(), ModItems.BRASS_CHESTPLATE_ITEM.get(), ModItems.BRASS_HELMET_ITEM.get());
    }
}
