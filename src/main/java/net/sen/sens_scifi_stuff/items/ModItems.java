package net.sen.sens_scifi_stuff.items;

import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.sens_scifi_stuff.items.armours.*;
import net.sen.sens_scifi_stuff.items.parts.*;
import net.sen.sens_scifi_stuff.items.tools.*;
import net.sen.sens_scifi_stuff.items.vehicles.*;
import net.sen.sens_scifi_stuff.utils.*;
import net.sen.sens_scifi_stuff.utils.parts.*;

import java.util.function.Supplier;

public class ModItems {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModUtils.getModId());

    public static final Supplier<Item> OMNI_WRENCH_ITEM = createItem("omni_wrench_item", ItemWrench::new);
    public static final Supplier<Item> PESTLE_ITEM = createItem("pestle_item");
    public static final Supplier<Item> MORTAR_ITEM = createItem("mortar_item");

    /*
    Tech Stuff
     */
    public static final Supplier<Item> LLAMARADA_CRYSTAL_ITEM = createItem("llamarada_crystal_item");
    public static final Supplier<Item> QUARTZ_POWDER_ITEM = createItem("quartz_powder_item");
    public static final Supplier<Item> CRYSTAL_STARTER_ITEM = createItem("crystal_starter_item");
    public static final Supplier<Item> AHOGAR_CRYSTAL_ITEM = createItem("ahogar_crystal_item");
    public static final Supplier<Item> CIELO_CRYSTAL_ITEM = createItem("cielo_crystal_item");
    public static final Supplier<Item> TIERRA_CRYSTAL_ITEM = createItem("tierra_crystal_item");
    public static final Supplier<Item> NOCHE_CRYSTAL_ITEM = createItem("noche_crystal_item");
    public static final Supplier<Item> LUZ_CRYSTAL_ITEM = createItem("luz_crystal_item");
    public static final Supplier<Item> FUERZA_CORE_ITEM = createItem("fuerza_core_item");
    public static final Supplier<Item> FUERZA_POWDER_ITEM = createItem("fuerza_powder_item");
    public static final Supplier<Item> FUERZA_CRYSTAL_ITEM = createItem("fuerza_crystal_item");

    /*
    Metals
     */
    //Iron
    public static final Supplier<Item> IRON_DUST_ITEM = createItem("iron_dust_item");
    public static final Supplier<Item> PURE_RAW_IRON_ITEM = createItem("pure_raw_iron_item");
    public static final Supplier<Item> REFINED_IRON_INGOT_ITEM = createItem("refined_iron_ingot_item");
    public static final Supplier<Item> REFINED_IRON_NUGGET_ITEM = createItem("refined_iron_nugget_item");
    public static final Supplier<Item> REFINED_IRON_DUST_ITEM = createItem("refined_iron_dust_item");
    public static final Supplier<Item> REFINED_IRON_SWORD_ITEM = createSword("refined_iron_sword_item", ModItemTeirs.REFINED_IRON);
    public static final Supplier<Item> REFINED_IRON_HOE_ITEM = createHoe("refined_iron_hoe_item", ModItemTeirs.REFINED_IRON);
    public static final Supplier<Item> REFINED_IRON_SHOVEL_ITEM = createShovel("refined_iron_shovel_item", ModItemTeirs.REFINED_IRON);
    public static final Supplier<Item> REFINED_IRON_AXE_ITEM = createAxe("refined_iron_axe_item", ModItemTeirs.REFINED_IRON);
    public static final Supplier<Item> REFINED_IRON_PICKAXE_ITEM = createPickaxe("refined_iron_pickaxe_item", ModItemTeirs.REFINED_IRON);
    public static final Supplier<Item> REFINED_IRON_SHIELD_ITEM = createShield("refined_iron_shield_item", 672);
    public static final Supplier<Item> REFINED_IRON_BOOTS_ITEM = createBoots("refined_iron_boots_item", ModArmourMaterials.REFINED_IRON);
    public static final Supplier<Item> REFINED_IRON_LEGGINGS_ITEM = createLeggings("refined_iron_leggings_item", ModArmourMaterials.REFINED_IRON);
    public static final Supplier<Item> REFINED_IRON_CHESTPLATE_ITEM = createChestplate("refined_iron_chestplate_item", ModArmourMaterials.REFINED_IRON);
    public static final Supplier<Item> REFINED_IRON_HELMET_ITEM = createHelmet("refined_iron_helmet_item", ModArmourMaterials.REFINED_IRON);

    //Copper
    public static final Supplier<Item> COPPER_DUST_ITEM = createItem("copper_dust_item");
    public static final Supplier<Item> PURE_RAW_COPPER_ITEM = createItem("pure_raw_copper_item");
    public static final Supplier<Item> REFINED_COPPER_INGOT_ITEM = createItem("refined_copper_ingot_item");
    public static final Supplier<Item> REFINED_COPPER_NUGGET_ITEM = createItem("refined_copper_nugget_item");
    public static final Supplier<Item> REFINED_COPPER_DUST_ITEM = createItem("refined_copper_dust_item");
    public static final Supplier<Item> REFINED_COPPER_SWORD_ITEM = createSword("refined_copper_sword_item", ModItemTeirs.REFINED_COPPER);
    public static final Supplier<Item> REFINED_COPPER_HOE_ITEM = createHoe("refined_copper_hoe_item", ModItemTeirs.REFINED_COPPER);
    public static final Supplier<Item> REFINED_COPPER_SHOVEL_ITEM = createShovel("refined_copper_shovel_item", ModItemTeirs.REFINED_COPPER);
    public static final Supplier<Item> REFINED_COPPER_AXE_ITEM = createAxe("refined_copper_axe_item", ModItemTeirs.REFINED_COPPER);
    public static final Supplier<Item> REFINED_COPPER_PICKAXE_ITEM = createPickaxe("refined_copper_pickaxe_item", ModItemTeirs.REFINED_COPPER);
    public static final Supplier<Item> REFINED_COPPER_SHIELD_ITEM = createShield("refined_copper_shield_item", 672);
    public static final Supplier<Item> REFINED_COPPER_BOOTS_ITEM = createBoots("refined_copper_boots_item", ModArmourMaterials.REFINED_COPPER);
    public static final Supplier<Item> REFINED_COPPER_LEGGINGS_ITEM = createLeggings("refined_copper_leggings_item", ModArmourMaterials.REFINED_COPPER);
    public static final Supplier<Item> REFINED_COPPER_CHESTPLATE_ITEM = createChestplate("refined_copper_chestplate_item", ModArmourMaterials.REFINED_COPPER);
    public static final Supplier<Item> REFINED_COPPER_HELMET_ITEM = createHelmet("refined_copper_helmet_item", ModArmourMaterials.REFINED_COPPER);

    //Gold
    public static final Supplier<Item> GOLD_DUST_ITEM = createItem("gold_dust_item");
    public static final Supplier<Item> PURE_RAW_GOLD_ITEM = createItem("pure_raw_gold_item");
    public static final Supplier<Item> REFINED_GOLD_INGOT_ITEM = createItem("refined_gold_ingot_item");
    public static final Supplier<Item> REFINED_GOLD_NUGGET_ITEM = createItem("refined_gold_nugget_item");
    public static final Supplier<Item> REFINED_GOLD_DUST_ITEM = createItem("refined_gold_dust_item");
    public static final Supplier<Item> REFINED_GOLD_SWORD_ITEM = createSword("refined_gold_sword_item", ModItemTeirs.REFINED_GOLD);
    public static final Supplier<Item> REFINED_GOLD_HOE_ITEM = createHoe("refined_gold_hoe_item", ModItemTeirs.REFINED_GOLD);
    public static final Supplier<Item> REFINED_GOLD_SHOVEL_ITEM = createShovel("refined_gold_shovel_item", ModItemTeirs.REFINED_GOLD);
    public static final Supplier<Item> REFINED_GOLD_AXE_ITEM = createAxe("refined_gold_axe_item", ModItemTeirs.REFINED_GOLD);
    public static final Supplier<Item> REFINED_GOLD_PICKAXE_ITEM = createPickaxe("refined_gold_pickaxe_item", ModItemTeirs.REFINED_GOLD);
    public static final Supplier<Item> REFINED_GOLD_SHIELD_ITEM = createShield("refined_gold_shield_item", 672);
    public static final Supplier<Item> REFINED_GOLD_BOOTS_ITEM = createBoots("refined_gold_boots_item", ModArmourMaterials.REFINED_GOLD);
    public static final Supplier<Item> REFINED_GOLD_LEGGINGS_ITEM = createLeggings("refined_gold_leggings_item", ModArmourMaterials.REFINED_GOLD);
    public static final Supplier<Item> REFINED_GOLD_CHESTPLATE_ITEM = createChestplate("refined_gold_chestplate_item", ModArmourMaterials.REFINED_GOLD);
    public static final Supplier<Item> REFINED_GOLD_HELMET_ITEM = createHelmet("refined_gold_helmet_item", ModArmourMaterials.REFINED_GOLD);

    //Steel
    public static final Supplier<Item> RAW_STEEL_MIX_ITEM = createItem("raw_steel_mix_item");
    public static final Supplier<Item> STEEL_INGOT_ITEM = createItem("steel_ingot_item");
    public static final Supplier<Item> STEEL_NUGGET_ITEM = createItem("steel_nugget_item");
    public static final Supplier<Item> STEEL_DUST_ITEM = createItem("steel_dust_item");
    public static final Supplier<Item> STEEL_SWORD_ITEM = createSword("steel_sword_item", ModItemTeirs.STEEL);
    public static final Supplier<Item> STEEL_HOE_ITEM = createHoe("steel_hoe_item", ModItemTeirs.STEEL);
    public static final Supplier<Item> STEEL_SHOVEL_ITEM = createShovel("steel_shovel_item", ModItemTeirs.STEEL);
    public static final Supplier<Item> STEEL_AXE_ITEM = createAxe("steel_axe_item", ModItemTeirs.STEEL);
    public static final Supplier<Item> STEEL_PICKAXE_ITEM = createPickaxe("steel_pickaxe_item", ModItemTeirs.STEEL);
    public static final Supplier<Item> STEEL_SHIELD_ITEM = createShield("steel_shield_item", 672);
    public static final Supplier<Item> STEEL_BOOTS_ITEM = createBoots("steel_boots_item", ModArmourMaterials.STEEL);
    public static final Supplier<Item> STEEL_LEGGINGS_ITEM = createLeggings("steel_leggings_item", ModArmourMaterials.STEEL);
    public static final Supplier<Item> STEEL_CHESTPLATE_ITEM = createChestplate("steel_chestplate_item", ModArmourMaterials.STEEL);
    public static final Supplier<Item> STEEL_HELMET_ITEM = createHelmet("steel_helmet_item", ModArmourMaterials.STEEL);

    //Tin
    public static final Supplier<Item> RAW_TIN_ITEM = createItem("raw_tin_item");
    public static final Supplier<Item> PURE_RAW_TIN_ITEM = createItem("pure_raw_tin_item");
    public static final Supplier<Item> TIN_DUST_ITEM = createItem("tin_dust_item");
    public static final Supplier<Item> TIN_INGOT_ITEM = createItem("tin_ingot_item");
    public static final Supplier<Item> TIN_NUGGET_ITEM = createItem("tin_nugget_item");
    public static final Supplier<Item> REFINED_TIN_INGOT_ITEM = createItem("refined_tin_ingot_item");
    public static final Supplier<Item> REFINED_TIN_NUGGET_ITEM = createItem("refined_tin_nugget_item");
    public static final Supplier<Item> REFINED_TIN_DUST_ITEM = createItem("refined_tin_dust_item");
    public static final Supplier<Item> TIN_SWORD_ITEM = createSword("tin_sword_item", ModItemTeirs.TIN);
    public static final Supplier<Item> TIN_HOE_ITEM = createHoe("tin_hoe_item", ModItemTeirs.TIN);
    public static final Supplier<Item> TIN_SHOVEL_ITEM = createShovel("tin_shovel_item", ModItemTeirs.TIN);
    public static final Supplier<Item> TIN_AXE_ITEM = createAxe("tin_axe_item", ModItemTeirs.TIN);
    public static final Supplier<Item> TIN_PICKAXE_ITEM = createPickaxe("tin_pickaxe_item", ModItemTeirs.TIN);
    public static final Supplier<Item> TIN_SHIELD_ITEM = createShield("tin_shield_item", 672);
    public static final Supplier<Item> TIN_BOOTS_ITEM = createBoots("tin_boots_item", ModArmourMaterials.TIN);
    public static final Supplier<Item> TIN_LEGGINGS_ITEM = createLeggings("tin_leggings_item", ModArmourMaterials.TIN);
    public static final Supplier<Item> TIN_CHESTPLATE_ITEM = createChestplate("tin_chestplate_item", ModArmourMaterials.TIN);
    public static final Supplier<Item> TIN_HELMET_ITEM = createHelmet("tin_helmet_item", ModArmourMaterials.TIN);
    public static final Supplier<Item> REFINED_TIN_SWORD_ITEM = createSword("refined_tin_sword_item", ModItemTeirs.REFINED_TIN);
    public static final Supplier<Item> REFINED_TIN_HOE_ITEM = createHoe("refined_tin_hoe_item", ModItemTeirs.REFINED_TIN);
    public static final Supplier<Item> REFINED_TIN_SHOVEL_ITEM = createShovel("refined_tin_shovel_item", ModItemTeirs.REFINED_TIN);
    public static final Supplier<Item> REFINED_TIN_AXE_ITEM = createAxe("refined_tin_axe_item", ModItemTeirs.REFINED_TIN);
    public static final Supplier<Item> REFINED_TIN_PICKAXE_ITEM = createPickaxe("refined_tin_pickaxe_item", ModItemTeirs.REFINED_TIN);
    public static final Supplier<Item> REFINED_TIN_SHIELD_ITEM = createShield("refined_tin_shield_item", 672);
    public static final Supplier<Item> REFINED_TIN_BOOTS_ITEM = createBoots("refined_tin_boots_item", ModArmourMaterials.REFINED_TIN);
    public static final Supplier<Item> REFINED_TIN_LEGGINGS_ITEM = createLeggings("refined_tin_leggings_item", ModArmourMaterials.REFINED_TIN);
    public static final Supplier<Item> REFINED_TIN_CHESTPLATE_ITEM = createChestplate("refined_tin_chestplate_item", ModArmourMaterials.REFINED_TIN);
    public static final Supplier<Item> REFINED_TIN_HELMET_ITEM = createHelmet("refined_tin_helmet_item", ModArmourMaterials.REFINED_TIN);

    //Zinc
    public static final Supplier<Item> RAW_ZINC_ITEM = createItem("raw_zinc_item");
    public static final Supplier<Item> PURE_RAW_ZINC_ITEM = createItem("pure_raw_zinc_item");
    public static final Supplier<Item> ZINC_DUST_ITEM = createItem("zinc_dust_item");
    public static final Supplier<Item> ZINC_INGOT_ITEM = createItem("zinc_ingot_item");
    public static final Supplier<Item> ZINC_NUGGET_ITEM = createItem("zinc_nugget_item");
    public static final Supplier<Item> REFINED_ZINC_INGOT_ITEM = createItem("refined_zinc_ingot_item");
    public static final Supplier<Item> REFINED_ZINC_NUGGET_ITEM = createItem("refined_zinc_nugget_item");
    public static final Supplier<Item> REFINED_ZINC_DUST_ITEM = createItem("refined_zinc_dust_item");
    public static final Supplier<Item> ZINC_SWORD_ITEM = createSword("zinc_sword_item", ModItemTeirs.ZINC);
    public static final Supplier<Item> ZINC_HOE_ITEM = createHoe("zinc_hoe_item", ModItemTeirs.ZINC);
    public static final Supplier<Item> ZINC_SHOVEL_ITEM = createShovel("zinc_shovel_item", ModItemTeirs.ZINC);
    public static final Supplier<Item> ZINC_AXE_ITEM = createAxe("zinc_axe_item", ModItemTeirs.ZINC);
    public static final Supplier<Item> ZINC_PICKAXE_ITEM = createPickaxe("zinc_pickaxe_item", ModItemTeirs.ZINC);
    public static final Supplier<Item> ZINC_SHIELD_ITEM = createShield("zinc_shield_item", 672);
    public static final Supplier<Item> ZINC_BOOTS_ITEM = createBoots("zinc_boots_item", ModArmourMaterials.ZINC);
    public static final Supplier<Item> ZINC_LEGGINGS_ITEM = createLeggings("zinc_leggings_item", ModArmourMaterials.ZINC);
    public static final Supplier<Item> ZINC_CHESTPLATE_ITEM = createChestplate("zinc_chestplate_item", ModArmourMaterials.ZINC);
    public static final Supplier<Item> ZINC_HELMET_ITEM = createHelmet("zinc_helmet_item", ModArmourMaterials.ZINC);
    public static final Supplier<Item> REFINED_ZINC_SWORD_ITEM = createSword("refined_zinc_sword_item", ModItemTeirs.REFINED_ZINC);
    public static final Supplier<Item> REFINED_ZINC_HOE_ITEM = createHoe("refined_zinc_hoe_item", ModItemTeirs.REFINED_ZINC);
    public static final Supplier<Item> REFINED_ZINC_SHOVEL_ITEM = createShovel("refined_zinc_shovel_item", ModItemTeirs.REFINED_ZINC);
    public static final Supplier<Item> REFINED_ZINC_AXE_ITEM = createAxe("refined_zinc_axe_item", ModItemTeirs.REFINED_ZINC);
    public static final Supplier<Item> REFINED_ZINC_PICKAXE_ITEM = createPickaxe("refined_zinc_pickaxe_item", ModItemTeirs.REFINED_ZINC);
    public static final Supplier<Item> REFINED_ZINC_SHIELD_ITEM = createShield("refined_zinc_shield_item", 672);
    public static final Supplier<Item> REFINED_ZINC_BOOTS_ITEM = createBoots("refined_zinc_boots_item", ModArmourMaterials.REFINED_ZINC);
    public static final Supplier<Item> REFINED_ZINC_LEGGINGS_ITEM = createLeggings("refined_zinc_leggings_item", ModArmourMaterials.REFINED_ZINC);
    public static final Supplier<Item> REFINED_ZINC_CHESTPLATE_ITEM = createChestplate("refined_zinc_chestplate_item", ModArmourMaterials.REFINED_ZINC);
    public static final Supplier<Item> REFINED_ZINC_HELMET_ITEM = createHelmet("refined_zinc_helmet_item", ModArmourMaterials.REFINED_ZINC);

    //Nickel
    public static final Supplier<Item> RAW_NICKEL_ITEM = createItem("raw_nickel_item");
    public static final Supplier<Item> PURE_RAW_NICKEL_ITEM = createItem("pure_raw_nickel_item");
    public static final Supplier<Item> NICKEL_DUST_ITEM = createItem("nickel_dust_item");
    public static final Supplier<Item> NICKEL_INGOT_ITEM = createItem("nickel_ingot_item");
    public static final Supplier<Item> NICKEL_NUGGET_ITEM = createItem("nickel_nugget_item");
    public static final Supplier<Item> REFINED_NICKEL_INGOT_ITEM = createItem("refined_nickel_ingot_item");
    public static final Supplier<Item> REFINED_NICKEL_NUGGET_ITEM = createItem("refined_nickel_nugget_item");
    public static final Supplier<Item> REFINED_NICKEL_DUST_ITEM = createItem("refined_nickel_dust_item");
    public static final Supplier<Item> NICKEL_SWORD_ITEM = createSword("nickel_sword_item", ModItemTeirs.NICKEL);
    public static final Supplier<Item> NICKEL_HOE_ITEM = createHoe("nickel_hoe_item", ModItemTeirs.NICKEL);
    public static final Supplier<Item> NICKEL_SHOVEL_ITEM = createShovel("nickel_shovel_item", ModItemTeirs.NICKEL);
    public static final Supplier<Item> NICKEL_AXE_ITEM = createAxe("nickel_axe_item", ModItemTeirs.NICKEL);
    public static final Supplier<Item> NICKEL_PICKAXE_ITEM = createPickaxe("nickel_pickaxe_item", ModItemTeirs.NICKEL);
    public static final Supplier<Item> NICKEL_SHIELD_ITEM = createShield("nickel_shield_item", 672);
    public static final Supplier<Item> NICKEL_BOOTS_ITEM = createBoots("nickel_boots_item", ModArmourMaterials.NICKEL);
    public static final Supplier<Item> NICKEL_LEGGINGS_ITEM = createLeggings("nickel_leggings_item", ModArmourMaterials.NICKEL);
    public static final Supplier<Item> NICKEL_CHESTPLATE_ITEM = createChestplate("nickel_chestplate_item", ModArmourMaterials.NICKEL);
    public static final Supplier<Item> NICKEL_HELMET_ITEM = createHelmet("nickel_helmet_item", ModArmourMaterials.NICKEL);
    public static final Supplier<Item> REFINED_NICKEL_SWORD_ITEM = createSword("refined_nickel_sword_item", ModItemTeirs.REFINED_NICKEL);
    public static final Supplier<Item> REFINED_NICKEL_HOE_ITEM = createHoe("refined_nickel_hoe_item", ModItemTeirs.REFINED_NICKEL);
    public static final Supplier<Item> REFINED_NICKEL_SHOVEL_ITEM = createShovel("refined_nickel_shovel_item", ModItemTeirs.REFINED_NICKEL);
    public static final Supplier<Item> REFINED_NICKEL_AXE_ITEM = createAxe("refined_nickel_axe_item", ModItemTeirs.REFINED_NICKEL);
    public static final Supplier<Item> REFINED_NICKEL_PICKAXE_ITEM = createPickaxe("refined_nickel_pickaxe_item", ModItemTeirs.REFINED_NICKEL);
    public static final Supplier<Item> REFINED_NICKEL_SHIELD_ITEM = createShield("refined_nickel_shield_item", 672);
    public static final Supplier<Item> REFINED_NICKEL_BOOTS_ITEM = createBoots("refined_nickel_boots_item", ModArmourMaterials.REFINED_NICKEL);
    public static final Supplier<Item> REFINED_NICKEL_LEGGINGS_ITEM = createLeggings("refined_nickel_leggings_item", ModArmourMaterials.REFINED_NICKEL);
    public static final Supplier<Item> REFINED_NICKEL_CHESTPLATE_ITEM = createChestplate("refined_nickel_chestplate_item", ModArmourMaterials.REFINED_NICKEL);
    public static final Supplier<Item> REFINED_NICKEL_HELMET_ITEM = createHelmet("refined_nickel_helmet_item", ModArmourMaterials.REFINED_NICKEL);

    //Invar
    public static final Supplier<Item> RAW_INVAR_ITEM = createItem("raw_invar_item");
    public static final Supplier<Item> PURE_RAW_INVAR_ITEM = createItem("pure_raw_invar_item");
    public static final Supplier<Item> INVAR_DUST_ITEM = createItem("invar_dust_item");
    public static final Supplier<Item> INVAR_INGOT_ITEM = createItem("invar_ingot_item");
    public static final Supplier<Item> INVAR_NUGGET_ITEM = createItem("invar_nugget_item");
    public static final Supplier<Item> REFINED_INVAR_INGOT_ITEM = createItem("refined_invar_ingot_item");
    public static final Supplier<Item> REFINED_INVAR_NUGGET_ITEM = createItem("refined_invar_nugget_item");
    public static final Supplier<Item> REFINED_INVAR_DUST_ITEM = createItem("refined_invar_dust_item");
    public static final Supplier<Item> INVAR_SWORD_ITEM = createSword("invar_sword_item", ModItemTeirs.INVAR);
    public static final Supplier<Item> INVAR_HOE_ITEM = createHoe("invar_hoe_item", ModItemTeirs.INVAR);
    public static final Supplier<Item> INVAR_SHOVEL_ITEM = createShovel("invar_shovel_item", ModItemTeirs.INVAR);
    public static final Supplier<Item> INVAR_AXE_ITEM = createAxe("invar_axe_item", ModItemTeirs.INVAR);
    public static final Supplier<Item> INVAR_PICKAXE_ITEM = createPickaxe("invar_pickaxe_item", ModItemTeirs.INVAR);
    public static final Supplier<Item> INVAR_SHIELD_ITEM = createShield("invar_shield_item", 672);
    public static final Supplier<Item> INVAR_BOOTS_ITEM = createBoots("invar_boots_item", ModArmourMaterials.INVAR);
    public static final Supplier<Item> INVAR_LEGGINGS_ITEM = createLeggings("invar_leggings_item", ModArmourMaterials.INVAR);
    public static final Supplier<Item> INVAR_CHESTPLATE_ITEM = createChestplate("invar_chestplate_item", ModArmourMaterials.INVAR);
    public static final Supplier<Item> INVAR_HELMET_ITEM = createHelmet("invar_helmet_item", ModArmourMaterials.INVAR);
    public static final Supplier<Item> REFINED_INVAR_SWORD_ITEM = createSword("refined_invar_sword_item", ModItemTeirs.REFINED_INVAR);
    public static final Supplier<Item> REFINED_INVAR_HOE_ITEM = createHoe("refined_invar_hoe_item", ModItemTeirs.REFINED_INVAR);
    public static final Supplier<Item> REFINED_INVAR_SHOVEL_ITEM = createShovel("refined_invar_shovel_item", ModItemTeirs.REFINED_INVAR);
    public static final Supplier<Item> REFINED_INVAR_AXE_ITEM = createAxe("refined_invar_axe_item", ModItemTeirs.REFINED_INVAR);
    public static final Supplier<Item> REFINED_INVAR_PICKAXE_ITEM = createPickaxe("refined_invar_pickaxe_item", ModItemTeirs.REFINED_INVAR);
    public static final Supplier<Item> REFINED_INVAR_SHIELD_ITEM = createShield("refined_invar_shield_item", 672);
    public static final Supplier<Item> REFINED_INVAR_BOOTS_ITEM = createBoots("refined_invar_boots_item", ModArmourMaterials.REFINED_INVAR);
    public static final Supplier<Item> REFINED_INVAR_LEGGINGS_ITEM = createLeggings("refined_invar_leggings_item", ModArmourMaterials.REFINED_INVAR);
    public static final Supplier<Item> REFINED_INVAR_CHESTPLATE_ITEM = createChestplate("refined_invar_chestplate_item", ModArmourMaterials.REFINED_INVAR);
    public static final Supplier<Item> REFINED_INVAR_HELMET_ITEM = createHelmet("refined_invar_helmet_item", ModArmourMaterials.REFINED_INVAR);

    //Lead
    public static final Supplier<Item> RAW_LEAD_ITEM = createItem("raw_lead_item");
    public static final Supplier<Item> PURE_RAW_LEAD_ITEM = createItem("pure_raw_lead_item");
    public static final Supplier<Item> LEAD_DUST_ITEM = createItem("lead_dust_item");
    public static final Supplier<Item> LEAD_INGOT_ITEM = createItem("lead_ingot_item");
    public static final Supplier<Item> LEAD_NUGGET_ITEM = createItem("lead_nugget_item");
    public static final Supplier<Item> REFINED_LEAD_INGOT_ITEM = createItem("refined_lead_ingot_item");
    public static final Supplier<Item> REFINED_LEAD_NUGGET_ITEM = createItem("refined_lead_nugget_item");
    public static final Supplier<Item> REFINED_LEAD_DUST_ITEM = createItem("refined_lead_dust_item");
    public static final Supplier<Item> LEAD_SWORD_ITEM = createSword("lead_sword_item", ModItemTeirs.LEAD);
    public static final Supplier<Item> LEAD_HOE_ITEM = createHoe("lead_hoe_item", ModItemTeirs.LEAD);
    public static final Supplier<Item> LEAD_SHOVEL_ITEM = createShovel("lead_shovel_item", ModItemTeirs.LEAD);
    public static final Supplier<Item> LEAD_AXE_ITEM = createAxe("lead_axe_item", ModItemTeirs.LEAD);
    public static final Supplier<Item> LEAD_PICKAXE_ITEM = createPickaxe("lead_pickaxe_item", ModItemTeirs.LEAD);
    public static final Supplier<Item> LEAD_SHIELD_ITEM = createShield("lead_shield_item", 672);
    public static final Supplier<Item> LEAD_BOOTS_ITEM = createBoots("lead_boots_item", ModArmourMaterials.LEAD);
    public static final Supplier<Item> LEAD_LEGGINGS_ITEM = createLeggings("lead_leggings_item", ModArmourMaterials.LEAD);
    public static final Supplier<Item> LEAD_CHESTPLATE_ITEM = createChestplate("lead_chestplate_item", ModArmourMaterials.LEAD);
    public static final Supplier<Item> LEAD_HELMET_ITEM = createHelmet("lead_helmet_item", ModArmourMaterials.LEAD);
    public static final Supplier<Item> REFINED_LEAD_SWORD_ITEM = createSword("refined_lead_sword_item", ModItemTeirs.REFINED_LEAD);
    public static final Supplier<Item> REFINED_LEAD_HOE_ITEM = createHoe("refined_lead_hoe_item", ModItemTeirs.REFINED_LEAD);
    public static final Supplier<Item> REFINED_LEAD_SHOVEL_ITEM = createShovel("refined_lead_shovel_item", ModItemTeirs.REFINED_LEAD);
    public static final Supplier<Item> REFINED_LEAD_AXE_ITEM = createAxe("refined_lead_axe_item", ModItemTeirs.REFINED_LEAD);
    public static final Supplier<Item> REFINED_LEAD_PICKAXE_ITEM = createPickaxe("refined_lead_pickaxe_item", ModItemTeirs.REFINED_LEAD);
    public static final Supplier<Item> REFINED_LEAD_SHIELD_ITEM = createShield("refined_lead_shield_item", 672);
    public static final Supplier<Item> REFINED_LEAD_BOOTS_ITEM = createBoots("refined_lead_boots_item", ModArmourMaterials.REFINED_LEAD);
    public static final Supplier<Item> REFINED_LEAD_LEGGINGS_ITEM = createLeggings("refined_lead_leggings_item", ModArmourMaterials.REFINED_LEAD);
    public static final Supplier<Item> REFINED_LEAD_CHESTPLATE_ITEM = createChestplate("refined_lead_chestplate_item", ModArmourMaterials.REFINED_LEAD);
    public static final Supplier<Item> REFINED_LEAD_HELMET_ITEM = createHelmet("refined_lead_helmet_item", ModArmourMaterials.REFINED_LEAD);

    //Silver
    public static final Supplier<Item> RAW_SILVER_ITEM = createItem("raw_silver_item");
    public static final Supplier<Item> PURE_RAW_SILVER_ITEM = createItem("pure_raw_silver_item");
    public static final Supplier<Item> SILVER_DUST_ITEM = createItem("silver_dust_item");
    public static final Supplier<Item> SILVER_INGOT_ITEM = createItem("silver_ingot_item");
    public static final Supplier<Item> SILVER_NUGGET_ITEM = createItem("silver_nugget_item");
    public static final Supplier<Item> REFINED_SILVER_INGOT_ITEM = createItem("refined_silver_ingot_item");
    public static final Supplier<Item> REFINED_SILVER_NUGGET_ITEM = createItem("refined_silver_nugget_item");
    public static final Supplier<Item> REFINED_SILVER_DUST_ITEM = createItem("refined_silver_dust_item");
    public static final Supplier<Item> SILVER_SWORD_ITEM = createSword("silver_sword_item", ModItemTeirs.SILVER);
    public static final Supplier<Item> SILVER_HOE_ITEM = createHoe("silver_hoe_item", ModItemTeirs.SILVER);
    public static final Supplier<Item> SILVER_SHOVEL_ITEM = createShovel("silver_shovel_item", ModItemTeirs.SILVER);
    public static final Supplier<Item> SILVER_AXE_ITEM = createAxe("silver_axe_item", ModItemTeirs.SILVER);
    public static final Supplier<Item> SILVER_PICKAXE_ITEM = createPickaxe("silver_pickaxe_item", ModItemTeirs.SILVER);
    public static final Supplier<Item> SILVER_SHIELD_ITEM = createShield("silver_shield_item", 672);
    public static final Supplier<Item> SILVER_BOOTS_ITEM = createBoots("silver_boots_item", ModArmourMaterials.SILVER);
    public static final Supplier<Item> SILVER_LEGGINGS_ITEM = createLeggings("silver_leggings_item", ModArmourMaterials.SILVER);
    public static final Supplier<Item> SILVER_CHESTPLATE_ITEM = createChestplate("silver_chestplate_item", ModArmourMaterials.SILVER);
    public static final Supplier<Item> SILVER_HELMET_ITEM = createHelmet("silver_helmet_item", ModArmourMaterials.SILVER);
    public static final Supplier<Item> REFINED_SILVER_SWORD_ITEM = createSword("refined_silver_sword_item", ModItemTeirs.REFINED_SILVER);
    public static final Supplier<Item> REFINED_SILVER_HOE_ITEM = createHoe("refined_silver_hoe_item", ModItemTeirs.REFINED_SILVER);
    public static final Supplier<Item> REFINED_SILVER_SHOVEL_ITEM = createShovel("refined_silver_shovel_item", ModItemTeirs.REFINED_SILVER);
    public static final Supplier<Item> REFINED_SILVER_AXE_ITEM = createAxe("refined_silver_axe_item", ModItemTeirs.REFINED_SILVER);
    public static final Supplier<Item> REFINED_SILVER_PICKAXE_ITEM = createPickaxe("refined_silver_pickaxe_item", ModItemTeirs.REFINED_SILVER);
    public static final Supplier<Item> REFINED_SILVER_SHIELD_ITEM = createShield("refined_silver_shield_item", 672);
    public static final Supplier<Item> REFINED_SILVER_BOOTS_ITEM = createBoots("refined_silver_boots_item", ModArmourMaterials.REFINED_SILVER);
    public static final Supplier<Item> REFINED_SILVER_LEGGINGS_ITEM = createLeggings("refined_silver_leggings_item", ModArmourMaterials.REFINED_SILVER);
    public static final Supplier<Item> REFINED_SILVER_CHESTPLATE_ITEM = createChestplate("refined_silver_chestplate_item", ModArmourMaterials.REFINED_SILVER);
    public static final Supplier<Item> REFINED_SILVER_HELMET_ITEM = createHelmet("refined_silver_helmet_item", ModArmourMaterials.REFINED_SILVER);

    //Electrum
    public static final Supplier<Item> RAW_ELECTRUM_ITEM = createItem("raw_electrum_item");
    public static final Supplier<Item> PURE_RAW_ELECTRUM_ITEM = createItem("pure_raw_electrum_item");
    public static final Supplier<Item> ELECTRUM_DUST_ITEM = createItem("electrum_dust_item");
    public static final Supplier<Item> ELECTRUM_INGOT_ITEM = createItem("electrum_ingot_item");
    public static final Supplier<Item> ELECTRUM_NUGGET_ITEM = createItem("electrum_nugget_item");
    public static final Supplier<Item> REFINED_ELECTRUM_INGOT_ITEM = createItem("refined_electrum_ingot_item");
    public static final Supplier<Item> REFINED_ELECTRUM_NUGGET_ITEM = createItem("refined_electrum_nugget_item");
    public static final Supplier<Item> REFINED_ELECTRUM_DUST_ITEM = createItem("refined_electrum_dust_item");
    public static final Supplier<Item> ELECTRUM_SWORD_ITEM = createSword("electrum_sword_item", ModItemTeirs.ELECTRUM);
    public static final Supplier<Item> ELECTRUM_HOE_ITEM = createHoe("electrum_hoe_item", ModItemTeirs.ELECTRUM);
    public static final Supplier<Item> ELECTRUM_SHOVEL_ITEM = createShovel("electrum_shovel_item", ModItemTeirs.ELECTRUM);
    public static final Supplier<Item> ELECTRUM_AXE_ITEM = createAxe("electrum_axe_item", ModItemTeirs.ELECTRUM);
    public static final Supplier<Item> ELECTRUM_PICKAXE_ITEM = createPickaxe("electrum_pickaxe_item", ModItemTeirs.ELECTRUM);
    public static final Supplier<Item> ELECTRUM_SHIELD_ITEM = createShield("electrum_shield_item", 672);
    public static final Supplier<Item> ELECTRUM_BOOTS_ITEM = createBoots("electrum_boots_item", ModArmourMaterials.ELECTRUM);
    public static final Supplier<Item> ELECTRUM_LEGGINGS_ITEM = createLeggings("electrum_leggings_item", ModArmourMaterials.ELECTRUM);
    public static final Supplier<Item> ELECTRUM_CHESTPLATE_ITEM = createChestplate("electrum_chestplate_item", ModArmourMaterials.ELECTRUM);
    public static final Supplier<Item> ELECTRUM_HELMET_ITEM = createHelmet("electrum_helmet_item", ModArmourMaterials.ELECTRUM);
    public static final Supplier<Item> REFINED_ELECTRUM_SWORD_ITEM = createSword("refined_electrum_sword_item", ModItemTeirs.REFINED_ELECTRUM);
    public static final Supplier<Item> REFINED_ELECTRUM_HOE_ITEM = createHoe("refined_electrum_hoe_item", ModItemTeirs.REFINED_ELECTRUM);
    public static final Supplier<Item> REFINED_ELECTRUM_SHOVEL_ITEM = createShovel("refined_electrum_shovel_item", ModItemTeirs.REFINED_ELECTRUM);
    public static final Supplier<Item> REFINED_ELECTRUM_AXE_ITEM = createAxe("refined_electrum_axe_item", ModItemTeirs.REFINED_ELECTRUM);
    public static final Supplier<Item> REFINED_ELECTRUM_PICKAXE_ITEM = createPickaxe("refined_electrum_pickaxe_item", ModItemTeirs.REFINED_ELECTRUM);
    public static final Supplier<Item> REFINED_ELECTRUM_SHIELD_ITEM = createShield("refined_electrum_shield_item", 672);
    public static final Supplier<Item> REFINED_ELECTRUM_BOOTS_ITEM = createBoots("refined_electrum_boots_item", ModArmourMaterials.REFINED_ELECTRUM);
    public static final Supplier<Item> REFINED_ELECTRUM_LEGGINGS_ITEM = createLeggings("refined_electrum_leggings_item", ModArmourMaterials.REFINED_ELECTRUM);
    public static final Supplier<Item> REFINED_ELECTRUM_CHESTPLATE_ITEM = createChestplate("refined_electrum_chestplate_item", ModArmourMaterials.REFINED_ELECTRUM);
    public static final Supplier<Item> REFINED_ELECTRUM_HELMET_ITEM = createHelmet("refined_electrum_helmet_item", ModArmourMaterials.REFINED_ELECTRUM);

    //Uranium
    public static final Supplier<Item> RAW_URANIUM_ITEM = createItem("raw_uranium_item");
    public static final Supplier<Item> PURE_RAW_URANIUM_ITEM = createItem("pure_raw_uranium_item");
    public static final Supplier<Item> URANIUM_DUST_ITEM = createItem("uranium_dust_item");
    public static final Supplier<Item> URANIUM_INGOT_ITEM = createItem("uranium_ingot_item");
    public static final Supplier<Item> URANIUM_NUGGET_ITEM = createItem("uranium_nugget_item");
    public static final Supplier<Item> REFINED_URANIUM_INGOT_ITEM = createItem("refined_uranium_ingot_item");
    public static final Supplier<Item> REFINED_URANIUM_NUGGET_ITEM = createItem("refined_uranium_nugget_item");
    public static final Supplier<Item> REFINED_URANIUM_DUST_ITEM = createItem("refined_uranium_dust_item");

    //Bronze
    public static final Supplier<Item> RAW_BRONZE_MIX_ITEM = createItem("raw_bronze_mix_item");
    public static final Supplier<Item> BRONZE_INGOT_ITEM = createItem("bronze_ingot_item");
    public static final Supplier<Item> BRONZE_NUGGET_ITEM = createItem("bronze_nugget_item");
    public static final Supplier<Item> BRONZE_DUST_ITEM = createItem("bronze_dust_item");
    public static final Supplier<Item> BRONZE_SWORD_ITEM = createSword("bronze_sword_item", ModItemTeirs.BRONZE);
    public static final Supplier<Item> BRONZE_HOE_ITEM = createHoe("bronze_hoe_item", ModItemTeirs.BRONZE);
    public static final Supplier<Item> BRONZE_SHOVEL_ITEM = createShovel("bronze_shovel_item", ModItemTeirs.BRONZE);
    public static final Supplier<Item> BRONZE_AXE_ITEM = createAxe("bronze_axe_item", ModItemTeirs.BRONZE);
    public static final Supplier<Item> BRONZE_PICKAXE_ITEM = createPickaxe("bronze_pickaxe_item", ModItemTeirs.BRONZE);
    public static final Supplier<Item> BRONZE_SHIELD_ITEM = createShield("bronze_shield_item", 672);
    public static final Supplier<Item> BRONZE_BOOTS_ITEM = createBoots("bronze_boots_item", ModArmourMaterials.BRONZE);
    public static final Supplier<Item> BRONZE_LEGGINGS_ITEM = createLeggings("bronze_leggings_item", ModArmourMaterials.BRONZE);
    public static final Supplier<Item> BRONZE_CHESTPLATE_ITEM = createChestplate("bronze_chestplate_item", ModArmourMaterials.BRONZE);
    public static final Supplier<Item> BRONZE_HELMET_ITEM = createHelmet("bronze_helmet_item", ModArmourMaterials.BRONZE);

    //Brass
    public static final Supplier<Item> RAW_BRASS_MIX_ITEM = createItem("raw_brass_mix_item");
    public static final Supplier<Item> BRASS_INGOT_ITEM = createItem("brass_ingot_item");
    public static final Supplier<Item> BRASS_NUGGET_ITEM = createItem("brass_nugget_item");
    public static final Supplier<Item> BRASS_DUST_ITEM = createItem("brass_dust_item");
    public static final Supplier<Item> BRASS_SWORD_ITEM = createSword("brass_sword_item", ModItemTeirs.BRASS);
    public static final Supplier<Item> BRASS_HOE_ITEM = createHoe("brass_hoe_item", ModItemTeirs.BRASS);
    public static final Supplier<Item> BRASS_SHOVEL_ITEM = createShovel("brass_shovel_item", ModItemTeirs.BRASS);
    public static final Supplier<Item> BRASS_AXE_ITEM = createAxe("brass_axe_item", ModItemTeirs.BRASS);
    public static final Supplier<Item> BRASS_PICKAXE_ITEM = createPickaxe("brass_pickaxe_item", ModItemTeirs.BRASS);
    public static final Supplier<Item> BRASS_SHIELD_ITEM = createShield("brass_shield_item", 672);
    public static final Supplier<Item> BRASS_BOOTS_ITEM = createBoots("brass_boots_item", ModArmourMaterials.BRASS);
    public static final Supplier<Item> BRASS_LEGGINGS_ITEM = createLeggings("brass_leggings_item", ModArmourMaterials.BRASS);
    public static final Supplier<Item> BRASS_CHESTPLATE_ITEM = createChestplate("brass_chestplate_item", ModArmourMaterials.BRASS);
    public static final Supplier<Item> BRASS_HELMET_ITEM = createHelmet("brass_helmet_item", ModArmourMaterials.BRASS);

    /*
    PARTS
     */
    ///Speeder
    //Power Cell - Energy storage
    //Tesla Focuses on power storage then power management
    public static final Supplier<Item> SPEEDER_TESLA_MK1_POWER_CELL_ITEM = createSpeederPowerCell("speeder_tesla_mk1_power_cell_item", EnumVehicleTypes.SPEEDER, 15000, 600, 300, EnumVehicleSize.SMALL); //Storage: 15kFE, input 600FE/t, output 300FE/t, Size: Small
    public static final Supplier<Item> SPEEDER_TESLA_MK2_POWER_CELL_ITEM = createSpeederPowerCell("speeder_tesla_mk2_power_cell_item", EnumVehicleTypes.SPEEDER, 150000, 6000, 3000, EnumVehicleSize.SMALL); //Storage: 150kFE, input 6kFE/t, output 3kFE/t, Size: Small
    public static final Supplier<Item> SPEEDER_TESLA_MK3_POWER_CELL_ITEM = createSpeederPowerCell("speeder_tesla_mk3_power_cell_item", EnumVehicleTypes.SPEEDER, 1500000, 60000, 30000, EnumVehicleSize.SMALL); //Storage: 1.5mFE, input 60kFE/t, output 30kFE/t, Size: Small
    public static final Supplier<Item> SPEEDER_TESLA_MK3XL_POWER_CELL_ITEM = createSpeederPowerCell("speeder_tesla_mk3xl_power_cell_item", EnumVehicleTypes.SPEEDER, 3000000, 120000, 60000, EnumVehicleSize.MID); //Storage: 3mFE, input 120kFE/t, output 60kFE/t, Size: Mid
    public static final Supplier<Item> SPEEDER_TESLA_MK4_POWER_CELL_ITEM = createSpeederPowerCell("speeder_tesla_mk4_power_cell_item", EnumVehicleTypes.SPEEDER, 15000000, 600000, 300000, EnumVehicleSize.SMALL); //Storage: 15mFE, input 600kFE/t, output 300kFE/t, Size: Small
    public static final Supplier<Item> SPEEDER_TESLA_MK4XL_POWER_CELL_ITEM = createSpeederPowerCell("speeder_tesla_mk4xl_power_cell_item", EnumVehicleTypes.SPEEDER, 30000000, 1200000, 600000, EnumVehicleSize.MID); //Storage: 30mFE, input 1.2mFE/t, output 600kFE/t, Size: Mid
    public static final Supplier<Item> SPEEDER_TESLA_ULT_POWER_CELL_ITEM = createSpeederPowerCell("speeder_tesla_ult_power_cell_item", EnumVehicleTypes.SPEEDER, 1000000000, 6000000, 3000000, EnumVehicleSize.MID); //Storage: 1bFE, input 6mFE/t, output 3mFE/t, Size: Mid

    //Controller - Reduces energy usage among parts and devides the usage smartly
    //Tesla Focuses on power storage then power management
    public static final Supplier<Item> SPEEDER_TESLA_MK1_CONTROLLER_ITEM = createSpeederController("speeder_tesla_mk1_controller_item", EnumVehicleTypes.SPEEDER, 300, 2, EnumVehicleSize.SMALL, EnumVehicleSteeringStrength.MID, 1); //Process: 300FE/t, Modules: 2, Size: Small, Steering: Mid, Heat: 1
    public static final Supplier<Item> SPEEDER_TESLA_MK2_CONTROLLER_ITEM = createSpeederController("speeder_tesla_mk2_controller_item", EnumVehicleTypes.SPEEDER, 3000, 2, EnumVehicleSize.SMALL, EnumVehicleSteeringStrength.MID, 2); //Process: 3kFE/t, Modules: 2, Size: Small, Steering: Mid, Heat: 2
    public static final Supplier<Item> SPEEDER_TESLA_MK3_CONTROLLER_ITEM = createSpeederController("speeder_tesla_mk3_controller_item", EnumVehicleTypes.SPEEDER, 30000, 2, EnumVehicleSize.SMALL, EnumVehicleSteeringStrength.MID, 3); //Process: 30kFE/t, Modules: 2, Size: Small, Steering: Mid, Heat: 3
    public static final Supplier<Item> SPEEDER_TESLA_MK3XL_CONTROLLER_ITEM = createSpeederController("speeder_tesla_mk3xl_controller_item", EnumVehicleTypes.SPEEDER, 60000, 4, EnumVehicleSize.MID, EnumVehicleSteeringStrength.MID, 6); //Process: 60kFE/t, Modules: 4, Size: Mid, Steering: Mid, Heat: 6
    public static final Supplier<Item> SPEEDER_TESLA_MK4_CONTROLLER_ITEM = createSpeederController("speeder_tesla_mk4_controller_item", EnumVehicleTypes.SPEEDER, 300000, 2, EnumVehicleSize.SMALL, EnumVehicleSteeringStrength.MID, 4); //Process: 300kFE/t, Modules: 2, Size: Small, Steering: Mid, Heat: 4
    public static final Supplier<Item> SPEEDER_TESLA_MK4XL_CONTROLLER_ITEM = createSpeederController("speeder_tesla_mk4xl_controller_item", EnumVehicleTypes.SPEEDER, 600000, 4, EnumVehicleSize.MID, EnumVehicleSteeringStrength.MID, 8); //Process: 600kFE/t, Modules: 4, Size: Mid, Steering: Mid, Heat: 8
    public static final Supplier<Item> SPEEDER_TESLA_ULT_CONTROLLER_ITEM = createSpeederController("speeder_tesla_ult_controller_item", EnumVehicleTypes.SPEEDER, 3000000, 4, EnumVehicleSize.MID, EnumVehicleSteeringStrength.MID, 10); //Process: 3mFE/t, Modules: 4, Size: Mid, Steering: Mid, Heat: 10

    //Coolent - Reduces energy usage among parts and devides the usage smartly
    //Tesla Focuses on power storage then power management
    public static final Supplier<Item> SPEEDER_TESLA_MK1_COOLENT_ITEM = createSpeederCoolent("speeder_tesla_mk1_coolent_item", EnumVehicleTypes.SPEEDER, 300, EnumVehicleSize.SMALL, 2); //Process: 300FE/t, Size: Small, Heat: -2
    public static final Supplier<Item> SPEEDER_TESLA_MK2_COOLENT_ITEM = createSpeederCoolent("speeder_tesla_mk2_coolent_item", EnumVehicleTypes.SPEEDER, 3000, EnumVehicleSize.SMALL, 4); //Process: 3kFE/t, Size: Small, Heat: -4
    public static final Supplier<Item> SPEEDER_TESLA_MK3_COOLENT_ITEM = createSpeederCoolent("speeder_tesla_mk3_coolent_item", EnumVehicleTypes.SPEEDER, 30000, EnumVehicleSize.SMALL, 6); //Process: 30kFE/t, Size: Small, Heat: -6
    public static final Supplier<Item> SPEEDER_TESLA_MK3XL_COOLENT_ITEM = createSpeederCoolent("speeder_tesla_mk3xl_coolent_item", EnumVehicleTypes.SPEEDER, 60000, EnumVehicleSize.MID, 10); //Process: 60kFE/t, Size: Mid, Heat: -10
    public static final Supplier<Item> SPEEDER_TESLA_MK4_COOLENT_ITEM = createSpeederCoolent("speeder_tesla_mk4_coolent_item", EnumVehicleTypes.SPEEDER, 300000, EnumVehicleSize.SMALL, 8); //Process: 300kFE/t, Size: Small, Heat: -8
    public static final Supplier<Item> SPEEDER_TESLA_MK4XL_COOLENT_ITEM = createSpeederCoolent("speeder_tesla_mk4xl_coolent_item", EnumVehicleTypes.SPEEDER, 600000, EnumVehicleSize.MID, 14); //Process: 600kFE/t, Size: Mid, Heat: -14
    public static final Supplier<Item> SPEEDER_TESLA_ULT_COOLENT_ITEM = createSpeederCoolent("speeder_tesla_ult_coolent_item", EnumVehicleTypes.SPEEDER, 3000000, EnumVehicleSize.MID, 20); //Process: 3mFE/t, Size: Mid, Heat: -20

    //Internal Engine - Speed of the speeder
    //Tesla Engines use less energy but are slower
    public static final Supplier<Item> SPEEDER_TESLA_MK1_INTERNAL_ENGINE_ITEM = createSpeederInternalEngine("speeder_tesla_mk1_internal_engine_item", EnumVehicleTypes.SPEEDER, 200, 10, EnumVehicleSize.SMALL, 2); //Energy 200FE/t, Speed 10bps, Size: Small, Heat: 2
    public static final Supplier<Item> SPEEDER_TESLA_MK2_INTERNAL_ENGINE_ITEM = createSpeederInternalEngine("speeder_tesla_mk2_internal_engine_item", EnumVehicleTypes.SPEEDER, 2000, 12, EnumVehicleSize.SMALL, 4); //Energy 2kFE/t, Speed 12bps, Size: Small, Heat: 4
    public static final Supplier<Item> SPEEDER_TESLA_MK3_INTERNAL_ENGINE_ITEM = createSpeederInternalEngine("speeder_tesla_mk3_internal_engine_item", EnumVehicleTypes.SPEEDER, 20000, 14, EnumVehicleSize.SMALL, 6); //Energy 20kFE/t, Speed 14bps, Size: Small, Heat: 6
    public static final Supplier<Item> SPEEDER_TESLA_MK3XL_INTERNAL_ENGINE_ITEM = createSpeederInternalEngine("speeder_tesla_mk3xl_internal_engine_item", EnumVehicleTypes.SPEEDER, 50000, 16, EnumVehicleSize.MID, 10); //Energy 50kFE/t, Speed 16bps, Size: Mid, Heat: 10
    public static final Supplier<Item> SPEEDER_TESLA_MK4_INTERNAL_ENGINE_ITEM = createSpeederInternalEngine("speeder_tesla_mk4_internal_engine_item", EnumVehicleTypes.SPEEDER, 200000, 18, EnumVehicleSize.SMALL, 8); //Energy 200kFE/t, Speed 18bps, Size: Small, Heat: 8
    public static final Supplier<Item> SPEEDER_TESLA_MK4XL_INTERNAL_ENGINE_ITEM = createSpeederInternalEngine("speeder_tesla_mk4xl_internal_engine_item", EnumVehicleTypes.SPEEDER, 500000, 20, EnumVehicleSize.MID, 15); //Energy 500kFE/t, Speed 20bps, Size: Mid, Heat: 15
    public static final Supplier<Item> SPEEDER_TESLA_ULT_INTERNAL_ENGINE_ITEM = createSpeederInternalEngine("speeder_tesla_ult_internal_engine_item", EnumVehicleTypes.SPEEDER, 2000000, 22, EnumVehicleSize.MID, 20); //Energy 2mFE/t, Speed 22bps, Size: Mid, Heat: 20

    //External Engine - Increases the speed of the speeder for racing
