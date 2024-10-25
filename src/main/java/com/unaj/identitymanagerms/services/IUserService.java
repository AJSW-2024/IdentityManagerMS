package com.unaj.identitymanagerms.services;

import com.unaj.identitymanagerms.entities.User;

import java.util.Optional;

public interface IUserService {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);

    Iterable<User> findAll();

    User save(User user);
    Optional<User> update(User user, Long id);

    void delete(Long id);
}
