package com.devsuperior.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.Entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	List<Game> findAll();

}
