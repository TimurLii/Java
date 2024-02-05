package Exception_3.Lec;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Lec_2 {
    public static void main(String[] args) {
        double[] x = new double[]{4, 6, 8, 10};
        double[] c = new double[]{1, 2, 0, 4};
        System.out.println(Arrays.toString(divide(x, c)));
        try {
            FileReader file = new FileReader("Twst");
        } catch (RuntimeException |  FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static double[] divide(double[] x, double[] y) {
        double[] result = new double[x.length];
        if (x.length != y.length) {
            return new double[]{0};
        }
        for (int i = 0; i < x.length; i++) {
            if (y[i] == 0) {
                try {
                    result[i] = (x[i] / y[i]);
//                } catch (Exception e) {
//                    System.out.println("На ноль делить нельзя " + (x[i] / y[i]));
                } finally {
                    System.out.printf("На ноль делить нельзя: %s / %s \n",  x[i], y[i] );
                    result[i ] = 0;
                }


            }
            result[i] = (x[i] / y[i]);
        }
        return result;
    }

}
