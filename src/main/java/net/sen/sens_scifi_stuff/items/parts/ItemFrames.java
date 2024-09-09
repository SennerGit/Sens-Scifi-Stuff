package net.sen.sens_scifi_stuff.items.parts;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.sen.sens_scifi_stuff.SensScifiStuff;
import net.sen.sens_scifi_stuff.utils.ModUtils;
import net.sen.sens_scifi_stuff.utils.parts.EnumEngineType;
import net.sen.sens_scifi_stuff.utils.parts.EnumPartType;
import net.sen.sens_scifi_stuff.utils.parts.EnumVehicleSize;
import net.sen.sens_scifi_stuff.utils.parts.EnumVehicleTypes;

import java.util.List;
import java.util.Locale;

public class ItemFrames extends Item {
    private final EnumVehicleTypes vehicleTypes;
    private final EnumVehicleSize vehicleSize;
    private final int modules;
    private final int cooling;
    private final int armour;
    private final EnumEngineType engineType;
    private final EnumPartType partType;

    public ItemFrames(Item.Properties properties, EnumVehicleTypes vehicleTypes, EnumVehicleSize vehicleSize, int modules, int cooling, int armour, EnumEngineType engineType) {
        super(properties.stacksTo(1));

        this.vehicleTypes = vehicleTypes;
        this.vehicleSize = vehicleSize;
        this.modules = modules;
        this.cooling = cooling;
        this.armour = armour;
        this.engineType = engineType;
        this.partType = EnumPartType.FRAME;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if (!Screen.hasShiftDown()) {
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".shift_down"));
        } else {
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".vehicle_types").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.vehicleTypes.name().toLowerCase(Locale.ROOT))));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".part_type").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.partType.name().toLowerCase(Locale.ROOT))));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".vehicle_size").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.vehicleSize.name().toLowerCase(Locale.ROOT))));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".modules").append(": ").append(String.valueOf(this.modules)));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".cooling").append(": ").append(String.valueOf(this.cooling)));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".armour").append(": ").append(String.valueOf(this.armour)));
            tooltipComponents.add(Component.translatable("tooltip." + ModUtils.getModId() + ".engine_types").append(": ").append(Component.translatable("tooltip." + ModUtils.getModId() + "." + this.engineType.name().toLowerCase(Locale.ROOT))));
        }

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
