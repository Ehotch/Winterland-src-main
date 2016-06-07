package com.chasem.block;

import java.util.Random;

import com.chasem.chasemmod.ChasemMod;
import com.chasem.item.ItemRegistry;

import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class GlowcrystalOre extends BlockGlowstone
{
	public GlowcrystalOre(String nym, Material m)
	{
		super(m);
		this.setCreativeTab(ChasemMod.winterland_tab);
		this.setUnlocalizedName(ChasemMod.getUnlocalizedNameForNym(nym));
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ItemRegistry.glowcrystal;
	}
}
