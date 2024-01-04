package Task.Task_1_10;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 11, 15, 7 , 5,4};
        int target = 9;
        System.out.println(twoSum(nums, target));

    }

    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int k = 0;
        while (k < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                k++;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result.add(i);
                        result.add(j);
                    }
                }
            }
        }
        return result;
    }
}
