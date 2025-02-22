package com.infamous.dungeons_mobs.client.renderer.ender;

import com.infamous.dungeons_mobs.DungeonsMobs;
import com.infamous.dungeons_mobs.client.models.ender.SnarelingModel;
import com.infamous.dungeons_mobs.client.renderer.layer.GeoEyeLayer;
import com.infamous.dungeons_mobs.entities.ender.AbstractEnderlingEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SnarelingRenderer extends GeoEntityRenderer<AbstractEnderlingEntity> {
	public SnarelingRenderer(EntityRendererManager renderManager) {
		super(renderManager, new SnarelingModel());
		this.addLayer(new GeoEyeLayer<>(this, new ResourceLocation(DungeonsMobs.MODID, "textures/entity/ender/snareling_eyes.png")));
	}

	@Override
	public RenderType getRenderType(AbstractEnderlingEntity animatable, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn,
			ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
