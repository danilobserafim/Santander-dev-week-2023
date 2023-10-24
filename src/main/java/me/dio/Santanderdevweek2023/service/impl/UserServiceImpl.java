/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.dio.Santanderdevweek2023.service.impl;

import java.util.List;
import me.dio.Santanderdevweek2023.domain.model.User;
import me.dio.Santanderdevweek2023.domain.repository.UserRepository;
import me.dio.Santanderdevweek2023.service.UserService;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

/**
 *
 * @author danil
 */
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    
    
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exist");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


    
}
