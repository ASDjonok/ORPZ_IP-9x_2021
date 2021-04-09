package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        if (!GameField.XYTaken(1, 2)) {
            Archer archer = new Archer(1, 2);
            players.add(archer);
            System.out.println(archer.showName() + archer.showPosition());
            archer.moveUp();
            System.out.println(archer.showName() + archer.showPosition());
        }
        if (!GameField.XYTaken(1, 3)) {
            Knight knight = new Knight(1, 3);
            players.add(knight);
            knight.moveUp();
            System.out.println(knight.showName() + knight.showPosition());
        } else {
            Swordsmen swordsmen = new Swordsmen(1, 2);
            players.add(swordsmen);
            swordsmen.moveUp();
            System.out.println(swordsmen.showName() + swordsmen.showPosition());
        }

        Visitor buildCastleVisitor = new BuildCastleVisitor();
        for (Player player: players) {
            player.accept(buildCastleVisitor);
        }

        Visitor disbandVisitor = new DisbandVisitor();
        players.get(0).accept(disbandVisitor);
    }
}
