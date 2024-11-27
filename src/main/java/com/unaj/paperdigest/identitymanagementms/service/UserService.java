package com.unaj.paperdigest.identitymanagementms.service;

import com.unaj.paperdigest.identitymanagementms.entities.User;
import com.unaj.paperdigest.identitymanagementms.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    IUserRepository userRepository;

    public UserService(IUserRepository repository) {
        userRepository = repository;
    }

    @Override
    public User addUser(User user) {
        if(this.userRepository.findUserByUsername(user.getUsername()).isPresent()) {
            throw new IllegalArgumentException("Username already exists");
        }
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return this.userRepository.findById((id));
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return this.userRepository.findUserByUsername(username);
    }

}
