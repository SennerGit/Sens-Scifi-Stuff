package net.sen.sens_scifi_stuff.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.sens_scifi_stuff.items.parts.*;
import net.sen.sens_scifi_stuff.items.vehicles.SpeederItem;
import net.sen.sens_scifi_stuff.utils.ModUtils;
import net.sen.sens_scifi_stuff.utils.parts.EnumEngineType;
import net.sen.sens_scifi_stuff.utils.parts.EnumVehicleSteeringStrength;
import net.sen.sens_scifi_stuff.utils.parts.EnumVehicleSize;
import net.sen.sens_scifi_stuff.utils.parts.EnumVehicleTypes;

import java.util.function.Supplier;

public class ModItems {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModUtils.getModId());

    public static final Supplier<Item> OMNI_WRENCH_ITEM = createItem("omni_wrench_item");
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
    public static final Supplier<Item> IRON_DUST_ITEM = createItem("iron_dust_item");
    public static final Supplier<Item> COPPER_DUST_ITEM = createItem("copper_dust_item");
    public static final Supplier<Item> GOLD_DUST_ITEM = createItem("gold_dust_item");

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

    private static <T extends Block> DeferredItem<Item> createItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    private static <T extends Block> DeferredItem<Item> createSpeederPowerCell(String name, EnumVehicleTypes vehicleTypes, int storage, int input, int output, EnumVehicleSize vehicleSize) {
        return ITEMS.register(name, () -> new ItemPowerCell(new Item.Properties(), vehicleTypes, storage, input, output, vehicleSize));
    }

    private static <T extends Block> DeferredItem<Item> createSpeederController(String name, EnumVehicleTypes vehicleTypes, int energyUsage, int modules, EnumVehicleSize vehicleSize, EnumVehicleSteeringStrength vehicleSteeringStrength, int heat) {
        return ITEMS.register(name, () -> new ItemController(new Item.Properties(), vehicleTypes, energyUsage, modules, vehicleSize, vehicleSteeringStrength, heat));
    }

    private static <T extends Block> DeferredItem<Item> createSpeederCoolent(String name, EnumVehicleTypes vehicleTypes, int energyUsage, EnumVehicleSize vehicleSize, int coolingAmount) {
        return ITEMS.register(name, () -> new ItemCoolent(new Item.Properties(), vehicleTypes, energyUsage, vehicleSize, coolingAmount));
    }

    private static <T extends Block> DeferredItem<Item> createSpeederInternalEngine(String name, EnumVehicleTypes vehicleTypes, int energyUsage, int speed, EnumVehicleSize vehicleSize, int heat) {
        return ITEMS.register(name, () -> new ItemInternalEngine(new Item.Properties(), vehicleTypes, energyUsage, speed, vehicleSize, heat));
    }

    private static <T extends Block> DeferredItem<Item> createSpeederFrame(String name, EnumVehicleTypes vehicleTypes, EnumVehicleSize vehicleSize, int modules, int cooling, int armour, EnumEngineType engineType) {
        return ITEMS.register(name, () -> new ItemFrames(new Item.Properties(), vehicleTypes, vehicleSize, modules, cooling, armour, engineType));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
