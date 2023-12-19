package OOP_2.Seminar.Sem_1.Animal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Cat  barsik = new Cat("Barsik", LocalDate.of(2023,12,11),
                new ArrayList<>(),"Hcumka","Biss", 4);

        Animal eagle = new Eagle("Don" ,LocalDate.of(2021,9,12),
                new ArrayList<>(),"Hcumka", "Anton" );

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
//        System.out.println(barsik.getLegsCount());
//        System.out.println(barsik);
//        System.out.println(eagle);

//        for( var any: animals){
//            System.out.println(any);
//        }
//        eagle.wakeUp();
//        eagle.wakeUp(14 );
        barsik.lifeСycle();

    }
}
