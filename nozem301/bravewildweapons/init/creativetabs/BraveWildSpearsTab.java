package nozem301.bravewildweapons.init.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import nozem301.bravewildweapons.init.ModItems;
import nozem301.bravewildweapons.util.Reference;

public class BraveWildSpearsTab extends CreativeTabs {
	
	public BraveWildSpearsTab(String label) {
		super(Reference.MOD_ID + "." + label);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.TRAVELER_SPEAR);
	}

}