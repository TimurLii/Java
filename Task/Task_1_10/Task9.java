package Task.Task_1_10;

public class Task9 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(climbStairs(n));


    }

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
