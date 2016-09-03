package com.jlgm.rp.main;

import com.jlgm.rp.lib.RPVersionChecker;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class RPClientProxy extends RPCommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent preInitEvent){
		super.preInit(preInitEvent);
	}

	@Override
	public void init(FMLInitializationEvent initEvent){
		super.init(initEvent);
	}

	@Override
	public void postInit(FMLPostInitializationEvent postInitEvent){
		super.postInit(postInitEvent);
		RPMain.versionChecker = new RPVersionChecker();
		Thread versionCheckThread = new Thread(RPMain.versionChecker, "VersionCheck");
		versionCheckThread.start();
	}
}
