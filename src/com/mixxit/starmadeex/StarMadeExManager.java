package com.mixxit.starmadeex;

import java.util.ArrayList;

import org.schema.game.common.Starter;
import org.schema.game.common.data.player.PlayerState;
import org.schema.game.mod.Mod;

import com.mixxit.starmadeex.Listeners.PlayerStateListenerEx;

public class StarMadeExManager {

	Mod mod = new Mod() {};
	private ArrayList<Player> playerList = new ArrayList<Player>();
	public StarMadeExManager()
	{
	      System.out.println("[STARMADEEX] Config LOADED!");
	      
	      
	}
	
	public void Start()
	{
		
		loadListeners();
	}
	
	private void loadListeners()
	{
		mod.addListener(new PlayerStateListenerEx(this));
		Starter.modManager.registerMod(mod);
		System.out.println("[STARMADEEX] Listening for new Players");
		
	}

	public void RegisterPlayer(Player player) {
		// TODO Auto-generated method stub
		playerList.add(player);
		OnPlayerRegistered(player);
		System.out.println("[STARMADEEX] Registered New Player : " + player.getName());
	}
	
	public void OnPlayerRegistered(Player player)
	{
		MessagePlayer(player,"You have been assigned the role of " + player.getRole().getRoleName());
		
		System.out.println("[STARMADEEX] Assigned role of "+player.getRole().getRoleName()+" to " + player.getName());
	}
	
	public void MessagePlayer(Player player, String message)
	{
		player.getPlayerState().sendServerMessagePlayerSimple(message);
	}

	public void UnregisterPlayerState(PlayerState playerstate) {
		Player foundplayer = null;
		for(Player player : playerList)
		{
			if (player.getPlayerState().equals(playerstate))
			{
				foundplayer = player;
			}
		}
		if (foundplayer != null)
		{
			playerList.remove(foundplayer);
			System.out.println("[STARMADEEX] Unregistered Player : " + foundplayer.getName());
		}
		
	}
}
