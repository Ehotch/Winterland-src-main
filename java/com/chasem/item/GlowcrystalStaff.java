package com.chasem.item;

import com.chasem.chasemmod.ChasemMod;
import com.chasem.entity.IceCube;
import com.google.common.base.Function;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class GlowcrystalStaff extends Glowcrystal
{
	public GlowcrystalStaff(String nym)
	{
		super(nym);
        this.setMaxStackSize(1);
	}
	
	public boolean hasEffect(ItemStack itemStackIn)
	{
		return true;
	}
	
	public boolean canHeal(EntityLiving entity)
	{
		return entity instanceof IceCube;
	}
	
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
        Block newBlock = worldIn.getBlockState(pos).getBlock();
        //newBlock.setLightLevel(0.9F);
		worldIn.setBlockState(pos, newBlock.getDefaultState());
		return false;
    }
	
	
	
}
