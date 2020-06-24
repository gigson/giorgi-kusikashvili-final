package giorgi.kusikashvili.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
