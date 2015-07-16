package com.mixxit.starmadeex;

import com.mixxit.starmadeex.Interfaces.IPlayer;
import com.mixxit.starmadeex.Interfaces.IRole;

public class Player implements IPlayer
{
	public int id;
	public String playername;
	public IRole role;
	
	public Player(int clientid, String playername, IRole role)
	{
		this.id = clientid;
		this.playername = playername;
	}

	@Override
	public IRole getRole() {
		// TODO Auto-generated method stub
		return this.role;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.playername;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
}
