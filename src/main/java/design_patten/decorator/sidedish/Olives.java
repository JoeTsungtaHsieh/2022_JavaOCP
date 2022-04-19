
package design_patten.decorator.sidedish;

import design_patten.decorator.Food;

public class Olives extends Sidedish{
    
    public Olives(Food food) {
        super(food);
        name = "橄欖";
        price = 7;
    }
    
}
