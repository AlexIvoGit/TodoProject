package com.alexivo.todo_project.repository;

import com.alexivo.todo_project.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Users, Long> {

    Optional<Users> findByLogin(@Param("login") String login);
}
