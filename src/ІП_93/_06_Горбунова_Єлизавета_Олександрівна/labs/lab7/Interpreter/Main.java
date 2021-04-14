package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setString("x", "Hello ");
        context.setString("y", "World!");

        AbstractExpression ae = new NonterminalExpression(new TerminalExpression("x"), new TerminalExpression("y"));
        String sentence = ae.Interpret(context);
        System.out.println(sentence);
    }
}
