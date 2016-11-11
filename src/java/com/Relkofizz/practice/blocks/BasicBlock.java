package com.Relkofizz.practice.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block{

	  public BasicBlock(String regName, Material material, float hardness, float resistance) {
	        super(material);
	        this.setRegistryName(regName);
	        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	        this.setHardness(hardness);
	        this.setResistance(resistance);
	  }
	  
	  public BasicBlock(String regName, float hardness, float resistance) {
	       this(regName, Material.ROCK, hardness, resistance);
	  }

	  public BasicBlock(String regName) {
	      this(regName, 2.0f, 10.0f);
	  }
}
