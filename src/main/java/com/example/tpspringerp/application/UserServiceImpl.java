package com.example.tpspringerp.application;

import com.example.tpspringerp.entite.User;
import com.example.tpspringerp.infrastructure.ClientBase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public void create(User user) {
        ClientBase.addClient(user);
        System.out.println("----------");
        System.out.println("Envoi en bdd du client :"+user.toString());
        System.out.println("----------");
        System.out.println("Son adresse est :"+user.getAddress().toString());
        System.out.println("----------\n\n");
    }

    @Override
    public List<User> getAllUsers() {
        return ClientBase.clientList;
    }

    @Override
    public User getUser(String name) {
        User user = ClientBase.clientList.stream()
                .filter(client -> client.getName().equals(name))
                .findFirst().orElse(null);
        return user;
    }
}
