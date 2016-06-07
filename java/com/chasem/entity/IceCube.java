package com.chasem.entity;

import com.chasem.block.BlockRegistry;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IceCube extends EntitySlime
{
    public IceCube(World worldIn)
    {
        super(worldIn);
        this.isImmuneToFire = true;
    }
    
    protected EnumParticleTypes func_180487_n()
    {
        return EnumParticleTypes.SNOW_SHOVEL;
    }
    
    protected EntitySlime createInstance()
    {
        return new IceCube(this.worldObj);
    }
    
    protected Item getDropItem()
    {
        return Item.getItemFromBlock(BlockRegistry.icy_block);
    }
    
    public boolean isBurning()
    {
        return false;
    }
}