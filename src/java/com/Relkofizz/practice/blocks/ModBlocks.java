package com.Relkofizz.practice.blocks;

import com.Relkofizz.practice.Main;
//import com.Relkofizz.practice.blocks.enums.OnOff;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemBlock;

public final class ModBlocks {
	
	public static Block practiceBlock;
	public static Block practiceBlock2;
	public static String modid = Main.MODID;
	
	public static void createBlocks() {
		practiceBlock = new BasicBlock("practiceBlock");
		practiceBlock2 = new BasicBlock("practiceBlock2");
		regBlock(practiceBlock);
		regBlock(practiceBlock2);
	}
	
	public static void regBlock(Block block) {
		block.setUnlocalizedName(block.getRegistryName().toString());
		GameRegistry.register(block);
		ItemBlock blockItem = new ItemBlock(block);
		blockItem.setRegistryName(block.getRegistryName());
		System.out.println(block.getRegistryName());
		blockItem.setUnlocalizedName(block.getRegistryName().toString());
		GameRegistry.register(blockItem);
	}

}
