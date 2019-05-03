package nozem301.bravewildweapons.entity;

import javax.annotation.Nonnull;

import net.minecraft.entity.ai.EntityAIFindEntityNearestPlayer;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import nozem301.bravewildweapons.init.ModEntity;

public class EntityChuChu extends EntitySlime {

	public EntityChuChu(World worldIn) { 

		super(worldIn);
	}
	@Override
    protected void initEntityAI()
    {
        this.targetTasks.addTask(1, new EntityAIFindEntityNearestPlayer(this));
    }
	@Override
	protected SoundEvent getAmbientSound() {
		return super.getAmbientSound();
	}
	
	@Override 
	protected SoundEvent getHurtSound(DamageSource source) {
		return super.getHurtSound(source);
	}
	
	@Override 
	protected SoundEvent getDeathSound() {
		return super.getDeathSound();
	}
	
	  @Override
	  protected boolean spawnCustomParticles() {
	    if(this.getEntityWorld().isRemote) {
	      int i = this.getSlimeSize();
	      for(int j = 0; j < i * 8; ++j) {
	        float f = this.rand.nextFloat() * (float) Math.PI * 2.0F;
	        float f1 = this.rand.nextFloat() * 0.5F + 0.5F;
	        float f2 = MathHelper.sin(f) * (float) i * 0.5F * f1;
	        float f3 = MathHelper.cos(f) * (float) i * 0.5F * f1;
	        double d0 = this.posX + (double) f2;
	        double d1 = this.posZ + (double) f3;
	        double d2 = this.getEntityBoundingBox().minY;
	      }
	    }
		return true;
     }
	  @Nonnull
	  @Override
	  protected EntitySlime createInstance() {
	    return new EntityChuChu(this.getEntityWorld());
	 }
	  
}
