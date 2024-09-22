package net.sen.sens_scifi_stuff.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sen.sens_scifi_stuff.SensScifiStuff;
import net.sen.sens_scifi_stuff.blocks.ModBlocks;
import net.sen.sens_scifi_stuff.items.ModItems;
import net.sen.sens_scifi_stuff.tags.ModTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SensScifiStuff.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        ModTags();
        VanillaTags();
        ForgeTags();
    }

    private void ModTags() {
        this.tag(ModTags.Blocks.TIN_ORES).add(ModBlocks.ORE_TIN_BLOCK.get());
        this.tag(ModTags.Blocks.ZINC_ORES).add(ModBlocks.ORE_ZINC_BLOCK.get());
        this.tag(ModTags.Blocks.NICKEL_ORES).add(ModBlocks.ORE_NICKEL_BLOCK.get());
        this.tag(ModTags.Blocks.INVAR_ORES).add(ModBlocks.ORE_INVAR_BLOCK.get());
        this.tag(ModTags.Blocks.LEAD_ORES).add(ModBlocks.ORE_LEAD_BLOCK.get());
        this.tag(ModTags.Blocks.SILVER_ORES).add(ModBlocks.ORE_SILVER_BLOCK.get());
        this.tag(ModTags.Blocks.ELECTRUM_ORES).add(ModBlocks.ORE_ELECTRUM_BLOCK.get());
        this.tag(ModTags.Blocks.URANIUM_ORES).add(ModBlocks.ORE_URANIUM_BLOCK.get());
    }

    private void VanillaTags() {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.ORE_TIN_BLOCK.get(),
                ModBlocks.ORE_ZINC_BLOCK.get(),
                ModBlocks.ORE_NICKEL_BLOCK.get(),
                ModBlocks.ORE_INVAR_BLOCK.get(),
                ModBlocks.ORE_LEAD_BLOCK.get(),
                ModBlocks.ORE_SILVER_BLOCK.get(),
                ModBlocks.ORE_ELECTRUM_BLOCK.get(),
                ModBlocks.ORE_URANIUM_BLOCK.get(),

                ModBlocks.STEEL_BLOCK.get(),
                ModBlocks.TIN_BLOCK.get(),
                ModBlocks.ZINC_BLOCK.get(),
                ModBlocks.NICKEL_BLOCK.get(),
                ModBlocks.INVAR_BLOCK.get(),
                ModBlocks.LEAD_BLOCK.get(),
                ModBlocks.SILVER_BLOCK.get(),
                ModBlocks.ELECTRUM_BLOCK.get(),
                ModBlocks.URANIUM_BLOCK.get(),
                ModBlocks.BRONZE_BLOCK.get(),
                ModBlocks.BRASS_BLOCK.get(),

                ModBlocks.RAW_TIN_BLOCK.get(),
                ModBlocks.RAW_ZINC_BLOCK.get(),
                ModBlocks.RAW_NICKEL_BLOCK.get(),
                ModBlocks.RAW_INVAR_BLOCK.get(),
                ModBlocks.RAW_LEAD_BLOCK.get(),
                ModBlocks.RAW_SILVER_BLOCK.get(),
                ModBlocks.RAW_ELECTRUM_BLOCK.get(),
                ModBlocks.RAW_URANIUM_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.ORE_TIN_BLOCK.get(),
                ModBlocks.ORE_ZINC_BLOCK.get(),
                ModBlocks.ORE_NICKEL_BLOCK.get(),
                ModBlocks.ORE_INVAR_BLOCK.get(),
                ModBlocks.TIN_BLOCK.get(),
                ModBlocks.ZINC_BLOCK.get(),
                ModBlocks.NICKEL_BLOCK.get(),
                ModBlocks.INVAR_BLOCK.get(),
                ModBlocks.RAW_TIN_BLOCK.get(),
                ModBlocks.RAW_ZINC_BLOCK.get(),
                ModBlocks.RAW_NICKEL_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.ORE_INVAR_BLOCK.get(),
                ModBlocks.ORE_LEAD_BLOCK.get(),
                ModBlocks.ORE_SILVER_BLOCK.get(),
                ModBlocks.ORE_ELECTRUM_BLOCK.get(),
                ModBlocks.ORE_URANIUM_BLOCK.get(),
                ModBlocks.STEEL_BLOCK.get(),
                ModBlocks.INVAR_BLOCK.get(),
                ModBlocks.LEAD_BLOCK.get(),
                ModBlocks.SILVER_BLOCK.get(),
                ModBlocks.ELECTRUM_BLOCK.get(),
                ModBlocks.URANIUM_BLOCK.get(),
                ModBlocks.BRONZE_BLOCK.get(),
                ModBlocks.BRASS_BLOCK.get(),
                ModBlocks.RAW_INVAR_BLOCK.get(),
                ModBlocks.RAW_LEAD_BLOCK.get(),
                ModBlocks.RAW_SILVER_BLOCK.get(),
                ModBlocks.RAW_ELECTRUM_BLOCK.get(),
                ModBlocks.RAW_URANIUM_BLOCK.get()
        );
    }

    private void ForgeTags() {
        this.tag(Tags.Blocks.ORES).addTags(
                ModTags.Blocks.TIN_ORES,
                ModTags.Blocks.ZINC_ORES,
                ModTags.Blocks.NICKEL_ORES,
                ModTags.Blocks.INVAR_ORES,
                ModTags.Blocks.LEAD_ORES,
                ModTags.Blocks.SILVER_ORES,
                ModTags.Blocks.ELECTRUM_ORES,
                ModTags.Blocks.URANIUM_ORES
        );

    }
}
