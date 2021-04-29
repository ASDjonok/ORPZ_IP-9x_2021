package ІП_90._00_Алещенко_Олексій_Вадимович.lab6;

import java.util.ArrayList;

public class GameRoom {
//    todo think about enum
    private Toy[] toys;

    /*private static YoungToy[] youngToys = {new YoungToy(), new YoungToy()};
    private static MiddleToy[] middleToys = {new MiddleToy(), new MiddleToy()};
    private static HighToy[] highToys = {new HighToy(), new HighToy()};*/

    public GameRoom(Toy[] toys) {
        this.toys = toys;
    }

    public GameRoom(int totalCost, int quantity) {
//        todo think about algorithm of automatic gathering of toys
    }

    public void sort() {
//        todo add realization
    }

    public Toy[] findByCost(int min, int max) {
        ArrayList<Toy> toysInCostInterval = new ArrayList<>();
        for (Toy toy : toys) {
            if (toy.getCost() >= min && toy.getCost() <= max) {
                toysInCostInterval.add(toy);
            }
        }
//        todo think about "new Toy[0]"
        return toysInCostInterval.toArray(new Toy[toysInCostInterval.size()]);
    }
}
