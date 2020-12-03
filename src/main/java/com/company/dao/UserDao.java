package com.company.dao;

import com.company.model.users.User;
import com.company.model.users.UserType;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    List<User> findByType(UserType userType);
    User findById(int id);
    boolean insert(User user);
    boolean update(User user);
    boolean delete(User user);
}
