package Task.Task_1_10;

public class Task5 {
    public static void main(String[] args) {
        int[] nums = {1, 3,5,7,9,10};
        int target = 8;
        System.out.println(searchInsert(nums, target));

    }

    public static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int max=0;
        int i=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else if(nums[i]<target)
            {
                max=Math.max(max,i+1);
            }
            else if(nums[i]>target)
            {
                max=Math.min(max,i);
            }
        }
        return max;
    }
}
