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
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String homePage(Model model) {
		
		ToDoService toDoService = new ToDoService();
		
		
		model.addAttribute("toDo", toDoService.getToDoList());
		
		return "index";
		
	}
	
	@RequestMapping(value="/completed", method = RequestMethod.GET)
	public String completed(Model model) {
		
		ToDoService toDoService = new ToDoService();
		logger.info("HERE IS AN INFO WARNING");
		
		model.addAttribute("toDo", toDoService.getCompletedToDoList());
		
		return "completed";
		
	}
	
	@RequestMapping(value="/incomplete", method = RequestMethod.GET)
	public String incomplete(Model model) {
		
		ToDoService toDoService = new ToDoService();
		logger.info("HERE IS AN INFO WARNING");
		
		model.addAttribute("toDo", toDoService.getInCompletedToDoList());
		
		return "incomplete";
		
	}

}
