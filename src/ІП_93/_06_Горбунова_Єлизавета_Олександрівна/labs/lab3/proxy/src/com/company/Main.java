package ІП_93._06_Горбунова_Єлизавета_Олександрівна.lab4.lab3.proxy.src.com.company;

public class Main {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        String info1 = proxy.getInfo("get some info");
        System.out.println(info1);
        String info2 = proxy.getInfo("get some info");
        System.out.println(info2);
        String info3 = proxy.getInfo("get some info 3");
        System.out.println(info3);
    }
}
