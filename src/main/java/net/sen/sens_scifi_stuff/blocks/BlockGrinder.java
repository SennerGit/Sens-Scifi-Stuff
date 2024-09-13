package net.sen.sens_scifi_stuff.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.sen.sens_scifi_stuff.blocks.energy_generation.BlockStirlingGenerator;
import org.jetbrains.annotations.Nullable;

public class BlockGrinder extends AbstractMachineBlock {
    public static final MapCodec<BlockStirlingGenerator> CODEC = simpleCodec(BlockStirlingGenerator::new);

    public BlockGrinder(Properties properties) {
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
