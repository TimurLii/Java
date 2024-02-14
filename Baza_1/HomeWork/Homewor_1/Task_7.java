package Baza_1.HomeWork.Homewor_1;
//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
public class Task_7 {
    public static void main(String[] args) {
        String str = "asdfdsa";
        System.out.println(pal(str));


    }
    public static boolean pal(String str) {
//        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        return str.equals(reverse);
    }
}
