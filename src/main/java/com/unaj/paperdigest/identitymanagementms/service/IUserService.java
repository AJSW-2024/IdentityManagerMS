package com.unaj.paperdigest.identitymanagementms.service;

import com.unaj.paperdigest.identitymanagementms.entities.User;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Optional;

public interface IUserService {
    User addUser(User user);
    Optional<User> getUserById(Long id);
    Optional<User> getUserByUsername(String username);
}
