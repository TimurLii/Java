package Task.Task_10_20;

public class Task16 {
    public static void main(String[] args) {

        System.out.println(canWinNim(12));

    }

    public static boolean canWinNim(int n) {
        return (n % 4 !=0);
    }
}
