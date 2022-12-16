package com.example.mediium.service;

import com.example.mediium.dao.UserDao;
import com.example.mediium.model.User;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public void createUser(User user) {
        userDao.createUser(user);
    }

    public List<User> getAllUser() {
        return userDao.findAllUsers();
    }

    public void printAll() {
        getAllUser().forEach(user -> System.out.println(user.toString()));
    }
}
