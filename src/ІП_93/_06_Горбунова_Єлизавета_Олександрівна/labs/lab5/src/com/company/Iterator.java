package com.company;

public interface Iterator {
    public Person next();
    public boolean hasNext();
    public Person prev();
    public boolean hasPrev();
    public void toStart();
    public void toEnd();
}
