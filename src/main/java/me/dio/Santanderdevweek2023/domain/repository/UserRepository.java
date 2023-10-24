/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package me.dio.Santanderdevweek2023.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import me.dio.Santanderdevweek2023.domain.model.User;

/**
 *
 * @author danil
 */
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String accountNumber);
}
