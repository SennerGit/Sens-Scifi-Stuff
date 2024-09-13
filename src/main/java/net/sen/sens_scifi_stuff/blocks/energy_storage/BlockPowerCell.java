package net.sen.sens_scifi_stuff.blocks.energy_storage;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.sen.sens_scifi_stuff.blocks.pipe.BlockStoragePipe;
import org.jetbrains.annotations.Nullable;

public class BlockPowerCell extends AbstractEnergyCellBlock {
    public static final MapCodec<BlockPowerCell> CODEC = simpleCodec(BlockPowerCell::new);

    public BlockPowerCell(BlockBehaviour.Properties properties) {
        super(properties, 10000);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }
}
