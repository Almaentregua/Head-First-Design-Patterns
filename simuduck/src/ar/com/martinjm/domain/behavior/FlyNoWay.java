package ar.com.martinjm.domain.behavior;

import ar.com.martinjm.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

