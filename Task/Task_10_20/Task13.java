package Task.Task_10_20;

public class Task13 {
    public static void main(String[] args) {
        int n =11;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        if (n == 1 || n == 7 ) return true;
        if(n < 10) return false;
        String num = String.valueOf(n);

        int sum = 0;
        for (int i = 0; i < num.length() ; i++) {
            System.out.println(Character.getNumericValue(num.charAt(i)));
            sum += Character.getNumericValue(num.charAt(i)) * Character.getNumericValue(num.charAt(i));
        }
        return isHappy(sum);
    }
}
