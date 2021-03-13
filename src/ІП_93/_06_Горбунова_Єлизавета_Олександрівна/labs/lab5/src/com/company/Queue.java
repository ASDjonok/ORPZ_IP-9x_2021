package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class Queue {
    protected List<Person> queue = new ArrayList<>();
    private String name;
    abstract public void add(Person person);
    abstract public Iterator createIterator();
    abstract public void deleteFromQueue(int i);
}
