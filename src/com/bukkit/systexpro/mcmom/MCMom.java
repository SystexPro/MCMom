package com.bukkit.systexpro.mcmom;

import java.io.File;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;
import org.bukkit.plugin.Plugin;
import com.beecub.bLog.bLogger;
import com.bukkit.systexpro.mcmom.listeners.PListener;

public class MCMom extends JavaPlugin {
	
	public static PermissionHandler Permissions;
	public static bLogger bLogger = new bLogger();
	public final PListener playerListener = new PListener();
	public File mcMomDir = new File("/mcmom");
	
	
	public MCMom()
	{
		//
	}
	
	@Override
	public void onDisable() {
		System.out.println("[MCMom] Unloaded!");
	}

	@Override
	public void onEnable() {
		System.out.println("[MCMom] Loaded!");
		registerPlugins();
		setupPermissions();
		
	}
	
	private void registerPlugins() {
		PluginManager pluginManager = getServer().getPluginManager();
		pluginManager.registerEvent(Event.Type.PLAYER_JOIN, this.playerListener, Priority.Monitor, this);
		pluginManager.registerEvent(Event.Type.PLAYER_LOGIN, this.playerListener, Priority.Monitor, this);
		pluginManager.registerEvent(Event.Type.PLAYER_TOGGLE_SNEAK, this.playerListener, Priority.Monitor, this);
		System.out.println("Edit plugins Loaded");
	}
	
	 @SuppressWarnings("static-access")
	private void setupPermissions() {
	      Plugin test = this.getServer().getPluginManager().getPlugin("Permissions");

	      if (this.Permissions == null) {
	          if (test != null) {
	              this.Permissions = ((Permissions)test).getHandler();
	              System.out.println("MCMom hooks into Permissions");
	          } else {
	              System.out.println("Permissions not found. Unloading Permissions from MCMom");
	          }
	      }
	  }
	 
	 /**
	 * @return the permissions
	 */
	 public PermissionHandler getPermissions() {
		 return Permissions;
	 }
	
}
