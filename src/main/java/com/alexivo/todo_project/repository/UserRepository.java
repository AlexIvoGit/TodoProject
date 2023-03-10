package com.alexivo.todo_project.repository;

import com.alexivo.todo_project.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {

}
