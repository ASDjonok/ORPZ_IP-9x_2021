package ІП_90._00_Алещенко_Олексій_Вадимович.test;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.myMethod();

        C c = new C();
        c.myDefaultMethod();
//        c.myStaticMethod();
        System.out.println(c.myField);
    }
}
