package com.Relkofizz.practice.items;
import com.Relkofizz.practice.items.tool.ItemSword;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

    public static final Item.ToolMaterial practiceToolMat = EnumHelper.addToolMaterial("practice", 7, 999, 7, 7, 100);
	public static Item practiceItem;
	public static ItemSword practiceSword;
	
	public static void createItems() {
		practiceItem = new BasicItem("practiceItem");
		practiceSword = new ItemSword(practiceToolMat, "practiceSword");
		regItem(practiceItem);
		regItem(practiceSword);
	}
	
	public static void regItem(Item item) {
		item.setUnlocalizedName(item.getRegistryName().toString());
		GameRegistry.register(item);
	}
}
