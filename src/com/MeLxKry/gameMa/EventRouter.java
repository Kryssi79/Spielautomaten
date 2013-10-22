package com.MeLxKry.gameMa;


import com.MeLxKry.gameMa.*;
import com.MeLxKry.gameMa.events.Router;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.event.block.BlockRedstoneEvent;



public class EventRouter 
{

	public boolean handleRedstoneEvent(Block block, BlockRedstoneEvent event) 
	{
        if (istSchild(block)) 
        {
            Sign signBlock = (Sign) block.getState();
            if (signBlock == null) {
                return false;
            }
            // System.out.println(" plugin:  handleRedstoneEvent()  ");
            if ( signBlock.getLine(1) == null) { return false; }
            if ( signBlock.getLine(1) == "") {
            	System.out.println("  .getLine(1)  " + signBlock.getLine(1) );
            	return false;
            }
            String sLine0 = signBlock.getLine(0).toLowerCase();
            if(sLine0=="init") { return true; }
            String sLine1 = signBlock.getLine(1).toLowerCase();
            for(int iLi=0; iLi<main.sInits.length; iLi++)  
            {
            	String sInit = main.sInits[iLi].toLowerCase();
            	if (sLine1.contains(sInit))
            	{
            		signBlock.setLine(0, "init"); //  "init"  =>  "is in use"  
            		signBlock.update();
            		Machines(block, event, "init", iLi+1);
            		return true;
            	}
            }
            return false;
        }
        return false;
	}
	
	
	private void Machines(Block block, BlockRedstoneEvent event, String sStatus, int iMachineID)
	{
		//  MachinesRouter ... 
        Router RouterEventer = new Router(block, event.getOldCurrent(), event.getNewCurrent(), sStatus, iMachineID); 
        Bukkit.getPluginManager().callEvent( RouterEventer );
	}
	
	
	public void umschauenNachSchild(Block block, BlockRedstoneEvent event)
	{
		handleRedstoneEvent(block.getRelative(0, 0, 0), event);
		handleRedstoneEvent(block.getRelative(1, 0, 0), event);
		handleRedstoneEvent(block.getRelative(-1, 0, 0), event);
		handleRedstoneEvent(block.getRelative(0, 0, 1), event);
		handleRedstoneEvent(block.getRelative(0, 0, -1), event);
	}
	
	public boolean istSchild(Block block)
	{
		if (block.getType().equals(Material.WALL_SIGN)) 
		{
			return true;
		}
		return false;
	}
	
	
	
	
}
