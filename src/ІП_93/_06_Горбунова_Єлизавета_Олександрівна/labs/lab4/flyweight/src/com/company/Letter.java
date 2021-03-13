package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab4.flyweight.src.com.company;

public class Letter {
    private int x;
    private int y;
    private String form;
    Letter(int x, int y, String form) {
        this.x = x;
        this.y = y;
        this.form = form;
    }
    public String getForm() {
        return this.form;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
