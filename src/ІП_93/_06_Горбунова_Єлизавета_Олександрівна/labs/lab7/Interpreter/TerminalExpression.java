package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Interpreter;

public class TerminalExpression implements AbstractExpression{
    private String name;
    TerminalExpression(String text) {
        name = text;
    }
    @Override
    public String Interpret(Context context) {
        return context.getString(name);
    }

}
