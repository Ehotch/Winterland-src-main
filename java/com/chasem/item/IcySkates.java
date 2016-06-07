package com.chasem.item;

import com.chasem.chasemmod.ChasemMod;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class IcySkates extends IcyArmor
{
	public IcySkates(String nym, ArmorMaterial material)
	{
		super(nym, material, 3, 1);
	}
	
	public void onArmorTick(World worldIn, EntityPlayer playerIn, ItemStack itemStackIn)
	{
		super.onArmorTick(worldIn, playerIn, itemStackIn);
		playerIn.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 2));
		
		for (int d = 0; d < 4; d++)
		{
            int a = MathHelper.floor_double(playerIn.posX + (double)((float)(d % 2 * 2 - 1) * 0.25F));
            int b = MathHelper.floor_double(playerIn.posY);
            int c = MathHelper.floor_double(playerIn.posZ + (double)((float)(d / 2 % 2 * 2 - 1) * 0.25F));
            int e = b - 1;
            
            BlockPos blockPosIn = new BlockPos(a, b, c);
            BlockPos blockPosOn = new BlockPos(a, e, c);
            
            if (playerIn.worldObj.getBlockState(blockPosOn).getBlock() == Blocks.ice)
            {
	            playerIn.moveEntity(playerIn.motionX * 2, playerIn.motionY * 2, playerIn.motionZ * 2);
            }
            
            if (playerIn.worldObj.getBlockState(blockPosOn).getBlock() == Blocks.water && Blocks.ice.canPlaceBlockAt(playerIn.worldObj, blockPosIn))
            {
            	playerIn.worldObj.setBlockState(blockPosOn, Blocks.ice.getDefaultState());
            }
            
            if (playerIn.worldObj.getBlockState(blockPosIn).getBlock().getMaterial() == Material.air && Blocks.snow_layer.canPlaceBlockAt(playerIn.worldObj, blockPosIn))
            {
            	playerIn.worldObj.setBlockState(blockPosIn, Blocks.snow_layer.getDefaultState());
            }
        }
	}
}
