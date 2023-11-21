package food;

public class Food {
    private String name;
    private  int nutritionalValue;
    public int getNutritionalValue() {
        return nutritionalValue;
    }

    protected Food (String name, int nutritionalValue) {
        this.name = name;
        this.nutritionalValue = nutritionalValue;
    }
    public String getName() {
        return name;
    }
}




