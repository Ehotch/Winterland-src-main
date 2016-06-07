package com.chasem.block;

import com.chasem.chasemmod.ChasemMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IcyBlock extends Block
{
	public IcyBlock(String nym, Material m)
	{
		super(m);
		this.setCreativeTab(ChasemMod.winterland_tab);
		this.lightOpacity = 1;
		this.slipperiness = 0.5F;
		this.blockHardness = 1.0F;
		this.setUnlocalizedName(ChasemMod.getUnlocalizedNameForNym(nym));
	}
	
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.TRANSLUCENT;
	}
}
