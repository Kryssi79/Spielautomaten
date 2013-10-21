package com.MeLxKry.gameMa;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.*;



// slot machines   /   gaming machines   
// Plugin:  gamingMachines.jar

public class main extends JavaPlugin 
{
	
	@Override
	public void onEnable()
	{
		// Save a copy of the default config.yml if one is not there
        //this.saveDefaultConfig();
        
		System.out.println("starte:   gamingMachines - Plugin  ");
		Bukkit.getLogger().info("gamingMachines  Plugin  enabled  ... ");
		
		// Events: 
        // getServer().getPluginManager().registerEvents(new EventListener(this), this);
	}
	
	
	@Override
	public void onDisable()
	{
		System.out.println("beende:   gamingMachines - Plugin  ");
	}
	
}
