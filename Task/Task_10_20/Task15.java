package Task.Task_10_20;

public class Task15 {
    public static void main(String[] args) {
//        int num = 123;
//        System.out.println(addDigits(num));


    }

    public static int addDigits(int num) {
        if (num < 10) return num;
        String[] arr = String.valueOf(num).split("");
        int sum = 0;
        for (String s : arr) {
            sum += Integer.valueOf(s);
        }
        return addDigits(sum);
    }
}
