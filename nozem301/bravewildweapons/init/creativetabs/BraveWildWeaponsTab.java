package nozem301.bravewildweapons.init.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import nozem301.bravewildweapons.init.ModItems;
import nozem301.bravewildweapons.util.Reference;

public class BraveWildWeaponsTab extends CreativeTabs {
	
	public BraveWildWeaponsTab(String label) {
		super(Reference.MOD_ID + "." + label);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.AWAKENED_MASTER_SWORD);
	}

}
