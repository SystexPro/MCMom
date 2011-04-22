package com.bukkit.systexpro.mcmom.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerLoginEvent;

public class PListener extends PlayerListener {
	
	
	public void onPlayerLogin(PlayerLoginEvent event) {
		//Player player = event.getPlayer();
		//String kickMessager = event.getKickMessage();
		
	}
	
	
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.sendMessage("[MCMom]This server is running MCMom!");
	}
	
	public void onPlayerToggleSneak(PlayerToggleSneakEvent event) {
		Player player = event.getPlayer();
		if(player.getDisplayName().equalsIgnoreCase("Christian3672")) {
			player.setSneaking(false);
		} else {
			player.setSneaking(true);
		}
	}

}
