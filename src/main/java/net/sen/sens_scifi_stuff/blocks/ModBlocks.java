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
import net.sen.sens_scifi_stuff.SensScifiStuff;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.function.Supplier;

public class ModBlocks {
    private static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ModUtils.getModId());
    private static final DeferredRegister.Items BLOCK_ITEMS = DeferredRegister.createItems(ModUtils.getModId());

    public static final Supplier<Block> WORKBENCH_BLOCK = createBlock("work_bench_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    private static <T extends Block> DeferredBlock<T> createBlock(String name, Supplier<T> block) {
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
