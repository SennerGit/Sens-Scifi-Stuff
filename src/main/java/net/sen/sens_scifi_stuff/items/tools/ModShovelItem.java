package net.sen.sens_scifi_stuff.items.tools;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class ModShovelItem extends ShovelItem {
    public ModShovelItem(Tier tier) {
        super(tier, new Item.Properties().stacksTo(1));
    }
}
