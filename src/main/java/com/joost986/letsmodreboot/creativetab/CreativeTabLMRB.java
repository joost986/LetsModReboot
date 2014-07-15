package com.joost986.letsmodreboot.creativetab;

import com.joost986.letsmodreboot.init.ModItems;
import com.joost986.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
	public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem() {
			return ModItems.mapleLeaf;
		}
	};
}
