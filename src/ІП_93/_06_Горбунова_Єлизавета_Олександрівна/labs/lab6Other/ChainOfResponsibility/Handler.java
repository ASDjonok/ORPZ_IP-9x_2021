package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6Other.ChainOfResponsibility;

public interface Handler {
    void setNext(Handler handler);
    void handleRequest(String request);
}
