package com.joost986.letsmodreboot;

import com.joost986.letsmodreboot.handler.ConfigurationHandler;
import com.joost986.letsmodreboot.init.ModBlocks;
import com.joost986.letsmodreboot.init.ModItems;
import com.joost986.letsmodreboot.proxy.IProxy;
import com.joost986.letsmodreboot.reference.Reference;
import com.joost986.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		ModItems.init();
		ModBlocks.init();

		LogHelper.info("Pre Initialization Complete!");
	}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

		LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

        LogHelper.info("Post Initialization Complete!");
    }
}
