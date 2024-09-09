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
                    output.accept(ModItems.IRON_DUST_ITEM.get());
                    output.accept(ModItems.COPPER_DUST_ITEM.get());
                    output.accept(ModItems.GOLD_DUST_ITEM.get());
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
                })
                .build();
    });

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
