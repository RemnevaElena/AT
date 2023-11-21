package animals;

import food.Food;

//import food.Grass;

public abstract class Animal {
    protected int satiety;

    protected Animal (int satiety) {
        this.satiety = satiety;
    }
    public int getSatiety() {
        return satiety;
    }
    public abstract void eat(Food food);
}

