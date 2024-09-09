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
        this.addBlock(ModBlocks.WORKBENCH_BLOCK, "WorkBench");

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
        this.addItem(ModItems.IRON_DUST_ITEM, "Iron Dust");
        this.addItem(ModItems.COPPER_DUST_ITEM, "Copper Dust");
        this.addItem(ModItems.GOLD_DUST_ITEM, "Gold Dust");

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