//    public static final Supplier<Item> _ITEM = createItem("_item");

    //Armour - Decrease damage amount
//    public static final Supplier<Item> _ITEM = createItem("_item");

    //Weapon - Improves damage
//    public static final Supplier<Item> _ITEM = createItem("_item");

    //Landing Repulsor - Reduce Landing damage
//    public static final Supplier<Item> _ITEM = createItem("_item");

    //Speed Booster - Increase speed boost
//    public static final Supplier<Item> _ITEM = createItem("_item");

    //Jump Booster - Increase jump boost amount
//    public static final Supplier<Item> _ITEM = createItem("_item");

    //Frame - For the stability of the booster
    public static final Supplier<Item> SPEEDER_TESLA_MK1_FRAME_ITEM = createSpeederFrame("speeder_tesla_mk1_frame_item", EnumVehicleTypes.SPEEDER, EnumVehicleSize.SMALL, 2, 4, 4, EnumEngineType.INTERNAL); //Size: Small, Modules: 2, Cooling: 4, Armour 4
    public static final Supplier<Item> SPEEDER_TESLA_MK2_FRAME_ITEM = createSpeederFrame("speeder_tesla_mk2_frame_item", EnumVehicleTypes.SPEEDER, EnumVehicleSize.SMALL, 2, 6, 4, EnumEngineType.INTERNAL); //Size: Small, Modules: 2, Cooling: 6, Armour 4
    public static final Supplier<Item> SPEEDER_TESLA_MK3_FRAME_ITEM = createSpeederFrame("speeder_tesla_mk3_frame_item", EnumVehicleTypes.SPEEDER, EnumVehicleSize.SMALL, 2, 8, 4, EnumEngineType.INTERNAL); //Size: Small, Modules: 2, Cooling: 8, Armour 4
    public static final Supplier<Item> SPEEDER_TESLA_MK3XL_FRAME_ITEM = createSpeederFrame("speeder_tesla_mk3xl_frame_item", EnumVehicleTypes.SPEEDER, EnumVehicleSize.MID, 2, 12, 4, EnumEngineType.INTERNAL); //Size: Mid, Modules: 2, Cooling: 12, Armour 4
    public static final Supplier<Item> SPEEDER_TESLA_MK4_FRAME_ITEM = createSpeederFrame("speeder_tesla_mk4_frame_item", EnumVehicleTypes.SPEEDER, EnumVehicleSize.SMALL, 2, 10, 4, EnumEngineType.INTERNAL); //Size: Small, Modules: 2, Cooling: 10, Armour 4
    public static final Supplier<Item> SPEEDER_TESLA_MK4XL_FRAME_ITEM = createSpeederFrame("speeder_tesla_mk4xl_frame_item", EnumVehicleTypes.SPEEDER, EnumVehicleSize.MID, 2, 14, 4, EnumEngineType.INTERNAL); //Size: Mid, Modules: 2, Cooling: 14, Armour 4
    public static final Supplier<Item> SPEEDER_TESLA_ULT_FRAME_ITEM = createSpeederFrame("speeder_tesla_ult_frame_item", EnumVehicleTypes.SPEEDER, EnumVehicleSize.MID, 2, 16, 4, EnumEngineType.INTERNAL); //Size: Mid, Modules: 2, Cooling: 16, Armour 4

    //Extra
