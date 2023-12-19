package Baza_1.L_Sem.Sem2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class program_sem_2 {
    public static void main(String[] args) {
//        System.out.println(task_1(20, '+', '-'));
        task_2("aaasdaasdsdsdsdaaddaasdww");
//        System.out.println(task_3("123321"));
//        System.out.println(wordRepiat(10,"TEST "));
//        task_4(wordRepiat(10,"KAKA "));
//        task_5(wordRepiat(10,"Тру-ля-ля "));
    }



    //    Текст задачи:
//    Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N, которая состоит из чередующихся
//    символов c1 и c2, начиная с c1.
    static String task_1(int num, char c1, char c2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num / 2; i++) {
            stringBuilder.append(c1).append(c2);
        }
        return stringBuilder.toString();
    }

    static void task_2(String str) {
        //    ****Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
//            🔑 **Ответ:** результат - a4b3c1d2 для примера
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                stringBuilder.append(chars[i - 1]).append(count + 1);
                count = 0;
            }else {
                count ++;
            }
        }
        stringBuilder.append(chars[chars.length-1]).append(count+1);
        System.out.println(stringBuilder);
    }
//    Текст задачи:
//    Напишите метод, который принимает на вход строку (String)
//    и определяет является ли строка палиндромом (возвращает boolean значение).
    static boolean task_3(String str){
//        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(str);
        String newstr = stringBuilder.reverse().toString();
        return str.equals(newstr);
    }
//    Текст задачи:
//    Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который
//    запишет эту строку в простой текстовый файл, обработайте исключения.
    static void task_4(String str){
        try (FileWriter writer = new FileWriter("text.txt", true)){
//            FileWriter writer = new FileWriter("text.txt");
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static String wordRepiat(int num, String str){
        return str.repeat(num);
    }
    static void task_5(String str){
        Logger logger = Logger.getAnonymousLogger();
        try {
            FileHandler fh = new FileHandler("log.txt", true);
            logger.addHandler(fh);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fh.setFormatter(simpleFormatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileWriter writers = new FileWriter("/sdf/sdf/text_1.txt", true)) {
            writers.write(str);
            writers.flush();
        } catch (IOException e) {
            logger.log(Level.WARNING,e.getMessage());

        }

    }
}


