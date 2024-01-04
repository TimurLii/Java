package Task.Task_1_10;

public class Task7 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        System.out.println(addBinary(a, b));

    }

    public static String addBinary(String a, String b) {
//        return Integer.toBinaryString(Integer.parseInt(a, 2) +
//                Integer.parseInt(b, 2));
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = Integer.parseInt(Integer.toBinaryString(num1 + num2));

        return String.valueOf(sum);
    }
}
