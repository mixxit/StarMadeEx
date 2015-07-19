package com.mixxit.starmadeex.Aspects;

import org.aspectj.lang.annotation.After;
import org.schema.common.util.linAlg.Vector3i;
import org.schema.game.common.data.player.PlayerState;
import org.schema.game.server.controller.GameServerController;
import org.schema.schine.network.RegisteredClientOnServer;
import org.schema.schine.network.objects.Sendable;

import com.mixxit.starmadeex.ServerStateEx;

import obfuscated.Tt;

public aspect TtAspect {
	@After("execution(* obfuscated.Tt.a(..)) && args(paramPlayerState,paramSendable,paramVector3i) && this(tt)")
	public void aroundServiceMethodAdvice(PlayerState paramPlayerState, Sendable paramSendable, Vector3i paramVector3i,Tt tt)
	{
		if (paramPlayerState.getState() instanceof ServerStateEx)
		{
			if(paramSendable == null)
			{
				ServerStateEx server = (ServerStateEx) paramPlayerState.getState();
				server.GetServer().GetManager().OnPlayerSpawned(paramPlayerState, paramVector3i,tt);
				
			} else {
				ServerStateEx server = (ServerStateEx) paramPlayerState.getState();
				server.GetServer().GetManager().OnPlayerSpawnedFromShip(paramPlayerState, paramSendable, paramVector3i,tt);
			}
			
		}
	}
}
