package net.sen.sens_scifi_stuff.client.entities;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.sen.sens_scifi_stuff.client.entities.renderers.SpeederRenderer;
import net.sen.sens_scifi_stuff.entities.ModEntities;

public class ModEntityRenderersRegistry {
    public static void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            EntityRenderers.register(ModEntities.SPEEDER_ENTITY.get(), SpeederRenderer::new);
        });
    }
}
