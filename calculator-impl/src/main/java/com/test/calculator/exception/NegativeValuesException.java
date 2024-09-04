package com.test.calculator.exception;

public class NegativeValuesException extends RuntimeException {
    public NegativeValuesException(String message) {
        super(message);
    }
}
