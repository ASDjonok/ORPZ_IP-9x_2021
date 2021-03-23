package ІП_93._20_Стронов_Іван_Сергійович.labs.lab6.containers;

public class MyString implements Sortable<MyString> {
    public String value = "";
    public MyString(String value) {
        this.value = value;
    }
    @Override
    public boolean isBiggerThan(MyString another) {
        return value.compareTo(another.value) > 0;
    }
    @Override
    public String toString() {
        return value;
    }
}
