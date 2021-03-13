package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab3.composite.src.com.company;

import java.util.List;

public class Leaf extends Component{
    public Leaf(String name) {
        this.name = name;
    }
    @Override
    public void add(Component component) {
        System.out.println("Add in leaf does not work");
    }

    @Override
    public void remove(int index) {
        System.out.println("Remove in leaf does not work");
    }

    public void getChild() {
        System.out.println("Get child in leaf does not work");
    }
}
