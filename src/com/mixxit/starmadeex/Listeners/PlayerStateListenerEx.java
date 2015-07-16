package com.mixxit.starmadeex.Listeners;

import org.schema.common.util.linAlg.Vector3i;
import org.schema.game.common.data.player.PlayerState;
import org.schema.game.mod.listeners.PlayerStateListener;
import org.schema.schine.network.objects.Sendable;

import com.mixxit.starmadeex.StarMadeExManager;

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
	public void onPlayerRemoved(PlayerState arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerSectorChanged(PlayerState arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerSpawned(PlayerState arg0, Tt arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerUpdate(PlayerState arg0, apo arg1) {
		// TODO Auto-generated method stub
		
	}

}
