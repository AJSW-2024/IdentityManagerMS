package com.unaj.identitymanagerms.repository;

import com.unaj.identitymanagerms.entities.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


    public interface RoleRepository extends CrudRepository<Role, Long> {
        Optional<Role> findByName(String name);
    }
