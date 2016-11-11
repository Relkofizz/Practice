package com.Relkofizz.practice.items;

import com.Relkofizz.practice.Main;
import com.Relkofizz.practice.items.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;


public final class ItemRenderRegister {

	public static String modid = Main.MODID;

	public static void registerItemRenderer() {
		reg(ModItems.practiceItem);
	}
	
	public static void reg(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
 