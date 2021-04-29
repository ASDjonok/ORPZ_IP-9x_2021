package ІП_90._00_Алещенко_Олексій_Вадимович.lab5;

public class Punctuation implements SentenceElement {
//    todo think about name of the field
    private String symbols;

//    todo think about String vs. char
    public Punctuation(String symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return symbols + ' ';
    }
}
