package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6;

import java.util.ArrayList;

public class DisbandVisitor implements Visitor{
    @Override
    public void visitArcher(Archer archer) {
        GameField.removePosition(archer.showName());
        System.out.println("Disbanding " + archer.showName());
        archer = null;

    }

    @Override
    public void visitKnight(Knight knight) {
        GameField.removePosition(knight.showName());
        System.out.println("Disbanding " + knight.showName());
        knight = null;
    }

    @Override
    public void visitSwordsmen(Swordsmen swordsmen) {
        GameField.removePosition(swordsmen.showName());
        System.out.println("Disbanding " + swordsmen.showName());
        swordsmen = null;
    }
}
