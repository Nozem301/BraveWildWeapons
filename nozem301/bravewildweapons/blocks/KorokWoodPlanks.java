package nozem301.bravewildweapons.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class KorokWoodPlanks extends BlockBase
{
	public KorokWoodPlanks(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("axe", 2);
		
		//Optional
		//setLightLevel(FloatValue);
		//setLightOpacity(FloatValue);
		//setBlockUnbreakable(FloatValue);
	}

}


