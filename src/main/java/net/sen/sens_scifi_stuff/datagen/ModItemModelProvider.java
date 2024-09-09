package net.sen.sens_scifi_stuff.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.function.Supplier;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ModUtils.getModId(), existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Items
        this.basicItem(ModItems.OMNI_WRENCH_ITEM);
        this.basicItem(ModItems.PESTLE_ITEM);
        this.basicItem(ModItems.MORTAR_ITEM);

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

        //Block
        this.generateBlockItem(ModBlocks.WORKBENCH_BLOCK);

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

    public ItemModelBuilder basicItem(Supplier<Item> item) {
        return basicItem(item.get());
    }

    public void generateBlockItem(Supplier<Block> block) {
        withExistingParent(ModUtils.getBlockId(block.get()), modLoc("block/" + ModUtils.getBlockId(block.get())));
    }
}
