package com.test.calculator.service;

import com.test.calculator.exception.NegativeValuesException;
import com.test.dto.CalculateRequest;
import com.test.dto.CalculateResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    // формула расчета брал https://journal.tinkoff.ru/guide/otpusk-stitaem/
    public CalculateResponse calculateVacationPay(CalculateRequest calculateRequest){
        if (calculateRequest.getAverageSalary() < 0 || calculateRequest.getAmountOfDaysOnVacation() < 0){
            throw new NegativeValuesException("Введины отрицательные значения");
        }
        return new CalculateResponse(String.format("%.3f",(calculateRequest.getAverageSalary() / 29.3) *
                calculateRequest.getAmountOfDaysOnVacation()));
    }

}
