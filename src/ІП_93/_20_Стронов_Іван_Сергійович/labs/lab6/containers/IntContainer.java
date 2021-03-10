package ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers;

import java.util.ArrayList;

public class IntContainer extends Container {
    ArrayList<Integer> objects = new ArrayList<>();

    @Override
    public void add(Object value) {
        objects.add((Integer) value);
    }
    @Override
    public void remove(Object value) {
        objects.remove(value);
    }
    @Override
    public ArrayList<Integer> sort() {
        sort(objects);
        return objects;
    }

    @Override
    public String toString() {
        return "IntContainer{" +
                "objects=" + objects.toString() +
                '}';
    }
}
