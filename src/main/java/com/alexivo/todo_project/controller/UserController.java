package com.alexivo.todo_project.controller;

import com.alexivo.todo_project.model.Users;
import com.alexivo.todo_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/create")
    public Users createUser(@RequestBody Users user) {
        return userService.create(user);
    }

    @DeleteMapping("/user/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.delete(id);
    }
}
