package andreallves.cursojava.introductionmethods.domain;

public class Calculator {
    public void sumTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

    public void substractTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    public void multiplyTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    public double divideTwoNumbers(double dividend, double divider) {
        if (divider == 0) {
            System.out.println("Não é possível fazer divisão por ZERO");
            return 0;
        }
        return dividend / divider;
    }

    // A diferent way to use a statement return
    public void printDivisionByTwoNumbers(double dividend, double divider) {
        if (divider == 0) {
            System.out.println("Não é possível fazer divisão por ZERO");
            return;
        }
        System.out.println(dividend / divider);
    }

    public void changeTwoNumbers(int firstNumber, int secondNumber) {
        firstNumber = 33;
        secondNumber = 99;
        System.out.println("Dentro do changeTwoNumbers");
        System.out.println("Num1 = " + firstNumber);
        System.out.println("Num2 = " + secondNumber);
    }
}
