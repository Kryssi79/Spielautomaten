package com.MeLxKry.gameMa;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;

import com.MeLxKry.gameMa.main;


public class EventListener implements Listener 
{

	main plugin;
	EventRouter router;
	
	public EventListener(main plugin) 
	{
		this.plugin = plugin;
		router = new EventRouter();
	}
	
	
	
	@EventHandler(priority=EventPriority.HIGH )
	public void onBlockRedstone(BlockRedstoneEvent event) 
	{
		Block block = event.getBlock();
		int iBlockID = block.getTypeId();
		if (iBlockID==69 || iBlockID==77 || iBlockID==143) {  return; }
		if(event.getOldCurrent() >=1 && event.getNewCurrent() == 0 ) { return; }

		if(event.getNewCurrent()>=1) {
			router.umschauenNachSchild(block, event);
		}
		return;
	}
	
	
}
