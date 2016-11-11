package com.Relkofizz.practice.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

import java.util.List;

public class BlockProperties extends Block {

	public enum PracticeEnum implements IStringSerializable {
		WHITE(0, "white"), BLACK(1, "black");

		private int ID;
		private String name;

		private PracticeEnum(int ID, String name) {
			this.ID = ID;
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public String toString() {
		    return getName();
		}
		
		public int getID() {
			return ID;
		}
	}

	public BlockProperties(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, PracticeEnum.WHITE));
	}
	
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
	    list.add(new ItemStack(itemIn, 1, 0)); //Meta 0
	    list.add(new ItemStack(itemIn, 1, 1)); //Meta 1
	}
	
	@Override
	public int damageDropped(IBlockState state) {
	    return getMetaFromState(state);
	}
	
	protected BlockStateContainer blockStateContainer() { 
		  	return new
		BlockStateContainer(this, new IProperty[] { TYPE  }); 
	}

	public static final PropertyEnum<PracticeEnum> TYPE = PropertyEnum.create("type",PracticeEnum.class);

}


