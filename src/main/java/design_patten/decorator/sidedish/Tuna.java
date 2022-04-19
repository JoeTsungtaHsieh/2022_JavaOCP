package design_patten.decorator.sidedish;

import design_patten.decorator.Food;

public class Tuna extends Sidedish{
    
    public Tuna(Food food) {
        super(food);
        name = "鮪魚";
        price = 25;
    }
    
}
