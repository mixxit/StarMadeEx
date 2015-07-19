package com.mixxit.starmadeex.Aspects;

import java.security.acl.Owner;
import java.util.ArrayList;

import org.aspectj.lang.annotation.After;
import org.schema.game.common.data.player.ControllerState;
import org.schema.game.network.objects.NetworkPlayer;
import org.schema.schine.network.RegisteredClientOnServer;
import org.schema.schine.network.server.ServerStateInterface;

import com.mixxit.starmadeex.ServerStateEx;

public aspect ControllerStateAspect {

	// fires on move event but also triggers on object use
	// used to start onMove() and onPrimaryClick() onSecondaryClick()
	// use NetworkPlayer to grab other events such as fire, harvest etc
	@After("execution(* org.schema.game.common.data.player.ControllerState.handleControllerStateFromNT(..)) && args(paramNetworkPlayer) && this(c)")
	public void aroundServiceMethodAdvice(NetworkPlayer paramNetworkPlayer, ControllerState c)
	{
		if (c.getOwner().getState() instanceof ServerStateEx)
		{
			
			ServerStateEx server = (ServerStateEx) c.getOwner().getState();
			server.GetServer().GetManager().OnPlayerStateChange(paramNetworkPlayer,c);
		}
		/*
		try
		{
			JsePlatform.standardGlobals();
			ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("luaj");
			File luafile = new File("./data/script/ControllerState.lua");
			BufferedReader reader = new BufferedReader(new FileReader((File)luafile));
			CompiledScript compiledScript = ((Compilable)scriptEngine).compile(reader);
			SimpleBindings bindings = new SimpleBindings();
			compiledScript.eval(bindings);
			LuaValue luaControllerState = CoerceJavaToLua.coerce(o);
			LuaValue luaBindings = CoerceJavaToLua.coerce(bindings);
			luaControllerState = ((LuaFunction) bindings.get("create")).call(luaControllerState, luaBindings);
		} catch (Exception e)
		{
			System.out.println("Exception: " + e.getMessage() + " " + e.getStackTrace());
			
		}
		*/
		//HashSet localHashSet = new HashSet();
		
		//Un localUn = o.getOwner().getInventory();
		//int i = o.getOwner().
		
		
		// send message on right to player
		//o.getOwner().sendServerMessage(new ServerMessage("Triggered event for "+inv, 3, o.getOwner().getId()));
		
		//Short targetitem = 598;
		//long slot = o.getOwner().getSelectedBuildSlot();
		//o.getOwner().getInventory(null).a(slot, targetitem, -1);
		
		
		// get count of an item in current slot by type
		//Short item = (short) o.getOwner().getInventory(null).a(o.getOwner().getSelectedBuildSlot(), targetitem);
		//System.out.println(o.getOwner().getName() + item);
		
		// find if the player has an item in the inventory
		/*
		if (o.getOwner().getInventory(null).a(item, true) == -1) {
			
			System.out.println(o.getOwner().getName() + " 598 is -1");
			
		}
		*/
		
		
		
/*		for (int i = 0; i < paramNetworkPlayer.controlRequestParameterBuffer.getReceiveBuffer().size(); i++)
		{
			RemoteIntegerArray localRemoteIntegerArray;
			int j = ((Integer)(localRemoteIntegerArray = (RemoteIntegerArray)paramNetworkPlayer.controlRequestParameterBuffer.getReceiveBuffer().get(i)).get(0).get()).intValue();
			Vector3i localVector3i1 = new Vector3i(((Integer)localRemoteIntegerArray.get(1).get()).intValue(), ((Integer)localRemoteIntegerArray.get(2).get()).intValue(), ((Integer)localRemoteIntegerArray.get(3).get()).intValue());
			int k = ((Integer)localRemoteIntegerArray.get(4).get()).intValue();
			Vector3i localVector3i2 = new Vector3i(((Integer)localRemoteIntegerArray.get(5).get()).intValue(), ((Integer)localRemoteIntegerArray.get(6).get()).intValue(), ((Integer)localRemoteIntegerArray.get(7).get()).intValue());
			boolean bool = ((Integer)localRemoteIntegerArray.get(8).get()).intValue() == 1;
			Tg localTg = new Tg(o.getOwner(), j, localVector3i1, k, localVector3i2, bool);
			System.out.println("[CONTROLLERSTATE] " + o.getOwner().getState() + "; " + o.getOwner() + " CONTROLLER REQUEST RECEIVED  " + localTg);
		}*/
	}
}
