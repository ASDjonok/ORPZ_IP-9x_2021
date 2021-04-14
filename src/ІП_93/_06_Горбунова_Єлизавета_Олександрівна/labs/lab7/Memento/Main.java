package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Memento;

public class Main {
    public static void main(String[] args) {
        //State 1
        ConcreteOriginator originator = new ConcreteOriginator();
        originator.save();

        //State 2
        originator.newState();
        //State 3
        originator.newState();
        originator.save();
        //State 4
        originator.newState();
        System.out.println(originator.getState());

        //State 3
        originator.undo();
        System.out.println(originator.getState());
        originator.undo();
        //State 1
        System.out.println(originator.getState());
        //State 2
        originator.newState();
        System.out.println(originator.getState());


    }
}
