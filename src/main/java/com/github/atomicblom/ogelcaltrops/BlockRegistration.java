package com.github.atomicblom.ogelcaltrops;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

@Mod.EventBusSubscriber
public class BlockRegistration
{
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> block) {
		final IForgeRegistry<Block> registry = block.getRegistry();
		registry.register(new CaltropBlock()
				.setRegistryName(OgelCaltrops.MODID, "ogel")
				.setUnlocalizedName("ogel")
				.setCreativeTab(CreativeTabs.MISC)
		);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		registry.register(new ItemBlock(Library.ogelBlock)
				.setRegistryName(Library.ogelBlock.getRegistryName())
				.setUnlocalizedName("ogel")
		);
	}
}
