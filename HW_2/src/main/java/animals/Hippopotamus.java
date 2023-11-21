package animals;

public class Hippopotamus extends Herbivore implements Voice {
    private String voice = "ahhaahha";
    public Hippopotamus() {
        super(8);
    }
    public String voice(){
        return voice;
    }
}