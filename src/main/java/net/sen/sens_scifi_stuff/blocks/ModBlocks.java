package net.sen.sens_scifi_stuff.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.sens_scifi_stuff.blocks.energy_generation.BlockStirlingGenerator;
import net.sen.sens_scifi_stuff.blocks.energy_storage.BlockPowerCell;
import net.sen.sens_scifi_stuff.blocks.pipe.BlockStoragePipe;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.function.Supplier;

public class ModBlocks {
    private static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ModUtils.getModId());
    private static final DeferredRegister.Items BLOCK_ITEMS = DeferredRegister.createItems(ModUtils.getModId());

    /*
    Metals
     */
    //Iron
    public static final Supplier<Block> PURE_RAW_IRON_BLOCK = createBlock("pure_raw_iron_block");
    public static final Supplier<Block> REFINED_IRON_BLOCK = createBlock("refined_iron_block");

    //Copper
    public static final Supplier<Block> PURE_RAW_COPPER_BLOCK = createBlock("pure_raw_copper_block");
    public static final Supplier<Block> REFINED_COPPER_BLOCK = createBlock("refined_copper_block");

    //Gold
    public static final Supplier<Block> PURE_RAW_GOLD_BLOCK = createBlock("pure_raw_gold_block");
    public static final Supplier<Block> REFINED_GOLD_BLOCK = createBlock("refined_gold_block");

    //Steel
    public static final Supplier<Block> STEEL_BLOCK = createBlock("steel_block");

    //Tin
    public static final Supplier<Block> ORE_TIN_BLOCK = createBlock("ore_tin_block");
    public static final Supplier<Block> RAW_TIN_BLOCK = createBlock("raw_tin_block");
    public static final Supplier<Block> PURE_RAW_TIN_BLOCK = createBlock("pure_raw_tin_block");
    public static final Supplier<Block> TIN_BLOCK = createBlock("tin_block");
    public static final Supplier<Block> REFINED_TIN_BLOCK = createBlock("refined_tin_block");

    //Zinc
    public static final Supplier<Block> ORE_ZINC_BLOCK = createBlock("ore_zinc_block");
    public static final Supplier<Block> RAW_ZINC_BLOCK = createBlock("raw_zinc_block");
    public static final Supplier<Block> PURE_RAW_ZINC_BLOCK = createBlock("pure_raw_zinc_block");
    public static final Supplier<Block> ZINC_BLOCK = createBlock("zinc_block");
    public static final Supplier<Block> REFINED_ZINC_BLOCK = createBlock("refined_zinc_block");

    //Nickel
    public static final Supplier<Block> ORE_NICKEL_BLOCK = createBlock("ore_nickel_block");
    public static final Supplier<Block> RAW_NICKEL_BLOCK = createBlock("raw_nickel_block");
    public static final Supplier<Block> PURE_RAW_NICKEL_BLOCK = createBlock("pure_raw_nickel_block");
    public static final Supplier<Block> NICKEL_BLOCK = createBlock("nickel_block");
    public static final Supplier<Block> REFINED_NICKEL_BLOCK = createBlock("refined_nickel_block");

    //Invar
    public static final Supplier<Block> ORE_INVAR_BLOCK = createBlock("ore_invar_block");
    public static final Supplier<Block> RAW_INVAR_BLOCK = createBlock("raw_invar_block");
    public static final Supplier<Block> PURE_RAW_INVAR_BLOCK = createBlock("pure_raw_invar_block");
    public static final Supplier<Block> INVAR_BLOCK = createBlock("invar_block");
    public static final Supplier<Block> REFINED_INVAR_BLOCK = createBlock("refined_invar_block");

    //Lead
    public static final Supplier<Block> ORE_LEAD_BLOCK = createBlock("ore_lead_block");
    public static final Supplier<Block> RAW_LEAD_BLOCK = createBlock("raw_lead_block");
    public static final Supplier<Block> PURE_RAW_LEAD_BLOCK = createBlock("pure_raw_lead_block");
    public static final Supplier<Block> LEAD_BLOCK = createBlock("lead_block");
    public static final Supplier<Block> REFINED_LEAD_BLOCK = createBlock("refined_lead_block");

    //Silver
    public static final Supplier<Block> ORE_SILVER_BLOCK = createBlock("ore_silver_block");
    public static final Supplier<Block> RAW_SILVER_BLOCK = createBlock("raw_silver_block");
    public static final Supplier<Block> PURE_RAW_SILVER_BLOCK = createBlock("pure_raw_silver_block");
    public static final Supplier<Block> SILVER_BLOCK = createBlock("silver_block");
    public static final Supplier<Block> REFINED_SILVER_BLOCK = createBlock("refined_silver_block");

    //Electrum
    public static final Supplier<Block> ORE_ELECTRUM_BLOCK = createBlock("ore_electrum_block");
    public static final Supplier<Block> RAW_ELECTRUM_BLOCK = createBlock("raw_electrum_block");
    public static final Supplier<Block> PURE_RAW_ELECTRUM_BLOCK = createBlock("pure_raw_electrum_block");
    public static final Supplier<Block> ELECTRUM_BLOCK = createBlock("electrum_block");
    public static final Supplier<Block> REFINED_ELECTRUM_BLOCK = createBlock("refined_electrum_block");

    //Uranium
    public static final Supplier<Block> ORE_URANIUM_BLOCK = createBlock("ore_uranium_block");
    public static final Supplier<Block> RAW_URANIUM_BLOCK = createBlock("raw_uranium_block");
    public static final Supplier<Block> PURE_RAW_URANIUM_BLOCK = createBlock("pure_raw_uranium_block");
    public static final Supplier<Block> URANIUM_BLOCK = createBlock("uranium_block");
    public static final Supplier<Block> REFINED_URANIUM_BLOCK = createBlock("refined_uranium_block");

    //Bronze
    public static final Supplier<Block> BRONZE_BLOCK = createBlock("bronze_block");

    //Brass
    public static final Supplier<Block> BRASS_BLOCK = createBlock("brass_block");

    /*
    Machines
     */
    public static final Supplier<Block> WORKBENCH_BLOCK = createBlock("workbench_block", () -> new BlockWorkbench(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final Supplier<Block> GRINDER_BLOCK = createBlock("grinder_block", () -> new BlockGrinder(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final Supplier<Block> ORE_WASHER_BLOCK = createBlock("ore_washer_block", () -> new BlockOreWasher(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final Supplier<Block> FLUX_GROWER_BLOCK = createBlock("flux_grower_block", () -> new BlockFluxGrower(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    //Player Upgrade Stations
    public static final Supplier<Block> RIPPERDOC_CHAIR_BLOCK = createBlock("ripperdoc_chair_block", () -> new BlockRipperDocChair(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final Supplier<Block> BIO_REACTOR_TANK_BLOCK = createBlock("bio_reactor_tank_block", () -> new BlockTankBioReactor(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    //Making NPC's Stations
    public static final Supplier<Block> INCUBATION_CHAMBER_TANK_BLOCK = createBlock("incubation_chamber_tank_block", () -> new BlockTankIncubationChamber(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final Supplier<Block> CLONING_TANK_BLOCK = createBlock("cloning_tank_block", () -> new BlockTankCloning(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    /*
    Generator
     */
    public static final Supplier<Block> STIRLING_GENERATOR_BLOCK = createBlock("stirling_generator_block", () -> new BlockStirlingGenerator(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    /*
    Pipes
     */
    public static final Supplier<Block> ENERGY_PIPE_BLOCK = createBlock("energy_pipe_block", () -> new BlockStoragePipe(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    /*
    Power Cells
     */
    public static final Supplier<Block> POWER_CELL_BLOCK = createBlock("power_cell_block", () -> new BlockPowerCell(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    private static DeferredBlock<Block> createBlock(String name) {
        DeferredBlock<Block> toReturn = BLOCKS.register(name, () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
        createBlockItem(name, toReturn);
        return toReturn;
    }

    private static DeferredBlock<Block> createBlock(String name, BlockBehaviour.Properties properties) {
        DeferredBlock<Block> toReturn = BLOCKS.register(name, () -> new Block(properties));
        createBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredBlock<T> createBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        createBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredBlock<T> createBlock(String name, DeferredBlock<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        createBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<Item> createBlockItem(String name, DeferredBlock<T> block) {
        return BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        BLOCK_ITEMS.register(eventBus);
    }
}
