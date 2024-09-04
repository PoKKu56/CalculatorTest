package com.test.calculator.controller;

import com.test.calculator.exception.NegativeValuesException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerImpl {

    @ExceptionHandler(NegativeValuesException.class)
    public ResponseEntity<?> negativeValues(RuntimeException ex){
        return ResponseEntity.status(HttpStatusCode.valueOf(408)).body(ex.getMessage());
    }

}
