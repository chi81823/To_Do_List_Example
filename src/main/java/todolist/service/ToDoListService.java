package todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todolist.domain.entity.ToDoList;
import todolist.exception.NotFound;
import todolist.repository.ToDoListRepository;

import java.util.List;

@Service
public class ToDoListService {
    @Autowired
    private ToDoListRepository repo;

    public ToDoList findById(Long id) throws NotFound {
        return repo.findById(id).orElseThrow(NotFound::new);
    }

    public ToDoList save(ToDoList toDoList) {
        return repo.save(toDoList);
    }

    public List<ToDoList> getAll() {
        return repo.findAll();
    }

    public ToDoList update(Long id, String name, String content) throws NotFound {
        ToDoList toDoList = findById(id);
        toDoList.setName(name);
        toDoList.setContent(content);
        return repo.save(toDoList);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

    public List<ToDoList> findEstimated(Long start, Long end) throws NotFound {
        return repo.findByEstimatedLessThanEqualAndEstimatedGreaterThanEqual(start, end)
                   .orElseThrow(NotFound::new);
    }
}
