package todo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import todo.Service.UserService;
import todo.model.User;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> getusers(){
        return ResponseEntity.ok(userService.getusers());
    }

    @PostMapping("/user")
    public ResponseEntity<?> createuser(@RequestBody User user){
        return ResponseEntity.ok(userService.adduser(user));
    }

}
