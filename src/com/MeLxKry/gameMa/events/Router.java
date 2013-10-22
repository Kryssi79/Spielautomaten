package com.MeLxKry.gameMa.events;

//import java.awt.Event;
import org.bukkit.block.Block;
import org.bukkit.event.*;
import org.bukkit.event.block.BlockRedstoneEvent;


public final  class Router extends BlockRedstoneEvent 
{
	private static  HandlerList handlers = new HandlerList();
	private final String m_RouterStatus;
	private final int m_ID;
	
	public Router(Block block, int oldCurrent, int newCurrent, String RouterStatus, int iMachineID) {
		super(block, oldCurrent, newCurrent);
		this.m_RouterStatus = RouterStatus;
		this.m_ID = iMachineID;
	}

	 
	@Override
	public HandlerList getHandlers() {
		return Router.handlers;
	}
	
	public String RouterStatus()
	{
		return this.m_RouterStatus;
	}
	
	public int getMachineID()
	{
		return this.m_ID;
	}
	
	public static HandlerList getHandlerList() {
        return Router.handlers;
    }

}
