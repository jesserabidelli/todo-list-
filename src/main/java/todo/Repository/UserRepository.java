package todo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todo.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
