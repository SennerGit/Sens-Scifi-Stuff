package net.sen.sens_scifi_stuff.items;

import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.sens_scifi_stuff.SensScifiStuff;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmourMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, SensScifiStuff.MODID);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> STEEL = createArmorMaterial("steel", 1, 5, 6, 2, 10, 1.0f, 0.0f, () -> Ingredient.of(ModItems.STEEL_INGOT_ITEM.get()));
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> TIN = createArmorMaterial("tin", 1, 5, 6, 2, 10, 1.0f, 0.0f, () -> Ingredient.of(ModItems.TIN_INGOT_ITEM.get()));
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ZINC = createArmorMaterial("zinc", 1, 5, 6, 2, 10, 1.0f, 0.0f, () -> Ingredient.of(ModItems.ZINC_INGOT_ITEM.get()));
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> NICKEL = createArmorMaterial("nickel", 1, 5, 6, 2, 10, 1.0f, 0.0f, () -> Ingredient.of(ModItems.NICKEL_INGOT_ITEM.get()));
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> INVAR = createArmorMaterial("invar", 1, 5, 6, 2, 10, 1.0f, 0.0f, () -> Ingredient.of(ModItems.INVAR_INGOT_ITEM.get()));
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> LEAD = createArmorMaterial("lead", 1, 5, 6, 2, 10, 1.0f, 0.0f, () -> Ingredient.of(ModItems.LEAD_INGOT_ITEM.get()));
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> SILVER = createArmorMaterial("silver", 1, 5, 6, 2, 10, 1.0f, 0.0f, () -> Ingredient.of(ModItems.SILVER_INGOT_ITEM.get()));
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ELECTRUM = createArmorMaterial("electrum", 1, 5, 6, 2, 10, 1.0f, 0.0f, () -> Ingredient.of(ModItems.ELECTRUM_INGOT_ITEM.get()));
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BRONZE = createArmorMaterial("bronze", 1, 5, 6, 2, 10, 1.0f, 0.0f, () -> Ingredient.of(ModItems.BRONZE_INGOT_ITEM.get()));
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BRASS = createArmorMaterial("brass", 1, 5, 6, 2, 10, 1.0f, 0.0f, () -> Ingredient.of(ModItems.BRASS_INGOT_ITEM.get()));

    private static DeferredHolder<ArmorMaterial, ArmorMaterial> createArmorMaterial(String name, int bootDefence, int leggingsDefence, int chestplateDefence, int helmetDefence, int enchantmentValue, float toughness, float knockbackResistance, Supplier<Ingredient> ingredient) {
        return ARMOR_MATERIALS.register(name, () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, bootDefence);
            map.put(ArmorItem.Type.LEGGINGS, leggingsDefence);
            map.put(ArmorItem.Type.CHESTPLATE, chestplateDefence);
            map.put(ArmorItem.Type.HELMET, helmetDefence);
        }), enchantmentValue, SoundEvents.ARMOR_EQUIP_IRON, ingredient, List.of(new ArmorMaterial.Layer(ModUtils.getModPath(name))), toughness, knockbackResistance));
    }

    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }
}
