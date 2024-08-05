package com.example.examplemod.entities;

import com.example.examplemod.ExampleMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class TestEntityRenderer extends MobRenderer<TestEntity, TestEntityModel> {
    private static final ResourceLocation BEE_TEXTURE = ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "textures/entity/test.png");

    public TestEntityRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new TestEntityModel(pContext.bakeLayer(TestEntityModel.LAYER_LOCATION)), 2f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(TestEntity pEntity) {
        return BEE_TEXTURE;
    }
}
