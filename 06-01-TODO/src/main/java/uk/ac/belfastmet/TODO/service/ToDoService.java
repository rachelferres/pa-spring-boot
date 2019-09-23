package uk.ac.belfastmet.TODO.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.belfastmet.TODO.controller.ToDoController;
import uk.ac.belfastmet.TODO.domain.ToDo;

public class ToDoService {
	Logger logger = LoggerFactory.getLogger(ToDoService.class);
	private ArrayList<ToDo> toDoList;
	
	public ArrayList<ToDo> getToDoList(){
		
		this.toDoList = new ArrayList<ToDo>();
		
		this.toDoList.add(new ToDo("Bathroom", "clean the bathroom", "22/9/2019", true, "Rachel", "Medium"));
		this.toDoList.add(new ToDo("Shopping", "go to tescos", "30/9/2019", false, "Rachel", "High"));
		this.toDoList.add(new ToDo("Washing", "do a coloured wash", "25/9/2019", true, "Rachel", "Low"));
		this.toDoList.add(new ToDo("Gym", "go to the gym", "23/9/2019", false, "Rachel", "Medium"));
		this.toDoList.add(new ToDo("Oven", "clean the oven", "1/10/2019", false, "Rachel", "Low"));
		
		
		
		return this.toDoList;
		
		
	}
	public ArrayList<ToDo> getCompletedToDoList(){
		this.toDoList = new ArrayList<ToDo>();
		this.toDoList.add(new ToDo("Bathroom", "clean the bathroom", "22/9/2019", true, "Rachel", "Medium"));
		this.toDoList.add(new ToDo("Washing", "do a coloured wash", "25/9/2019", true, "Rachel", "Low"));

		
		return this.toDoList;
		
		
	}
	
	public ArrayList<ToDo> getInCompletedToDoList(){
		this.toDoList = new ArrayList<ToDo>();
	
		this.toDoList.add(new ToDo("Shopping", "go to tescos", "30/9/2019", false, "Rachel", "High"));
		this.toDoList.add(new ToDo("Gym", "go to the gym", "23/9/2019", false, "Rachel", "Medium"));
		this.toDoList.add(new ToDo("Oven", "clean the oven", "1/10/2019", false, "Rachel", "Low"));

		
		return this.toDoList;
		
		
	}
}
