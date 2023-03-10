package com.alexivo.todo_project.service;

import com.alexivo.todo_project.model.Users;

public interface UserService {
    Users create(Users users);
    void delete(Long id);
}
