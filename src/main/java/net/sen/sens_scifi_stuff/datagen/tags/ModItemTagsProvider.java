package net.sen.sens_scifi_stuff.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sen.sens_scifi_stuff.SensScifiStuff;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;
import net.sen.sens_scifi_stuff.tags.ModTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SensScifiStuff.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        ModTags();
        VanillaTags();
        ForgeTags();
    }

    private void ModTags() {
        this.tag(ModTags.Items.RAW_STEEL).add(ModItems.RAW_STEEL_MIX_ITEM.get());
        this.tag(ModTags.Items.RAW_TIN).add(ModItems.RAW_TIN_ITEM.get());
        this.tag(ModTags.Items.RAW_ZINC).add(ModItems.RAW_ZINC_ITEM.get());
        this.tag(ModTags.Items.RAW_NICKEL).add(ModItems.RAW_NICKEL_ITEM.get());
        this.tag(ModTags.Items.RAW_INVAR).add(ModItems.RAW_INVAR_ITEM.get());
        this.tag(ModTags.Items.RAW_LEAD).add(ModItems.RAW_LEAD_ITEM.get());
        this.tag(ModTags.Items.RAW_SILVER).add(ModItems.RAW_SILVER_ITEM.get());
        this.tag(ModTags.Items.RAW_ELECTRUM).add(ModItems.RAW_ELECTRUM_ITEM.get());
        this.tag(ModTags.Items.RAW_URANIUM).add(ModItems.RAW_URANIUM_ITEM.get());
        this.tag(ModTags.Items.RAW_BRONZE).add(ModItems.RAW_BRONZE_MIX_ITEM.get());
        this.tag(ModTags.Items.RAW_BRASS).add(ModItems.RAW_BRASS_MIX_ITEM.get());

        this.tag(ModTags.Items.INGOTS_STEEL).add(ModItems.STEEL_INGOT_ITEM.get());
        this.tag(ModTags.Items.INGOTS_TIN).add(ModItems.TIN_INGOT_ITEM.get());
        this.tag(ModTags.Items.INGOTS_ZINC).add(ModItems.ZINC_INGOT_ITEM.get());
        this.tag(ModTags.Items.INGOTS_NICKEL).add(ModItems.NICKEL_INGOT_ITEM.get());
        this.tag(ModTags.Items.INGOTS_INVAR).add(ModItems.INVAR_INGOT_ITEM.get());
        this.tag(ModTags.Items.INGOTS_LEAD).add(ModItems.LEAD_INGOT_ITEM.get());
        this.tag(ModTags.Items.INGOTS_SILVER).add(ModItems.SILVER_INGOT_ITEM.get());
        this.tag(ModTags.Items.INGOTS_ELECTRUM).add(ModItems.ELECTRUM_INGOT_ITEM.get());
        this.tag(ModTags.Items.INGOTS_URANIUM).add(ModItems.URANIUM_INGOT_ITEM.get());
        this.tag(ModTags.Items.INGOTS_BRONZE).add(ModItems.BRONZE_INGOT_ITEM.get());
        this.tag(ModTags.Items.INGOTS_BRASS).add(ModItems.BRASS_INGOT_ITEM.get());

        this.tag(ModTags.Items.NUGGETS_STEEL).add(ModItems.STEEL_NUGGET_ITEM.get());
        this.tag(ModTags.Items.NUGGETS_TIN).add(ModItems.TIN_NUGGET_ITEM.get());
        this.tag(ModTags.Items.NUGGETS_ZINC).add(ModItems.ZINC_NUGGET_ITEM.get());
        this.tag(ModTags.Items.NUGGETS_NICKEL).add(ModItems.NICKEL_NUGGET_ITEM.get());
        this.tag(ModTags.Items.NUGGETS_INVAR).add(ModItems.INVAR_NUGGET_ITEM.get());
        this.tag(ModTags.Items.NUGGETS_LEAD).add(ModItems.LEAD_NUGGET_ITEM.get());
        this.tag(ModTags.Items.NUGGETS_SILVER).add(ModItems.SILVER_NUGGET_ITEM.get());
        this.tag(ModTags.Items.NUGGETS_ELECTRUM).add(ModItems.ELECTRUM_NUGGET_ITEM.get());
        this.tag(ModTags.Items.NUGGETS_URANIUM).add(ModItems.URANIUM_NUGGET_ITEM.get());
        this.tag(ModTags.Items.NUGGETS_BRONZE).add(ModItems.BRONZE_NUGGET_ITEM.get());
        this.tag(ModTags.Items.NUGGETS_BRASS).add(ModItems.BRASS_NUGGET_ITEM.get());

        this.tag(ModTags.Items.DUST_STEEL).add(ModItems.STEEL_DUST_ITEM.get());
        this.tag(ModTags.Items.DUST_TIN).add(ModItems.TIN_DUST_ITEM.get());
        this.tag(ModTags.Items.DUST_ZINC).add(ModItems.ZINC_DUST_ITEM.get());
        this.tag(ModTags.Items.DUST_NICKEL).add(ModItems.NICKEL_DUST_ITEM.get());
        this.tag(ModTags.Items.DUST_INVAR).add(ModItems.INVAR_DUST_ITEM.get());
        this.tag(ModTags.Items.DUST_LEAD).add(ModItems.LEAD_DUST_ITEM.get());
        this.tag(ModTags.Items.DUST_SILVER).add(ModItems.SILVER_DUST_ITEM.get());
        this.tag(ModTags.Items.DUST_ELECTRUM).add(ModItems.ELECTRUM_DUST_ITEM.get());
        this.tag(ModTags.Items.DUST_URANIUM).add(ModItems.URANIUM_DUST_ITEM.get());
        this.tag(ModTags.Items.DUST_BRONZE).add(ModItems.BRONZE_DUST_ITEM.get());
        this.tag(ModTags.Items.DUST_BRASS).add(ModItems.BRASS_DUST_ITEM.get());

        this.copy(ModTags.Blocks.TIN_ORES, ModTags.Items.TIN_ORES);
        this.copy(ModTags.Blocks.ZINC_ORES, ModTags.Items.ZINC_ORES);
        this.copy(ModTags.Blocks.NICKEL_ORES, ModTags.Items.NICKEL_ORES);
        this.copy(ModTags.Blocks.INVAR_ORES, ModTags.Items.INVAR_ORES);
        this.copy(ModTags.Blocks.LEAD_ORES, ModTags.Items.LEAD_ORES);
        this.copy(ModTags.Blocks.SILVER_ORES, ModTags.Items.SILVER_ORES);
        this.copy(ModTags.Blocks.ELECTRUM_ORES, ModTags.Items.ELECTRUM_ORES);
        this.copy(ModTags.Blocks.URANIUM_ORES, ModTags.Items.URANIUM_ORES);

        this.tag(ModTags.Items.DUST).addTags(
                ModTags.Items.DUST_STEEL,
                ModTags.Items.DUST_TIN,
                ModTags.Items.DUST_ZINC,
                ModTags.Items.DUST_NICKEL,
                ModTags.Items.DUST_INVAR,
                ModTags.Items.DUST_LEAD,
                ModTags.Items.DUST_SILVER,
                ModTags.Items.DUST_ELECTRUM,
                ModTags.Items.DUST_URANIUM,
                ModTags.Items.DUST_BRONZE,
                ModTags.Items.DUST_BRASS
        );
    }

    private void VanillaTags() {
        this.tag(ItemTags.SWORDS).add(
                ModItems.STEEL_SWORD_ITEM.get(),
                ModItems.TIN_SWORD_ITEM.get(),
                ModItems.ZINC_SWORD_ITEM.get(),
                ModItems.NICKEL_SWORD_ITEM.get(),
                ModItems.INVAR_SWORD_ITEM.get(),
                ModItems.LEAD_SWORD_ITEM.get(),
                ModItems.SILVER_SWORD_ITEM.get(),
                ModItems.ELECTRUM_SWORD_ITEM.get(),
                ModItems.BRONZE_SWORD_ITEM.get(),
                ModItems.BRASS_SWORD_ITEM.get()
        );

        this.tag(ItemTags.PICKAXES).add(
                ModItems.STEEL_PICKAXE_ITEM.get(),
                ModItems.TIN_PICKAXE_ITEM.get(),
                ModItems.ZINC_PICKAXE_ITEM.get(),
                ModItems.NICKEL_PICKAXE_ITEM.get(),
                ModItems.INVAR_PICKAXE_ITEM.get(),
                ModItems.LEAD_PICKAXE_ITEM.get(),
                ModItems.SILVER_PICKAXE_ITEM.get(),
                ModItems.ELECTRUM_PICKAXE_ITEM.get(),
                ModItems.BRONZE_PICKAXE_ITEM.get(),
                ModItems.BRASS_PICKAXE_ITEM.get()
        );

        this.tag(ItemTags.CLUSTER_MAX_HARVESTABLES).add(
                ModItems.STEEL_PICKAXE_ITEM.get(),
                ModItems.TIN_PICKAXE_ITEM.get(),
                ModItems.ZINC_PICKAXE_ITEM.get(),
                ModItems.NICKEL_PICKAXE_ITEM.get(),
                ModItems.INVAR_PICKAXE_ITEM.get(),
                ModItems.LEAD_PICKAXE_ITEM.get(),
                ModItems.SILVER_PICKAXE_ITEM.get(),
                ModItems.ELECTRUM_PICKAXE_ITEM.get(),
                ModItems.BRONZE_PICKAXE_ITEM.get(),
                ModItems.BRASS_PICKAXE_ITEM.get()
        );

        this.tag(ItemTags.AXES).add(
                ModItems.STEEL_AXE_ITEM.get(),
                ModItems.TIN_AXE_ITEM.get(),
                ModItems.ZINC_AXE_ITEM.get(),
                ModItems.NICKEL_AXE_ITEM.get(),
                ModItems.INVAR_AXE_ITEM.get(),
                ModItems.LEAD_AXE_ITEM.get(),
                ModItems.SILVER_AXE_ITEM.get(),
                ModItems.ELECTRUM_AXE_ITEM.get(),
                ModItems.BRONZE_AXE_ITEM.get(),
                ModItems.BRASS_AXE_ITEM.get()
        );

        this.tag(ItemTags.SHOVELS).add(
                ModItems.STEEL_SHOVEL_ITEM.get(),
                ModItems.TIN_SHOVEL_ITEM.get(),
                ModItems.ZINC_SHOVEL_ITEM.get(),
                ModItems.NICKEL_SHOVEL_ITEM.get(),
                ModItems.INVAR_SHOVEL_ITEM.get(),
                ModItems.LEAD_SHOVEL_ITEM.get(),
                ModItems.SILVER_SHOVEL_ITEM.get(),
                ModItems.ELECTRUM_SHOVEL_ITEM.get(),
                ModItems.BRONZE_SHOVEL_ITEM.get(),
                ModItems.BRASS_SHOVEL_ITEM.get()
        );

        this.tag(ItemTags.HOES).add(
                ModItems.STEEL_HOE_ITEM.get(),
                ModItems.TIN_HOE_ITEM.get(),
                ModItems.ZINC_HOE_ITEM.get(),
                ModItems.NICKEL_HOE_ITEM.get(),
                ModItems.INVAR_HOE_ITEM.get(),
                ModItems.LEAD_HOE_ITEM.get(),
                ModItems.SILVER_HOE_ITEM.get(),
                ModItems.ELECTRUM_HOE_ITEM.get(),
                ModItems.BRONZE_HOE_ITEM.get(),
                ModItems.BRASS_HOE_ITEM.get()
        );
    }

    private void ForgeTags() {
        this.tag(Tags.Items.TOOLS_SHIELD).add(
                ModItems.STEEL_SHIELD_ITEM.get(),
                ModItems.TIN_SHIELD_ITEM.get(),
                ModItems.ZINC_SHIELD_ITEM.get(),
                ModItems.NICKEL_SHIELD_ITEM.get(),
                ModItems.INVAR_SHIELD_ITEM.get(),
                ModItems.LEAD_SHIELD_ITEM.get(),
                ModItems.SILVER_SHIELD_ITEM.get(),
                ModItems.ELECTRUM_SHIELD_ITEM.get(),
                ModItems.BRONZE_SHIELD_ITEM.get(),
                ModItems.BRASS_SHIELD_ITEM.get()
        );

        this.tag(Tags.Items.ARMORS).add(
                ModItems.STEEL_BOOTS_ITEM.get(), ModItems.STEEL_LEGGINGS_ITEM.get(), ModItems.STEEL_CHESTPLATE_ITEM.get(), ModItems.STEEL_HELMET_ITEM.get(),
                ModItems.TIN_BOOTS_ITEM.get(), ModItems.TIN_LEGGINGS_ITEM.get(), ModItems.TIN_CHESTPLATE_ITEM.get(), ModItems.TIN_HELMET_ITEM.get(),
                ModItems.ZINC_BOOTS_ITEM.get(), ModItems.ZINC_LEGGINGS_ITEM.get(), ModItems.ZINC_CHESTPLATE_ITEM.get(), ModItems.ZINC_HELMET_ITEM.get(),
                ModItems.NICKEL_BOOTS_ITEM.get(), ModItems.NICKEL_LEGGINGS_ITEM.get(), ModItems.NICKEL_CHESTPLATE_ITEM.get(), ModItems.NICKEL_HELMET_ITEM.get(),
                ModItems.INVAR_BOOTS_ITEM.get(), ModItems.INVAR_LEGGINGS_ITEM.get(), ModItems.INVAR_CHESTPLATE_ITEM.get(), ModItems.INVAR_HELMET_ITEM.get(),
                ModItems.LEAD_BOOTS_ITEM.get(), ModItems.LEAD_LEGGINGS_ITEM.get(), ModItems.LEAD_CHESTPLATE_ITEM.get(), ModItems.LEAD_HELMET_ITEM.get(),
                ModItems.SILVER_BOOTS_ITEM.get(), ModItems.SILVER_LEGGINGS_ITEM.get(), ModItems.SILVER_CHESTPLATE_ITEM.get(), ModItems.SILVER_HELMET_ITEM.get(),
                ModItems.ELECTRUM_BOOTS_ITEM.get(), ModItems.ELECTRUM_LEGGINGS_ITEM.get(), ModItems.ELECTRUM_CHESTPLATE_ITEM.get(), ModItems.ELECTRUM_HELMET_ITEM.get(),
                ModItems.BRONZE_BOOTS_ITEM.get(), ModItems.BRONZE_LEGGINGS_ITEM.get(), ModItems.BRONZE_CHESTPLATE_ITEM.get(), ModItems.BRONZE_HELMET_ITEM.get(),
                ModItems.BRASS_BOOTS_ITEM.get(), ModItems.BRASS_LEGGINGS_ITEM.get(), ModItems.BRASS_CHESTPLATE_ITEM.get(), ModItems.BRASS_HELMET_ITEM.get()
        );

        this.tag(ItemTags.HEAD_ARMOR).add(
                ModItems.STEEL_HELMET_ITEM.get(),
                ModItems.TIN_HELMET_ITEM.get(),
                ModItems.ZINC_HELMET_ITEM.get(),
                ModItems.NICKEL_HELMET_ITEM.get(),
                ModItems.INVAR_HELMET_ITEM.get(),
                ModItems.LEAD_HELMET_ITEM.get(),
                ModItems.SILVER_HELMET_ITEM.get(),
                ModItems.ELECTRUM_HELMET_ITEM.get(),
                ModItems.BRONZE_HELMET_ITEM.get(),
                ModItems.BRASS_HELMET_ITEM.get()
        );

        this.tag(ItemTags.CHEST_ARMOR).add(
                ModItems.STEEL_CHESTPLATE_ITEM.get(),
                ModItems.TIN_CHESTPLATE_ITEM.get(),
                ModItems.ZINC_CHESTPLATE_ITEM.get(),
                ModItems.NICKEL_CHESTPLATE_ITEM.get(),
                ModItems.INVAR_CHESTPLATE_ITEM.get(),
                ModItems.LEAD_CHESTPLATE_ITEM.get(),
                ModItems.SILVER_CHESTPLATE_ITEM.get(),
                ModItems.ELECTRUM_CHESTPLATE_ITEM.get(),
                ModItems.BRONZE_CHESTPLATE_ITEM.get(),
                ModItems.BRASS_CHESTPLATE_ITEM.get()
        );

        this.tag(ItemTags.LEG_ARMOR).add(
                ModItems.STEEL_LEGGINGS_ITEM.get(),
                ModItems.TIN_LEGGINGS_ITEM.get(),
                ModItems.ZINC_LEGGINGS_ITEM.get(),
                ModItems.NICKEL_LEGGINGS_ITEM.get(),
                ModItems.INVAR_LEGGINGS_ITEM.get(),
                ModItems.LEAD_LEGGINGS_ITEM.get(),
                ModItems.SILVER_LEGGINGS_ITEM.get(),
                ModItems.ELECTRUM_LEGGINGS_ITEM.get(),
                ModItems.BRONZE_LEGGINGS_ITEM.get(),
                ModItems.BRASS_LEGGINGS_ITEM.get()
        );

        this.tag(ItemTags.FOOT_ARMOR).add(
                ModItems.STEEL_BOOTS_ITEM.get(),
                ModItems.TIN_BOOTS_ITEM.get(),
                ModItems.ZINC_BOOTS_ITEM.get(),
                ModItems.NICKEL_BOOTS_ITEM.get(),
                ModItems.INVAR_BOOTS_ITEM.get(),
                ModItems.LEAD_BOOTS_ITEM.get(),
                ModItems.SILVER_BOOTS_ITEM.get(),
                ModItems.ELECTRUM_BOOTS_ITEM.get(),
                ModItems.BRONZE_BOOTS_ITEM.get(),
                ModItems.BRASS_BOOTS_ITEM.get()
        );

        this.tag(Tags.Items.RAW_MATERIALS).addTags(
                ModTags.Items.RAW_STEEL,
                ModTags.Items.RAW_TIN,
                ModTags.Items.RAW_ZINC,
                ModTags.Items.RAW_NICKEL,
                ModTags.Items.RAW_INVAR,
                ModTags.Items.RAW_LEAD,
                ModTags.Items.RAW_SILVER,
                ModTags.Items.RAW_ELECTRUM,
                ModTags.Items.RAW_URANIUM,
                ModTags.Items.RAW_BRONZE,
                ModTags.Items.RAW_BRASS
        );

        this.tag(Tags.Items.ORES).addTags(
                ModTags.Items.TIN_ORES,
                ModTags.Items.ZINC_ORES,
                ModTags.Items.NICKEL_ORES,
                ModTags.Items.INVAR_ORES,
                ModTags.Items.LEAD_ORES,
                ModTags.Items.SILVER_ORES,
                ModTags.Items.ELECTRUM_ORES,
                ModTags.Items.URANIUM_ORES
        );

        this.tag(Tags.Items.NUGGETS).addTags(
                ModTags.Items.NUGGETS_STEEL,
                ModTags.Items.NUGGETS_TIN,
                ModTags.Items.NUGGETS_ZINC,
                ModTags.Items.NUGGETS_NICKEL,
                ModTags.Items.NUGGETS_INVAR,
                ModTags.Items.NUGGETS_LEAD,
                ModTags.Items.NUGGETS_SILVER,
                ModTags.Items.NUGGETS_ELECTRUM,
                ModTags.Items.NUGGETS_URANIUM,
                ModTags.Items.NUGGETS_BRONZE,
                ModTags.Items.NUGGETS_BRASS
        );
    }
}
