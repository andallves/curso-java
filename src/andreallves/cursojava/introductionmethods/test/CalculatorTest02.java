package andreallves.cursojava.introductionmethods.test;

import andreallves.cursojava.introductionmethods.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiplyTwoNumbers(2, 8);
        double result = calculator.divideTwoNumbers(20, 4);
        calculator.printDivisionByTwoNumbers(10, 5);
    }
}
