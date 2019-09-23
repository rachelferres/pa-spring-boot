package uk.ac.belfastmet.topten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.belfastmet.topten.service.ToptenService;

@Controller
@RequestMapping()
public class ToptenController {
	
	Logger logger = LoggerFactory.getLogger(ToptenController.class);
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/", method = RequestMethod.GET)
	//@GetMapping()
	public String homePage(Model model) {
		model.addAttribute("pageTitle", "TopTen");
		model.addAttribute("numberOfTopten", "10");
		logger.info("HERE IS AN INFO WARNING");
		return "index";
	}
	
	/**
	 * 
	 * @param model topten calls the arrayList of singles 
	 * @return the single page
	 */
	@RequestMapping(value="/single", method = RequestMethod.GET)
	//@GetMapping("/single")
	public String singlePage(Model model) {
		ToptenService toptenService = new ToptenService();
	
		model.addAttribute("pageTitle", "Top ten singles");
		model.addAttribute("topten", toptenService.getSingleTopten());
		return "single";
	}
	/**
	 * 
	 * @param model top ten calls the album arrayList
	 * @return the album page
	 */
	@RequestMapping(value="/album", method = RequestMethod.GET)
	//@GetMapping("/album")
	public String albumPage(Model model) {
		ToptenService toptenService = new ToptenService();
	
		model.addAttribute("pageTitle", "Top ten albums");
		model.addAttribute("topten", toptenService.getAlbumTopten());
		return "album";
	}

}
