package com.hilburn.floodgate;

import net.minecraftforge.common.DimensionManager;

import com.hilburn.floodgate.world.WorldProviderFloodgate;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInformation.MODID, name = ModInformation.NAME, version = ModInformation.VERSION)
public class Floodgate {

	
	@Instance(ModInformation.MODID)
	public static Floodgate instance;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		DimensionManager.unregisterProviderType(0);
        DimensionManager.registerProviderType(0, WorldProviderFloodgate.class, true);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
