import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kitiket = new Kotik(10, "meeoow", 30, "kitiket");
        Kotik pedegree = new Kotik();
        pedegree.setKotik(20, "pedegree", 40, "meeooooow");

        kitiket.liveAnotherDay();
        System.out.println(kitiket.getName());
        System.out.println(kitiket.getWeight());
        if (kitiket.getMeow().equals(pedegree.getMeow())) System.out.println("Cats are meowing the same");
        else {
            System.out.println("Cats are meowing different");
        }
        System.out.println(Kotik.getKotikCount());
    }
}
