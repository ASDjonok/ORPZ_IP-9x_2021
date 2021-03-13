package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab4.flyweight.src.com.company;

import java.util.HashMap;

public class GlifFactory {
    private HashMap<String, Glif> cache = new HashMap<>();
    public Glif getGlif(String form) {
        if (this.cache.containsKey(form)) return this.cache.get(form);
        else {
            this.cache.put(form, new Glif(form));
            return this.cache.get(form);
        }
    }
    public int getNumberOfGlives() {
        return this.cache.size();
    }
}
