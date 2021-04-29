package ІП_90._00_Алещенко_Олексій_Вадимович.lab6;

public class Toy {
    private String name;
    private int cost;

    public Toy(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
