package com.example.firstweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {
	
	@GetMapping({"/game"})
	public String game() {
		return "game";
		}
	
	@GetMapping({"/GusseMyNumber/gusseMyNumber"})
	public String GusseMyNumber() {
		return "/GusseMyNumber/gusseMyNumber";
		}


	
	
}
