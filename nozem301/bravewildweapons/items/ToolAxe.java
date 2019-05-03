package nozem301.bravewildweapons.items;

import net.minecraft.item.ItemAxe;
import nozem301.bravewildweapons.Main;
import nozem301.bravewildweapons.init.ModItems;
import nozem301.bravewildweapons.util.IHasModel;

public class ToolAxe extends ItemAxe implements IHasModel {
	
	public ToolAxe(String name, ToolMaterial material)
	{
		super (material, 3.0F, -3.2F);
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
