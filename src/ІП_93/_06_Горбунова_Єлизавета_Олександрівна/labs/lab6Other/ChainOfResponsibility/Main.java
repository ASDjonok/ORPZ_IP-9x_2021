package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6Other.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler handler1 = new HandlerA();
        Handler handler2 = new HandlerB();
        Handler handler3 = new HandlerC();

        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler1.handleRequest("Hi");
        handler1.handleRequest("Hello");
        handler1.handleRequest("Hi and hello and greetings");
    }
}
