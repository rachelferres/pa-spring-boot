package uk.ac.belfastmet.TODO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.TODO.domain.ToDo;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

}
