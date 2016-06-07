package com.chasem.entity;

import com.chasem.item.ItemRegistry;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class Yeti extends EntityZombie
{
	public Yeti(World worldIn)
	{
        super(worldIn);
        this.setHealth(20);
        this.isImmuneToFire = true;
        this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityBlaze.class, true));
    }
	
	@Override
	protected void dropFewItems(boolean bool, int num)
	{
		this.dropItem(ItemRegistry.icy_skates, 1);
    }
	
	protected void func_180481_a(DifficultyInstance p_180481_1_)
	{
        this.setCurrentItemOrArmor(0, new ItemStack(ItemRegistry.icy_sword));
    }
	
	public void onLivingUpdate()
	{
        super.onLivingUpdate();
        this.powers(this);
    }
	
	public static void powers(EntityLivingBase entityIn)
	{
		entityIn.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 1));
		
		if (!entityIn.worldObj.isRemote)
		{
			for (int d = 0; d < 4; d++) {
	            int a = MathHelper.floor_double(entityIn.posX + (double)((float)(d % 2 * 2 - 1) * 0.25F));
	            int b = MathHelper.floor_double(entityIn.posY);
	            int c = MathHelper.floor_double(entityIn.posZ + (double)((float)(d / 2 % 2 * 2 - 1) * 0.25F));
	            int e = b - 1;
	            
	            BlockPos blockPosIn = new BlockPos(a, b, c);
	            BlockPos blockPosOn = new BlockPos(a, e, c);
	            
	            if (entityIn.worldObj.getBlockState(blockPosOn).getBlock() == Blocks.ice)
	            {
		            entityIn.moveEntity(entityIn.motionX * 2, entityIn.motionY * 2, entityIn.motionZ * 2);
	            }
	            
	            if (entityIn.worldObj.getBlockState(blockPosOn).getBlock() == Blocks.water && Blocks.ice.canPlaceBlockAt(entityIn.worldObj, blockPosIn))
	            {
	            	entityIn.worldObj.setBlockState(blockPosOn, Blocks.ice.getDefaultState());
	            }
	            
	            if (entityIn.worldObj.getBlockState(blockPosIn).getBlock().getMaterial() == Material.air && Blocks.snow_layer.canPlaceBlockAt(entityIn.worldObj, blockPosIn))
	            {
	            	entityIn.worldObj.setBlockState(blockPosIn, Blocks.snow_layer.getDefaultState());
	            }
			}
        }
	}
}
