package com.jlgm.rp.main;

import com.jlgm.rp.event.RPEventHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class RPCommonProxy{

	public void preInit(FMLPreInitializationEvent preInitEvent){
		Configuration config = new Configuration(preInitEvent.getSuggestedConfigurationFile());
		config.load();

		config.save();
	}

	public void init(FMLInitializationEvent initEvent){
		MinecraftForge.EVENT_BUS.register(new RPEventHandler());
	}

	public void postInit(FMLPostInitializationEvent postInitEvent){

	}
}
