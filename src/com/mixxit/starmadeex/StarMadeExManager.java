package com.mixxit.starmadeex;

import org.schema.game.common.Starter;
import org.schema.game.mod.Mod;

import com.mixxit.starmadeex.Listeners.PlayerStateListenerEx;

public class StarMadeExManager {

	Mod mod = new Mod() {};
	public StarMadeExManager()
	{
		
		
	}
	
	public void Start()
	{
		
		loadListeners();
	}
	
	private void loadListeners()
	{
		mod.addListener(new PlayerStateListenerEx(this));
		Starter.modManager.registerMod(mod);
		
	}
}
