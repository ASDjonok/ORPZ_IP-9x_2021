package ІП_90._00_Алещенко_Олексій_Вадимович.lab5;

import java.util.Arrays;

public class Text {
    private Sentence[] sentences;

    public Text(String textString) {
        String[] sentenceStrings = textString.split("(?<=[.!])");
        sentences = new Sentence[sentenceStrings.length];
        for (int i = 0; i < sentenceStrings.length; i++) {
            sentences[i] = new Sentence(sentenceStrings[i]);
        }

        /*String myString = "\\.";
        System.out.println(myString);*/

        /*System.out.println(Arrays.toString("a;b;c;d".split(";")));
        System.out.println(Arrays.toString("a;b;c;d".split("(?<=;)")));
        System.out.println(Arrays.toString("a;b;c;d".split("(?=;)")));
        System.out.println(Arrays.toString("a;b;c;d".split("((?<=;)|(?=;))")));*/

//        System.out.println(Arrays.toString(sentenceStrings));
    }

    @Override
    public String toString() {
        StringBuilder textStringBuilder = new StringBuilder();
        for (int i = 0; i < sentences.length /*- 1*/; i++) {
            textStringBuilder.append(sentences[i].toString())/*.append(' ')*/;
        }
//        textStringBuilder.append(sentences[sentences.length - 1].toString());
        return textStringBuilder.toString();
    }
}
