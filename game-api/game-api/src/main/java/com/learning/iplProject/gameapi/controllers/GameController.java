package com.learning.iplProject.gameapi.controllers;

import com.learning.iplProject.gameapi.service.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class GameController {
	
	
	@Autowired
	GamerService gameService;
	 @Autowired
	   RestTemplate restTemplate;

	@GetMapping
	public ResponseEntity<?> getAllGames() {

		List<String> a = restTemplate.getForObject("http://matchup-service/", List.class);
		return ResponseEntity.ok(a);
//		try {
//			return ResponseEntity.ok(gameService.getAllGames(id));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			return (ResponseEntity<?>) ResponseEntity.notFound();
//		}
		//return ResponseEntity<>;
		
	}
	

	
}
