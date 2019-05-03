package nozem301.bravewildweapons.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import nozem301.bravewildweapons.Main;
import nozem301.bravewildweapons.init.ModItems;
import nozem301.bravewildweapons.util.IHasModel;

public class ToolSword extends ItemSword implements IHasModel {
	
	
	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BWW_TAB);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

