package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/shrekmovie")
public class ShrekController {
	
	@GetMapping("")
	public String home() {
		return "Characters in the movie shrek";
	}
	
	@GetMapping("/shrek")
	public String shrek() {
		return "Shrek was played by Mike Myers";
	}

	@GetMapping("/donkey")
	public String donkey() {
		return "donkey was played by Eddie Murphy";
	}
}
