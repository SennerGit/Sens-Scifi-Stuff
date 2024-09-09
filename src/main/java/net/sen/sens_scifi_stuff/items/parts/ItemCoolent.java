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

public class ItemCoolent extends Item {
    private final EnumVehicleTypes vehicleTypes;
    private final int energyUsage;
    private final EnumVehicleSize vehicleSize;
    private final int coolingAmount;
    private final EnumPartType partType;

    public ItemCoolent(Item.Properties properties, EnumVehicleTypes vehicleTypes, int energyUsage, EnumVehicleSize vehicleSize, int coolingAmount) {
        super(properties.stacksTo(1));
        this.vehicleTypes = vehicleTypes;
        this.energyUsage = energyUsage;
        this.vehicleSize = vehicleSize;
        this.coolingAmount = coolingAmount;
        this.partType = EnumPartType.COOLENT;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if (!Screen.hasShiftDown()) {
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".shift_down"));
        } else {
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".vehicle_types").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.vehicleTypes.name().toLowerCase(Locale.ROOT))));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".part_type").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.partType.name().toLowerCase(Locale.ROOT))));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".energy_usage").append(": ").append(String.valueOf(this.energyUsage)).append("RF/t"));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".vehicle_size").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.vehicleSize.name().toLowerCase(Locale.ROOT))));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".cooling").append(": ").append(String.valueOf(this.coolingAmount)));
        }

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
