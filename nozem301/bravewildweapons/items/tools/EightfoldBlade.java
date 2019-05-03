package nozem301.bravewildweapons.items.tools;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import nozem301.bravewildweapons.items.ToolSword;

public class EightfoldBlade extends ToolSword {

	public EightfoldBlade(String name, ToolMaterial material) {
		super(name, material);
	}
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            tooltip.add("A single-edged sword traditional to the Sheikah tribe.");
        }
        else
        {
            tooltip.add("Hold " + "\u00A7a" + "Shift" + "\u00A77" + " for more information"); //"\u00A7e" is a color code
        }
    }

}
