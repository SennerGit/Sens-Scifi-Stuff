package net.sen.sens_scifi_stuff.datagen.language;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.function.Supplier;

public abstract class LanguageProviderHelper extends LanguageProvider {
    public LanguageProviderHelper(PackOutput output, String locale) {
        super(output, ModUtils.getModId(), locale);
    }

    protected void addCreativeTab(Supplier<CreativeModeTab> creativeTab, String translation) {
        add("itemgroup." + (BuiltInRegistries.CREATIVE_MODE_TAB.getKey(creativeTab.get()).getPath()), translation);
    }
}
