package animals;

public class Jackal extends Carnivorous implements Run, Voice {


    private String voice = "ohuuu";
    private int speed = 50;
    public Jackal() {
        super(5);
    }
    public int getSpeed() {
        return speed;
    }
    public String getVoice() {
        return voice;
    }
    public String voice() {
        return voice;
    }
    public void run() {
        System.out.println("Шакал бежит со скоростью " + speed);
    }
}