package ar.com.martinjm.domain.behavior;

import ar.com.martinjm.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

