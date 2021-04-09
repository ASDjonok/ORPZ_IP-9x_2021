package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6;

public class Swordsmen extends ConcretePlayer{
    private static int number = 0;
    private String type = "Swordsmen";
    Swordsmen(int x, int y) {
        number++;
        setName(type, number);
        setPosition(x, y);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSwordsmen(this);
    }
}
