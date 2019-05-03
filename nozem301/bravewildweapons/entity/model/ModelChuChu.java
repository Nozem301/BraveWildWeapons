package nozem301.bravewildweapons.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSlime - Either Mojang or a mod author
 * Created using Tabula 7.0.1
 */
public class ModelChuChu extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Eye1;
    public ModelRenderer Eye2;

    public ModelChuChu() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Eye2 = new ModelRenderer(this, 24, 0);
        this.Eye2.setRotationPoint(-3.3F, 17.5F, -5.6F);
        this.Eye2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Eye1 = new ModelRenderer(this, 0, 0);
        this.Eye1.setRotationPoint(1.2F, 17.5F, -5.6F);
        this.Eye1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 16.0F, -4.0F, 8, 8, 8, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Eye2.render(f5);
        this.Eye1.render(f5);
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
