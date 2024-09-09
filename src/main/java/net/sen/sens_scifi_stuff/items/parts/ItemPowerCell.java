package net.sen.sens_scifi_stuff.items.parts;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.sen.sens_scifi_stuff.SensScifiStuff;
import net.sen.sens_scifi_stuff.utils.ModUtils;
import net.sen.sens_scifi_stuff.utils.parts.EnumPartType;
import net.sen.sens_scifi_stuff.utils.parts.EnumVehicleSize;
import net.sen.sens_scifi_stuff.utils.parts.EnumVehicleTypes;

import java.util.List;
import java.util.Locale;

public class ItemPowerCell extends Item {
    private final EnumVehicleTypes vehicleTypes;
    private final int storage;
    private final int input;
    private final int output;
    private final EnumVehicleSize vehicleSize;
    private final EnumPartType partType;

    public ItemPowerCell(Properties properties, EnumVehicleTypes vehicleTypes, int storage, int input, int output, EnumVehicleSize vehicleSize) {
        super(properties.stacksTo(1));

        this.vehicleTypes = vehicleTypes;
        this.storage = storage;
        this.input = input;
        this.output = output;
        this.vehicleSize = vehicleSize;
        this.partType = EnumPartType.POWER_CELL;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if (!Screen.hasShiftDown()) {
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".shift_down"));
        } else {
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".vehicle_types").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.vehicleTypes.name().toLowerCase(Locale.ROOT))));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".part_type").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.partType.name().toLowerCase(Locale.ROOT))));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".storage").append(": ").append(String.valueOf(this.storage)).append("RF"));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".input").append(": ").append(String.valueOf(this.input)).append("RF/t"));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".output").append(": ").append(String.valueOf(this.output)).append("RF/t"));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".vehicle_size").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.vehicleSize.name().toLowerCase(Locale.ROOT))));
        }

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
