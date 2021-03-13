package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab3.decorator.src.com.company;

public class DecoratorCar extends DecoratorBase{
    public DecoratorCar(Graphics shape) {
        super(shape, "Car with " + shape.getName());
    }
    public void ride() {
        System.out.println(this.getName() + " started riding.....");
    }
}
