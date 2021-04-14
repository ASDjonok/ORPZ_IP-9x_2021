package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Memento;

public class ConcreteOriginator {
    private String state;
    private int num = 1;
    private Caretaker caretaker;
    ConcreteOriginator() {
        caretaker = new Caretaker();
        state = "State 1";
    }

    public String getState() {
        return state;
    }

    public void newState() {
        num++;
        state = "State " + num;
    }

    public void save() {
        Memento memento = new Memento(this, state, num);
        caretaker.add(memento);
    }

    public void undo() {
        caretaker.undo().restore();
    }

    public class Memento {
        private String state;
        private ConcreteOriginator originator;
        private  int num;
        public void restore() {
            originator.state = state;
            originator.num = num;
        }

        Memento(ConcreteOriginator originator, String state, int num) {
            this.originator = originator;
            this.state = state;
            this.num = num;
        }
    }
}
