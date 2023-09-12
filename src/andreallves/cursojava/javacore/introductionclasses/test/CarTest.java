package andreallves.cursojava.javacore.introductionclasses.test;

import andreallves.cursojava.javacore.introductionclasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car();

        carOne.name = "Lamborghini";
        carOne.model = "XR5";
        carOne.year = 2022;

        carTwo.name = "Ferrari";
        carTwo.model = "TNT";
        carTwo.year = 2018;

        System.out.println(carOne.name);
        System.out.println(carOne.model);
        System.out.println(carOne.year);

        System.out.println(carTwo.name);
        System.out.println(carTwo.model);
        System.out.println(carTwo.year);
    }
}
