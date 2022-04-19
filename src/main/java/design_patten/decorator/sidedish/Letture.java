
package design_patten.decorator.sidedish;

import design_patten.decorator.Food;


public class Letture extends Sidedish{
    
    public Letture(Food food) {
        super(food);
        name = "生菜";
        price = 15;
    }
    
}
