package userservices.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import userservices.model.User;

@RestController
public class UserController {
    
    @RequestMapping(path="/user/{id}",produces="application/json")
    public User getUser(@PathVariable(name="id") String userId) {
        
        User user = new User();
        user.setUserId(userId);
        user.setisActive("Y");
        
        return user;
    }
}
