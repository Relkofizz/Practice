package com.Relkofizz.practice.items;
import com.Relkofizz.practice.items.tool.ItemSword;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

    public static final Item.ToolMaterial practiceToolMat = EnumHelper.addToolMaterial("PRACTICE", 7, 999, 7, 7, 100);
	public static final ItemArmor.ArmorMaterial practiceArmorMat = EnumHelper.addArmorMaterial("PRACTICE", "practice" + ":practice", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static Item practiceItem;
	public static ItemSword practiceSword;
	public static ItemArmor practiceHelmet;
	public static ItemArmor practiceChestplate;
	public static ItemArmor practiceLeggings;
	public static ItemArmor practiceBoots;

	public static void createItems() {
		practiceHelmet 		= new com.Relkofizz.practice.items.ItemArmor(practiceArmorMat, EntityEquipmentSlot.HEAD, "practiceHelmet");
		practiceChestplate	= new com.Relkofizz.practice.items.ItemArmor(practiceArmorMat, EntityEquipmentSlot.CHEST, "practiceChestplate");
		practiceLeggings	= new com.Relkofizz.practice.items.ItemArmor(practiceArmorMat, EntityEquipmentSlot.LEGS, "practiceLeggings");
		practiceBoots 		= new com.Relkofizz.practice.items.ItemArmor(practiceArmorMat, EntityEquipmentSlot.FEET, "practiceBoots");
		practiceItem 		= new BasicItem("practiceItem");
		practiceSword 		= new ItemSword(practiceToolMat, "practiceSword");
		regItem(practiceItem);
		regItem(practiceSword);
		regItem(practiceHelmet);
		regItem(practiceChestplate);
		regItem(practiceLeggings);
		regItem(practiceBoots);

	}
	
	public static void regItem(Item item) {
		item.setUnlocalizedName(item.getRegistryName().toString());
		GameRegistry.register(item);
	}
}
