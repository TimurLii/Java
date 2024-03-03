package Baza_1.L_Sem.Sem5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = getArray();
        System.out.println(getUnicaleNumber(getArray()));
    }
    public static int[] getArray(){
        Random rand = new Random(0);
        int[] array = new int[1000];
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(0,24);
        }
        return array;
    }
    public static double getUnicaleNumber(int[] array){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length;i++) {
            set.add(array[i]);
        }

        return (double)(set.size() * 100) /array.length;
    }
}
