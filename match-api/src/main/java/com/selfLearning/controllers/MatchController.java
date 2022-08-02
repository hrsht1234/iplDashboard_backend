package com.selfLearning.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MatchController {
	
	@RequestMapping
	public String getMatchInfo(String[] args) {
		return "888888888ab";
	}

}
