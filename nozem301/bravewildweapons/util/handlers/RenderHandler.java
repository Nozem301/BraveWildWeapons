package nozem301.bravewildweapons.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import nozem301.bravewildweapons.entity.EntityChuChu;
import nozem301.bravewildweapons.entity.render.RenderChuChu;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityChuChu.class, new IRenderFactory<EntityChuChu>()
	    {
			@Override
			public Render<? super EntityChuChu> createRenderFor(RenderManager manager) 
			{
				return new RenderChuChu(manager);
			}
			
	    });
		
	}


}
