package net.sen.sens_scifi_stuff.tabs;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.function.Supplier;

public class ModCreativeTabs {
    private static DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModUtils.getModId());

    public static final Supplier<CreativeModeTab> SENSSCIFISTUFFCORETAB = TABS.register("sens_scifi_stuff_tab", () -> {
        return CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModItems.OMNI_WRENCH_ITEM.get()))
                .title(Component.translatable("itemgroup.sens_scifi_stuff_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.OMNI_WRENCH_ITEM.get());
                    output.accept(ModItems.PESTLE_ITEM.get());
                    output.accept(ModItems.MORTAR_ITEM.get());
                    output.accept(ModItems.LLAMARADA_CRYSTAL_ITEM.get());
                    output.accept(ModItems.QUARTZ_POWDER_ITEM.get());
                    output.accept(ModItems.CRYSTAL_STARTER_ITEM.get());
                    output.accept(ModItems.AHOGAR_CRYSTAL_ITEM.get());
                    output.accept(ModItems.CIELO_CRYSTAL_ITEM.get());
                    output.accept(ModItems.TIERRA_CRYSTAL_ITEM.get());
                    output.accept(ModItems.NOCHE_CRYSTAL_ITEM.get());
                    output.accept(ModItems.LUZ_CRYSTAL_ITEM.get());
                    output.accept(ModItems.FUERZA_CORE_ITEM.get());
                    output.accept(ModItems.FUERZA_POWDER_ITEM.get());
                    output.accept(ModItems.FUERZA_CRYSTAL_ITEM.get());

                    //Iron
                    output.accept(ModItems.IRON_DUST_ITEM.get());
                    output.accept(ModItems.PURE_RAW_IRON_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_INGOT_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_DUST_ITEM.get());
                    output.accept(ModBlocks.PURE_RAW_IRON_BLOCK.get());
                    output.accept(ModBlocks.REFINED_IRON_BLOCK.get());
                    output.accept(ModItems.REFINED_IRON_SWORD_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_HOE_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_SHOVEL_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_AXE_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_PICKAXE_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_SHIELD_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_BOOTS_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_LEGGINGS_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.REFINED_IRON_HELMET_ITEM.get());

                    //Copper
                    output.accept(ModItems.COPPER_DUST_ITEM.get());
                    output.accept(ModItems.PURE_RAW_COPPER_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_INGOT_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_DUST_ITEM.get());
                    output.accept(ModBlocks.PURE_RAW_COPPER_BLOCK.get());
                    output.accept(ModBlocks.REFINED_COPPER_BLOCK.get());
                    output.accept(ModItems.REFINED_COPPER_SWORD_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_HOE_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_SHOVEL_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_AXE_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_PICKAXE_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_SHIELD_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_BOOTS_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_LEGGINGS_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.REFINED_COPPER_HELMET_ITEM.get());

                    //Gold
                    output.accept(ModItems.GOLD_DUST_ITEM.get());
                    output.accept(ModItems.PURE_RAW_GOLD_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_INGOT_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_DUST_ITEM.get());
                    output.accept(ModBlocks.PURE_RAW_GOLD_BLOCK.get());
                    output.accept(ModBlocks.REFINED_GOLD_BLOCK.get());
                    output.accept(ModItems.REFINED_GOLD_SWORD_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_HOE_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_SHOVEL_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_AXE_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_PICKAXE_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_SHIELD_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_BOOTS_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_LEGGINGS_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.REFINED_GOLD_HELMET_ITEM.get());

                    //Steel
                    output.accept(ModItems.RAW_STEEL_MIX_ITEM.get());
                    output.accept(ModItems.STEEL_INGOT_ITEM.get());
                    output.accept(ModItems.STEEL_NUGGET_ITEM.get());
                    output.accept(ModItems.STEEL_DUST_ITEM.get());
                    output.accept(ModBlocks.STEEL_BLOCK.get());
                    output.accept(ModItems.STEEL_SWORD_ITEM.get());
                    output.accept(ModItems.STEEL_HOE_ITEM.get());
                    output.accept(ModItems.STEEL_SHOVEL_ITEM.get());
                    output.accept(ModItems.STEEL_AXE_ITEM.get());
                    output.accept(ModItems.STEEL_PICKAXE_ITEM.get());
                    output.accept(ModItems.STEEL_SHIELD_ITEM.get());
                    output.accept(ModItems.STEEL_BOOTS_ITEM.get());
                    output.accept(ModItems.STEEL_LEGGINGS_ITEM.get());
                    output.accept(ModItems.STEEL_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.STEEL_HELMET_ITEM.get());

                    //Tin
                    output.accept(ModItems.RAW_TIN_ITEM.get());
                    output.accept(ModItems.PURE_RAW_TIN_ITEM.get());
                    output.accept(ModItems.TIN_DUST_ITEM.get());
                    output.accept(ModItems.TIN_INGOT_ITEM.get());
                    output.accept(ModItems.TIN_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_INGOT_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_DUST_ITEM.get());
                    output.accept(ModBlocks.ORE_TIN_BLOCK.get());
                    output.accept(ModBlocks.RAW_TIN_BLOCK.get());
                    output.accept(ModBlocks.PURE_RAW_TIN_BLOCK.get());
                    output.accept(ModBlocks.TIN_BLOCK.get());
                    output.accept(ModBlocks.REFINED_TIN_BLOCK.get());
                    output.accept(ModItems.TIN_SWORD_ITEM.get());
                    output.accept(ModItems.TIN_HOE_ITEM.get());
                    output.accept(ModItems.TIN_SHOVEL_ITEM.get());
                    output.accept(ModItems.TIN_AXE_ITEM.get());
                    output.accept(ModItems.TIN_PICKAXE_ITEM.get());
                    output.accept(ModItems.TIN_SHIELD_ITEM.get());
                    output.accept(ModItems.TIN_BOOTS_ITEM.get());
                    output.accept(ModItems.TIN_LEGGINGS_ITEM.get());
                    output.accept(ModItems.TIN_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.TIN_HELMET_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_SWORD_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_HOE_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_SHOVEL_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_AXE_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_PICKAXE_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_SHIELD_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_BOOTS_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_LEGGINGS_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.REFINED_TIN_HELMET_ITEM.get());

                    //Zinc
                    output.accept(ModItems.RAW_ZINC_ITEM.get());
                    output.accept(ModItems.PURE_RAW_ZINC_ITEM.get());
                    output.accept(ModItems.ZINC_DUST_ITEM.get());
                    output.accept(ModItems.ZINC_INGOT_ITEM.get());
                    output.accept(ModItems.ZINC_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_INGOT_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_DUST_ITEM.get());
                    output.accept(ModBlocks.ORE_ZINC_BLOCK.get());
                    output.accept(ModBlocks.RAW_ZINC_BLOCK.get());
                    output.accept(ModBlocks.PURE_RAW_ZINC_BLOCK.get());
                    output.accept(ModBlocks.ZINC_BLOCK.get());
                    output.accept(ModBlocks.REFINED_ZINC_BLOCK.get());
                    output.accept(ModItems.ZINC_SWORD_ITEM.get());
                    output.accept(ModItems.ZINC_HOE_ITEM.get());
                    output.accept(ModItems.ZINC_SHOVEL_ITEM.get());
                    output.accept(ModItems.ZINC_AXE_ITEM.get());
                    output.accept(ModItems.ZINC_PICKAXE_ITEM.get());
                    output.accept(ModItems.ZINC_SHIELD_ITEM.get());
                    output.accept(ModItems.ZINC_BOOTS_ITEM.get());
                    output.accept(ModItems.ZINC_LEGGINGS_ITEM.get());
                    output.accept(ModItems.ZINC_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.ZINC_HELMET_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_SWORD_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_HOE_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_SHOVEL_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_AXE_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_PICKAXE_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_SHIELD_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_BOOTS_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_LEGGINGS_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.REFINED_ZINC_HELMET_ITEM.get());

                    //Nickel
                    output.accept(ModItems.RAW_NICKEL_ITEM.get());
                    output.accept(ModItems.PURE_RAW_NICKEL_ITEM.get());
                    output.accept(ModItems.NICKEL_DUST_ITEM.get());
                    output.accept(ModItems.NICKEL_INGOT_ITEM.get());
                    output.accept(ModItems.NICKEL_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_INGOT_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_DUST_ITEM.get());
                    output.accept(ModBlocks.ORE_NICKEL_BLOCK.get());
                    output.accept(ModBlocks.RAW_NICKEL_BLOCK.get());
                    output.accept(ModBlocks.PURE_RAW_NICKEL_BLOCK.get());
                    output.accept(ModBlocks.NICKEL_BLOCK.get());
                    output.accept(ModBlocks.REFINED_NICKEL_BLOCK.get());
                    output.accept(ModItems.NICKEL_SWORD_ITEM.get());
                    output.accept(ModItems.NICKEL_HOE_ITEM.get());
                    output.accept(ModItems.NICKEL_SHOVEL_ITEM.get());
                    output.accept(ModItems.NICKEL_AXE_ITEM.get());
                    output.accept(ModItems.NICKEL_PICKAXE_ITEM.get());
                    output.accept(ModItems.NICKEL_SHIELD_ITEM.get());
                    output.accept(ModItems.NICKEL_BOOTS_ITEM.get());
                    output.accept(ModItems.NICKEL_LEGGINGS_ITEM.get());
                    output.accept(ModItems.NICKEL_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.NICKEL_HELMET_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_SWORD_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_HOE_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_SHOVEL_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_AXE_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_PICKAXE_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_SHIELD_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_BOOTS_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_LEGGINGS_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.REFINED_NICKEL_HELMET_ITEM.get());

                    //Invar
                    output.accept(ModItems.RAW_INVAR_ITEM.get());
                    output.accept(ModItems.PURE_RAW_INVAR_ITEM.get());
                    output.accept(ModItems.INVAR_DUST_ITEM.get());
                    output.accept(ModItems.INVAR_INGOT_ITEM.get());
                    output.accept(ModItems.INVAR_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_INGOT_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_DUST_ITEM.get());
                    output.accept(ModBlocks.ORE_INVAR_BLOCK.get());
                    output.accept(ModBlocks.RAW_INVAR_BLOCK.get());
                    output.accept(ModBlocks.PURE_RAW_INVAR_BLOCK.get());
                    output.accept(ModBlocks.INVAR_BLOCK.get());
                    output.accept(ModBlocks.REFINED_INVAR_BLOCK.get());
                    output.accept(ModItems.INVAR_SWORD_ITEM.get());
                    output.accept(ModItems.INVAR_HOE_ITEM.get());
                    output.accept(ModItems.INVAR_SHOVEL_ITEM.get());
                    output.accept(ModItems.INVAR_AXE_ITEM.get());
                    output.accept(ModItems.INVAR_PICKAXE_ITEM.get());
                    output.accept(ModItems.INVAR_SHIELD_ITEM.get());
                    output.accept(ModItems.INVAR_BOOTS_ITEM.get());
                    output.accept(ModItems.INVAR_LEGGINGS_ITEM.get());
                    output.accept(ModItems.INVAR_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.INVAR_HELMET_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_SWORD_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_HOE_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_SHOVEL_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_AXE_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_PICKAXE_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_SHIELD_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_BOOTS_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_LEGGINGS_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.REFINED_INVAR_HELMET_ITEM.get());

                    //Lead
                    output.accept(ModItems.RAW_LEAD_ITEM.get());
                    output.accept(ModItems.PURE_RAW_LEAD_ITEM.get());
                    output.accept(ModItems.LEAD_DUST_ITEM.get());
                    output.accept(ModItems.LEAD_INGOT_ITEM.get());
                    output.accept(ModItems.LEAD_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_INGOT_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_DUST_ITEM.get());
                    output.accept(ModBlocks.ORE_LEAD_BLOCK.get());
                    output.accept(ModBlocks.RAW_LEAD_BLOCK.get());
                    output.accept(ModBlocks.PURE_RAW_LEAD_BLOCK.get());
                    output.accept(ModBlocks.LEAD_BLOCK.get());
                    output.accept(ModBlocks.REFINED_LEAD_BLOCK.get());
                    output.accept(ModItems.LEAD_SWORD_ITEM.get());
                    output.accept(ModItems.LEAD_HOE_ITEM.get());
                    output.accept(ModItems.LEAD_SHOVEL_ITEM.get());
                    output.accept(ModItems.LEAD_AXE_ITEM.get());
                    output.accept(ModItems.LEAD_PICKAXE_ITEM.get());
                    output.accept(ModItems.LEAD_BOOTS_ITEM.get());
                    output.accept(ModItems.LEAD_LEGGINGS_ITEM.get());
                    output.accept(ModItems.LEAD_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.LEAD_HELMET_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_SWORD_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_HOE_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_SHOVEL_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_AXE_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_PICKAXE_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_SHIELD_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_BOOTS_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_LEGGINGS_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.REFINED_LEAD_HELMET_ITEM.get());

                    //Silver
                    output.accept(ModItems.RAW_SILVER_ITEM.get());
                    output.accept(ModItems.PURE_RAW_SILVER_ITEM.get());
                    output.accept(ModItems.SILVER_DUST_ITEM.get());
                    output.accept(ModItems.SILVER_INGOT_ITEM.get());
                    output.accept(ModItems.SILVER_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_INGOT_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_DUST_ITEM.get());
                    output.accept(ModBlocks.ORE_SILVER_BLOCK.get());
                    output.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                    output.accept(ModBlocks.PURE_RAW_SILVER_BLOCK.get());
                    output.accept(ModBlocks.SILVER_BLOCK.get());
                    output.accept(ModBlocks.REFINED_SILVER_BLOCK.get());
                    output.accept(ModItems.SILVER_SWORD_ITEM.get());
                    output.accept(ModItems.SILVER_HOE_ITEM.get());
                    output.accept(ModItems.SILVER_SHOVEL_ITEM.get());
                    output.accept(ModItems.SILVER_AXE_ITEM.get());
                    output.accept(ModItems.SILVER_PICKAXE_ITEM.get());
                    output.accept(ModItems.SILVER_SHIELD_ITEM.get());
                    output.accept(ModItems.SILVER_BOOTS_ITEM.get());
                    output.accept(ModItems.SILVER_LEGGINGS_ITEM.get());
                    output.accept(ModItems.SILVER_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.SILVER_HELMET_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_SWORD_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_HOE_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_SHOVEL_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_AXE_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_PICKAXE_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_SHIELD_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_BOOTS_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_LEGGINGS_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.REFINED_SILVER_HELMET_ITEM.get());

                    //Electrum
                    output.accept(ModItems.RAW_ELECTRUM_ITEM.get());
                    output.accept(ModItems.PURE_RAW_ELECTRUM_ITEM.get());
                    output.accept(ModItems.ELECTRUM_DUST_ITEM.get());
                    output.accept(ModItems.ELECTRUM_INGOT_ITEM.get());
                    output.accept(ModItems.ELECTRUM_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_INGOT_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_DUST_ITEM.get());
                    output.accept(ModBlocks.ORE_ELECTRUM_BLOCK.get());
                    output.accept(ModBlocks.RAW_ELECTRUM_BLOCK.get());
                    output.accept(ModBlocks.PURE_RAW_ELECTRUM_BLOCK.get());
                    output.accept(ModBlocks.ELECTRUM_BLOCK.get());
                    output.accept(ModBlocks.REFINED_ELECTRUM_BLOCK.get());
                    output.accept(ModItems.ELECTRUM_SWORD_ITEM.get());
                    output.accept(ModItems.ELECTRUM_HOE_ITEM.get());
                    output.accept(ModItems.ELECTRUM_SHOVEL_ITEM.get());
                    output.accept(ModItems.ELECTRUM_AXE_ITEM.get());
                    output.accept(ModItems.ELECTRUM_PICKAXE_ITEM.get());
                    output.accept(ModItems.ELECTRUM_SHIELD_ITEM.get());
                    output.accept(ModItems.ELECTRUM_BOOTS_ITEM.get());
                    output.accept(ModItems.ELECTRUM_LEGGINGS_ITEM.get());
                    output.accept(ModItems.ELECTRUM_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.ELECTRUM_HELMET_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_SWORD_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_HOE_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_SHOVEL_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_AXE_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_PICKAXE_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_SHIELD_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_BOOTS_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_LEGGINGS_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.REFINED_ELECTRUM_HELMET_ITEM.get());

                    //Uranium
                    output.accept(ModItems.RAW_URANIUM_ITEM.get());
                    output.accept(ModItems.PURE_RAW_URANIUM_ITEM.get());
                    output.accept(ModItems.URANIUM_DUST_ITEM.get());
                    output.accept(ModItems.URANIUM_INGOT_ITEM.get());
                    output.accept(ModItems.URANIUM_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_URANIUM_INGOT_ITEM.get());
                    output.accept(ModItems.REFINED_URANIUM_NUGGET_ITEM.get());
                    output.accept(ModItems.REFINED_URANIUM_DUST_ITEM.get());
                    output.accept(ModBlocks.ORE_URANIUM_BLOCK.get());
                    output.accept(ModBlocks.RAW_URANIUM_BLOCK.get());
                    output.accept(ModBlocks.PURE_RAW_URANIUM_BLOCK.get());
                    output.accept(ModBlocks.URANIUM_BLOCK.get());
                    output.accept(ModBlocks.REFINED_URANIUM_BLOCK.get());

                    //Bronze
                    output.accept(ModItems.RAW_BRONZE_MIX_ITEM.get());
                    output.accept(ModItems.BRONZE_INGOT_ITEM.get());
                    output.accept(ModItems.BRONZE_NUGGET_ITEM.get());
                    output.accept(ModItems.BRONZE_DUST_ITEM.get());
                    output.accept(ModBlocks.BRONZE_BLOCK.get());
                    output.accept(ModItems.BRONZE_SWORD_ITEM.get());
                    output.accept(ModItems.BRONZE_HOE_ITEM.get());
                    output.accept(ModItems.BRONZE_SHOVEL_ITEM.get());
                    output.accept(ModItems.BRONZE_AXE_ITEM.get());
                    output.accept(ModItems.BRONZE_PICKAXE_ITEM.get());
                    output.accept(ModItems.BRONZE_SHIELD_ITEM.get());
                    output.accept(ModItems.BRONZE_BOOTS_ITEM.get());
                    output.accept(ModItems.BRONZE_LEGGINGS_ITEM.get());
                    output.accept(ModItems.BRONZE_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.BRONZE_HELMET_ITEM.get());

                    //Brass
                    output.accept(ModItems.RAW_BRASS_MIX_ITEM.get());
                    output.accept(ModItems.BRASS_INGOT_ITEM.get());
                    output.accept(ModItems.BRASS_NUGGET_ITEM.get());
                    output.accept(ModItems.BRASS_DUST_ITEM.get());
                    output.accept(ModBlocks.BRASS_BLOCK.get());
                    output.accept(ModItems.BRASS_SWORD_ITEM.get());
                    output.accept(ModItems.BRASS_HOE_ITEM.get());
                    output.accept(ModItems.BRASS_SHOVEL_ITEM.get());
                    output.accept(ModItems.BRASS_AXE_ITEM.get());
                    output.accept(ModItems.BRASS_PICKAXE_ITEM.get());
                    output.accept(ModItems.BRASS_SHIELD_ITEM.get());
                    output.accept(ModItems.BRASS_BOOTS_ITEM.get());
                    output.accept(ModItems.BRASS_LEGGINGS_ITEM.get());
                    output.accept(ModItems.BRASS_CHESTPLATE_ITEM.get());
                    output.accept(ModItems.BRASS_HELMET_ITEM.get());
                })
                .build();
    });

    public static final Supplier<CreativeModeTab> PARTSTAB = TABS.register("sens_scifi_stuff_parts_tab", () -> {
        return CreativeModeTab.builder()
                .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ModUtils.getModId(), ModUtils.getCreativeModeId(SENSSCIFISTUFFCORETAB.get())))
                .icon(() -> new ItemStack(ModItems.SPEEDER_TESLA_MK1_POWER_CELL_ITEM.get()))
                .title(Component.translatable("itemgroup.sens_scifi_stuff_parts_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    /*
                    PARTS
                    */
                    ///Speeder
                    //Power Cell - Energy storage
                    output.accept(ModItems.SPEEDER_TESLA_MK1_POWER_CELL_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK2_POWER_CELL_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK3_POWER_CELL_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK3XL_POWER_CELL_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK4_POWER_CELL_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK4XL_POWER_CELL_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_ULT_POWER_CELL_ITEM.get());

                    //Controller - Reduces energy usage among parts and devides the usage smartly
                    output.accept(ModItems.SPEEDER_TESLA_MK1_CONTROLLER_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK2_CONTROLLER_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK3_CONTROLLER_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK3XL_CONTROLLER_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK4_CONTROLLER_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK4XL_CONTROLLER_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_ULT_CONTROLLER_ITEM.get());

                    //Coolent - Reduces energy usage among parts and devides the usage smartly
                    output.accept(ModItems.SPEEDER_TESLA_MK1_COOLENT_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK2_COOLENT_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK3_COOLENT_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK3XL_COOLENT_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK4_COOLENT_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK4XL_COOLENT_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_ULT_COOLENT_ITEM.get());

                    //Internal Engine - Speed of the speeder
                    output.accept(ModItems.SPEEDER_TESLA_MK1_INTERNAL_ENGINE_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK2_INTERNAL_ENGINE_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK3_INTERNAL_ENGINE_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK3XL_INTERNAL_ENGINE_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK4_INTERNAL_ENGINE_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK4XL_INTERNAL_ENGINE_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_ULT_INTERNAL_ENGINE_ITEM.get());

                    //Frame - For the stability of the booster
                    output.accept(ModItems.SPEEDER_TESLA_MK1_FRAME_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK2_FRAME_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK3_FRAME_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK3XL_FRAME_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK4_FRAME_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_MK4XL_FRAME_ITEM.get());
                    output.accept(ModItems.SPEEDER_TESLA_ULT_FRAME_ITEM.get());

                    //Extra
//                    output.accept(ModItems.FLUID_REPULSOR_ITEM.get());
//                    output.accept(ModItems.RADIO_ITEM.get());
//                    output.accept(ModItems.SCANNER_ITEM.get());
                })
                .build();
    });

    public static final Supplier<CreativeModeTab> BASEVEHICLETAB = TABS.register("sens_scifi_stuff_base_vehicle_tab", () -> {
        return CreativeModeTab.builder()
                .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ModUtils.getModId(), ModUtils.getCreativeModeId(PARTSTAB.get())))
                .icon(() -> new ItemStack(ModItems.SPEEDER_ITEM.get()))
                .title(Component.translatable("itemgroup.sens_scifi_stuff_base_vehicle_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.SPEEDER_ITEM.get());
                })
                .build();
    });

    public static final Supplier<CreativeModeTab> MACHINETAB = TABS.register("machine_tab", () -> {
        return CreativeModeTab.builder()
                .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ModUtils.getModId(), ModUtils.getCreativeModeId(BASEVEHICLETAB.get())))
                .icon(() -> new ItemStack(ModBlocks.WORKBENCH_BLOCK.get()))
                .title(Component.translatable("itemgroup.machine_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModBlocks.WORKBENCH_BLOCK.get());
                    output.accept(ModBlocks.GRINDER_BLOCK.get());
                    output.accept(ModBlocks.ORE_WASHER_BLOCK.get());
                    output.accept(ModBlocks.FLUX_GROWER_BLOCK.get());
                    output.accept(ModBlocks.RIPPERDOC_CHAIR_BLOCK.get());
                    output.accept(ModBlocks.BIO_REACTOR_TANK_BLOCK.get());
                    output.accept(ModBlocks.INCUBATION_CHAMBER_TANK_BLOCK.get());
                    output.accept(ModBlocks.CLONING_TANK_BLOCK.get());
                    output.accept(ModBlocks.STIRLING_GENERATOR_BLOCK.get());
                    output.accept(ModBlocks.ENERGY_PIPE_BLOCK.get());
                    output.accept(ModBlocks.POWER_CELL_BLOCK.get());
                })
                .build();
    });

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
