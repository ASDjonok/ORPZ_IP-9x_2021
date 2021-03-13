package com.company;

import java.util.List;

public class QueueToPassportTable extends Queue{
    public void add(Person person) {
        this.queue.add(person);
    }
    @Override
    public Iterator createIterator() {
        return new PeopleInQueueToGetPassportIterator(this.queue);
    }

    @Override
    public void deleteFromQueue(int i) {
        if (i == this.queue.size() - 1) this.queue.remove(this.queue.size() - 1);
        else this.queue.set(i, null);
    }
}
