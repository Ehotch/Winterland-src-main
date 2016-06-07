package com.chasem.dimension;

import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry
{
	public static int dimensionId = DimensionManager.getNextFreeDimId();

	public static void init()
	{
		registerDimension();
	}

	public static void registerDimension()
	{
		DimensionManager.registerProviderType(dimensionId, Winterland.class, false);
		DimensionManager.registerDimension(dimensionId, dimensionId);
	}
}
