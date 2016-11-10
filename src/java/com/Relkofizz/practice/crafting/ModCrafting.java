package com.Relkofizz.practice.crafting;

import com.Relkofizz.practice.blocks.ModBlocks;
import com.Relkofizz.practice.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void initRecipes(){
		GameRegistry.addRecipe(new ItemStack(ModBlocks.practiceBlock), new Object[] {"##", "##", '#', ModItems.practiceItem});	
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.practiceItem), new Object[] {Items.REDSTONE,Items.REDSTONE, new ItemStack(Items.DYE, 1, 4)});
		GameRegistry.addSmelting(Items.DIAMOND, new ItemStack(ModItems.practiceItem), 1.0F);
	}
}