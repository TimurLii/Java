package Baza_1.L_Sem.Sem3;

import java.util.ArrayList;

public class Lekciy3 {
    public static void main(String[] args) {
//        Object num = 1; GetType(num);
//        num = 1.2;GetType(num);
//        num = " qwe"; GetType(num);
//        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList list = new ArrayList();
        list.add(2.1);

        for (Object o: list){
            System.out.println(o);
        }

    }
    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }
}
