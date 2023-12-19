package Baza_1.HomeWork.HomeWork_4;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>();
        arr.add("1");
        arr.add("One");
        arr.add("2");
        arr.add("Two");
//        System.out.println(arr);


        System.out.println(revert(arr));

    }

    public static LinkedList<String> revert(LinkedList<String> arr) {
//Пусть дан LinkedList с несколькими элементами.
//Напишите класс LLTasks с методом revert, который принимал бы на вход LinkedList и возвращает “перевернутый” список.
        LinkedList<String> newArr = new LinkedList<>();
//        for (int i = 0; i <arr.size() ; i++) {
//            String temp = arr.get(i);
//            newArr.addFirst(temp);
//
//        }
        for(String item:arr){
            newArr.addFirst(item);
        }


        return newArr;
    }
}
