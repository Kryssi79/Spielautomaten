package com.MeLxKry.gameMa;

import com.MeLxKry.gameMa.*;
import com.MeLxKry.gameMa.Machines.bandit;
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
		String sRouterStatus = event.RouterStatus();
        if(sRouterStatus=="init") { onInit(event); }
        if(sRouterStatus=="ready") {  }  //TODO:  wenn bereit zum spielen
	}
	
	
	private void onInit(Router event)
	{
		System.out.println(" onRouterEvent()  =>  onInit() " );
		Block block = event.getBlock();
		Sign signBlock = (Sign) block.getState();
		String sRouterStatus = event.RouterStatus();
		int iMachineID = event.getMachineID();
		String sInitLine = signBlock.getLine(1).toLowerCase();
		System.out.println("  RouterStatus =  " + sRouterStatus );
		System.out.println("   Machine ID  =  " + iMachineID );
		System.out.println("  .getLine(0)  " + signBlock.getLine(0) );
		System.out.println("  .getLine(1)  " + signBlock.getLine(1) );
        System.out.println("  .getLine(2)  " + signBlock.getLine(2) );
        if( iMachineID == 1 )
        {
        	bandit gamingMachine = new bandit();
        	String sName = gamingMachine.getName();
        	System.out.println("  sName = " + sName );
        	//TODO:  Machine erstellen  =>  Status auf "ready" (bereit zum spielen) => Infos in  Block Metadata  schreiben 
        }
        else if( iMachineID == 2 )
        {
        	// ... 
        }
        else
        {
        	// ... 
        }
	}
	
}
