package com.chasem.item;

import com.chasem.chasemmod.ChasemMod;
import com.chasem.dimension.DimensionRegistry;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class WinterlandPearl extends IcyItem
{
	public WinterlandPearl(String nym)
	{
		super(nym);
	}
	
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		
		Entity entityIn = (Entity)playerIn;
		int dimensionId = playerIn.dimension == DimensionRegistry.dimensionId ? 1 : DimensionRegistry.dimensionId;
		
        if (entityIn.ridingEntity == null && entityIn.riddenByEntity == null)
        {
            if (!worldIn.isRemote && !entityIn.isDead)
            {
                worldIn.theProfiler.startSection("changeDimension");
                MinecraftServer minecraftserver = MinecraftServer.getServer();
                int j = entityIn.dimension;
                WorldServer worldserver = minecraftserver.worldServerForDimension(j);
                WorldServer worldserver1 = minecraftserver.worldServerForDimension(dimensionId);
                entityIn.dimension = dimensionId;
                
                if (j == 1 && dimensionId == 1)
                {
                    worldserver1 = minecraftserver.worldServerForDimension(0);
                    entityIn.dimension = 0;
                }
                
                worldIn.removeEntity(entityIn);
                entityIn.isDead = false;
                worldIn.theProfiler.startSection("reposition");
                minecraftserver.getConfigurationManager().transferEntityToWorld(entityIn, j, worldserver, worldserver1);
                worldIn.theProfiler.endStartSection("reloading");
                Entity entity = EntityList.createEntityByName(EntityList.getEntityString(entityIn), worldserver1);
                
                if (entity != null)
                {
                    entity.copyDataFromOld(entityIn);

                    if (j == 1 && dimensionId == 1)
                    {
                        BlockPos blockpos = worldIn.getTopSolidOrLiquidBlock(worldserver1.getSpawnPoint());
                        entity.moveToBlockPosAndAngles(blockpos, entity.rotationYaw, entity.rotationPitch);
                    }

                    worldserver1.spawnEntityInWorld(entity);
                }
                
                entityIn.isDead = true;
                entityIn.worldObj.theProfiler.endSection();
                worldserver.resetUpdateEntityTick();
                worldserver1.resetUpdateEntityTick();
                worldIn.theProfiler.endSection();
            }
        }
		return itemStackIn;
	}
}
