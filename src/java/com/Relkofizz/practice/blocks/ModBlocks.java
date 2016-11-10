package com.Relkofizz.practice.blocks;

import com.Relkofizz.practice.Main;
//import com.Relkofizz.practice.blocks.enums.OnOff;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.ItemBlock;
import net.minecraft.client.renderer.block.statemap.IStateMapper;
@SuppressWarnings("unused")
public final class ModBlocks {
	
	public static Block practiceBlock;
	public static Block practiceBlock2;
	public static String modid = Main.MODID;
	public static void createBlocks() {
		//PropertyEnum<OnOff>.create("practiceBlock", OnOff);
	    //GameRegistry.registerBlock(practiceBlock = new BasicBlock("practiceBlock"), "practiceBlock");
	  //  GameRegistry.registerBlock(practiceBlock2 = new BasicBlock("practiceBlock2"), "practiceBlock2");
		practiceBlock = new BasicBlock("practiceBlock");
		practiceBlock.setRegistryName("practiceBlock");	
		
		practiceBlock2 = new BasicBlock("practiceBlock2");
		practiceBlock2.setRegistryName("practiceBlock2");	
	    
		regBlock(practiceBlock);
	    regBlock(practiceBlock2);
	}
	public static void regBlock(Block block){
		GameRegistry.register(block);
		ItemBlock blockItem = new ItemBlock(block);
		blockItem.setRegistryName(block.getRegistryName());
		GameRegistry.register(blockItem);
	}
}
