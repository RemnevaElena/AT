package animals;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal {

    protected Carnivorous(int satiety) {
        super(satiety);
    }

    public void eat(Food food) {
        if (!(food instanceof Meat)) System.out.println(getClass().getSimpleName() + ": Такое я не употребляю)");
        else {
            satiety += food.getNutritionalValue();
            System.out.println(getClass().getSimpleName() + ": Я попитался и моя сытость равна " + satiety);
        }
    }
}