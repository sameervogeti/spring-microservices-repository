package com.rest.webservices.service;

import com.rest.webservices.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component
public class UserServiceImpl implements UserService {
    private static List<User> userList() {
        List<User> userList = new ArrayList<>();
        User firstUser = User.builder()
                .name("First User")
                .id(UUID.fromString("f30c6251-e03d-432c-a18d-3e63a42d64ae"))
                .birthDate(new Date()).build();

        User secondUser = User.builder()
                .name("Second User")
                .id(UUID.fromString("a4ea5c54-8dd9-4f4c-b544-91b84f98e58d"))
                .birthDate(new Date()).build();
        userList.add(firstUser);
        userList.add(secondUser);
        return userList;

    }

    @Override
    public User getUser(String id) {
        return userList().stream()
                .filter(user -> user.getId().toString().equals(id))
                .findFirst().get();
    }

    @Override
    public List<User> getAllUsers() {
        return userList();
    }

    @Override
    public UUID addUser(User userDetais) {
        UUID userId = UUID.randomUUID();
        userDetais.setId(userId);
        userList().add(userDetais);
        return userDetais.getId();
    }
}
