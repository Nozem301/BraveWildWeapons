package nozem301.bravewildweapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nozem301.bravewildweapons.init.ModSmeltingRecipes;
import nozem301.bravewildweapons.init.creativetabs.BraveWildBowsTab;
import nozem301.bravewildweapons.init.creativetabs.BraveWildMaterialsTab;
import nozem301.bravewildweapons.init.creativetabs.BraveWildSpearsTab;
import nozem301.bravewildweapons.init.creativetabs.BraveWildTwoHandedWeaponsTab;
import nozem301.bravewildweapons.init.creativetabs.BraveWildWeaponsTab;
import nozem301.bravewildweapons.proxy.CommonProxy;
import nozem301.bravewildweapons.util.Reference;
import nozem301.bravewildweapons.util.handlers.RegistryHandler;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler 
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries();
	}
	
	@EventHandler 
	public static void init(FMLInitializationEvent event)
	{
		ModSmeltingRecipes.init();
	}
	
	@EventHandler 
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
	//Creative Tabs
	public static final CreativeTabs BWW_TAB = new BraveWildWeaponsTab("BraveWildWeaponsTab");
	public static final CreativeTabs BWWM_TAB = new BraveWildMaterialsTab("BraveWildMaterialsTab");
	public static final CreativeTabs BWWB_TAB = new BraveWildBowsTab("BraveWildBowsTab");
	public static final CreativeTabs BWWTH_TAB = new BraveWildTwoHandedWeaponsTab("BraveWildTwoHandedWeaponsTab");
	public static final CreativeTabs BWWS_TAB = new BraveWildSpearsTab("BraveWildSpearsTab");
}
