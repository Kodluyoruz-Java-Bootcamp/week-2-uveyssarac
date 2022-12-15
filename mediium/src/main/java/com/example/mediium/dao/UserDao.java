package com.example.mediium.dao;

import com.example.mediium.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
   private static List<User> userList=new ArrayList<User>();

   public void createUser(User user){
       userList.add(user);
   }
   public List<User> findAllUsers(){
       return userList;
   }

}
