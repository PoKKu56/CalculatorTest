package com.test.calculator.controller;

import com.test.calculator.service.CalculatorService;
import com.test.controller.CalculatorController;
import com.test.dto.CalculateRequest;
import com.test.dto.CalculateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorControllerImpl implements CalculatorController {

    private final CalculatorService calculatorService;

    @Override
    public CalculateResponse calculate(CalculateRequest calculateRequest) {
        return calculatorService.calculateVacationPay(calculateRequest);
    }
}
