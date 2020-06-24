package giorgi.kusikashvili.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "attachments")
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Book pdfUrl;

}
