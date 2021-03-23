package ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.strategies;

import ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers.Sortable;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Sortable[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].isBiggerThan(array[j + 1])) {
                    Sortable temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
