package com.chasem.chasemmod;

import com.chasem.biome.BiomeRegistry;
import com.chasem.block.BlockRegistry;
import com.chasem.crafting.CraftingRegistry;
import com.chasem.dimension.DimensionRegistry;
import com.chasem.entity.CreatureRegistry;
import com.chasem.entity.IceCube;
import com.chasem.entity.RenderIceCube;
import com.chasem.entity.RenderYeti;
import com.chasem.entity.Yeti;
import com.chasem.item.ItemRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = ChasemMod.MODID, name = ChasemMod.MODNAME, version = ChasemMod.version)
public class ChasemMod
{

	public static final String MODID = "chasemmod";
	public static final String MODNAME = "Winterland Mod";
	public static final String version = "1.0";

	@Instance
	public static ChasemMod modInstance = new ChasemMod();
	
	public static final CreativeTabs winterland_tab = new CreativeTabs(modInstance.getUnlocalizedNameForNym("winterland_tab"))
	{
		@Override
		public Item getTabIconItem()
		{
			return ItemRegistry.icy_skates;
		}
	};
	
	public static String getUnlocalizedNameForNym(String nym)
	{
		String name;
		name = MODID + "_s_" + nym;
		return name;
	}

	@EventHandler
    public void preInit(FMLPreInitializationEvent e)
	{
		ItemRegistry.init();
		BlockRegistry.init();
		CreatureRegistry.init();
		BiomeRegistry.init();
		DimensionRegistry.init();
		CraftingRegistry.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent e)
    {
    	if (e.getSide() == Side.CLIENT)
    	{
    		ItemRegistry.render(ItemRegistry.icy_helmet, "icy_helmet");
    		ItemRegistry.render(ItemRegistry.icy_chestplate, "icy_chestplate");
    		ItemRegistry.render(ItemRegistry.icy_leggings, "icy_leggings");
    		ItemRegistry.render(ItemRegistry.icy_skates, "icy_skates");
    		ItemRegistry.render(ItemRegistry.icy_rod, "icy_rod");
    		ItemRegistry.render(ItemRegistry.icy_axe, "icy_axe");
    		ItemRegistry.render(ItemRegistry.icy_pick, "icy_pick");
    		ItemRegistry.render(ItemRegistry.icy_spade, "icy_spade");
    		ItemRegistry.render(ItemRegistry.icy_sword, "icy_sword");
    		ItemRegistry.render(ItemRegistry.glowcrystal, "glowcrystal");
    		ItemRegistry.render(ItemRegistry.glowcrystal_staff, "glowcrystal_staff");
    		ItemRegistry.render(ItemRegistry.sapphire, "sapphire");
    		ItemRegistry.render(Item.getItemFromBlock(BlockRegistry.icy_block), "icy_block");
    		ItemRegistry.render(Item.getItemFromBlock(BlockRegistry.glowcrystal_ore), "glowcrystal_ore");
    		ItemRegistry.render(Item.getItemFromBlock(BlockRegistry.glowcrystal_torch), "glowcrystal_torch");

    		RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();

    		RenderingRegistry.registerEntityRenderingHandler(Yeti.class, new RenderYeti(renderManager));
    		RenderingRegistry.registerEntityRenderingHandler(IceCube.class, new RenderIceCube(renderManager));
        }
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    	
    }
    
}