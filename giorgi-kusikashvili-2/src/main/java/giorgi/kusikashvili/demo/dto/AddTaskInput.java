package giorgi.kusikashvili.demo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AddTaskInput {

    private Long id;

    private String title;

    private String description;

    private Date startDate;

    private Date endDate;

}
