package andreallves.cursojava.introductionmethods.test;

import andreallves.cursojava.introductionmethods.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers(10, 5);
        calculator.substractTwoNumbers(20, 7);
    }
}
