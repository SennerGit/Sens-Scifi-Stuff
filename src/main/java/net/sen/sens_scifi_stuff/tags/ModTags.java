package net.sen.sens_scifi_stuff.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sen.sens_scifi_stuff.SensScifiStuff;
import net.sen.sens_scifi_stuff.utils.ModUtils;

public class ModTags {
    public static class Blocks {
        public static TagKey<Block> TIN_ORES = createTag("tin_ores");
        public static TagKey<Block> ZINC_ORES = createTag("zinc_ores");
        public static TagKey<Block> NICKEL_ORES = createTag("nickel_ores");
        public static TagKey<Block> INVAR_ORES = createTag("invar_ores");
        public static TagKey<Block> LEAD_ORES = createTag("lead_ores");
        public static TagKey<Block> SILVER_ORES = createTag("silver_ores");
        public static TagKey<Block> ELECTRUM_ORES = createTag("electrum_ores");
        public static TagKey<Block> URANIUM_ORES = createTag("uranium_ores");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, ModUtils.getModPath(name));
        }
    }

    public static class Items {
        public static TagKey<Item> RAW_STEEL = createTag("raw_steel");
        public static TagKey<Item> RAW_TIN = createTag("raw_tin");
        public static TagKey<Item> RAW_ZINC = createTag("raw_zinc");
        public static TagKey<Item> RAW_NICKEL = createTag("raw_nickel");
        public static TagKey<Item> RAW_INVAR = createTag("raw_invar");
        public static TagKey<Item> RAW_LEAD = createTag("raw_lead");
        public static TagKey<Item> RAW_SILVER = createTag("raw_silver");
        public static TagKey<Item> RAW_ELECTRUM = createTag("raw_electrum");
        public static TagKey<Item> RAW_URANIUM = createTag("raw_uranium");
        public static TagKey<Item> RAW_BRONZE = createTag("raw_bronze");
        public static TagKey<Item> RAW_BRASS = createTag("raw_brass");

        public static TagKey<Item> INGOTS_STEEL = createTag("ingots_steel");
        public static TagKey<Item> INGOTS_TIN = createTag("ingots_tin");
        public static TagKey<Item> INGOTS_ZINC = createTag("ingots_zinc");
        public static TagKey<Item> INGOTS_NICKEL = createTag("ingots_nickel");
        public static TagKey<Item> INGOTS_INVAR = createTag("ingots_invar");
        public static TagKey<Item> INGOTS_LEAD = createTag("ingots_lead");
        public static TagKey<Item> INGOTS_SILVER = createTag("ingots_silver");
        public static TagKey<Item> INGOTS_ELECTRUM = createTag("ingots_electrum");
        public static TagKey<Item> INGOTS_URANIUM = createTag("ingots_uranium");
        public static TagKey<Item> INGOTS_BRONZE = createTag("ingots_bronze");
        public static TagKey<Item> INGOTS_BRASS = createTag("ingots_brass");

        public static TagKey<Item> NUGGETS_STEEL = createTag("nuggets_steel");
        public static TagKey<Item> NUGGETS_TIN = createTag("nuggets_tin");
        public static TagKey<Item> NUGGETS_ZINC = createTag("nuggets_zinc");
        public static TagKey<Item> NUGGETS_NICKEL = createTag("nuggets_nickel");
        public static TagKey<Item> NUGGETS_INVAR = createTag("nuggets_invar");
        public static TagKey<Item> NUGGETS_LEAD = createTag("nuggets_lead");
        public static TagKey<Item> NUGGETS_SILVER = createTag("nuggets_silver");
        public static TagKey<Item> NUGGETS_ELECTRUM = createTag("nuggets_electrum");
        public static TagKey<Item> NUGGETS_URANIUM = createTag("nuggets_uranium");
        public static TagKey<Item> NUGGETS_BRONZE = createTag("nuggets_bronze");
        public static TagKey<Item> NUGGETS_BRASS = createTag("nuggets_bronze");

        public static TagKey<Item> DUST = createTag("dust");
        public static TagKey<Item> DUST_STEEL = createTag("dust_steel");
        public static TagKey<Item> DUST_TIN = createTag("dust_tin");
        public static TagKey<Item> DUST_ZINC = createTag("dust_zinc");
        public static TagKey<Item> DUST_NICKEL = createTag("dust_nickel");
        public static TagKey<Item> DUST_INVAR = createTag("dust_invar");
        public static TagKey<Item> DUST_LEAD = createTag("dust_lead");
        public static TagKey<Item> DUST_SILVER = createTag("dust_silver");
        public static TagKey<Item> DUST_ELECTRUM = createTag("dust_electrum");
        public static TagKey<Item> DUST_URANIUM = createTag("dust_uranium");
        public static TagKey<Item> DUST_BRONZE = createTag("dust_bronze");
        public static TagKey<Item> DUST_BRASS = createTag("dust_bronze");

        public static TagKey<Item> TIN_ORES = createTag("tin_ores");
        public static TagKey<Item> ZINC_ORES = createTag("zinc_ores");
        public static TagKey<Item> NICKEL_ORES = createTag("nickel_ores");
        public static TagKey<Item> INVAR_ORES = createTag("invar_ores");
        public static TagKey<Item> LEAD_ORES = createTag("lead_ores");
        public static TagKey<Item> SILVER_ORES = createTag("silver_ores");
        public static TagKey<Item> ELECTRUM_ORES = createTag("electrum_ores");
        public static TagKey<Item> URANIUM_ORES = createTag("uranium_ores");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, ModUtils.getModPath(name));
        }
    }

    public static class EntityTypes {
        private static TagKey<EntityType<?>> createTag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, ModUtils.getModPath(name));
        }
    }
}
