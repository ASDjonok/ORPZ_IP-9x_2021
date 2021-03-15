package ІП_90._00_Алещенко_Олексій_Вадимович.interestingTask;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        A a = new A(0);
        System.out.println(a.fn.get());
        a = a.map();
        System.out.println(a.fn.get());
    }

    static class A {
        int a;
        public Supplier<Integer> fn = () -> a;

        public A(int a) {
            this.a = a;
        }

        public A(int a, Supplier<Integer> fn) {
            this.a = a;
            this.fn = fn;
        }

        public A map() {
            return new A(a + 1, () -> a);
        }
    }
}

