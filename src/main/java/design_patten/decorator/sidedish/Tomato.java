package design_patten.decorator.sidedish;

import design_patten.decorator.Food;

public class Tomato extends Sidedish{
    
    public Tomato(Food food) {
        super(food);
        name = "番茄";
        price = 12;
    }
    
}
