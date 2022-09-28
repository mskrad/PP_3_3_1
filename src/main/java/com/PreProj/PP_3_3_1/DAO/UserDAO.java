package com.PreProj.PP_3_3_1.DAO;

import com.PreProj.PP_3_3_1.models.User;

import java.util.List;


public interface UserDAO {
    void updateUser(User user);
    void removeUserById(long id);
    User getUserById(long id);
    List<User> getAllUsers();
    void addUser(User user);
}
