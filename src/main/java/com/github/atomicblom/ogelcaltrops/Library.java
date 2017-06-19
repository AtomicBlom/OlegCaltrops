package com.github.atomicblom.ogelcaltrops;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(OgelCaltrops.MODID)
public class Library
{
	@GameRegistry.ObjectHolder("ogel")
	public static final Block ogelBlock;
	@GameRegistry.ObjectHolder("ogel")
	public static final Item ogelItem;

	static {
		ogelBlock = null;
		ogelItem = null;
	}
}
