package com.my.decorator;

public class ThreeCheesePizza {

    public String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
    public double cost = 0.5;

    public void setDescription(String newDescription){
        description = newDescription;
    }

    public String getDescription()
    {
        return description;
    }

    public void setCost(double newCost)
    {
        cost = newCost;
    }

    public double getCost()
    {
        return cost;
    }

}
