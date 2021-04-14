package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6Other.Strategy;

public class Context {
    private Strategy strategy;
    public void setStrategy(Strategy strategyNew) {
        strategy = strategyNew;
    }
    public void useStrategy() {
        System.out.println("This algorithm is " + strategy.algorithmInterface());
    }
}
