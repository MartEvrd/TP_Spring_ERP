package com.example.tpspringerp.exposition;

import com.example.tpspringerp.application.IUserService;
import com.example.tpspringerp.entite.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    IUserService serviceUser;

    @PostMapping("/client")
    public void createUser(@RequestBody User u){
        serviceUser.create(u);
    }

    @GetMapping("/clients")
    public List<User> getAllUsers(){
        return serviceUser.getAllUsers();
    }

    @GetMapping("/client/{name}")
    public User getUser(@PathVariable("name") String name){
        return serviceUser.getUser(name);
    }
}
