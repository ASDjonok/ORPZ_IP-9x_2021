package ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers;

import ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.Sort;

import java.util.ArrayList;

public abstract class Container {
    public Sort sortingStrategy = (obj) -> { };

    abstract void add(Object value);
    abstract void remove(Object value);
    abstract ArrayList<?> sort();
    void sort(ArrayList<?> objects) {
        sortingStrategy.sort(objects);
    }
}
