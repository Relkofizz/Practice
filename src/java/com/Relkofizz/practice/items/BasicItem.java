package com.Relkofizz.practice.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicItem extends Item{

	public BasicItem(String regName) {
		super();
		this.setRegistryName(regName);
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
	
}
