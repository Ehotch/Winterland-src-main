package com.chasem.biome;

import com.chasem.block.BlockRegistry;
import com.chasem.entity.IceCube;
import com.chasem.entity.Yeti;

import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenSwamp;

public class WinterlandBiome extends BiomeGenBase
{
	public WinterlandBiome(int id, boolean register)
	{
		super(id);
		this.setBiomeName("Winterland Biome");
		this.setHeight(this.height_LowHills);
		this.setEnableSnow();
		this.setTemperatureRainfall(0.0F, 0.5F);
		this.topBlock = BlockRegistry.icy_block.getDefaultState();
        this.fillerBlock = Blocks.snow.getDefaultState();
        this.waterColorMultiplier = 0x60FFFF;
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.worldGeneratorSwamp = new WorldGenSwamp();
        
	    if (register)
	    {
	        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntitySheep.class, 50, 4, 4));
	        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(Yeti.class, 50, 4, 4));
	        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(IceCube.class, 50, 4, 4));
	    }
	}
}
