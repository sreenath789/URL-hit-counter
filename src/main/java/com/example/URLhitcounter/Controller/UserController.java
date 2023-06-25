package com.example.URLhitcounter.Controller;

import com.example.URLhitcounter.Model.User;
import com.example.URLhitcounter.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("count")
    public String getHitCount(){
        return userService.getHitCount();
    }
    @GetMapping("getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("addUser")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/username/{name}/count")
    public User getUserHitCount(@PathVariable String name){
        return userService.getUserHitCount(name);
    }
}
