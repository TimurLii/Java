package Exception_3.Sem.Sem_1;

public class HW {
    public static void main(String[] args) {
//        divisionByZero();
//        numberFormatException();
//        int[] a = new int[]{4, 5, 6, 3};
//        int[] b = new int[]{1, 2, 3};
        int[] a = new int[]{12, 8, 16};
        int[] b = new int[]{4, 2, 4};
//        System.out.println(Arrays.toString(subArrays(a, b)));
//        System.out.println(Arrays.toString(divArrays(a,b)));
        int resul = 0;
        for( int  i = 0; i < 1000; i+= 10){
            resul+=i;

        }
        System.out.println(resul);
    }

    public static void divisionByZero() {
        int result = 12 / 0;
    }

    public static void numberFormatException() {
        String s = "A";
        int i = Integer.parseInt(s);
    }

    public static int[] subArrays(int[] a, int[] b) {
        int[] c = new int[a.length];
        if (a.length != b.length) {
            return new int[]{0};
        } else {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];

            }
        }
        return c;
    }

    public static int[] divArrays(int[] a, int[] b) {
        int[] c = new int[a.length];
        if (a.length != b.length) {
            return new int[]{0};
//            throw new RuntimeException();
        } else {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] / b[i];

            }
        }
        return c;
    }

}


