package net.sen.sens_scifi_stuff.client.entities.renderers;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sen.sens_scifi_stuff.entities.SpeederEntity;

public class SpeederRenderer extends EntityRenderer<SpeederEntity> {
    public SpeederRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public void render(SpeederEntity p_entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        super.render(p_entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(SpeederEntity entity) {
        return null;
    }
}
