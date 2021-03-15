package ІП_90._00_Алещенко_Олексій_Вадимович.interestingTask;

import java.util.function.Function;

public class Main3 {
    public static void main(String[] args) {
        A a = new A(0);
        System.out.println(a.call());
        a = a.map();
        System.out.println(a.call());
    }
    static class A {
        private int a;
        private Function<A, Integer> fn = (obj) -> obj.a;
        public int call() {
            return fn.apply(this);
        }
        public A(int a) {
            this.a = a;
        }
        public A(int a, Function<A, Integer> fn) {
            this.a = a;
            this.fn = fn;
        }
        public A map() {
            return new A(a + 1, (obj) -> obj.a);
        }
    }
}

