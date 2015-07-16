package com.mixxit.starmadeex;

import org.schema.game.common.data.player.PlayerState;
import org.schema.game.network.objects.NetworkPlayer;

import com.mixxit.starmadeex.Interfaces.IPlayer;
import com.mixxit.starmadeex.Interfaces.IRole;

public class Player implements IPlayer
{
	public int id;
	public String playername;
	public IRole role;
	private PlayerState playerstateref;
	
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

	@Override
	public void setPlayerState(PlayerState playerstateref) {
		// TODO Auto-generated method stub
		this.playerstateref = playerstateref;
	}

	@Override
	public PlayerState getPlayerState() {
		// TODO Auto-generated method stub
		return this.playerstateref;
	}

}
