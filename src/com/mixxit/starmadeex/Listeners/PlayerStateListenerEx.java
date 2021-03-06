package com.mixxit.starmadeex.Listeners;

import org.schema.common.util.linAlg.Vector3i;
import org.schema.game.common.data.player.PlayerState;
import org.schema.game.mod.listeners.PlayerStateListener;
import org.schema.schine.network.objects.Sendable;

import com.mixxit.starmadeex.Player;
import com.mixxit.starmadeex.StarMadeExManager;
import com.mixxit.starmadeex.Factories.RoleFactory;

import obfuscated.Nv;
import obfuscated.Tt;
import obfuscated.apo;
import obfuscated.gg;

public class PlayerStateListenerEx implements PlayerStateListener
{
	
	StarMadeExManager manager;

	public PlayerStateListenerEx(StarMadeExManager starMadeExManager) {
		this.manager = starMadeExManager;
	}

	@Override
	public void onPlayerChangedContol(PlayerState arg0, gg arg1, Vector3i arg2, Sendable arg3, Vector3i arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerCreated(PlayerState arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerCreditsChanged(PlayerState arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerKilled(PlayerState arg0, Nv arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerRemoved(PlayerState playerstate) {
		// TODO Auto-generated method stub
		System.out.println("[STARMADEEX] Player removed : " + playerstate.getName());
		manager.UnregisterPlayerState(playerstate);
		
	}

	@Override
	public void onPlayerSectorChanged(PlayerState arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerSpawned(PlayerState playerstate, Tt arg1) {
		// TODO Auto-generated method stub
		System.out.println("[STARMADEEX] Player Spawned : " + playerstate.getName());
		Player player = new Player(playerstate.getClientId(), playerstate.getName(), RoleFactory.CreateRole(RoleFactory.GetRandomRoleType()));
		player.setPlayerState(playerstate);
		manager.RegisterPlayer(player);
		
	}

	@Override
	public void onPlayerUpdate(PlayerState arg0, apo arg1) {
		// TODO Auto-generated method stub
		
	}

}
