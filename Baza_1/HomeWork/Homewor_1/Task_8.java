package Baza_1.HomeWork.Homewor_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//        Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
public class Task_8 {
    static Logger logger = Log.log("Task_8");
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getFileName(".")));
        fileWrite(".");

    }

    public static String[] getFileName(String path) {
        File dir = new File(path);
        if (dir.isFile()) {
            throw new RuntimeException("Not file");
        } else {
            return dir.list();
        }
    }
    public static void fileWrite(String path){
        try (  FileWriter fw = new FileWriter("Task_8.txt")){
            String[] data = getFileName(path);
            for(String line : data){
                fw.append(line).append("\n");
                fw.flush();
            }
            throw new IOException("File write");
        } catch (IOException e) {
            logger.log(Level.INFO,"Error");
        }

    }
//    private static String[] getFileNamesInDir(String path) {
//        File dir = new File(path);
//        String[] result = new String[0];
//        File[] files;
//        if (dir.isDirectory()) {
//            files = dir.listFiles();
//            if (files != null) {
//                result = new String[files.length];
//                for (int i = 0; i < files.length; i++) {
//                    File file = files[i];
//                    String name = file.getName();
//                    if (file.isFile()) {
//                        System.out.println("\tFile - " + name);
//                    } else {
//                        System.out.println("Directory - " + name);
//                    }
//                    result[i] = name;
//                }
//            }
//        } else {
//            System.out.println(dir.getName() + " не является папкой");
//        }
//        return result;
//    }
}
