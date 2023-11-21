public class program_lekciy_1 {
    public static void main(String[] args) {

        lib.sayHi();


        System.err.println("Hellddo,word");

        String s = "sdf";
        System.out.println(s);

        float f = 123.123f;
        System.out.println(f);

        double d = 123.123;
        System.out.println(d);

        char ch = 123;
        System.out.println(ch);

        boolean g = true && false;
        System.out.println(g);
        String q = "qweqwe";
        System.out.println(q.length());

        int a = 123;
        System.out.println(a++);
        System.out.println(++a);

        int r = 5;
        r = ++r + r++;
        System.out.println(r);

        int[] arr = new int[10];
        System.out.println(arr.length);
        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr.length);
        System.out.println(arr[3]);

//        int[] array[] = new int[3][5];
//        for (int[] line : arr) {
//            for (int item : line) {
//                System.out.printf("%d", item);
//
//            }
//            System.out.println();
//        }
//        int[][] arr1 = new int[4][5];
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.printf("%d ", arr1[i][j]);
//            }
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        iScanner.close();
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        int x = iScanner.nextInt();
//        System.out.printf("double a: ");
//        double y = iScanner.nextDouble();
//        System.out.printf("%d + %f = %f", x, y, x + y);
//        iScanner.close();


//        int value = 200;
//        int count = 0;
//
//        while ( value != 0){
//            value /=10;
//            count++;
//        }
//        System.out.println("Количетсво делений " + count);

        int value = 123;
        int count = 0;

        do  {
            value /= 10;
            count ++;
        } while (value != 0);
        System.out.println("Количетсво делениё равно   " + count);


    }
    }
