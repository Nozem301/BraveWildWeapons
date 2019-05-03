package nozem301.bravewildweapons.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nozem301.bravewildweapons.Main;
import nozem301.bravewildweapons.init.ModItems;
import nozem301.bravewildweapons.util.IHasModel;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BWWM_TAB);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
