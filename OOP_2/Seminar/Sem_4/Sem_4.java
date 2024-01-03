package OOP_2.Seminar.Sem_4;

import java.util.*;

public class Sem_4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        some<String> some = new some<>(list);
        some.add("a");
        some.add("234");
        System.out.println(some.type);



    }
    static void printCollection(Collection<?> c){
        Iterator i = c.iterator();
        for( int d = 0; d < c.size(); d++){
            System.out.println(i.next());
        }
    }

}
