package ІП_93._20_Стронов_Іван_Сергійович.labs.lab6;

import ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers.IntContainer;
import ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers.StringContainer;

public class Main {
    public static void main(String[] args) {
        Sort strategy1 = obj -> obj.sort((a, b) -> a.toString().compareTo(b.toString()));
        Sort strategy2 = obj -> obj.sort((a, b) -> a.toString().length() - b.toString().length());

        StringContainer str = new StringContainer();
        str.add("bc"); str.add("abc"); str.add("c");

        IntContainer num = new IntContainer();
        num.add(100); num.add(20); num.add(3);

        str.sortingStrategy = strategy1;
        num.sortingStrategy = strategy1;
        System.out.println(str.sort());
        System.out.println(num.sort());

        str.sortingStrategy = strategy2;
        num.sortingStrategy = strategy2;
        System.out.println(str.sort());
        System.out.println(num.sort());
    }
}
