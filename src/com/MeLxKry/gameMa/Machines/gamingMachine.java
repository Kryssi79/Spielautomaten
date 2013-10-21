package com.MeLxKry.gameMa.Machines;


import org.bukkit.Server;


public abstract class  gamingMachine 
{
	private String m_Name = "";
	private boolean isEnabled = false;
	private boolean initialized = false;
	
	
	public gamingMachine() {}
	
	
	public String getName() {
		return this.m_Name;
	}
	
	public void setName(String name) {
		this.m_Name = name;
	}
	
}
