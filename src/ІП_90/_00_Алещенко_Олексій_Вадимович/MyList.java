package ІП_90._00_Алещенко_Олексій_Вадимович;

import ІП_90._00_Алещенко_Олексій_Вадимович.lab6.Toy;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList implements List<Toy> {
    private final static int INITIAL_ELEMENTS_QUANTITY = 15;
    private final static int INCREASE_PERCENTAGE = 30;

    private Toy[] toys/* = new Toy[INITIAL_ELEMENTS_QUANTITY]*/;

//    todo
    public MyList() {
        toys = new Toy[INITIAL_ELEMENTS_QUANTITY];
    }

    //    todo
    public MyList(Toy toy) {
        this();
        add(toy);
    }

    //    todo
    public MyList(Collection<?> objects) {
//        todo check type of collections elements
        toys = new Toy[objects.size()];
        addAll(objects);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

//    todo
    @Override
    public Iterator iterator() {
        return null;
    }

//    todo
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

//    todo
    @Override
    public boolean add(Toy toy) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Toy get(int index) {
        return null;
    }

    @Override
    public Toy set(int index, Toy toy) {
        return null;
    }

//    todo
    @Override
    public void add(int index, Toy toy) {

    }

    @Override
    public Toy remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

//    todo **
    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

//    todo
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
