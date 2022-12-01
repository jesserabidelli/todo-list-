package todo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.Repository.UserRepository;
import todo.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;



    @Override
    public List<User> getusers(){
        return userRepository.findAll();
    };

    @Override
    public User adduser(User user){
        return userRepository.save(user);
    }
}
