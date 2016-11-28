package com.Relkofizz.practice;

import com.Relkofizz.practice.blocks.BlockRenderRegister;
import com.Relkofizz.practice.items.ItemRenderRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	/*public ModelBiped getArmorModel(int id){
		 final bionicEye bionicEye = new bionicEye(1.0f);
		 final bionicEye bionicEyeB = new bionicEye(0.5f);
		 //and switch on the id in your getArmorModel !
		 switch (id) {
		  case 0:
		  return bionicEye;
		  case 1:
		  return bionicEyeB;
		 }
		 return null;
	}*/
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		ItemRenderRegister.registerItemRenderer();
		BlockRenderRegister.registerBlockRenderer();
	
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

}
