package ІП_90._00_Алещенко_Олексій_Вадимович.lab5;

import java.util.Arrays;

public class Sentence {
    public Sentence(String sentenceString) {
        System.out.println(Arrays.toString("a;b;c;d".split(";")));
        System.out.println(Arrays.toString("a;b;c;d".split("(?<=;)")));
        System.out.println(Arrays.toString("a;b;c;d".split("(?=;)")));
        System.out.println(Arrays.toString("a;b;c;d".split("((?<=;)|(?=;))")));

        String[] sentenceElementStrings = sentenceString.split("(?=\\p{Punct}\s?)|\s");
        System.out.println(Arrays.toString(sentenceElementStrings));
    }
}
