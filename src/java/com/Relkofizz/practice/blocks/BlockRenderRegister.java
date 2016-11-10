package com.Relkofizz.practice.blocks;

import com.Relkofizz.practice.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class BlockRenderRegister {
	
	
	public static void registerBlockRenderer() {
	//	regB(ModBlocks.practiceBlock);
	//	regB(ModBlocks.practiceBlock2);
	Item item = new Item();
	item = Item.REGISTRY.getObject(ModBlocks.practiceBlock.getRegistryName());
	System.out.println(item.getUnlocalizedName());
	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(ModBlocks.practiceBlock.getRegistryName(), "inventory"));
	item = Item.REGISTRY.getObject(ModBlocks.practiceBlock2.getRegistryName());
	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(ModBlocks.practiceBlock2.getRegistryName(), "inventory"));

	}
public static void regB(Block block) {
	//GameRegistry.fin
	Item item = Item.REGISTRY.getObject(block.getRegistryName());
	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
	}
}