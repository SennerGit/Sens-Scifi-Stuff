package net.sen.sens_scifi_stuff.datagen.loot_tables;

import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.sen.sens_scifi_stuff.entities.ModEntities;
import net.sen.sens_scifi_stuff.items.ModItems;

public class ModEntityLootTables extends ModEntityLootHelper {
    protected ModEntityLootTables(HolderLookup.Provider registries) {
        super(registries);
    }

    @Override
    public void generate() {
        this.add
                (ModEntities.SPEEDER_ENTITY.get(), LootTable.lootTable()
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(ConstantValue.exactly(1))
                                        .add(
                                                LootItem.lootTableItem(ModItems.SPEEDER_ITEM.get())
                                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0f, 2.0f)))
                                                        .apply(EnchantedCountIncreaseFunction.lootingMultiplier(this.registries, UniformGenerator.between(0.0f, 1.0f)))
                                                        .when(LootItemKilledByPlayerCondition.killedByPlayer())
                                        )
                        )
        );
    }
}
