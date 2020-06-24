package giorgi.kusikashvili.demo.service;

import giorgi.kusikashvili.demo.dto.*;

public interface TaskService {

    GetTasksOutput getTasks(GetTasksInput getTasksInput);

    AddTaskOutput addTask(AddTaskInput addTaskInput);

    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);
}
