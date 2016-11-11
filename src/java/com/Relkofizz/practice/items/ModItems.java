package com.Relkofizz.practice.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item practiceItem;
	
	public static void createItems() {
		practiceItem = new BasicItem("practiceItem");
		regItem(practiceItem);
	}
	
	public static void regItem(Item item) {
		item.setUnlocalizedName(item.getRegistryName().toString());
		GameRegistry.register(item);
	}
}
