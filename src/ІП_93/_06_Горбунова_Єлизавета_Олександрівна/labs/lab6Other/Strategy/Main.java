package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6Other.Strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyA());
        context.useStrategy();

        context.setStrategy(new StrategyC());
        context.useStrategy();

        context.setStrategy(new StrategyB());
        context.useStrategy();
    }
}
