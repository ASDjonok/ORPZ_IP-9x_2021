package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6;

import java.util.ArrayList;

abstract public class ConcretePlayer implements Player {
    private int y;
    private int x;
    protected String name;
    @Override
    public void moveUp() {
        boolean taken = GameField.XYTaken(x, y+1);
        if (taken) return;
        GameField.XYPut(name, x, y+1);
        y++;
    }

    @Override
    public void moveDown() {
        boolean taken = GameField.XYTaken(x, y-1);
        if (taken) return;
        GameField.XYPut(name, x, y-1);
        y--;
    }

    @Override
    public void moveLeft() {
        boolean taken = GameField.XYTaken(x-1, y);
        if (taken) return;
        GameField.XYPut(name, x-1, y);
        x--;
    }

    @Override
    public void moveRight() {
        boolean taken = GameField.XYTaken(x + 1, y);
        if (taken) return;
        GameField.XYPut(name, x + 1, y);
        x++;
    }

    protected void setPosition(int x1, int y1) {
        boolean taken = GameField.XYTaken(x1, y1);
        if (taken) return;
        GameField.XYPut(name, x1, y1);
        x = x1;
        y = y1;
    }

    protected String showName() {
        return name;
    }

    protected void setName(String type, int number) {
        name = type + " #" + number;
    }

    @Override
    public ArrayList<Integer> showPosition() {
        ArrayList<Integer> XY = new ArrayList<>();
        XY.add(x);
        XY.add(y);
        return XY;
    }
}
