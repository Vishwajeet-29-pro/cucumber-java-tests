package com.example.cucumbertests.calculator;

import io.cucumber.java.en.Given;

public class CalculatorStepDefinition {
    private Calculator calculator;

    @Given("I have a calculator")
    public void iHaveACalculator() {
        calculator = new Calculator();
    }
}
