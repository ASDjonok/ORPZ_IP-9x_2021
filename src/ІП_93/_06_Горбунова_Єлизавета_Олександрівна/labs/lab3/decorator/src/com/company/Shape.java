package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab3.decorator.src.com.company;

abstract class Shape extends Graphics{

    public Shape(String name) {
        this.name = name;
        System.out.println(this.name + " created");
    }
    public String getName() {
        return this.name;
    }

}
