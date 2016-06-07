package com.chasem.dimension;

import com.chasem.biome.BiomeRegistry;
import com.chasem.block.BlockRegistry;

import net.minecraft.util.BlockPos;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class Winterland extends WorldProvider
{
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.winterland_biome, 1.2F);
		this.dimensionId = DimensionRegistry.dimensionId;
	}
	
	public boolean canCoordinateBeSpawn(int x, int z)
	{
        return super.worldObj.getGroundAboveSeaLevel(new BlockPos(x, 0, z)) == BlockRegistry.icy_block;
    }
	
	public boolean isSurfaceWorld()
	{
        return false;
    }
	
	public boolean canRespawnHere()
	{
        return false;
    }
	
	@Override
	public String getDimensionName()
	{
		return "Winterland";
	}
	
	@Override
	public String getInternalNameSuffix()
	{
		return "_winterland";
	}
	
	public String getWelcomeMessage()
	{
        return "Welcome to Winterland!";
    }
	
	public String getDepartMessage()
	{
        return "Leaving Winterland";
    }
	
	public double getMovementFactor()
	{
        return 6.0;
    }
	
	public BiomeGenBase getBiomeGenForCoords(BlockPos pos)
	{
        return BiomeRegistry.winterland_biome;
    }
	
	public boolean canSnowAt(BlockPos pos, boolean checkLight)
	{
        return true;
    }
}
