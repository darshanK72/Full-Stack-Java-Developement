package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.entity.User;

@Service
public class UserService {

    private static List<User> userList = new ArrayList<>();

    static{
        userList.add(new User(1,"darshan","darshan@123"));
        userList.add(new User(2,"prasad","prasad@123"));
        userList.add(new User(3,"aakash","aakash@123"));
    }


    public List<User> getAllUsers() {
        return userList;
    }

    public String addUser(User user) {
        userList.add(user);
        return "User Added Successfully !!!";
    }

    public User getUser(int userId) {
        return userList.stream().filter((user) -> user.getUserId() == userId).findFirst().orElse(new User());
    }
    
}
