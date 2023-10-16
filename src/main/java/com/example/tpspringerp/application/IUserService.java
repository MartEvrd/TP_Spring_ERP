package com.example.tpspringerp.application;

import com.example.tpspringerp.entite.User;

import java.util.List;

public interface IUserService {

    void create(User c);

    List<User> getAllUsers();

    User getUser(String name);
}
