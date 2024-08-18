package com.example.cucumbertests.calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CalculatorStepDefinition {
    private Calculator calculator;
    private int result;

    @Given("I have a calculator")
    public void iHaveACalculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int num1, int num2) {
        result = calculator.add(num1, num2);
    }
}
