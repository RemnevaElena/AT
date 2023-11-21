package animals;

public class Fish extends Carnivorous implements Swim {
    public Fish() {
        super(1);
    }
    public void swim() {
        System.out.println("Как бы я жила под водой без своей средней линии");
    }
}