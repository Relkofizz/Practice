package com.Relkofizz.practice;

import com.Relkofizz.practice.blocks.ModBlocks;
import com.Relkofizz.practice.crafting.ModCrafting;
import com.Relkofizz.practice.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
	    ModItems.createItems();
	    ModBlocks.createBlocks();
    }
	
	public void init(FMLInitializationEvent e) {
		ModCrafting.initRecipes();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
