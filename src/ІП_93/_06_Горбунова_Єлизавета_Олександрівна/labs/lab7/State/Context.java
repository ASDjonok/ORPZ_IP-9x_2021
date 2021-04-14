package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.State;

public class Context {
    private State state;
    Context() {
        state = new StateA();
    }

    public void newState() {
        if (state instanceof StateA) state = new StateB();
        else state = new StateA();
    }

    public String showState() {
        return "Context now uses " + state.showState();
    }
}
