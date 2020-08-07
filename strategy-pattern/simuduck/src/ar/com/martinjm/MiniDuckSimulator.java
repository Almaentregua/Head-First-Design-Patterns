package ar.com.martinjm;

import ar.com.martinjm.domain.Duck;
import ar.com.martinjm.domain.MallardDuck;
import ar.com.martinjm.domain.ModelDuck;
import ar.com.martinjm.domain.behavior.FlyRocketPower;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPower());
        modelDuck.performFly();
    }
}
