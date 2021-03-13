package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab4.flyweight.src.com.company;

import java.util.ArrayList;
import java.util.List;

public class StringObj {
    private GlifFactory glifFactory = new GlifFactory();
    private List<Letter> letters = new ArrayList<>();
    public void addLetter(String form, int x, int y) {
        if (form.length() > 1 || x < 0 || y < 0) {
            System.out.println("Input is wrong");
            return;
        }
        glifFactory.getGlif(form);
        letters.add(new Letter(x, y, form));
    }
    public void drawString() {
        String str = "";
        for (int i = 0; i < letters.size(); i++) {
            Letter letter = letters.get(i);
            String glif = letter.getForm();
            Glif form = glifFactory.getGlif(glif);
            str = str + form.readGlif();
            System.out.println("glif: " + form.readGlif() + ", x: " + letter.getX() + ", y: " + letter.getY());
        }
        System.out.println("String: " + str);
        System.out.println("Number of flyweight objects: " + glifFactory.getNumberOfGlives());
        System.out.println("Number of all objects in string: " + letters.size());
    }
}
