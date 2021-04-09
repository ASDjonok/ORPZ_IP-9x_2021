package com.company;

import java.util.List;

public class PeopleInQueueToGetPassportIterator implements Iterator{
    private int index = 0;
    private List<Person> queue;
    PeopleInQueueToGetPassportIterator(List<Person> queue) {
        this.queue = queue;
    }
    @Override
    public Person next() {
        Person person = this.queue.get(index);
        while (person == null && index < this.queue.size() - 1) {
            person = this.queue.get(++index);
        }
        index++;
        return person;
    }

    @Override
    public  boolean hasNext(){
        return index < queue.size();
    }

    @Override
    public Person prev() {
        Person person = this.queue.get(index);
        while (person == null && index > 0) {
            person = this.queue.get(--index);
        }
        index--;
        return person;
    }

    @Override
    public  boolean hasPrev(){
        return index >= 0;
    }

    @Override
    public void toStart() {
        index = 0;
    }

    @Override
    public void toEnd() {
        index = this.queue.size() - 1;
    }

}
