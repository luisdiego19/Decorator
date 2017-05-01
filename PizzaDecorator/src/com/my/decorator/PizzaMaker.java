package com.my.decorator;

public class PizzaMaker {


    public ToppingDecorator addTomatoSauce(Pizza pizza)
    {
        TomatoSauce tomatoSauce = new TomatoSauce(pizza);
        return tomatoSauce;
    }

    public ToppingDecorator addMozzarella(Pizza pizza)
    {
        Mozzarella mozzarella = new Mozzarella(pizza);
        return mozzarella;
    }

}
