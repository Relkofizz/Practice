package com.Relkofizz.practice;

import com.Relkofizz.practice.blocks.BlockRenderRegister;
import com.Relkofizz.practice.items.ItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

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
