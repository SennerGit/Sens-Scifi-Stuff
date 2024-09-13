package net.sen.sens_scifi_stuff.items;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.sen.sens_scifi_stuff.blocks.AbstractMachineBlock;

public class ItemWrench extends Item {
    public ItemWrench() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        BlockPos blockPos = context.getClickedPos();
        Level level = context.getLevel();
        BlockState blockState = level.getBlockState(blockPos);
        Player player = context.getPlayer();

        if (!(blockState.getBlock() instanceof AbstractMachineBlock)) {
            return super.useOn(context);
        }

        if (player.isCrouching()) {
            level.destroyBlock(blockPos, true);
            return super.useOn(context);
        }

        //Open Gui for configuration

        return super.useOn(context);
    }
}
