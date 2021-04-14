package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Interpreter;

public class NonterminalExpression implements AbstractExpression{
    AbstractExpression left;
    AbstractExpression right;

    NonterminalExpression(AbstractExpression exp1, AbstractExpression exp2) {
        left = exp1;
        right = exp2;
    }

    @Override
    public String Interpret(Context context) {
        return left.Interpret(context) + right.Interpret(context);
    }
}
