package todo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity(name="liste")
@Data
public class Liste {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean done;
    private String titre;

    @OneToMany(mappedBy = "liste",cascade = {CascadeType.ALL} )
    List<Tache> taches;

}
