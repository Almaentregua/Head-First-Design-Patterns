package ar.com.martinjm;

import ar.com.martinjm.domain.Duck;
import ar.com.martinjm.domain.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
