package com.mixxit.starmadeex.Aspects;

import org.aspectj.lang.annotation.After;
import org.schema.game.common.data.player.PlayerState;
import org.schema.game.mod.ModManager;
import org.schema.schine.network.StateInterface;

import com.mixxit.starmadeex.ServerStateEx;

public aspect PlayerStateAspect {
	@After("execution(* org.schema.game.common.data.player.PlayerState.setState(..)) && args(paramStateInterface) && this(p)")
	public void aroundServiceMethodAdvice(StateInterface paramStateInterface, PlayerState p)
	{
		if (p.getOwnerState().getState() instanceof ServerStateEx)
		{
			ServerStateEx server = (ServerStateEx) p.getOwnerState().getState();
			server.GetServer().GetManager().OnPlayerSetState(p,paramStateInterface);
		}
	}
}
