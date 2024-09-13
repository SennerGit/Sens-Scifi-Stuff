package net.sen.sens_scifi_stuff.items.tools;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ModSwordItem extends SwordItem {
    public ModSwordItem(Tier tier) {
        super(tier, new Item.Properties().stacksTo(1));
    }
}
