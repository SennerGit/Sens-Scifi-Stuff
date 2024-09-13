package net.sen.sens_scifi_stuff.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sen.sens_scifi_stuff.SensScifiStuff;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.Locale;
import java.util.function.Supplier;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ModUtils.getModId(), exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlock(ModBlocks.WORKBENCH_BLOCK);
        this.simpleBlock(ModBlocks.GRINDER_BLOCK);
        this.simpleBlock(ModBlocks.ORE_WASHER_BLOCK);
        this.simpleBlock(ModBlocks.FLUX_GROWER_BLOCK);
        this.simpleBlock(ModBlocks.RIPPERDOC_CHAIR_BLOCK);
        this.simpleBlock(ModBlocks.BIO_REACTOR_TANK_BLOCK);
        this.simpleBlock(ModBlocks.INCUBATION_CHAMBER_TANK_BLOCK);
        this.simpleBlock(ModBlocks.CLONING_TANK_BLOCK);
        this.simpleBlock(ModBlocks.STIRLING_GENERATOR_BLOCK);
        this.simpleBlock(ModBlocks.ENERGY_PIPE_BLOCK);
        this.simpleBlock(ModBlocks.POWER_CELL_BLOCK);

        //Iron
        this.simpleBlock(ModBlocks.PURE_RAW_IRON_BLOCK);
        this.simpleBlock(ModBlocks.REFINED_IRON_BLOCK);

        //Copper
        this.simpleBlock(ModBlocks.PURE_RAW_COPPER_BLOCK);
        this.simpleBlock(ModBlocks.REFINED_COPPER_BLOCK);

        //Gold
        this.simpleBlock(ModBlocks.PURE_RAW_GOLD_BLOCK);
        this.simpleBlock(ModBlocks.REFINED_GOLD_BLOCK);

        //Steel
        this.simpleBlock(ModBlocks.STEEL_BLOCK);

        //Tin
        this.simpleBlock(ModBlocks.ORE_TIN_BLOCK);
        this.simpleBlock(ModBlocks.RAW_TIN_BLOCK);
        this.simpleBlock(ModBlocks.PURE_RAW_TIN_BLOCK);
        this.simpleBlock(ModBlocks.TIN_BLOCK);
        this.simpleBlock(ModBlocks.REFINED_TIN_BLOCK);

        //Zinc
        this.simpleBlock(ModBlocks.ORE_ZINC_BLOCK);
        this.simpleBlock(ModBlocks.RAW_ZINC_BLOCK);
        this.simpleBlock(ModBlocks.PURE_RAW_ZINC_BLOCK);
        this.simpleBlock(ModBlocks.ZINC_BLOCK);
        this.simpleBlock(ModBlocks.REFINED_ZINC_BLOCK);

        //Nickel
        this.simpleBlock(ModBlocks.ORE_NICKEL_BLOCK);
        this.simpleBlock(ModBlocks.RAW_NICKEL_BLOCK);
        this.simpleBlock(ModBlocks.PURE_RAW_NICKEL_BLOCK);
        this.simpleBlock(ModBlocks.NICKEL_BLOCK);
        this.simpleBlock(ModBlocks.REFINED_NICKEL_BLOCK);

        //Invar
        this.simpleBlock(ModBlocks.ORE_INVAR_BLOCK);
        this.simpleBlock(ModBlocks.RAW_INVAR_BLOCK);
        this.simpleBlock(ModBlocks.PURE_RAW_INVAR_BLOCK);
        this.simpleBlock(ModBlocks.INVAR_BLOCK);
        this.simpleBlock(ModBlocks.REFINED_INVAR_BLOCK);

        //Lead
        this.simpleBlock(ModBlocks.ORE_LEAD_BLOCK);
        this.simpleBlock(ModBlocks.RAW_LEAD_BLOCK);
        this.simpleBlock(ModBlocks.PURE_RAW_LEAD_BLOCK);
        this.simpleBlock(ModBlocks.LEAD_BLOCK);
        this.simpleBlock(ModBlocks.REFINED_LEAD_BLOCK);

        //Silver
        this.simpleBlock(ModBlocks.ORE_SILVER_BLOCK);
        this.simpleBlock(ModBlocks.RAW_SILVER_BLOCK);
        this.simpleBlock(ModBlocks.PURE_RAW_SILVER_BLOCK);
        this.simpleBlock(ModBlocks.SILVER_BLOCK);
        this.simpleBlock(ModBlocks.REFINED_SILVER_BLOCK);

        //Electrum
        this.simpleBlock(ModBlocks.ORE_ELECTRUM_BLOCK);
        this.simpleBlock(ModBlocks.RAW_ELECTRUM_BLOCK);
        this.simpleBlock(ModBlocks.PURE_RAW_ELECTRUM_BLOCK);
        this.simpleBlock(ModBlocks.ELECTRUM_BLOCK);
        this.simpleBlock(ModBlocks.REFINED_ELECTRUM_BLOCK);

        //Uranium
        this.simpleBlock(ModBlocks.ORE_URANIUM_BLOCK);
        this.simpleBlock(ModBlocks.RAW_URANIUM_BLOCK);
        this.simpleBlock(ModBlocks.PURE_RAW_URANIUM_BLOCK);
        this.simpleBlock(ModBlocks.URANIUM_BLOCK);
        this.simpleBlock(ModBlocks.REFINED_URANIUM_BLOCK);

        //Bronze
        this.simpleBlock(ModBlocks.BRONZE_BLOCK);
        
        //Brass
        this.simpleBlock(ModBlocks.BRASS_BLOCK);
    }

    public void simpleBlock(Supplier<Block> block) {
        this.simpleBlock(block.get());
    }
}
