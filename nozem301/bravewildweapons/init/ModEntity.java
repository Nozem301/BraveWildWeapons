package nozem301.bravewildweapons.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import nozem301.bravewildweapons.Main;
import nozem301.bravewildweapons.entity.EntityChuChu;
import nozem301.bravewildweapons.util.Reference;

public class ModEntity 
{
	public static void registerEntities() 
	{
		registerEntity("chuchu", EntityChuChu.class, Reference.ENTITY_CHUCHU, 50, 3134179, 3107030);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + " : " + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
