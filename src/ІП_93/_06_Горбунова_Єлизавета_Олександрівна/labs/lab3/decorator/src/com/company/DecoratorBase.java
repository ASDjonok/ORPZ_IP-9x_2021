package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab3.decorator.src.com.company;

abstract public class DecoratorBase extends Graphics {
    private Graphics shape;
    public DecoratorBase(Graphics shape, String name) {
        this.shape = shape;
        this.shape.name = name;
        this.createName();
    }

    public String getName() {
        return this.shape.name;
    }

    public void createName() {
        System.out.println("Decorator created: " + this.shape.name);
    }
}
