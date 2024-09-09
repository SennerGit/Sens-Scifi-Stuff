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

public class ItemInternalEngine extends Item {
    private final EnumVehicleTypes vehicleTypes;
    private final int energyUsage;
    private final int speed;
    private final EnumVehicleSize vehicleSize;
    private final int heat;
    private final EnumPartType partType;

    public ItemInternalEngine(Item.Properties properties, EnumVehicleTypes vehicleTypes, int energyUsage, int speed, EnumVehicleSize vehicleSize, int heat) {
        super(properties.stacksTo(1));
        this.vehicleTypes = vehicleTypes;
        this.energyUsage = energyUsage;
        this.speed = speed;
        this.vehicleSize = vehicleSize;
        this.heat = heat;
        this.partType = EnumPartType.ENGINE;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if (!Screen.hasShiftDown()) {
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".shift_down"));
        } else {
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".vehicle_types").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.vehicleTypes.name().toLowerCase(Locale.ROOT))));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".part_type").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.partType.name().toLowerCase(Locale.ROOT))));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".energy_usage").append(": ").append(String.valueOf(this.energyUsage)).append("RF/t"));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".speed").append(": ").append(String.valueOf(this.speed)).append("BPS"));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".vehicle_size").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.vehicleSize.name().toLowerCase(Locale.ROOT))));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".heat").append(": ").append(String.valueOf(this.heat)));
        }

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
