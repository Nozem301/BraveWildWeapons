package nozem301.bravewildweapons.items.tools;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.lwjgl.input.Keyboard;

import com.google.common.collect.Multimap;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nozem301.bravewildweapons.Main;
import nozem301.bravewildweapons.items.ToolAxe;

public class WoodcutterAxe extends ToolAxe {
	public WoodcutterAxe(String name, ToolMaterial material) {
		super(name, material);
		setCreativeTab(Main.BWWTH_TAB);
	}
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            tooltip.add("A woodcutter's tool of choice for felling trees. Its formidable weight and uneven balancing make it a slow, inefficient weapon.");
        }
        else
        {
            tooltip.add("Hold " + "\u00A7a" + "Shift" + "\u00A77" + " for more information"); //"\u00A7e" is a color code
        }
    }
}
