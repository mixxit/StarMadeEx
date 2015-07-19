package com.mixxit.starmadeex;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import org.schema.game.server.controller.GameServerController;

import obfuscated.aiV;
import obfuscated.apb;
import obfuscated.e;
import obfuscated.gw;

public class StarMadeServer
{
	private StarMadeExManager manager;
	private ServerStateEx serverstate = null;
	private GameServerController servercontroller;
	public void SetManager(StarMadeExManager manager)
	{
		this.manager = manager;
	}
	
	public StarMadeExManager GetManager()
	{
		return this.manager;		
	}
	
	public void Start(StarMadeExManager manager) throws InterruptedException, IOException
	{
		System.err.println("[STARMADEEX][SERVER] Initializing");
		
		apb.a(new gw());
		
		SetManager(manager);
		
		try
		{		
			serverstate = new ServerStateEx(this);
		} catch (Exception localSQLException)
		{
			localSQLException.printStackTrace();
			e.a(localSQLException);
			System.exit(-1);		
		}
		servercontroller = new GameServerController(serverstate);
		servercontroller.startServerAndListen();
		while(!servercontroller.isListenting())
		{
			Thread.sleep(30L);
		}
		
		File localFile;
        if ((localFile = new File("./debugPlayerLock.lock")).exists()) {
          localFile.delete();
        }
        
        localFile.createNewFile();
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(localFile));
        synchronized (serverstate.getClients())
        {
        	dos.writeInt(serverstate.getClients().size());
        }
        dos.close();
        
        System.err.println("[STARMADEEX][SERVER] INTIALIZED!");
        
	}
}
