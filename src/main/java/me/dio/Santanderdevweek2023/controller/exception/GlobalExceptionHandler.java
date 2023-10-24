/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.dio.Santanderdevweek2023.controller.exception;

import java.util.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author danil
 */
@RestControllerAdvice
public class GlobalExceptionHandler  {
    
    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> businessException(IllegalArgumentException businessException){
        return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
        
    }
    
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> notFoundException(NoSuchElementException notFoundException){
        return new ResponseEntity<>("Resource ID not found", HttpStatus.NOT_FOUND);
        
    }
    
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnexpectedException(Throwable unexpectedException){
        var message = "Unexpected server error, see the logs.";
        logger.error(message, unexpectedException);
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
        
    }
}
