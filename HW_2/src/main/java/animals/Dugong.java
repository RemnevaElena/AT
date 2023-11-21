package animals;

public class Dugong extends Herbivore implements Swim {
    public Dugong() {
        super(9);
    }
    public void swim() {
        System.out.println("Дюгонь совершает поступательные движения под водой, перебирая своими плавниками");
    }
}