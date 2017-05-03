package com.my.controller;

import com.my.decorator.Pizza;
import com.my.decorator.PizzaMaker;
import com.my.decorator.PlainPizza;
import com.my.decorator.TomatoSauce;
import com.my.decorator.ToppingDecorator;

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

    public void runTestMethod()
    {       
        try{
            ((TomatoSauce)pizza).tomatoSauceTestMethod();
        }catch(ClassCastException ex)
        {
            if(!(pizza instanceof PlainPizza))           
                runTestMethod(((ToppingDecorator)pizza).getTempPizza());
            else 
                System.out.println("Not a tomato sauce");
        }
    }        
    
    private void runTestMethod(Pizza pizza)
    {
        if(pizza instanceof TomatoSauce)        
            ((TomatoSauce)pizza).tomatoSauceTestMethod();
        else {  
            if(!(pizza instanceof PlainPizza) && 
               !(((ToppingDecorator)pizza).getTempPizza() instanceof PlainPizza))            
                runTestMethod((ToppingDecorator)((ToppingDecorator)pizza).getTempPizza());   
            else
                System.out.println("Not a tomato sauce");       
        }
    }    
}
