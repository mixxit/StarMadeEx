package com.mixxit.starmadeex.Aspects;

import org.aspectj.lang.annotation.After;
import org.schema.game.common.data.player.PlayerState;
import org.schema.game.server.controller.GameServerController;
import org.schema.schine.network.RegisteredClientOnServer;
import org.schema.schine.network.StateInterface;

import com.mixxit.starmadeex.ServerStateEx;

public aspect GameServerControllerAspect {
	@After("execution(* org.schema.game.server.controller.GameServerController.onLoggedIn(..)) && args(paramRegisteredClientOnServer) && this(g)")
	public void aroundServiceMethodAdvice(RegisteredClientOnServer paramRegisteredClientOnServer, GameServerController g)
	{
		if (g.getServerState() instanceof ServerStateEx)
		{
			ServerStateEx server = (ServerStateEx) g.getServerState();
			server.GetServer().GetManager().OnGameServerClientLoggedIn(paramRegisteredClientOnServer,g);
			
		}
	}
}
