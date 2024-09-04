package com.test.controller;

import com.test.dto.CalculateRequest;
import com.test.dto.CalculateResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public interface CalculatorController {

    @PostMapping("/calculate")
    CalculateResponse calculate(@RequestBody CalculateRequest calculateRequest);


}
