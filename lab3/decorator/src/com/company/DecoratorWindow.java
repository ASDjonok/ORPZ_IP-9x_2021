package com.company;

public class DecoratorWindow extends DecoratorBase{
    public DecoratorWindow(Graphics shape) {
        super(shape, shape.getName() + " windows");
    }
}