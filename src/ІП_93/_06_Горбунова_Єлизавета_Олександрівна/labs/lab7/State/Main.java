package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.State;

public class Main {
    public static void main(String[] args) {

        //StateA
        Context context = new Context();
        System.out.println(context.showState());
        //StateB
        context.newState();
        System.out.println(context.showState());
        //StateA
        context.newState();
        System.out.println(context.showState());
    }
}
