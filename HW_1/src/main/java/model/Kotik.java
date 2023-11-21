package model;

public class Kotik {
    private int satiety;
    private int weight;
    private String meow;
    private String name;
    private int prettiness;
    private static int KotikCount = 0;
    public Kotik() {
        KotikCount++;
    }

    public static int getKotikCount() {
        return KotikCount;
    }
    public Kotik (int satiety, String meow, int weight, String name) {
        this();
        this.satiety = satiety;
        this.meow = meow;
        this.weight = weight;
        this.name = name;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.meow = meow;
        this.weight = weight;
        this.name = name;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getMeow() {
        return meow;
    }

    public String getName() {
        return name;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getWeight() {
        return weight;
    }

    public boolean play() {
        if (satiety >= 2) {
            System.out.println("I`m tired");
            satiety -= 2;
            return true;
        }
        //System.out.println("Feed me please!");
        return false;
    }

    private boolean sleep() {
        if (satiety >= 1) {
            System.out.println("I've slept enough");
            satiety -= 1;
            return true;
        }
       // System.out.println("Feed me please!");
        return false;
    }

    private boolean chaseMouse() {
        if (satiety >= 3) {
            System.out.println("The mouse target is defeated");
            satiety -= 3;
            return true;
        }
        //System.out.println("Feed me please!");
        return false;
    }

    private boolean chewWires() {
        if (satiety >= 5) {
            System.out.println("Wires successfully destroyed");
            satiety -= 5;
            return true;
        }
        //System.out.println("Feed me please!");
        return false;
    }

   /* public void eat() {
        System.out.println("Delicious, too bad it's not enough");
        satiety = +15;
        System.out.println(satiety);
    }*/

    public void eat(int countOfSatiety) {
        System.out.println("Delicious, too bad it's not enough");
        satiety += countOfSatiety;
    }

    public void eat(int countOfSatiety, String typeOfFood) {
        System.out.println("Delicious, too bad it's not enough");
        satiety += countOfSatiety;
    }

    public void eat () {
        eat(5, "salmon ceviche");
    }


    public void liveAnotherDay() {
        for (int i = 1; i < 25; i++) {
            int num = (int) (Math.random() * 5 + 1);
            //System.out.println(i + ". ");
            switch (num) {
                case 1:
                    if (play()) break;
                    else {
                        eat();
                        break;
                    }
                case 2:
                    if (sleep()) break;
                    else {
                        eat();
                        break;
                    }
                case 3:
                    if (chaseMouse()) break;
                    else {
                        eat();
                        break;
                    }
                case 4:
                    if (chewWires()) break;
                    else {
                        eat();
                        break;
                    }
                case 5:
                    eat();
                    break;
            }
        }
    }
}
