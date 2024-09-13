package net.sen.sens_scifi_stuff.items.tools;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;

public class ModShieldItem extends ShieldItem {
    public ModShieldItem(int durability) {
        super(new Item.Properties().stacksTo(1).durability(durability));
    }
}
