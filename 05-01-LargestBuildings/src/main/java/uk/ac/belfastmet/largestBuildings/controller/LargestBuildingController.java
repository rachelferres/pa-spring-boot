package uk.ac.belfastmet.largestBuildings.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.largestBuildings.service.LargestBuildingService;

@Controller
@RequestMapping
public class LargestBuildingController {
	public static LargestBuildingService largestBuildingService = new LargestBuildingService();
	
	@GetMapping("")
	public String homePage() {
		
		return "index";
	}
	
	@GetMapping("/floorArea")
	public String floorArea(Model model) {
		model.addAttribute("pageTitle", "Top ten singles");
		model.addAttribute("buildings", largestBuildingService.getLargestBuildingFloorArea());
		return "floorArea";
	}
	
	@GetMapping("/footPrint")
	public String footPrint() {
		
		return "footPrint";
	}
	
	@PostConstruct
	public void makeBuildingList() {
		largestBuildingService.initLargestBuildings();
	}
	

}
