package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab3.decorator.src.com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Graphics circle = new Circle();
        Graphics circleWindows = new DecoratorWindow((circle));
        Graphics house = new DecoratorHouse(circleWindows);
        Graphics circleWindowCar = new DecoratorCar(circleWindows);
        System.out.println();

        DecoratorCar car = new DecoratorCar(new DecoratorWheels(new Rectangle()));
        car.ride();
        System.out.println();

        DecoratorCar car2 = new DecoratorCar(new DecoratorWheels(new Circle()));
        car2.ride();
        System.out.println();

    }
}
