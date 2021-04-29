package ІП_90._00_Алещенко_Олексій_Вадимович.lab5;

public class Main {
    public static void main(String[] args) {
//        String textString = "Hello, \"world\"! I am program.";
        String textString = "Hello, world! I am program.";


//        System.out.println(Arrays.toString("a;b;c;d".split("(?=;)")));
//        String[] split = "a;b;c;d".split("(?=\\p{Punct}\s?)|\s");
        /*String[] split = "a;b;c;d".split("(?=\\p{Punct}\s?)");
        System.out.println(Arrays.toString(split));*/
//        String[] split1 = "Hello, world!".split("(?=\\p{Punct}\s?)|\s");
        /*String[] split1 = "Hello, world!".split("(?=(\\p{Punct}\s?))");
        System.out.println(Arrays.toString(split1));*/
//        System.out.println(Arrays.toString("a;b;c;d".split("((?<=;)|(?=;))")));

//        String[] sentenceElementStrings = sentenceString.split("(?=\\p{Punct}\s?)|\s");
//        System.out.println("Hello world! \\I am program.");
        Text text = new Text(textString);

        System.out.println("Original text:\n" + text);

        text.swapFirstAndLastWordsInSentences();

        System.out.println("Text after swapping:\n" + text);
    }
}
