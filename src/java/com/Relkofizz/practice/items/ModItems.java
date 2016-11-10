package com.Relkofizz.practice.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item practiceItem;
	
	public static void createItems() {
		//Item practiceItem = practiceItem.setRegistryName("practiceItem");
		GameRegistry.registerItem(practiceItem = new BasicItem("Item of Practice"),"practiceItem");
		//GameRegistry.register(practiceItem);
	}
}
