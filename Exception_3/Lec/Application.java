package Exception_3.Lec;

import java.io.File;

public class Application {
    public static void main(String[] args) {
//        System.out.println(getFileSize(new File("E:\\1.IPHONE\\Даша")));
        System.out.println(devide(12, 0));
//        a();

    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] arr = new int[]{191, 890, 638, 108, 426, 576, 189};
        System.out.println(arr[10]);
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            System.out.println("File does not exist");
            return -1L;
        }
        return file.length();
    }

    public static int devide(int a1, int a2) {
        if (a2 == 0) throw new RuntimeException("Devide by zero not permited");
        return a1 / a2;
    }

}
