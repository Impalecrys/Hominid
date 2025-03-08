package com.alganaut.hominid.registry.entity.client;

import com.alganaut.hominid.Hominid;
import com.alganaut.hominid.registry.entity.client.layer.HominidModelLayers;
import com.alganaut.hominid.registry.entity.custom.Famished;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FamishedRenderer extends MobRenderer<Famished, FamishedModel<Famished>> {
    private static final ResourceLocation LOCATION = ResourceLocation.fromNamespaceAndPath(Hominid.MODID, "textures/entity/famished/famished.png");
    public FamishedRenderer(EntityRendererProvider.Context context) {
        super(context, new FamishedModel<>(context.bakeLayer(HominidModelLayers.FAMISHED)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Famished famished) {
        return LOCATION;
    }
}