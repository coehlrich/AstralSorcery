/*package model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * astralsorcery_grindingstone - wiiv
 * Created using Tabula 4.1.1
 */
/*public class ASgrindingstone extends ModelBase {
    public ModelRenderer wheel;
    public ModelRenderer frame1;
    public ModelRenderer frame2;
    public ModelRenderer frame3;
    public ModelRenderer frame4;
    public ModelRenderer mount1;
    public ModelRenderer shape1;
    public ModelRenderer sit1;
    public ModelRenderer sit2;
    public ModelRenderer shield;
    public ModelRenderer axis;

    public ASgrindingstone() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.sit1 = new ModelRenderer(this, 20, 0);
        this.sit1.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.sit1.addBox(-3.0F, 1.0F, -8.0F, 6, 1, 6, 0.0F);
        this.wheel = new ModelRenderer(this, 0, 0);
        this.wheel.setRotationPoint(0.0F, 16.0F, 3.5F);
        this.wheel.addBox(-1.5F, -3.5F, -3.5F, 3, 7, 7, 0.0F);
        this.setRotateAngle(wheel, 3.141592653589793F, 0.0F, 0.0F);
        this.frame1 = new ModelRenderer(this, 0, 14);
        this.frame1.setRotationPoint(0.0F, 16.5F, 0.0F);
        this.frame1.addBox(-3.0F, -2.0F, 2.5F, 1, 10, 1, 0.0F);
        this.setRotateAngle(frame1, -0.7853981633974483F, 0.0F, 0.0F);
        this.mount1 = new ModelRenderer(this, 8, 14);
        this.mount1.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.mount1.addBox(-4.0F, -2.0F, 1.5F, 2, 4, 4, 0.0F);
        this.sit2 = new ModelRenderer(this, 20, 7);
        this.sit2.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.sit2.addBox(-2.0F, 2.0F, -6.0F, 4, 6, 4, 0.0F);
        this.frame2 = new ModelRenderer(this, 0, 14);
        this.frame2.setRotationPoint(0.0F, 16.5F, 0.0F);
        this.frame2.addBox(2.0F, -2.0F, 2.5F, 1, 10, 1, 0.0F);
        this.setRotateAngle(frame2, -0.7853981633974483F, 0.0F, 0.0F);
        this.axis = new ModelRenderer(this, 8, 22);
        this.axis.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.axis.addBox(-3.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F);
        this.frame4 = new ModelRenderer(this, 4, 14);
        this.frame4.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.frame4.addBox(2.0F, 2.0F, 2.5F, 1, 8, 1, 0.0F);
        this.setRotateAngle(frame4, 0.39269908169872414F, 0.0F, 0.0F);
        this.frame3 = new ModelRenderer(this, 4, 14);
        this.frame3.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.frame3.addBox(-3.0F, 2.0F, 2.5F, 1, 8, 1, 0.0F);
        this.setRotateAngle(frame3, 0.39269908169872414F, 0.0F, 0.0F);
        this.shield = new ModelRenderer(this, 36, 7);
        this.shield.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.shield.addBox(-2.0F, -4.0F, -3.0F, 4, 5, 1, 0.0F);
        this.shape1 = new ModelRenderer(this, 8, 14);
        this.shape1.mirror = true;
        this.shape1.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.shape1.addBox(2.0F, -2.0F, 1.5F, 2, 4, 4, 0.0F);
        this.wheel.addChild(this.axis);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.sit1.render(f5);
        this.wheel.render(f5);
        this.frame1.render(f5);
        this.mount1.render(f5);
        this.sit2.render(f5);
        this.frame2.render(f5);
        this.frame4.render(f5);
        this.frame3.render(f5);
        this.shield.render(f5);
        this.shape1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    /*public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
*/