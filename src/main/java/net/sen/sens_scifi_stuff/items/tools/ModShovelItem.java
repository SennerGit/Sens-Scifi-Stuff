package net.sen.sens_scifi_stuff.items.tools;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class ModShovelItem extends ShovelItem {
    public ModShovelItem(Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        super(tier, new Item.Properties().attributes(ShovelItem.createAttributes(tier, attackDamage, attackSpeed)).rarity(rarity).stacksTo(1));
    }
}
