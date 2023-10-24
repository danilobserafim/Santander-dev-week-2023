/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.dio.Santanderdevweek2023.service;
import java.util.List;
import me.dio.Santanderdevweek2023.domain.model.User;
/**
 *
 * @author danil
 */
public interface UserService {
    User findById(Long id); 
    
    User create(User userToCreate);
    
    List<User> findAll();
}
