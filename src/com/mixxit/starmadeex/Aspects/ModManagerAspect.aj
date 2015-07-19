package com.mixxit.starmadeex.Aspects;

import org.aspectj.lang.annotation.After;
import org.schema.game.common.data.player.ControllerState;
import org.schema.game.common.data.player.PlayerState;
import org.schema.game.mod.ModManager;
import org.schema.game.network.objects.NetworkPlayer;

import com.mixxit.starmadeex.ServerStateEx;

public aspect ModManagerAspect {
	@After("execution(* org.schema.game.mod.ModManager.onPlayerCreated(..)) && args(paramPlayerState) && this(mm)")
	public void aroundServiceMethodAdvice(PlayerState paramPlayerState, ModManager mm)
	{
		if (paramPlayerState.getOwnerState().getState() instanceof ServerStateEx)
		{
			ServerStateEx server = (ServerStateEx) paramPlayerState.getOwnerState().getState();
			server.GetServer().GetManager().OnPlayerCreated(paramPlayerState);
		}
	}
}
