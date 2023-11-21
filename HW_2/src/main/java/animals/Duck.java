package animals;

public class Duck extends Herbivore implements Swim, Fly, Voice {
    public Duck() {
        super(3);
    }
    private String voice = "krya";

    public String getVoice() {
        return voice;
    }
    public void swim() {
        System.out.println("Плыву, но не промокаю");
    }
    public void fly() {
        System.out.println("Поспеть за косяком -  the main problem");
    }
    public String voice() {
        return voice;
    }
}