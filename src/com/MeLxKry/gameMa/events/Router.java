package com.MeLxKry.gameMa.events;

//import java.awt.Event;
import org.bukkit.block.Block;
import org.bukkit.event.*;
import org.bukkit.event.block.BlockRedstoneEvent;


public final  class Router extends BlockRedstoneEvent 
{
	private final String RouterStatus;
	
	public Router(Block block, int oldCurrent, int newCurrent, String RouterStatus) {
		super(block, oldCurrent, newCurrent);
		this.RouterStatus = RouterStatus;
	}

	private static  HandlerList handlers = new HandlerList();
	 
	@Override
	public HandlerList getHandlers() {
		return Router.handlers;
	}
	
	public String RouterStatus()
	{
		return this.RouterStatus;
	}
	
	public static HandlerList getHandlerList() {
        return Router.handlers;
    }

}
