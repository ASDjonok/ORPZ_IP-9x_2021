package ІП_90._00_Алещенко_Олексій_Вадимович.lab5;

import java.util.Arrays;

public class Word implements SentenceElement {
//    todo!! change field
//    private String wordString;
    private Letter[] letters;

    public Word(String wordString) {
//        wordString.toCharArray();
        letters = new Letter[wordString.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = new Letter(wordString.charAt(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder wordStringBuilder = new StringBuilder();

        for (Letter letter : letters) {
            wordStringBuilder.append(letter.toString());
        }

        return wordStringBuilder.append(' ').toString();
    }
}
