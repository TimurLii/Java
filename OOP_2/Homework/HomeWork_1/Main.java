package OOP_2.Homework.HomeWork_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(2023, 12, 11),
                new ArrayList<>(), "Hcumka", "Biss", 4);

        Eagle eagle = new Eagle("Don", LocalDate.of(2021, 9, 12),
                new ArrayList<>(), "Hcumka", "Anton");
        Crocodile Dandi = new Crocodile("Dandi", LocalDate.of(2023, 11, 15)
                , new ArrayList<>(), "Hcumka", "Jon");
        Penguin penguin = new Penguin("Peny", LocalDate.of(2022, 12, 16),
                new ArrayList<>(), "Hcumka", "Arnton");


//        barsik.lifeСycle();


//        System.out.println(barsik);
//        System.out.println(eagle);
//        System.out.println(penguin);
//        System.out.println(Dandi);

        System.out.println("Dandi");
        Dandi.lifeСycle(Dandi.flying(), Dandi.swims(), Dandi.toGoing());
        System.out.println("___________________________________________");
        System.out.println("penguin");
        penguin.lifeСycle(penguin.flying(), penguin.swims(), penguin.toGoing());
        System.out.println("___________________________________________");
        System.out.println("eagle");
        eagle.lifeСycle(eagle.flying(), eagle.swims(), eagle.toGoing());
        System.out.println("___________________________________________");
        System.out.println("Barsik");
        barsik.lifeСycle(barsik.flying(), barsik.swims(), barsik.toGoing());


        //Проблемой при таком программировании является то, что в каждом классе наследнике
        // необходимо прописать свойства (умет ли животное летать, плавать,ходить).
    }
}
