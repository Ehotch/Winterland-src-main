package com.chasem.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistry
{
	public static final Material icy_material = new Material(MapColor.iceColor);
	public static final Material glowcrystal_material = new Material(MapColor.emeraldColor);
	
	public static final IcyBlock icy_block = new IcyBlock("icy_block", icy_material);
	public static final GlowcrystalOre  glowcrystal_ore = new GlowcrystalOre("glowcrystal_ore", glowcrystal_material);
	public static final GlowcrystalTorch glowcrystal_torch = new GlowcrystalTorch("glowcrystal_torch");

	public static void init()
	{
		GameRegistry.registerBlock(icy_block, "icy_block");
		GameRegistry.registerBlock(glowcrystal_ore, "glowcrystal_ore");
		GameRegistry.registerBlock(glowcrystal_torch, "glowcrystal_torch");
	}
}
