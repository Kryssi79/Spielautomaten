package com.MeLxKry.gameMa;

import com.MeLxKry.gameMa.*;
import com.MeLxKry.gameMa.events.Router;

import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;


public class MachinesRouter  implements Listener 
{

	main plugin;
	
	public MachinesRouter(main plugin) 
	{
		this.plugin = plugin;
	}
	
	@EventHandler(priority=EventPriority.NORMAL )
	public void onRouterEvent(Router event) 
	{
		System.out.println(" onRouterEvent()  " );
		Block block = event.getBlock();
		Sign signBlock = (Sign) block.getState();
		System.out.println("  RouterStatus =  " + event.RouterStatus() );
		System.out.println("  .getLine(0)  " + signBlock.getLine(0) );
		System.out.println("  .getLine(1)  " + signBlock.getLine(1) );
        System.out.println("  .getLine(2)  " + signBlock.getLine(2) );
	}
	
}
