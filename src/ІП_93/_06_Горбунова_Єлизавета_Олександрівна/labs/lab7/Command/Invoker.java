package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Command;

public class Invoker {
    private Request command;
    public void setRequest(Request request) {
        command = request;
    }

    public String executeRequest() {
        return command.execute();
    }
}
