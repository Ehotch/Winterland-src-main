package com.chasem.entity;

import java.util.Map;

import com.chasem.chasemmod.ChasemMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CreatureRegistry
{
	public static void init()
	{
		createEntity(Yeti.class, "yeti", 0xFFFFFF, 0x0078FF);
		createEntity(IceCube.class, "ice_cube", 0x77a9FF, 0x0078FF);
	}

	public static void createEntity(Class entityClass, String nym, int solidColor, int spotColor)
	{
		int id = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, ChasemMod.getUnlocalizedNameForNym(nym), id);
		EntityRegistry.registerModEntity(entityClass, ChasemMod.getUnlocalizedNameForNym(nym), id, ChasemMod.modInstance, 64, 1, true);
		createEgg(id, solidColor, spotColor);
	}

	public static void createEgg(int id, int solidColor, int spotColor)
	{
		EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, solidColor, spotColor));
	}
}
