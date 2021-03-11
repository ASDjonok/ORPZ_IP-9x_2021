package ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers;

import java.util.ArrayList;

public class StringContainer extends Container {
    ArrayList<String> objects = new ArrayList<>();

    @Override
    public void add(Object value) {
        objects.add((String) value);
    }
    @Override
    public void remove(Object value) {
        objects.remove(value);
    }
    @Override
    public ArrayList<String> sort() {
        sort(objects);
        return objects;
    }

    @Override
    public String toString() {
        return "StringContainer{" +
                "objects=" + objects.toString() +
                '}';
    }
}
