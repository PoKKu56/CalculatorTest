package com.test.calculator;

import com.test.calculator.exception.NegativeValuesException;
import com.test.calculator.service.CalculatorService;
import com.test.dto.CalculateRequest;
import com.test.dto.CalculateResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorApplicationTests {
	CalculatorService calculatorService = new CalculatorService();
	CalculateRequest request = new CalculateRequest();
	CalculateResponse response = new CalculateResponse();

	@Test
	void firstTryCalculateTest() {
		request.setAverageSalary(30000);
		request.setAmountOfDaysOnVacation(28);
		response.setVacationPay("28668,942");
		assertEquals(response.getVacationPay(), calculatorService.calculateVacationPay(request).getVacationPay());
	}

	@Test
	void checkCalculateVacationPayWithNegativeValues(){
		request.setAmountOfDaysOnVacation(-1);
		request.setAverageSalary(-1);
		NegativeValuesException exception = assertThrows(NegativeValuesException.class,
				() -> calculatorService.calculateVacationPay(request));
		assertEquals(exception.getMessage(),"Введины отрицательные значения");
	}

	@Test
	void secondTryCalculateTest(){
		request.setAmountOfDaysOnVacation(30);
		request.setAverageSalary(90500);
		response.setVacationPay("92662,116");
		assertEquals(response.getVacationPay(), calculatorService.calculateVacationPay(request).getVacationPay());
	}

}
