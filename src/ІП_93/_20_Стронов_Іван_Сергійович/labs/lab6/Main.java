package ІП_93._20_Стронов_Іван_Сергійович.labs.lab6;

import ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers.MyInt;
import ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers.MyString;
import ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers.SortingContainer;
import ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.strategies.BubbleSort;
import ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.strategies.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var sortingContainer = new SortingContainer();
        MyString[] strings = { new MyString("c"), new MyString("a"), new MyString("b") };
        MyInt[] ints = { new MyInt(3), new MyInt(1), new MyInt(2) };

        sortingContainer.sortingStrategy = new BubbleSort();
        sortingContainer.objectsToSort = ints;
        System.out.println(Arrays.toString(sortingContainer.sort()));

        sortingContainer.sortingStrategy = new QuickSort();
        sortingContainer.objectsToSort = strings;
        System.out.println(Arrays.toString(sortingContainer.sort()));
    }
}
