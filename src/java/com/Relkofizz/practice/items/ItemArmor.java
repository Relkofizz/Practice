package com.Relkofizz.practice.items;


import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class ItemArmor extends net.minecraft.item.ItemArmor{

	//private String name;

	public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		//this.name = name;
	}

	public void registerItemModel(Item item) {
		ItemRenderRegister.reg(item);
	}
}
