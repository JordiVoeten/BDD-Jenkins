package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users;

    public UserService() {
        users = new ArrayList<>();
    }

    public void create(User user) {
        users.add(user);
    }


    public void update(User user, int age) {
        int index = users.indexOf(user);
        user.setAge(age);
        users.set(index, user);
    }

    public List<User> getUsers() {
        return users;
    }
}
