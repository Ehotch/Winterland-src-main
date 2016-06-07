package com.chasem.entity;

import com.chasem.chasemmod.ChasemMod;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderYeti extends RenderZombie
{
	private static final ResourceLocation yeti_textures = new ResourceLocation(ChasemMod.MODID + ":" + "textures/entity/yeti.png");
	
	public RenderYeti(RenderManager renderManager)
	{
		super(renderManager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return yeti_textures;
	}
}
