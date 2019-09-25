package uk.ac.belfastmet.dwarfs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.service.DwarfService;

@Controller
@RequestMapping
public class DwarfController {
	@Autowired
	private DwarfService dwarfService;
	
	Logger logger = LoggerFactory.getLogger(DwarfController.class);
	@GetMapping()
	/**
	 * 
	 * @param model
	 * @return
	 */
	public String homePage(Model model) {
		
		dwarfService.getNumberOfDwarfs();
		
		model.addAttribute("pageTitle", "Dwarfs rule");
		model.addAttribute("numberOfDwarfs", dwarfService.getNumberOfDwarfs());
		return"index";
	}
	
	@GetMapping("/disney")
	public String disneyPage(Model model) {
		dwarfService.getNumberOfDwarfs();
	
		model.addAttribute("pageTitle", "Disney Dwarfs rule best");
		model.addAttribute("dwarfs", dwarfService.getDisneyDwarfs());
		return "disney";
	}
	
	@GetMapping("/tolkien")
	public String tolkienPage(Model model) {
		dwarfService.getNumberOfDwarfs();
		model.addAttribute("pageTitle", "Tolkien Dwarves rule best");
		model.addAttribute("dwarfs", dwarfService.getTolkienDwarfs());
		return "tolkien";
	}

}
