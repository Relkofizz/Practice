// Date: 11/26/2016 1:49:35 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package com.Relkofizz.practice.items;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class BionicEyeRender extends ModelBiped
{
  //fields
    private ModelRenderer EyePieceBase;
    private ModelRenderer EyeCrystal;
    private ModelRenderer EyePieceBody;
    private ModelRenderer EyePieceCrossX;
    private ModelRenderer EyePieceCrossY;
  
  public BionicEyeRender(float scale)
  {
	super(scale, 0, 64, 64);
    System.out.println("Bionic Eye initalized");

    textureWidth = 64;
    textureHeight = 64;
    
      EyePieceBase = new ModelRenderer(this, 0, 32);
      EyePieceBase.addBox(0F, -5F, -4.5F, 3, 3, 1);
      EyePieceBase.setRotationPoint(0F, 0F, 0F);
      EyePieceBase.setTextureSize(64, 64);
      EyePieceBase.mirror = true;
      setRotation(EyePieceBase, 0F, 0F, 0F);
      
      EyeCrystal = new ModelRenderer(this, 10, 36);
      EyeCrystal.addBox(1F, -4F, -5F, 1, 1, 1);
      EyeCrystal.setRotationPoint(0F, 0F, 0F);
      EyeCrystal.setTextureSize(64, 64);
      EyeCrystal.mirror = true;
      setRotation(EyeCrystal, 0F, 0F, 0F);
      
      EyePieceBody = new ModelRenderer(this, 8, 32);
      EyePieceBody.addBox(0.5F, -4.5F, -4.9F, 2, 2, 2);
      EyePieceBody.setRotationPoint(0F, 0F, 0F);
      EyePieceBody.setTextureSize(64, 64);
      EyePieceBody.mirror = true;
      setRotation(EyePieceBody, 0F, 0F, 0F);
      
      EyePieceBody.mirror = false;
      EyePieceCrossX = new ModelRenderer(this, 0, 36);
      EyePieceCrossX.addBox(-0.5F, -4F, -4.25F, 4, 1, 1);
      EyePieceCrossX.setRotationPoint(0F, 0F, 0F);
      EyePieceCrossX.setTextureSize(64, 64);
      EyePieceCrossX.mirror = true;
      setRotation(EyePieceCrossX, 0F, 0F, 0F);
      
      EyePieceCrossY = new ModelRenderer(this, 16, 32);
      EyePieceCrossY.addBox(1F, -5.5F, -4.3F, 1, 4, 1);
      EyePieceCrossY.setRotationPoint(0F, 0F, 0F);
      EyePieceCrossY.setTextureSize(64, 64);
      EyePieceCrossY.mirror = true;
      setRotation(EyePieceCrossY, 0F, 0F, 0F);

      bipedHead.addChild(EyePieceBase);
      bipedHead.addChild(EyePieceBody);
      bipedHead.addChild(EyeCrystal);
      bipedHead.addChild(EyePieceCrossX);
      bipedHead.addChild(EyePieceCrossY);

  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  

}