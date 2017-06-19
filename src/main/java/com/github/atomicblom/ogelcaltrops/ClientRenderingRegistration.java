package com.github.atomicblom.ogelcaltrops;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientRenderingRegistration
{
	@SubscribeEvent
	public static void onModelRegistryReady(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(
				Library.ogelItem,
				0,
				new ModelResourceLocation(
						Library.ogelBlock.getRegistryName(),
						"normal"
				)
		);
	}
}
