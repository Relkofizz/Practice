package com.Relkofizz.practice.blocks;


import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
public class BlockRenderRegister {
	
	
	public static void registerBlockRenderer() {
		regB(ModBlocks.practiceBlock);
		regB(ModBlocks.practiceBlock2);
	}
	
	public static void regB(Block block) {
		Item item = Item.REGISTRY.getObject(block.getRegistryName());
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));	
	}
	
}