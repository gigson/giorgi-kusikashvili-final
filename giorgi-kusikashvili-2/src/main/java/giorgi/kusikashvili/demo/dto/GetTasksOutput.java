package giorgi.kusikashvili.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetTasksOutput {

    List<TaskDTO> task;

}
