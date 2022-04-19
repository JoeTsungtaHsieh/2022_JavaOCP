package design_patten.decorator.sidedish;

import design_patten.decorator.Food;

public class Onion extends Sidedish{
    
    public Onion(Food food) {
        super(food);
        name = "洋蔥";
        price = 8;
    }
    
}
