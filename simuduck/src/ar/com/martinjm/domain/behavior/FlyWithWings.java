package ar.com.martinjm.domain.behavior;

import ar.com.martinjm.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
