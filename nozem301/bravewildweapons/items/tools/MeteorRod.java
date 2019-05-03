package nozem301.bravewildweapons.items.tools;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import nozem301.bravewildweapons.items.ToolSword;

public class MeteorRod extends ToolSword {
	
	public MeteorRod(String name, ToolMaterial material) {
		super(name, material);
	}

	@Override 
	public ActionResult<ItemStack> onItemRightClick (World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		EntityLargeFireball fireball = new EntityLargeFireball(worldIn, playerIn, 1, 1, 1);
		
		fireball.setPosition(playerIn.posX + aim.x * 1.50, playerIn.posY + aim.y * 1.50, playerIn.posZ + aim.z * 1.50);
		fireball.accelerationX = aim.x * 0.1; fireball.accelerationY = aim.y * 0.1;fireball.accelerationZ = aim.z * 0.1;
		worldIn.spawnEntity(fireball);
		
		item.damageItem(1, playerIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            tooltip.add("A magical rod that can cast three fireballs at once, crafted by an ancient magician.");
        }
        else
        {
            tooltip.add("Hold " + "\u00A7a" + "Shift" + "\u00A77" + " for more information"); //"\u00A7e" is a color code
        }
    }

}
