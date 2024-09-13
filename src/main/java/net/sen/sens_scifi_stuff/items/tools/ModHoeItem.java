package net.sen.sens_scifi_stuff.items.tools;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class ModHoeItem extends HoeItem {
    public ModHoeItem(Tier tier) {
        super(tier, new Item.Properties().stacksTo(1));
    }
}
