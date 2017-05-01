package com.my.decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);       
    }

    @Override
    public String getDescription()
    {
        return tempPizza.getDescription() + ", mozzarella";
    }

    @Override
    public double getCost()
    {
        return tempPizza.getCost() + .50;
    }

}
