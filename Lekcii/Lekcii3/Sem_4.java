package Lekcii.Lekcii3;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


public class Sem_4 {
    public static void main(String[] args) {
//        LinkedList<Integer> nums = new LinkedList<>();
//        nums.add(10);
//        nums.add(101);
//        nums.add(1011);
//        System.out.println(nums);

        Queue<Integer> nums = new LinkedList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        int item = nums.remove();
        System.out.println(item);


    }
}
