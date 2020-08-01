package ar.com.martinjm.domain;

import ar.com.martinjm.interfaces.FlyBehavior;
import ar.com.martinjm.interfaces.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public Duck(){
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All duck float, even Decoys!");
    }
}
