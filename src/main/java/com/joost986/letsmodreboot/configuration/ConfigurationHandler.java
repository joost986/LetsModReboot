package com.joost986.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
	public static void init (File configFile)
	{
		// create config object
		Configuration configuration = new Configuration(configFile);
		boolean exampleConfigValue = false;

		try
		{
			// load the config
			configuration.load();

			// Read in properties from configuration file
			exampleConfigValue = configuration.get("LetsModReboot", "configValue", true, "This is an example config file").getBoolean(true);
		}
		catch (Exception e)
		{
			// log the exception
		}
		finally
		{
			// Save the config
			configuration.save();
		}
		System.out.println(exampleConfigValue);
	}
}
