package org.example.pp_3_1_1.service;

import org.example.pp_3_1_1.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void save(User user);

    void update(User user);

    Optional<User> findById(Long id);

    List<User> findAll();

    void deleteById(int id);
}
