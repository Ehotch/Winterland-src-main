package com.chasem.entity;

import com.chasem.chasemmod.ChasemMod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSlime;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderIceCube extends RenderSlime
{
	private static final ResourceLocation ice_cube_textures = new ResourceLocation(ChasemMod.MODID + ":" + "textures/entity/ice_cube.png");
	
	public RenderIceCube(RenderManager renderManager)
	{
		super(renderManager, new ModelSlime(16), 0.25F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return ice_cube_textures;
	}
}
