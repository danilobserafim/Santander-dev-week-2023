/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.dio.Santanderdevweek2023.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

/**
 *
 * @author danil
 */
@Entity(name = "tb_card")
public class Card {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    
    @Column(scale = 2, precision = 13, name = "available_limit")
    private BigDecimal limit;
}
