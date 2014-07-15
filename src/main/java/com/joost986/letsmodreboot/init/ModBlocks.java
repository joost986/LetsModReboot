package com.joost986.letsmodreboot.init;

import com.joost986.letsmodreboot.block.BlockFlag;
import com.joost986.letsmodreboot.block.BlockLMRB;
import com.joost986.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
	public static final BlockLMRB flagBlock = new BlockFlag();

	public static void init()
	{
		GameRegistry.registerBlock(flagBlock, "flag");
	}
}
