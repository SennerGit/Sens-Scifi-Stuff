package net.sen.sens_scifi_stuff.items;

import com.google.common.base.Suppliers;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.sens_scifi_stuff.SensScifiStuff;

import java.util.function.Supplier;

public enum ModItemTeirs implements Tier {
    STEEL(286, 6.0f, 3.0f, 8, () -> Ingredient.of(ModItems.STEEL_INGOT_ITEM.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    TIN(286, 6.0f, 3.0f, 8, () -> Ingredient.of(ModItems.TIN_INGOT_ITEM.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    ZINC(286, 6.0f, 3.0f, 8, () -> Ingredient.of(ModItems.ZINC_INGOT_ITEM.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    NICKEL(286, 6.0f, 3.0f, 8, () -> Ingredient.of(ModItems.NICKEL_INGOT_ITEM.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    INVAR(286, 6.0f, 3.0f, 8, () -> Ingredient.of(ModItems.INVAR_INGOT_ITEM.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    LEAD(286, 6.0f, 3.0f, 8, () -> Ingredient.of(ModItems.LEAD_INGOT_ITEM.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    SILVER(286, 6.0f, 3.0f, 8, () -> Ingredient.of(ModItems.SILVER_INGOT_ITEM.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    ELECTRUM(286, 6.0f, 3.0f, 8, () -> Ingredient.of(ModItems.ELECTRUM_INGOT_ITEM.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    BRONZE(286, 6.0f, 3.0f, 8, () -> Ingredient.of(ModItems.BRONZE_INGOT_ITEM.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    BRASS(286, 6.0f, 3.0f, 8, () -> Ingredient.of(ModItems.BRASS_INGOT_ITEM.get()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    ;

    private final int durability;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;
    private final TagKey<Block> incorrectTag;

    ModItemTeirs(int durability, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient, TagKey<Block> incorrectTag) {
        this.durability = durability;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
        this.incorrectTag = incorrectTag;
    }

    public int getUses() {
        return this.durability;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectTag;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
