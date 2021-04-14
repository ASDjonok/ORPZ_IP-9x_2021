package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Command;

import java.util.ArrayList;
import java.util.List;

public class TransactionStack {
    private List<Request> stack;

    TransactionStack() {
        stack = new ArrayList<>();
    }

    public void push(Request request) {
        stack.add(request);
    }

    public void clearAll(Request request) {

    }
}