//    public static final Supplier<Item> FLUID_REPULSOR_ITEM = createItem("speeder_fluid_repulsor_item"); //Fly on water
//    public static final Supplier<Item> RADIO_ITEM = createItem("speeder_radio_item");
//    public static final Supplier<Item> SCANNER_ITEM = createItem("speeder_scanner_item");

    /*
    Vehicles
     */
    public static final Supplier<Item> SPEEDER_ITEM = ITEMS.register("speeder_item", () -> new SpeederItem(new Item.Properties()));

    /*
    Synthetic Parts
     */

    /*
    Test tubes
     */

    /*
    Fossils and Artifacts
     */

    private static DeferredItem<Item> createItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    private static DeferredItem<Item> createSword(String name, Tier tier) {
        return ITEMS.register(name, () -> new ModSwordItem(tier));
    }
    private static DeferredItem<Item> createHoe(String name, Tier tier) {
        return ITEMS.register(name, () -> new ModHoeItem(tier));
    }
    private static DeferredItem<Item> createShovel(String name, Tier tier) {
        return ITEMS.register(name, () -> new ModShovelItem(tier));
    }
    private static DeferredItem<Item> createAxe(String name, Tier tier) {
        return ITEMS.register(name, () -> new ModAxeItem(tier));
    }
    private static DeferredItem<Item> createPickaxe(String name, Tier tier) {
        return ITEMS.register(name, () -> new ModPickaxeItem(tier));
    }
    private static DeferredItem<Item> createShield(String name, int durability) {
        return ITEMS.register(name, () -> new ModShieldItem(durability));
    }
    private static DeferredItem<Item> createBoots(String name, Holder<ArmorMaterial> armorMaterial) {
        return ITEMS.register(name, () -> new ModItemArmours(armorMaterial, ArmorItem.Type.BOOTS, new Item.Properties()));
    }
    private static DeferredItem<Item> createLeggings(String name, Holder<ArmorMaterial> armorMaterial) {
        return ITEMS.register(name, () -> new ModItemArmours(armorMaterial, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    }
    private static DeferredItem<Item> createChestplate(String name, Holder<ArmorMaterial> armorMaterial) {
        return ITEMS.register(name, () -> new ModItemArmours(armorMaterial, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    }
    private static DeferredItem<Item> createHelmet(String name, Holder<ArmorMaterial> armorMaterial) {
        return ITEMS.register(name, () -> new ModItemArmours(armorMaterial, ArmorItem.Type.HELMET, new Item.Properties()));
    }

    private static <T extends Item> DeferredItem<T> createItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    private static DeferredItem<Item> createSpeederPowerCell(String name, EnumVehicleTypes vehicleTypes, int storage, int input, int output, EnumVehicleSize vehicleSize) {
        return ITEMS.register(name, () -> new ItemPowerCell(new Item.Properties(), vehicleTypes, storage, input, output, vehicleSize));
    }

    private static DeferredItem<Item> createSpeederController(String name, EnumVehicleTypes vehicleTypes, int energyUsage, int modules, EnumVehicleSize vehicleSize, EnumVehicleSteeringStrength vehicleSteeringStrength, int heat) {
        return ITEMS.register(name, () -> new ItemController(new Item.Properties(), vehicleTypes, energyUsage, modules, vehicleSize, vehicleSteeringStrength, heat));
    }

    private static DeferredItem<Item> createSpeederCoolent(String name, EnumVehicleTypes vehicleTypes, int energyUsage, EnumVehicleSize vehicleSize, int coolingAmount) {
        return ITEMS.register(name, () -> new ItemCoolent(new Item.Properties(), vehicleTypes, energyUsage, vehicleSize, coolingAmount));
    }

    private static DeferredItem<Item> createSpeederInternalEngine(String name, EnumVehicleTypes vehicleTypes, int energyUsage, int speed, EnumVehicleSize vehicleSize, int heat) {
        return ITEMS.register(name, () -> new ItemInternalEngine(new Item.Properties(), vehicleTypes, energyUsage, speed, vehicleSize, heat));
    }

    private static DeferredItem<Item> createSpeederFrame(String name, EnumVehicleTypes vehicleTypes, EnumVehicleSize vehicleSize, int modules, int cooling, int armour, EnumEngineType engineType) {
        return ITEMS.register(name, () -> new ItemFrames(new Item.Properties(), vehicleTypes, vehicleSize, modules, cooling, armour, engineType));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
