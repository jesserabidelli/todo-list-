package todo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name="utilisateurs")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String mail;

    @OneToMany
    List<Liste> listes;


}
