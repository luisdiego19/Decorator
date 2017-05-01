package com.my.controller;

import com.my.decorator.Pizza;
import com.my.decorator.PizzaMaker;
import com.my.decorator.PlainPizza;

public class Controller {
    
    private Pizza pizza;

    public Controller() { }

    public Pizza getPizza() {
        return pizza;
    }
    
    public boolean crearPizza()
    {
        pizza = new PlainPizza(); 
        return true;
    }
    
    public boolean agregarSalsaTomate()
    {       
        if(pizza != null)
        {
            PizzaMaker maker = new PizzaMaker();
            pizza = maker.addTomatoSauce(pizza);        
            return true;  
        }
        return false;             
    }
    
    public boolean agregarMozzarella()
    {       
        if(pizza != null)
        {
            PizzaMaker maker = new PizzaMaker();
            pizza = maker.addMozzarella(pizza);
            return true;  
        }
        return false;        
    }            
}
