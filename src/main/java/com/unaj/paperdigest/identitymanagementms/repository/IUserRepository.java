package com.unaj.paperdigest.identitymanagementms.repository;

import com.unaj.paperdigest.identitymanagementms.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IUserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserByUsername(String username);
}
