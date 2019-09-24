package uk.ac.belfastmet.TODO.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.TODO.domain.ToDo;
import uk.ac.belfastmet.TODO.repository.ToDoRepository;

@Service
public class ToDoService {
	private static Logger logger = LoggerFactory.getLogger(ToDoService.class);
	private ArrayList<ToDo> toDoList;
	
	@Autowired
	private ToDoRepository toDoRepository;
	
	public void getNumberOfTasks(){
		
		logger.info("# of tasks: {}", toDoRepository.count());
		Iterable <ToDo> toDoList = toDoRepository.findAll();
		Iterator <ToDo> iterator = toDoList.iterator();
		while(iterator.hasNext()) {
			logger.info("{}", iterator.next().toString());
		}
	}
	
	//public ArrayList<ToDo> getToDoList(){
		
//		this.toDoList = new ArrayList<ToDo>();
//		
//		this.toDoList.add(new ToDo("Bathroom", "clean the bathroom", "22/9/2019", true, "Rachel", "Medium"));
//		this.toDoList.add(new ToDo("Shopping", "go to tescos", "30/9/2019", false, "Rachel", "High"));
//		this.toDoList.add(new ToDo("Washing", "do a coloured wash", "25/9/2019", true, "Rachel", "Low"));
//		this.toDoList.add(new ToDo("Gym", "go to the gym", "23/9/2019", false, "Rachel", "Medium"));
//		this.toDoList.add(new ToDo("Oven", "clean the oven", "1/10/2019", false, "Rachel", "Low"));
//		
		
		
		//return this.toDoList;
		
		
	//}
	public ArrayList<ToDo> getCompletedToDoList(){
		this.toDoList = new ArrayList<ToDo>();
		this.toDoList.add(new ToDo("Bathroom", "clean the bathroom", "22/9/2019", "Rachel", "Medium"));
		this.toDoList.add(new ToDo("Washing", "do a coloured wash", "25/9/2019", "Rachel", "Low"));

		
		return this.toDoList;
		
		
	}
	
	public ArrayList<ToDo> getInCompletedToDoList(){
		this.toDoList = new ArrayList<ToDo>();
	
		this.toDoList.add(new ToDo("Shopping", "go to tescos", "30/9/2019", "Rachel", "High"));
		this.toDoList.add(new ToDo("Gym", "go to the gym", "23/9/2019", "Rachel", "Medium"));
		this.toDoList.add(new ToDo("Oven", "clean the oven", "1/10/2019", "Rachel", "Low"));

		
		return this.toDoList;
		
		
	}
}
