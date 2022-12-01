package todo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import todo.Repository.UserRepository;
import todo.model.User;

import java.util.List;

public interface UserService {

    public User adduser(User user);
    public List<User> getusers();
}
