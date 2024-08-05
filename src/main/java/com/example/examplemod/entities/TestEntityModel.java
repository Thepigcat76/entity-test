package com.example.examplemod.entities;

import com.example.examplemod.ExampleMod;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class TestEntityModel extends EntityModel<TestEntity> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "test"), "main");
    private final ModelPart main;
    private final ModelPart leg3;
    private final ModelPart leg0;
    private final ModelPart leg2;
    private final ModelPart head;
    private final ModelPart leg1;

    public TestEntityModel(ModelPart root) {
        this.main = root.getChild("main");
        this.leg3 = main.getChild("leg3");
        this.leg0 = main.getChild("leg0");
        this.leg2 = main.getChild("leg2");
        this.head = main.getChild("head");
        this.leg1 = main.getChild("leg1");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(5.0F, 24.0F, 3.0F));

        PartDefinition leg3 = main.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(34, 32).addBox(-2.0F, -13.0F, -8.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, 0.0F));

        PartDefinition leg0 = main.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(42, 15).addBox(3.0F, -5.0F, -5.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -8.0F, -3.0F));

        PartDefinition leg2 = main.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(26, 32).addBox(-10.0F, -13.0F, 0.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition head = main.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -16.0F, -9.0F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 15).addBox(-10.0F, -23.0F, -8.0F, 11.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 32).addBox(1.0F, -22.0F, -7.0F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition leg1 = main.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(18, 32).addBox(-2.0F, -13.0F, 0.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(TestEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack pPoseStack, VertexConsumer pBuffer, int pPackedLight, int pPackedOverlay, int pColor) {
        main.render(pPoseStack, pBuffer, pPackedLight, pPackedOverlay, pColor);
    }
}