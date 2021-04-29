package ІП_90._00_Алещенко_Олексій_Вадимович.lab6;

public class YoungToy extends Toy {
    private double riskFactor;
    public YoungToy(String name, int cost, double riskFactor) {
        super(name, cost);
        this.riskFactor = riskFactor;
    }

    @Override
    public int getCost() {
        return (int) (super.getCost() * riskFactor);
    }

    /*@Override
    public String toString() {
        return "YoungToy{" +
                "riskFactor=" + riskFactor +
                '}';
    }*/
}
