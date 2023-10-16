package com.example.tpspringerp.infrastructure;

import com.example.tpspringerp.entite.User;

import java.util.ArrayList;
import java.util.List;

public class ClientBase {
    public static List<User> clientList = new ArrayList<>();
    private static int compteur = 1;

    public static void addClient(User user) {
        user.setName(user.getName()+"-"+ compteur);
        clientList.add(user);
        compteur++;
    }
}
