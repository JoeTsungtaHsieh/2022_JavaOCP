
package design_patten.decorator.sidedish;

import design_patten.decorator.Food;

public class Egg extends Sidedish{
    
    public Egg(Food food) {
        super(food);
        name = "雞蛋";
        price = 30;
    }
    
}
