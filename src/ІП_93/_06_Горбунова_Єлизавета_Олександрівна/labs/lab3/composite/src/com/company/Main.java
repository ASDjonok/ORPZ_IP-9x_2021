package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab3.composite.src.com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Composite composite1 = new Composite("Composite1");
        Composite composite2 = new Composite("Composite2");
        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");
        Leaf leaf3 = new Leaf("Leaf3");
        composite1.add(composite2);
        composite1.add(leaf1);
        composite2.add(leaf2);
        composite2.add(leaf3);

        List<Component> array1 = composite1.getChild();
        System.out.println("Objects in composite1: ");
        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.get(i).name);
        }

        System.out.println();
        List<Component> array2 = composite2.getChild();
        System.out.println("Objects in composite2: ");
        for (int i = 0; i < array2.size(); i++) {
            System.out.println(array2.get(i).name);
        }

    }
}
