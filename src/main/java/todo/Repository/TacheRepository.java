package todo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todo.model.Tache;

import java.util.List;

public interface TacheRepository extends JpaRepository<Tache,Integer> {
    List<Tache> findByDoneTrue();
}