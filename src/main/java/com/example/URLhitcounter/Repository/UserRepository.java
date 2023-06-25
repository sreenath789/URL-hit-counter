package com.example.URLhitcounter.Repository;

import com.example.URLhitcounter.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    List<User> users;

    public List<User> getUsers(){
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
