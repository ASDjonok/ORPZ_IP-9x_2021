package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6;

import java.util.ArrayList;

public class BuildCastleVisitor implements Visitor{
    @Override
    public void visitArcher(Archer archer) {
        ArrayList<Integer> position = archer.showPosition();
        GameField.buildCastle(archer.showName(), position);
        System.out.println("Building archer's " + archer.showName() + " castle on position " + position);
    }

    @Override
    public void visitKnight(Knight knight) {
        ArrayList<Integer> position = knight.showPosition();
        GameField.buildCastle(knight.showName(), position);
        System.out.println("Building knight's " + knight.showName() + " castle on position " + position);
    }

    @Override
    public void visitSwordsmen(Swordsmen swordsmen) {
        ArrayList<Integer> position = swordsmen.showPosition();
        GameField.buildCastle(swordsmen.showName(), position);
        System.out.println("Building archer's " + swordsmen.showName() + " castle on position " + position);
    }
}
