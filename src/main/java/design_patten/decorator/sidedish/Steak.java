package design_patten.decorator.sidedish;

import design_patten.decorator.Food;

public class Steak extends Sidedish{
    
    public Steak(Food food) {
        super(food);
        name = "牛排";
        price = 100;
    }
    
}
