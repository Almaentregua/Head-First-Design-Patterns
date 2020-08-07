package ar.com.martinjm.domain;

import ar.com.martinjm.domain.behavior.FlyNoWay;
import ar.com.martinjm.domain.behavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model Duck");
    }
}
