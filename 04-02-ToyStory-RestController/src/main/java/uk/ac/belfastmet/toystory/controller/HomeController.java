package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping()
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Home Page";
	}
	
	@GetMapping("/woody")
	public String woody() {
		return "Woody was played by Tom Hanks";
	}
	
	@GetMapping("/buzz")
	public String buzz() {
		return "Buzz lightyear was played by tim allen";
	}
	
	
	@GetMapping("/mrPotatoHead")
	public String mrPotatoHead() {
		return "Mr Potato Head was played by Don Rickles";
	}
	
	@GetMapping("/rex")
	public String rex() {
		return "Rex was played by Wallace Shawn";
	}

}
