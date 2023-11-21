package animals;

public class Musang extends Carnivorous implements Run, Voice {
    private String voice =  "oueee";
    private int speed = 50;

    public Musang() {
        super(7);
    }
    public String getVoice() {
        return voice;
    }
    public int getSpeed() {
        return speed;
    }
    public void run() {
        System.out.println("Шакал бежит со скоростью " + speed);
        satiety--;
    }
    public String voice() {
        return voice;
    }
}
