package com.chasem.crafting;

import com.chasem.block.BlockRegistry;
import com.chasem.item.ItemRegistry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRegistry
{
	public static final ItemStack icy_block_stack = new ItemStack(BlockRegistry.icy_block, 1);
	public static final ItemStack icy_rod_stack = new ItemStack(ItemRegistry.icy_rod);

	public static final ItemStack icy_axe_stack = new ItemStack(ItemRegistry.icy_axe);
	public static final ItemStack icy_pick_stack = new ItemStack(ItemRegistry.icy_pick);
	public static final ItemStack icy_spade_stack = new ItemStack(ItemRegistry.icy_spade);
	public static final ItemStack icy_sword_stack = new ItemStack(ItemRegistry.icy_sword, 1);

	public static void init()
	{
		GameRegistry.addShapedRecipe(icy_axe_stack,
				"++ ",
				"+| ",
				" | ",
				'|', icy_rod_stack, '+', icy_block_stack
		);
		GameRegistry.addShapedRecipe(icy_sword_stack,
			" | ",
			" | ",
			" + ",
			'+', icy_rod_stack, '|', icy_block_stack
		);
		GameRegistry.addShapedCraftingRecipe(itemStackOfIcyHoe,
			“-- ”
			“ + ”
			“ + ”
			‘+’, icy_block_stack, ‘-’, icy_block_stack
		);
		}
	}
}
