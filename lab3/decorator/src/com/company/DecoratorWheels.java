package com.company;

public class DecoratorWheels extends DecoratorBase{
    public DecoratorWheels(Graphics shape) {
        super(shape, shape.getName() + " wheels");
    }
}
