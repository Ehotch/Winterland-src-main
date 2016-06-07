package com.chasem.biome;

import java.util.Random;

import com.chasem.block.BlockRegistry;
import com.chasem.dimension.DimensionRegistry;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GlowcrystalOreGen implements IWorldGenerator
{
	private WorldGenerator glowcrystal_ore_generation;

	public GlowcrystalOreGen()
	{
		this.glowcrystal_ore_generation = new WorldGenMinable(BlockRegistry.glowcrystal_ore.getDefaultState(), 8);
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight)
	{
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimensionId() == 6) {
			this.runGenerator(this.glowcrystal_ore_generation, world, random, chunkX, chunkZ, 60/*20*/, 0, 64);
		}
	}
}
