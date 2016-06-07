package com.chasem.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BiomeRegistry
{
//	public static final IWorldGenerator glowcrystal_ore_generator = new GlowcrystalOreGen();

	public static final WinterlandBiome winterland_biome = new WinterlandBiome(60, true);

	public static void init()
	{
//		GameRegistry.registerWorldGenerator(glowcrystalOreGen, 0);
	}
}
