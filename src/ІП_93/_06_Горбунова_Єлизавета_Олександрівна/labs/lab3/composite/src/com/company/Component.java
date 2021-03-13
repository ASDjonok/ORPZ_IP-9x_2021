package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab3.composite.src.com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

abstract public class Component {
    String name;
    List<Component> components = new ArrayList<Component>();
    abstract public void add(Component component);
    abstract public void remove(int index);
}
