package system;

import mperevalov.winter.annotations.Bean;

@Bean
public class A {
    private B b;


    public A(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }
}

