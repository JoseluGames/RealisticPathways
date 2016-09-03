package com.jlgm.rp.main;

import com.jlgm.rp.lib.RPConfigStorage;
import com.jlgm.rp.lib.RPConstants;
import com.jlgm.rp.lib.RPVersionChecker;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RPConstants.MODID,
	name = RPConstants.NAME,
	version = RPConstants.VERSION,
	acceptedMinecraftVersions = RPConstants.ACCEPTEDMINECRAFTVERSIONS)

public class RPMain{

	public static RPConfigStorage configStorage;
	public static RPVersionChecker versionChecker;
	public static boolean haveWarnedVersionOutOfDate = false;

	@SidedProxy(clientSide = RPConstants.CLIENT_PROXY, serverSide = RPConstants.SERVER_PROXY)
	public static RPCommonProxy proxy;
	@Instance(RPConstants.MODID)
	public static RPMain instance;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent preInitEvent){
		configStorage = new RPConfigStorage();
		proxy.preInit(preInitEvent);
	}

	@EventHandler
	public static void Init(FMLInitializationEvent initEvent){
		proxy.init(initEvent);
	}

	@EventHandler
	public static void PostInit(FMLPostInitializationEvent postInitEvent){
		proxy.postInit(postInitEvent);
	}
}
