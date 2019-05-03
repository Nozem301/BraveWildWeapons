package nozem301.bravewildweapons.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmeltingRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.SILVER_ZORA_ORE_BLOCK, new ItemStack(ModItems.SILVER_ZORA_INGOT, 1), 4.0f);
	}
}
