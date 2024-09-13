package net.sen.sens_scifi_stuff.items.tools;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class ModAxeItem extends AxeItem {
    public ModAxeItem(Tier tier) {
        super(tier, new Item.Properties().stacksTo(1));
    }
}
