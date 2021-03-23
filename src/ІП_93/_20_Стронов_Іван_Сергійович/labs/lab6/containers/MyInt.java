package ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers;

public class MyInt implements Sortable<MyInt> {
    public int value = 0;
    public MyInt(int value) {
        this.value = value;
    }
    @Override
    public boolean isBiggerThan(MyInt another) {
        return value > another.value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
