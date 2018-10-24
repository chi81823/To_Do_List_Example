package todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import todolist.domain.entity.ToDoList;
import todolist.domain.http.request.ToDoListRequest;
import todolist.service.ToDoListService;

import java.util.List;

@RestController
@RequestMapping("/api/todolist")
public class ToDoListController {

    @Autowired
    private ToDoListService service;

    @GetMapping("/{id}")
    public ToDoList getById(@PathVariable long id) {

        return service.findById(id);
    }


    @PutMapping("/{id}")
    public ToDoList update(@PathVariable Long id, @RequestBody ToDoListRequest toDoListReq) {

        return service.update(id, toDoListReq.getName(), toDoListReq.getContent());
    }

    @PostMapping()
    public ToDoList add(@RequestBody ToDoList toDoList) {

        return service.save(toDoList.getName(), toDoList.getContent());
    }

    @GetMapping("/all")
    public List<ToDoList> getAll() {

        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {

        service.delete(id);
    }


}
