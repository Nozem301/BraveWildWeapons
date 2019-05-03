package nozem301.bravewildweapons.items.tools;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nozem301.bravewildweapons.Main;
import nozem301.bravewildweapons.init.ModItems;
import nozem301.bravewildweapons.util.IHasModel;


public class TravelersBow extends ItemBow implements IHasModel

{
	public TravelersBow(String name) {
		this.setCreativeTab(Main.BWWB_TAB);
		setUnlocalizedName(name);
		setRegistryName(name);
		ModItems.ITEMS.add(this);
	} 
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            tooltip.add("A small bow used by travelers for protection.");
        }
        else
        {
            tooltip.add("Hold " + "\u00A7a" + "Shift" + "\u00A77" + " for more information"); //"\u00A7e" is a color code
        }
    }

}
