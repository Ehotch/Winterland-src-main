package com.chasem.item;

import com.chasem.chasemmod.ChasemMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRegistry {
	
	public static WinterlandPearl winterland_pearl = new WinterlandPearl("winterland_pearl");
	
	public static final ToolMaterial icy_tool_material = EnumHelper.addToolMaterial("ICY", 3, 250, 6.0F, 2.0F, 0);
	public static final ArmorMaterial icy_armor_material = EnumHelper.addArmorMaterial("ICY", ChasemMod.MODID + ":" + "icy", 15, new int[]{2, 6, 5, 2}, 0);
	
	public static final IcyItem icy_rod = new IcyItem("icy_rod");
	public static final IcySword icy_sword = new IcySword("icy_sword", icy_tool_material);
	public static final IcyPick icy_pick = new IcyPick("icy_pick", icy_tool_material);
	public static final IcySpade icy_spade = new IcySpade("icy_spade", icy_tool_material);
	public static final IcyAxe icy_axe = new IcyAxe("icy_axe", icy_tool_material);
	public static final IcyArmor icy_helmet = new IcyArmor("icy_helmet", icy_armor_material, 0, 1);
	public static final IcyArmor icy_chestplate = new IcyArmor("icy_chestplate", icy_armor_material, 1, 1);
	public static final IcyArmor icy_leggings = new IcyArmor("icy_leggings", icy_armor_material, 2, 2);
	public static final IcySkates icy_skates = new IcySkates("ice_skates", icy_armor_material);
	public static final Glowcrystal glowcrystal = new Glowcrystal("glowcrystal");
	public static final GlowcrystalStaff glowcrystal_staff = new GlowcrystalStaff("glowcrystal_staff");
	public static final Sapphire sapphire = new Sapphire("sapphire");
	
	public static void init()
	{
		GameRegistry.registerItem(winterland_pearl, "winterland_pearl");
		GameRegistry.registerItem(icy_rod, "icy_rod");
		GameRegistry.registerItem(icy_sword, "icy_sword");
		GameRegistry.registerItem(icy_pick, "icy_pickaxe");
		GameRegistry.registerItem(icy_spade, "icy_shovel");
		GameRegistry.registerItem(icy_axe, "icy_axe");
		GameRegistry.registerItem(icy_helmet, "icy_helmet");
		GameRegistry.registerItem(icy_chestplate, "icy_chestplate");
		GameRegistry.registerItem(icy_leggings, "icy_leggings");
		GameRegistry.registerItem(icy_skates, "ice_skates");
		GameRegistry.registerItem(glowcrystal, "glowcrystal");
		GameRegistry.registerItem(glowcrystal_staff, "glowcrystal_staff");
		GameRegistry.registerItem(sapphire, "sapphire");
	}
	
	public static void render(Item item, String name)
	{
		ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		itemModelMesher.register(item, 0, new ModelResourceLocation(ChasemMod.MODID + ":" + name, "inventory"));
	}
	
}
