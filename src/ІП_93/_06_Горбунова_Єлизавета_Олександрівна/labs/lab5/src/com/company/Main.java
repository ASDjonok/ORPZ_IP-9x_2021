package com.company;

public class Main {

    public static void main(String[] args) {
        Queue queue = new QueueToPassportTable();
        queue.add(new Person("Lucifer", "666"));
        queue.add(new Person("Maria", "356"));
        queue.add(new Person("Nestor", "1000"));
        queue.add(null);
        queue.add(new Person("Platon", "000"));
        queue.add(new Person("Somebody Else", "12345"));
        queue.deleteFromQueue(2);
        Iterator iterator = queue.createIterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person != null) {
                System.out.println(person.name + "'s passport ID is " + person.getPassport());
            }
            else System.out.println("no person in this place");
        }
        iterator.toEnd();
        while (iterator.hasPrev()) {
            Person person = iterator.prev();
            if (person != null) {
                System.out.println(person.name + "'s passport ID is " + person.getPassport());
            }
            else System.out.println("no person in this place");
        }
    }
}
