package todo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todo.model.Liste;

public interface Listerepository extends JpaRepository<Liste,Integer> {
}
