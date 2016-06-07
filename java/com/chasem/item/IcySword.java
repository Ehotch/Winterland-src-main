package com.chasem.item;

import com.chasem.chasemmod.ChasemMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class IcySword extends ItemSword {
	
	public IcySword(String nym, ToolMaterial material)
	{
		super(material);
        this.setCreativeTab(ChasemMod.winterland_tab);
        this.setUnlocalizedName(ChasemMod.getUnlocalizedNameForNym(nym));
	}
	
}
