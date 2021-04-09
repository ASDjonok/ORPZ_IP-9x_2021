package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6;

import java.util.ArrayList;

public interface Player {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
    ArrayList<Integer> showPosition();
    void accept(Visitor visitor);
}
