package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab3.proxy.src.com.company;

import java.util.HashMap;

public class Proxy implements  ServiceInterface{
    private Service service = new Service();
    HashMap<String,String> hash = new HashMap<String,String>();
    public String getInfo(String string) {
        if (this.hash.containsKey(string)) {
            System.out.println("Info returned from hash");
            return this.hash.get(string);
        } else {
            String info = this.service.getInfo(string);
            this.hash.put(string, info);
            return info;
        }
    }
}
