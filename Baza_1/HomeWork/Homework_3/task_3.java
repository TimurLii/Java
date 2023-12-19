package Baza_1.HomeWork.Homework_3;

import java.util.Arrays;
import java.util.ArrayList;

public class task_3 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        analyzeNumbers(arr);
//        Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
//        Сортирует его по возрастанию и выводит на экран
//        Находит минимальное значение в списке и выводит на экран - Minimum is {число}
//        Находит максимальное значение в списке и выводит на экран - Maximum is {число}
//        Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
//Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers
// принимает на вход один параметр:
//        Integer[] arr - список целых чисел


    }

    public static void analyzeNumbers(Integer[] arr) {
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

//        метод №1

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int min = arr[0];
//        int max = arr[0];
//        int sum = 0;
//        for(int num : arr){
//            if (num < min) min = num;
//            if (num > max) max = num;
//            sum +=num;
//
//        }
//        System.out.println("Minimum is " + min);
//        System.out.println("Maximum is " + max);
//        System.out.println("Average is = "+  sum/arr.length);

//        метод №2
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
        ints.sort(Integer::compareTo);
        System.out.println(ints);
        System.out.println("Minimum is " + ints.get(0));
        System.out.println("Maximum is " + ints.get(ints.size()-1));

        int sum = 0;
        for(int i : ints){
            sum += i;
        }
        System.out.println("Average is = " + sum / ints.size());
    }
}
