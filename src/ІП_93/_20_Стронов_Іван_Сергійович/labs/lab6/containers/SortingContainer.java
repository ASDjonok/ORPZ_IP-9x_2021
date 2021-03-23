package ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers;

import ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.strategies.SortingStrategy;

public class SortingContainer {
    public SortingStrategy sortingStrategy;
    public Sortable<?>[] objectsToSort;
    public Sortable<?>[] sort() {
        sortingStrategy.sort(objectsToSort);
        return objectsToSort;
    }
}
