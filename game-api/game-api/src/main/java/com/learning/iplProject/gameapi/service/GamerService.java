package com.learning.iplProject.gameapi.service;

import java.util.Arrays;
import java.util.Optional;


import com.learning.iplProject.gameapi.entity.Players;
import com.learning.iplProject.gameapi.repository.GameRepository;
import com.learning.iplProject.gameapi.models.GameInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class GamerService {
	
	
	@Autowired
	GameRepository repo;
	public GameInfo getAllGames(int id) throws Exception {
		
		
			Optional<Players> player = repo.findById(id);
			if(player.isPresent()) {
				GameInfo a = new GameInfo();
				a.setPlayername(player.get().name);
				a.setCountryName("Cool");
				return a;
			}
			throw new Exception("Invalid ID");
		
		
	
		
	}

}
