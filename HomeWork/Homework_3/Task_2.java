package HomeWork.Homework_3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class Task_2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        removeEvenNumbers(arr);
    }

    public static void removeEvenNumbers(Integer[] arr) {
// метод №1

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (arr[i] % 2 == 0) {
                list.remove(arr[i]);
            }
        }
        System.out.println(list);



//        метод №2
//
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) % 2 == 0) {
                ints.remove(i);
                i--;
            }
        }
        System.out.println(ints);

//          метод №3
//
        List<Integer> numbers = new ArrayList<>(Arrays.asList(arr));
        numbers.removeIf(s -> (s % 2 == 0));
        numbers.forEach(s -> System.out.print(s + " "));

    }
}

//    Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел,
//    удаляла бы из него четные числа и выводила список без четных чисел.
//    Напишите свой код в методе removeEvenNumbers класса Answer.
//    Метод removeEvenNumbers принимает на вход один параметр:
//    Integer[] arr - список целых чисел

