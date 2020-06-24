package giorgi.kusikashvili.demo.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authors = new ArrayList<>();

    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL)
    private List<Tag> tags = new ArrayList<>();
}
