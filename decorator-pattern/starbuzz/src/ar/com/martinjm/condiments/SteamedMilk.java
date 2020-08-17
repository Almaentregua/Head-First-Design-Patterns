package ar.com.martinjm.condiments;

import ar.com.martinjm.beverages.Beverage;
import ar.com.martinjm.beverages.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {
    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}