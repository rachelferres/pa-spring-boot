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
	// private ArrayList<ToDo> toDoList;

	@Autowired
	private ToDoRepository toDoRepository;

	public Iterable<ToDo> getNumberOfTasks() {

		logger.info("# of tasks: {}", toDoRepository.count());
		Iterable<ToDo> toDoList = toDoRepository.findAll();
		Iterator<ToDo> iterator = toDoList.iterator();
		while (iterator.hasNext()) {
			logger.info("{}", iterator.next().toString());

		}
		return toDoList;
	}

	public Iterable<ToDo> getToDoList() {

//		logger.info("# of tasks: {}", toDoRepository.count());
		Iterable<ToDo> toDoList = toDoRepository.findAll();
		Iterator<ToDo> iterator = toDoList.iterator();
		while (iterator.hasNext()) {
			logger.info("{}", iterator.next().toString());
			// toDoList.add(iterator.next());
		}
		return toDoList;
	}

	/**
	 * 
	 * @return todoList containing completed list
	 */
	public Iterable<ToDo> getCompletedToDoList() {
		Iterable<ToDo> toDoList = toDoRepository.findAll();
		Iterator<ToDo> iterator = toDoList.iterator();
		while (iterator.hasNext()) {
			// if()
			logger.info("{}", iterator.next().toString());

		}

		return toDoList;

	}

	/**
	 * 
	 * @return todoList containing incompleted list
	 */
	public Iterable<ToDo> getInCompletedToDoList() {
		Iterable<ToDo> toDoList = toDoRepository.findAll();
		Iterator<ToDo> iterator = toDoList.iterator();
		while (iterator.hasNext()) {
			// if()
			logger.info("{}", iterator.next().toString());

		}

		return toDoList;

	}
}
