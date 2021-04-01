package ІП_90._00_Алещенко_Олексій_Вадимович.test;

public interface MyInterface {
    int myField = 1;
    static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }
    default void myDefaultMethod() {
        System.out.println("myDefaultMethod");
    }
}
