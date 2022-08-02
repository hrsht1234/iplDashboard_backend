package com.selfLearning.iplProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IPLController {
	
	
	@GetMapping("/matchInfo")
	public String getMatchResults() {
		return "MAtch 1";
	}
 
}
