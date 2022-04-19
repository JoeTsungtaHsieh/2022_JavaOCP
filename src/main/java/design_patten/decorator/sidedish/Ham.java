
package design_patten.decorator.sidedish;

import design_patten.decorator.Food;

public class Ham extends Sidedish{
    
    public Ham(Food food) {
        super(food);
        name = "火腿";
        price = 10;
    }
    
}
