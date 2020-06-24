package giorgi.kusikashvili.demo.service.impl;

import giorgi.kusikashvili.demo.dto.*;
import giorgi.kusikashvili.demo.model.Task;
import giorgi.kusikashvili.demo.repository.TaskRepository;
import giorgi.kusikashvili.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public GetTasksOutput getTasks(GetTasksInput getTasksInput) {

        GetTasksOutput getTasksOutput = new GetTasksOutput();
        List<TaskDTO> taskDTOList = new ArrayList<>();

        for (Task task : taskRepository.findAll()) {
            TaskDTO taskDTO = new TaskDTO();

            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setEndDate(task.getEndDate());
            taskDTO.setStartDate(task.getStartDate());

            taskDTOList.add(taskDTO);
        }

        getTasksOutput.setTask(taskDTOList);
        return getTasksOutput;
    }

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setEndDate(addTaskInput.getEndDate());
        task.setStartDate(addTaskInput.getStartDate());
        taskRepository.save(task);
        return new AddTaskOutput();
    }

    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        Task task = new Task();
        task.setId(deleteTaskInput.getId());
        taskRepository.delete(task);
        return new DeleteTaskOutput();
    }
}
