package com.joost986.letsmodreboot.handler;

import com.joost986.letsmodreboot.reference.Reference;
import com.joost986.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
	public static final ConfigurationHandler INSTANCE = new ConfigurationHandler();
	public static Configuration configuration;

	public static boolean exampleConfigValue = false;

	public static void init (File configFile)
	{
		// create config object
		if (configuration == null)
		{
			configuration = new Configuration(configFile);
			INSTANCE.loadConfiguration();
		}
	}

	@SubscribeEvent
	public void onConfigurationChanged(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equals(Reference.MOD_ID))
		{
			loadConfiguration();
		}
	}

	public void loadConfiguration()
	{
		exampleConfigValue = configuration.getBoolean("exampleConfig", configuration.CATEGORY_GENERAL, true, "This is an example config file");

		if (configuration.hasChanged())
		{
			configuration.save();
			LogHelper.info("Configuration letsmodreboot saved");
		}
	}
}
