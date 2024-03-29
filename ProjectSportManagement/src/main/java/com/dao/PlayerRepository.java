package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
