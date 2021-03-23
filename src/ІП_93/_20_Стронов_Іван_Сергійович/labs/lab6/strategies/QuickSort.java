package ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.strategies;

import ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers.Sortable;

import java.util.Arrays;

public class QuickSort implements SortingStrategy {
    @Override
    public void sort(Sortable<?>[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(Sortable[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Sortable opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (!array[i].isBiggerThan(opora) && i < middle) {
                i++;
            }

            while (array[j].isBiggerThan(opora) && j > middle) {
                j--;
            }

            if (i <= j) {
                Sortable temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
}
