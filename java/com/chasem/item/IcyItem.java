package com.chasem.item;

import com.chasem.chasemmod.ChasemMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IcyItem extends Item
{
	public IcyItem(String nym)
	{
		super();
        this.setCreativeTab(ChasemMod.winterland_tab);
        this.setUnlocalizedName(ChasemMod.getUnlocalizedNameForNym(nym));
	}
}
