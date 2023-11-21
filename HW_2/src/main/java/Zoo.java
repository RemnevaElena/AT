import animals.*;
import food.Grass;
import food.Meat;
import worker.Worker;

import java.util.stream.IntStream;

public class Zoo {
    public static void main(String[] args) {
        Worker john = new Worker();

        Duck duck = new Duck();
        Dugong dugong = new Dugong();
        Fish fish = new Fish();
        Hippopotamus hippopotamus = new Hippopotamus();
        Jackal jackal = new Jackal();
        Musang musang = new Musang();

        Grass heather = new Grass("Вереск", 2);
        Grass thistle = new Grass("Чертополох", 1);
        Grass moss = new Grass("Мох", 1);

        Meat pork = new Meat("Свинина", 7);
        Meat mutton = new Meat("Баранина", 8);
        Meat chicken = new Meat("Кура", 4);

        Swim[] prud = new Swim[3];
        prud[0] = duck;
        prud[1] = fish;
        prud[2] = dugong;

        IntStream.range(0, prud.length).forEach(i -> prud[i].swim());

        System.out.println("\n");

        //Кормим животных тем, что они употребляют обычно
        john.feed(duck, heather);
        john.feed(dugong, moss);
        john.feed(fish, pork);
        john.feed(hippopotamus, thistle);
        john.feed(jackal, mutton);
        john.feed(musang, chicken);

        System.out.println("\n");

        //Кормим животных непривычной для них пищей
        john.feed(duck, pork);
        john.feed(dugong, chicken);
        john.feed(fish,  thistle);
        john.feed(hippopotamus, mutton);
        john.feed(jackal, moss);
        john.feed(musang, heather);

        //Издаем звуки
        john.getVoice(hippopotamus);
        john.getVoice(duck);
        john.getVoice(jackal);
        john.getVoice(musang);

        //Завставляем немых издавать звуки
        //john.getVoice(dugong);
        //john.getVoice(fish);

    }
}
