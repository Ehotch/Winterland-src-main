package com.chasem.item;

import com.chasem.chasemmod.ChasemMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

public class IcyArmor extends ItemArmor
{
	public IcyArmor(String nym, ArmorMaterial material, int armorType, int renderIndex)
	{
		super(material, renderIndex, armorType);
		this.setCreativeTab(ChasemMod.winterland_tab);
        this.setUnlocalizedName(ChasemMod.getUnlocalizedNameForNym(nym));
	}
}
