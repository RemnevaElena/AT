package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Herbivore extends Animal {
    protected Herbivore(int satiety) {
        super(satiety);
    }
    public void eat(Food food) {
        if (!(food instanceof Grass)) System.out.println(getClass().getSimpleName() + ": Такое я не употребляю)");
        else {
            satiety += food.getNutritionalValue();
            System.out.println(getClass().getSimpleName() + ": Я попитался и моя сытость равна " + satiety);
        }
    }
}