package nozem301.bravewildweapons.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import nozem301.bravewildweapons.entity.EntityChuChu;
import nozem301.bravewildweapons.entity.model.ModelChuChu;
import nozem301.bravewildweapons.util.Reference;

public class RenderChuChu extends RenderLiving<EntityChuChu> 
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/chuchu.png");
	
	public RenderChuChu(RenderManager manager)
	{
		super(manager, new ModelChuChu(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityChuChu entity)
	{
		return TEXTURES;
	}
	
	@Override 
	protected void applyRotations(EntityChuChu entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
