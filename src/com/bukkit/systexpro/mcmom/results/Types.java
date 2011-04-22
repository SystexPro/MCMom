package com.bukkit.systexpro.mcmom.results;

import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;

public class Types {
	
	
	public static Result kickBanned() {
		return PlayerLoginEvent.Result.KICK_BANNED;
	}
	public static Result kick() {
		return PlayerLoginEvent.Result.KICK_OTHER;
	}
	
}
