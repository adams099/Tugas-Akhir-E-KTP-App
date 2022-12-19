package com.example.ektp.repository;

import java.util.List;

import com.example.ektp.model.User;

public interface IUserRepository {
    public User insertUser(User user);

    public List<User> getAllUser();

    public User getUserByEmail(String email);

    public User updateUser(int id, User user);

    public User getUserByEmailPass(User user);
}