package com.chasem.item;

import com.chasem.chasemmod.ChasemMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class IcyPick extends ItemPickaxe {
	
	public IcyPick(String nym, ToolMaterial material) {
		super(material);
        this.setCreativeTab(ChasemMod.winterland_tab);
        this.setUnlocalizedName(ChasemMod.getUnlocalizedNameForNym(nym));
	}
	
}
