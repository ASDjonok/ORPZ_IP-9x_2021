package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6Other.ChainOfResponsibility;

public class HandlerA implements Handler {
    private Handler next;
    @Override
    public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void handleRequest(String request) {
        if(request.length() < 3) {
            System.out.println("Log " + request + " from HandlerA ");
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Error in chain of resposibility logic");
        }
    }
}
