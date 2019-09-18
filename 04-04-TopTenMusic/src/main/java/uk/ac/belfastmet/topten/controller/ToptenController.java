package uk.ac.belfastmet.topten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.topten.service.ToptenService;

@Controller
@RequestMapping
public class ToptenController {
	
	
	@GetMapping()
	public String homePage(Model model) {
		model.addAttribute("pageTitle", "TopTen");
		model.addAttribute("numberOfTopten", "10");
		return "index";
	}
	
	@GetMapping("/single")
	public String singlePage(Model model) {
		ToptenService toptenService = new ToptenService();
	
		model.addAttribute("pageTitle", "Top ten singles");
		model.addAttribute("topten", toptenService.getSingleTopten());
		return "single";
	}
	
	@GetMapping("/album")
	public String albumPage(Model model) {
		ToptenService toptenService = new ToptenService();
	
		model.addAttribute("pageTitle", "Top ten albums");
		model.addAttribute("topten", toptenService.getAlbumTopten());
		return "album";
	}

}
