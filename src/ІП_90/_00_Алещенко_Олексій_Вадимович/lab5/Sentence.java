package ІП_90._00_Алещенко_Олексій_Вадимович.lab5;

import java.util.Arrays;

public class Sentence {
    private SentenceElement[] sentenceElements;

    public Sentence(String sentenceString) {
        String[] sentenceElementStrings = sentenceString.split("(?=\\p{Punct}\s?)|\s");

        sentenceElements = new SentenceElement[sentenceElementStrings.length];

        for (int i = 0; i < sentenceElementStrings.length; i++) {
            if (sentenceElementStrings[i].matches("\\p{Punct}")) {
                sentenceElements[i] = new Punctuation(sentenceElementStrings[i]);
            } else {
                sentenceElements[i] = new Word(sentenceElementStrings[i]);
            }
        }

        /*System.out.println(Arrays.toString("a;b;c;d".split(";")));
        System.out.println(Arrays.toString("a;b;c;d".split("(?<=;)")));
        System.out.println(Arrays.toString("a;b;c;d".split("(?=;)")));
        System.out.println(Arrays.toString("a;b;c;d".split("((?<=;)|(?=;))")));*/

//        System.out.println(Arrays.toString(sentenceElementStrings));
    }
}
