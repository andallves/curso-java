package andreallves.cursojava.introductionmethods.test;

import andreallves.cursojava.introductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;
        calculator.changeTwoNumbers(4, 20);
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
    }
}
