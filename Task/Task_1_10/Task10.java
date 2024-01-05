package Task.Task_1_10;

import java.util.HashSet;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        Integer[] list = {1,1,2,2,3,4,5,6,6};
        HashSet<Integer> set = new HashSet<Integer>();
        set.addAll(List.of(list));
        System.out.println(set);
    }
}
