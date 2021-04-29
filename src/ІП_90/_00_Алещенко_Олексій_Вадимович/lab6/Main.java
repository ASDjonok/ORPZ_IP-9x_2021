package ІП_90._00_Алещенко_Олексій_Вадимович.lab6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int totalCost = 10;
        final int quantity = 4;
//        todo try to switch on this constructor
//        GameRoom gameRoom = new GameRoom(totalCost, quantity);
        GameRoom gameRoom = new GameRoom(new Toy[]{
                new YoungToy("Маленька машинка", 1, 0.7),
                new MiddleToy("Cередня машинка", 2),
                new HighToy("Велика машинка", 3),
                new YoungToy("М'яч", 4, 0.5)
        });

        gameRoom.sort();
        System.out.println(Arrays.toString(gameRoom.findByCost(2, 3)));
    }
}
