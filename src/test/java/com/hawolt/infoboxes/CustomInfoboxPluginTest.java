package com.hawolt.infoboxes;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class CustomInfoboxPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(CustomInfoboxPlugin.class);
		RuneLite.main(args);
	}
}