package giorgi.kusikashvili.demo.controller;


import giorgi.kusikashvili.demo.dto.*;
import giorgi.kusikashvili.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RESTController {

    @Autowired
    TaskService taskService;

    @PostMapping("getTasks")
    public GetTasksOutput getTasksOutput(@RequestBody GetTasksInput getTasksInput) {
        return taskService.getTasks(getTasksInput);
    }

    @PostMapping("addTask")
    public AddTaskOutput addTask(@RequestBody AddTaskInput addTaskInput) {
        return taskService.addTask(addTaskInput);
    }

    @PostMapping("deleteTask")
    public DeleteTaskOutput deleteTask(@RequestBody DeleteTaskInput deleteTaskInput) {
        return taskService.deleteTask(deleteTaskInput);
    }


}
