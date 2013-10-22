package com.MeLxKry.gameMa;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.event.block.BlockRedstoneEvent;



public class EventRouter 
{

	public void handleRedstoneEvent(Block block, BlockRedstoneEvent event, int delayTicks) 
	{
        if (istSchild(block)) 
        {
        	System.out.println(" plugin:  handleRedstoneEvent()  ");
            Sign signBlock = (Sign) block.getState();
            if (signBlock == null) {
                return;
            }
            if (signBlock.getLine(1) == null) {
                return;
            }
            String sLine1 = signBlock.getLine(1);
            System.out.println("   .getLine(0)  " + signBlock.getLine(0) );
            System.out.println("   .getLine(1)  " + sLine1 );
            System.out.println("   .getLine(2)  " + signBlock.getLine(2) );
            //istAutomat(signBlock, block);
        }
	}
	
	
	public void umschauenNachSchild(Block block, BlockRedstoneEvent event)
	{
		handleRedstoneEvent(block.getRelative(0, 0, 0), event, 1);
		handleRedstoneEvent(block.getRelative(1, 0, 0), event, 1);
		handleRedstoneEvent(block.getRelative(-1, 0, 0), event, 1);
		handleRedstoneEvent(block.getRelative(0, 0, 1), event, 1);
		handleRedstoneEvent(block.getRelative(0, 0, -1), event, 1);
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
