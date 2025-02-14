package com.infamous.dungeons_mobs.client.renderer.summonables;

import com.infamous.dungeons_mobs.client.models.summonables.TornadoModel;
import com.infamous.dungeons_mobs.entities.summonables.Tornado2Entity;
import com.infamous.dungeons_mobs.entities.summonables.TornadoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.renderers.geo.GeoProjectilesRenderer;

public class Tornado2Renderer extends GeoEntityRenderer<Tornado2Entity> {
    public Tornado2Renderer(EntityRendererManager renderManager) {
        super(renderManager, new TornadoModel());
        //  this.addLayer(new GeoEyeLayer<>(this, new ResourceLocation(DungeonsMobs.MODID, "textures/entity/enchanter/enchanter_eyes.png")));
        //this.addLayer(new GeoHeldItemLayer<>(this, 0.0, 0.0, 0.5));
    }

    @Override
    public void render(Tornado2Entity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {

        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    @Override
    public RenderType getRenderType(Tornado2Entity animatable, float partialTicks, MatrixStack stack,
                                    IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}