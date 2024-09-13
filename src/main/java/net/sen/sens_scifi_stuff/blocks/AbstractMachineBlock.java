package net.sen.sens_scifi_stuff.blocks;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.Difficulty;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.sen.sens_scifi_stuff.items.ItemWrench;

import java.util.function.Function;

public abstract class AbstractMachineBlock extends BaseEntityBlock {
    private final float energyStorage;

    public AbstractMachineBlock(Properties properties, float energyStorage) {
        super(properties);
        this.energyStorage = energyStorage;
    }

    public float getEnergyStorage() {
        return energyStorage;
    }
}
