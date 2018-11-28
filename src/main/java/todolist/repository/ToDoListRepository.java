package todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todolist.domain.entity.ToDoList;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;


public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {
    Optional<List<ToDoList>> findByEstimatedLessThanEqualAndEstimatedGreaterThanEqual(Long timeStart, Long timeEnd);
    Optional<List<ToDoList>> findByCreateDateLessThanEqual(Timestamp time);

}
