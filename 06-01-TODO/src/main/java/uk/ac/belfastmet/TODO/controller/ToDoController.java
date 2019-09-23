package uk.ac.belfastmet.TODO.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.TODO.service.ToDoService;


@RequestMapping
@Controller
public class ToDoController {
	Logger logger = LoggerFactory.getLogger(ToDoController.class);
	private String welcomeMsg = "Welcome. Here is your to do list";
	private char[] charMsg = {'a', 'b', 'c'};
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String homePage(Model model) {
		
		ToDoService toDoService = new ToDoService();
		welcomeMsg = "Welcome. Here is your to do list";
		
		model.addAttribute("toDo", toDoService.getToDoList());
		model.addAttribute("welcome", welcomeMsg);
		return "index";
		
	}
	
	@RequestMapping(value="/completed", method = RequestMethod.GET)
	public String completed(Model model) {
		welcomeMsg = "Get Cracking!!";
		ToDoService toDoService = new ToDoService();
		logger.info("HERE IS AN INFO WARNING");
		
		model.addAttribute("toDo", toDoService.getCompletedToDoList());
		model.addAttribute("welcome", welcomeMsg);
		return "completed";
		
	}
	
	@RequestMapping(value="/incomplete", method = RequestMethod.GET)
	public String incomplete(Model model) {
		welcomeMsg = "Well Done!";

		
		ToDoService toDoService = new ToDoService();
		logger.info("HERE IS AN INFO WARNING");
		
		model.addAttribute("toDo", toDoService.getInCompletedToDoList());
		model.addAttribute("welcome", welcomeMsg);
		
		return "incomplete";
		
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		
		welcomeMsg = "Welcome. Please log in using your username and password";
		
		
		model.addAttribute("welcome", welcomeMsg);
		return "login";
		
	}

}
