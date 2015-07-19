package com.mixxit.starmadeex;

import obfuscated.aiV;

public class ServerStateEx extends aiV {

	StarMadeServer server;
	public StarMadeServer GetServer()
	{
		return this.server;
	}
	
	
	public ServerStateEx(StarMadeServer starMadeServer) {
		super();
		// TODO Auto-generated constructor stub
		this.server = starMadeServer;
	}

}
