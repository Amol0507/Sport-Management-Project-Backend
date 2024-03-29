package com.service;

import java.util.List;
import java.util.Map;

import com.model.Player;



public interface PlayerService {

	Player savePlayer(Player player);
	Player getPlayerById(int id);
	List<Player> getAllPlayers();
    Player updatePlayer(Player player);
	//Player updatePlayer(int id,Player player);
    Player deletePlayer(int id);
    public  Map<String, Boolean> deletePlayer1(int id) ;
}
