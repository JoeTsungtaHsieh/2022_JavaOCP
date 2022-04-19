package design_patten.decorator;

import design_patten.decorator.sidedish.Egg;
import design_patten.decorator.sidedish.Ham;
import design_patten.decorator.sidedish.Letture;
import design_patten.decorator.sidedish.Olives;
import design_patten.decorator.sidedish.Onion;
import design_patten.decorator.sidedish.Steak;
import design_patten.decorator.sidedish.Tomato;
import design_patten.decorator.sidedish.Tuna;

public class Subway {
    public static void main(String[] args) {
        Food food = new Bread();
        food = new Ham(food);
        food = new Letture(food);
        food = new Olives(food);
        food = new Olives(food);
        food = new Tomato(food);
        food = new Tuna(food);
        food = new Onion(food);
        food = new Onion(food);
        food = new Steak(food);
        food = new Egg(food);
        food = new Egg(food);
        food = new Egg(food);
        System.out.println("subway: ");
        System.out.println(food.getName());
        System.out.println(food.getPrice());
    }
}
