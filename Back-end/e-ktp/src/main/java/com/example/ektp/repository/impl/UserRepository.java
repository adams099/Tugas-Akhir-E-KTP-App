package com.example.ektp.repository.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ektp.model.User;
import com.example.ektp.repository.IUserRepository;

@Repository
public class UserRepository implements IUserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public User insertUser(User user) {
        // TODO Auto-generated method stub
        String query = "INSERT INTO tb_user(email, nama, password) "
                + "VALUES(?, ?, ?)";
        jdbcTemplate.update(query,
                new Object[] { user.getEmail(), user.getNama(), user.getPassword() });
        return user;
    }

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        String query = "SELECT * FROM tb_user";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public User getUserByEmail(String email) {
        // TODO Auto-generated method stub
        String query = "SELECT * FROM tb_user WHERE email = ?";
        return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(User.class), email);
    }

    @Override
    public User updateUser(int id, User user) {
        // TODO Auto-generated method stub
        String query = "UPDATE tb_user SET email = ?, nama = ?, password = ?";

        jdbcTemplate.update(query,
                new Object[] { user.getEmail(), user.getNama(), user.getPassword(), id });

        return user;
    }

    @Override
    public User getUserByEmailPass(User user) {
        // TODO Auto-generated method stub
        String query = "SELECT * FROM tb_user WHERE email = ? AND password = ?";
        var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(User.class),
                new Object[] { user.getEmail(), user.getPassword() });
        return result;
    }
}
