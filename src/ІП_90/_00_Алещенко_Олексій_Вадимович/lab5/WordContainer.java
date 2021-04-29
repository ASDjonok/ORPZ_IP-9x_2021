package ІП_90._00_Алещенко_Олексій_Вадимович.lab5;

public class WordContainer implements SentenceElement {
    private Word word;

    public WordContainer(String wordString) {
        this.word = new Word(wordString);
    }

    @Override
    public String toString() {
        return word.toString();
    }

//    todo think about duplication in WordWithPunctuationContainer
    @Override
    public Word getWord() {
        return word;
    }

    @Override
    public void setWord(Word word) {
        this.word = word;
    }
}
