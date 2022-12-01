package todo.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
@Entity(name="tache")
@Data
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titre;
    private LocalDateTime date;
    private String description;
    private Boolean done;
    @ManyToOne
    @JoinColumn(name="liste-id")
    Liste liste;

}
