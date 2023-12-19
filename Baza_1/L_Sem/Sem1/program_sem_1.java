package Baza_1.L_Sem.Sem1;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class program_sem_1 {
    public static void main(String[] args) {
//        task_0();
//        task_1();
//        task_2();
//        task_4("Добро пожаловать на курс по Java");
        System.out.println(task_5(2,2));
//        System.out.println("What is yor name?");
//        Scanner scaner = new Scanner(System.in);
//        String name = scaner.nextLine();
//        System.out.printf("Hello " + name);

//    В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//    "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//            "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    }
    static void task_0() {
        System.out.println(" Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LocalTime localtime = LocalTime.now();
        int hour = localtime.getHour();
//        System.out.print(hour);

        if (hour >= 5 && hour < 12) System.out.println("Доброе утро, " + name + "!");
        else if (hour < 18) System.out.println("Добрый день, " + name + "!");
        else if (hour < 23) System.out.println(" Добрый вечер " + name + " !");
        else System.out.println(" Добрый вечер " + name + " !");

    }

    //    Текст задачи:
//    Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1
    static void task_1() {
        int[] array = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) count++;
            else {
                if (maxOnes < count)
                    maxOnes = count;
                count = 0;
            }
        }
        if (maxOnes < count) maxOnes = count;
        System.out.println(maxOnes);
    }
    static void task_2(){
//        Текст задачи:
//        Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
        int[] array = {3,2,2,3};
        int val = 3;
        int[] arr = new int[array.length];
        Arrays.fill(arr , val);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != val) {
                arr[count++] = array[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void task_4(String str){
    //    Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        for (int i = arr.length -1; i >= 0; i--) {
            System.out.println(arr[i] + " ");

        }


    }
    static double task_5(int a, int b){
//        Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//        Пример 1: а = 3, b = 2, ответ: 9
//        Пример 2: а = 2, b = -2, ответ: 0.25
//        Пример 3: а = 3, b = 0, ответ: 1
        double result = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            result *= a;
        }
        return b >0 ? result : 1/ result;
    }
}

