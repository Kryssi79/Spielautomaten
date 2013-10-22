package com.MeLxKry.gameMa;


import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.*;



// slot machines   /   gaming machines   
// Plugin:  gamingMachines.jar

public class main extends JavaPlugin 
{
	private String pluginName;
	public static String[] sInits = { "game.bandit" };  // for EventRouter   signBlock.getLine(1)
	
	
	@Override
	public void onEnable()
	{
		// Save a copy of the default config.yml if one is not there
        //this.saveDefaultConfig();
		loadVersion();
		printInConsole("starte:   gamingMachines - Plugin ");
		Bukkit.getLogger().info("gamingMachines  Plugin  enabled  ... ");
		
		// Events: 
        getServer().getPluginManager().registerEvents(new EventListener(this), this);
	}
	
	
	@Override
	public void onDisable()
	{
		printInConsole(this.pluginName + " disabled");
	}
	
	
	private void loadVersion() {
        PluginDescriptionFile pdfFile = getDescription();
        this.pluginName = (pdfFile.getName() + " v" + pdfFile.getVersion() + " ");
    }
	
	
	public static void printInConsole(String str) {
        System.out.println("[ gamingMachines ] " + str);
    }
	
	
}
