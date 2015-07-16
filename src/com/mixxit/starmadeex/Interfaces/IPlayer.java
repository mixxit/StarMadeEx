package com.mixxit.starmadeex.Interfaces;

import org.schema.game.common.data.player.PlayerState;

public interface IPlayer {
	public IRole getRole();
	public String getName();
	public int getId();
	public void setPlayerState(PlayerState playerstateref);
	public PlayerState getPlayerState();
}
