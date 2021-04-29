package ІП_90._00_Алещенко_Олексій_Вадимович.lab5;

public class WordWithPunctuationContainer implements SentenceElement {
    private Word word;
    private Punctuation punctuation;

    public WordWithPunctuationContainer(String wordString, String punctuationString) {
        this.word = new Word(wordString);
        this.punctuation = new Punctuation(punctuationString);
    }

    @Override
    public String toString() {
        return word.toString() + punctuation.toString();
    }

    @Override
    public Word getWord() {
        return word;
    }

    @Override
    public void setWord(Word word) {
        this.word = word;
    }

    private class Punctuation /*implements SentenceElement*/ {
        //    todo think about name of the field
        private String symbols;

        //    todo think about String vs. char
        public Punctuation(String symbols) {
            this.symbols = symbols;
        }

        @Override
        public String toString() {
            return symbols /*+ ' '*/;
        }
    }
}
