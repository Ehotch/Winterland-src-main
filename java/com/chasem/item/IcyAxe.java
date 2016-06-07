package com.chasem.item;

import com.chasem.chasemmod.ChasemMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class IcyAxe extends ItemAxe
{
	public IcyAxe(String nym, ToolMaterial material)
	{
		super(material);
        this.setCreativeTab(ChasemMod.winterland_tab);
        this.setUnlocalizedName(ChasemMod.getUnlocalizedNameForNym(nym));
        
	}
}
