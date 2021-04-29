package ІП_90._00_Алещенко_Олексій_Вадимович.lab5;

public class Sentence {
    private SentenceElement[] sentenceElements;

    public Sentence(String sentenceString) {
//        todo "Замінити послідовність табуляцій та пробілів одним пробілом."
//        String[] sentenceElementStrings = sentenceString.split("(?=\\p{Punct})|\\s");
//        todo обробка ситуації з лапками в тексті
        String[] sentenceElementStrings = sentenceString.split(" ");

        sentenceElements = new SentenceElement[sentenceElementStrings.length];

        for (int i = 0; i < sentenceElementStrings.length; i++) {
            String lastSymbolString = sentenceElementStrings[i].substring(sentenceElementStrings[i].length() - 1);
            if (lastSymbolString.matches("\\p{Punct}")) {
                String wordString = sentenceElementStrings[i].substring(0, sentenceElementStrings[i].length() - 1);
                sentenceElements[i] = new WordWithPunctuationContainer(wordString, lastSymbolString);
            } else {
                sentenceElements[i] = new WordContainer(sentenceElementStrings[i]);
            }
        }

//        System.out.println(Arrays.toString("a;b;c;d".split(";")));
//        System.out.println(Arrays.toString("a;b;c;d".split("(?<=;)")));
        /*System.out.println(Arrays.toString("a;b;c;d".split("(?=;)")));
        System.out.println(Arrays.toString("a;b;c;d".split("((?<=;)|(?=;))")));

        System.out.println(Arrays.toString(sentenceElementStrings));*/
    }

    @Override
    public String toString() {
        StringBuilder sentenceStringBuilder = new StringBuilder();

        /*for (SentenceElement sentenceElement : sentenceElements) {
            sentenceStringBuilder.append(sentenceElement.toString()).append(' ');
        }*/

        for (int i = 0; i < sentenceElements.length - 1; i++) {
            sentenceStringBuilder.append(sentenceElements[i].toString()).append(' ');
        }
        sentenceStringBuilder.append(sentenceElements[sentenceElements.length - 1].toString());

        /*StringBuilder sentenceStringBuilderAlternative = new StringBuilder(sentenceElements[0].toString());
        for (int i = 1; i < sentenceElements.length; i++) {
            if (sentenceElements[i] instanceof Word) {
                sentenceStringBuilderAlternative.append(' ');
            }
            sentenceStringBuilderAlternative.append(sentenceElements[i].toString());
        }*/

        return sentenceStringBuilder.toString();
    }

    public void swapFirstAndLastWords() {
        final Word firstWord = sentenceElements[0].getWord();
        sentenceElements[0].setWord(sentenceElements[sentenceElements.length - 1].getWord());
        sentenceElements[sentenceElements.length - 1].setWord(firstWord);
    }
}
