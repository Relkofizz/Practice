package com.Relkofizz.practice.items;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BionicEye extends net.minecraft.item.ItemArmor{

	//private String name;

	public BionicEye(ArmorMaterial mat) {
		super(mat, 0, EntityEquipmentSlot.HEAD);
		setRegistryName("bionicEye");
		setUnlocalizedName("bionicEye");
	}

	public void registerItemModel(Item item) {
		ItemRenderRegister.reg(item);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			ModelBiped defaultModel) {

		if (itemStack != null) {
			if (itemStack.getItem() instanceof BionicEye) {
				ModelBiped armorModel = ModItems.bionicEyeRender;
		
				armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;

				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;
				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

				return armorModel;
			}

		}
		return null;
	}
}
