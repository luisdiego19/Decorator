package com.my.decorator;

public class TomatoSauce extends ToppingDecorator{

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);
    }
    
    @Override
    public String getDescription()
    {
        return tempPizza.getDescription() + ", tomato sauce";
    }

    @Override
    public double getCost()
    {
        return tempPizza.getCost() + .35;
    }


}
