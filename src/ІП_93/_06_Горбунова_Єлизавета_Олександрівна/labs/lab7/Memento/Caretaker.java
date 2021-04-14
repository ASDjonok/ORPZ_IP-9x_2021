package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Memento;

import java.util.ArrayList;

public class Caretaker {
    private ConcreteOriginator originator;
    private ArrayList<ConcreteOriginator.Memento> history = new ArrayList<>();
    public ConcreteOriginator.Memento undo() {
        if (history.size() - 1 < 0) return null;
        ConcreteOriginator.Memento m = history.get(history.size() - 1);
        history.remove(history.size() - 1);
        return m;
    }
    public void add (ConcreteOriginator.Memento memento) {
        history.add(memento);
    }
}
