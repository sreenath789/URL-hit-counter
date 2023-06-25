package com.example.URLhitcounter.Service;

import com.example.URLhitcounter.Model.User;
import com.example.URLhitcounter.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    private int hitCount;


    public String getHitCount() {
        hitCount++;
        return "visitors : "+hitCount;
    }

    public List<User> getAllUsers() {
        return userRepository.getUsers();
    }

    public String addUser(User user) {
        userRepository.addUser(user);
        return "User Added";
    }

    public User getUserHitCount(String name) {
        for(User user : userRepository.getUsers()){
            if(user.getUserName().equals(name)){
                user.setCount(user.getCount()+1);
                return user;
            }
        }
        return null;
    }
}
