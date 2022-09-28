package com.PreProj.PP_3_3_1.services;

import com.PreProj.PP_3_3_1.models.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void updateUser(User user);
    void removeUserById(long id);
    User getUserById(long id);
    List<User> getAllUsers();
}
