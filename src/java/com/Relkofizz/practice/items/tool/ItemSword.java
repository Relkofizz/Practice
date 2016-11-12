package com.Relkofizz.practice.items.tool;

public class ItemSword extends net.minecraft.item.ItemSword{
	
	public ItemSword(ToolMaterial mat, String name){
		super(mat);
		setRegistryName(name);
		setUnlocalizedName(name);
	}
}
