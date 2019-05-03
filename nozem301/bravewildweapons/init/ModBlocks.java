package nozem301.bravewildweapons.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nozem301.bravewildweapons.blocks.BlockBase;
import nozem301.bravewildweapons.blocks.KorokWoodPlanks;
import nozem301.bravewildweapons.blocks.SilverZoraOre;

public class ModBlocks 
{
	public static final List <Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SILVER_ZORA_ORE_BLOCK = new SilverZoraOre("silver_zora_ore_block", Material.ROCK);
	public static final Block KOROK_PLANKS_BLOCK = new KorokWoodPlanks("korok_planks_block", Material.WOOD);
}
