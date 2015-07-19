package com.mixxit.starmadeex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import org.schema.common.util.linAlg.Vector3i;
import org.schema.game.common.Starter;
import org.schema.game.common.controller.EditableSendableSegmentController;
import org.schema.game.common.data.element.ControlElementMapperFactory;
import org.schema.game.common.data.element.ElementCountMapFactory;
import org.schema.game.common.data.element.ElementKeyMap;
import org.schema.game.common.data.player.ControllerState;
import org.schema.game.common.data.player.PlayerState;
import org.schema.game.mod.Mod;
import org.schema.game.mod.ModManager;
import org.schema.game.network.objects.NetworkPlayer;
import org.schema.game.server.controller.GameServerController;
import org.schema.schine.network.ChatSystem;
import org.schema.schine.network.NetUtil;
import org.schema.schine.network.RegisteredClientOnServer;
import org.schema.schine.network.StateInterface;
import org.schema.schine.network.objects.Sendable;
import org.schema.schine.network.server.ServerController;
import org.schema.schine.network.server.ServerMessage;

import com.mixxit.starmadeex.Factories.RoleFactory;

import obfuscated.KR;
import obfuscated.KU;
import obfuscated.LM;
import obfuscated.LR;
import obfuscated.LV;
import obfuscated.Lb;
import obfuscated.Mb;
import obfuscated.Me;
import obfuscated.Mg;
import obfuscated.NK;
import obfuscated.PE;
import obfuscated.Pu;
import obfuscated.Tt;
import obfuscated.UR;
import obfuscated.Vq;
import obfuscated.Vs;
import obfuscated.Vu;
import obfuscated.ZV;
import obfuscated.akC;
import obfuscated.axp;
import obfuscated.e;
import obfuscated.gw;
import obfuscated.n;
import obfuscated.z;


public class StarMadeExManager {

	StarMadeServer server;
	Starter starter;
	
	
	
	public StarMadeExManager()
	{
	      System.out.println("[STARMADEEX] Config LOADED!");
	}
	
	public void Start(String[] args)
	{
		starter = new Starter();
		
		String[] launchargs = new String[1];
		launchargs[0] = "-nogui";
		
		starter.main(launchargs);
	    
		server = new StarMadeServer();
		try {
			server.Start(this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	  
	
	public void OnPlayerStateChange(NetworkPlayer paramNetworkPlayer, ControllerState paramControllerState)
	{
		//System.out.println("OnPlayerStateChange");
		
	}
	
	public void MessagePlayer(PlayerState paramPlayerState, String message)
	{
		try
		{
			if (paramPlayerState.isOnServer())
			{
				ServerStateEx server = (ServerStateEx)paramPlayerState.getState();
				
				RegisteredClientOnServer clientonserver = (RegisteredClientOnServer) server.getClients().get(Integer.valueOf(paramPlayerState.getClientId()));
				if (clientonserver != null)
				{
					clientonserver.serverMessage(message);			
				}
			}
		} catch (Exception e)
		{
			System.err.println("[STARMADEEX] Exception during message system");
			
		}
	}

	public void OnPlayerCreated(PlayerState paramPlayerState) {
		
	}

	public void OnPlayerSetState(PlayerState paramPlayerState, StateInterface paramStateInterface) {
		// TODO Auto-generated method stub
		
	}

	public void OnGameServerClientLoggedIn(RegisteredClientOnServer paramRegisteredClientOnServer,
			GameServerController g) {
		
		
	}

	public void OnPlayerSpawned(PlayerState paramPlayerState, Vector3i paramVector3i, Tt tt) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BaseRole role = RoleFactory.CreateRole(RoleFactory.GetRandomRoleType());
		MessagePlayer(paramPlayerState,"You have been assigned the role of " + role.getRoleName());
		System.out.println("[STARMADEEX] Assigned role of "+role.getRoleName()+" to " + paramPlayerState.getName());
	}

	public void OnPlayerSpawnedFromShip(PlayerState paramPlayerState, Sendable paramSendable, Vector3i paramVector3i,
			Tt tt) {
		// TODO Auto-generated method stub
		System.out.println("[STARMADEEX ONPLAYERSPAWNEDFROMSHIP");
	}


	
}
