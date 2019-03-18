package com.company.example.Library.Controller;

import com.company.example.Library.Db.Db;
import com.company.example.Library.Model.User;

import java.util.Scanner;

public class UserController {

    public void showUsers() {

        Db.users.forEach(user -> {
            System.out.println(user.getId());
            System.out.println(user.getName());
        });
    }

    public void addUser(User user)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adi : ");
        String username = input.nextLine();
        User user1 = new User(username);
        Db.users.add(user1);
    }
}
