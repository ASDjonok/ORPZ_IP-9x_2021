package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab3.proxy.src.com.company;

public class Service implements ServiceInterface{
    public String getInfo(String string) {
        System.out.println("Info returned from Service");
        return string;
    }
}
