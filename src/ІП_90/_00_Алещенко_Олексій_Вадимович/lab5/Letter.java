package ІП_90._00_Алещенко_Олексій_Вадимович.lab5;

public class Letter {
    private char symbol;

    public Letter(char symbol) {
//        todo check that symbol is letter (e.g. not number)
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "" + symbol;
//        return Character.toString(symbol);
    }
}
