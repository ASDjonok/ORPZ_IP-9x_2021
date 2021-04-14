package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Interpreter;

import java.util.HashMap;

public class Context {
    private HashMap<String, String> var;
    Context (){
        var = new HashMap<>();
    }
    public void setString(String name, String text) {
        if(var.containsKey(name)) var.replace(name, text);
        else var.put(name, text);
    }
    public String getString(String vars) {
        return var.get(vars);
    }
}
