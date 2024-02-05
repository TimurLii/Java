package Exception_3.Sem.Sem_2;

import static java.lang.Float.NaN;


public class HW {
    public static void main(String[] args) throws Exception {
//        System.out.println(isFloat("w"));
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8,9};
//        int div = 2;
//        System.out.println(expr(arr, div));
//        System.out.println(expr(12, 0));
        System.out.println(expr('l'));
        expr('a');

    }

    public static float isFloat(String input) {
//        System.out.println(input);
//        Scanner scanner = new Scanner(System.in);
        try {
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            System.out.println("Your input is not a float number. Please, try again.");
            return NaN;
        }
    }

//    public static double expr(int[] intArray, int d) {
//        if (intArray.length < 9) {
//            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
//            return Double.NaN;
//        } else if (d == 0) {
//            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
//            return Double.NaN;
//        } else {
//            double catchedRes1 = (double) intArray[8] / d;
//            System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + catchedRes1);
//            return catchedRes1;
//        }
//    }

//    public static double expr(int a, int b) {
//
//        double result = 0.0; // Initialize the result
//        if (b != 0) {
//            result = (double) a / b; // Perform the division and store the result
//        }
//        printSum(a, b);
//        return result; // Return the result
//
//    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);

    }
    public static String expr(char a) throws Exception {
        if (a == ' ') {
            throw new Exception("Empty string has been input.");
        } else {
            return "Your input was - " + a;
        }
    }
    }



