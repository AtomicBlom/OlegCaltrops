package com.github.atomicblom.ogelcaltrops;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = OgelCaltrops.MODID, version = OgelCaltrops.MOD_VERSION)
public class OgelCaltrops
{
	public static final String MODID = "ogelcaltrops";
	public static final String MOD_VERSION = "@MOD_VERSION@";
	public static boolean DEBUG = true;
	private static final String IS_CI_BUILD = "@CI_BUILD@";
}
