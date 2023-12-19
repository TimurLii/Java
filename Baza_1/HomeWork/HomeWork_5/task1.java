package Baza_1.HomeWork.HomeWork_5;

import java.util.ArrayList;
import java.util.HashMap;

public class task1 {
    public static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public static void main(String[] args) {

        add("Anton", 132456);
        add("Anton", 13234456);
        add("Anton", 132451236);
        add("Jon", 132451236);
        add("Lip", 132451236);
        add("Lip", 5236);
        add("Debi", 132451236);
        add("Iyn", 132);
        add("Iyn", 136);
        add("Carl", 132451236);
//        System.out.println(phoneBook);
        System.out.println( getPhoneBook());
//        System.out.println(find("Mama"));
//        Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:
//
//        add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
//                Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
//        Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.
//
//                find(String name): Поиск номеров телефона по имени в телефонной книге.
//        Если запись с именем name существует, возвращает список номеров телефона для этой записи.
//        Если запись с именем name не существует, возвращает пустой список.
//
//        getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.
//        HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    }

    static void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> list = phoneBook.get(name);
            list.add(phoneNum);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phoneNum);
            phoneBook.put(name, list);
        }

    }

    public static ArrayList<Integer> find(String name) {
        ArrayList<Integer> array = new ArrayList<>();
        if (phoneBook.containsKey(name)) {
            array = phoneBook.get(name);
            return array;
        } else return array;
//        System.out.println();
    }


    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        HashMap<String, ArrayList<Integer>> list = new HashMap<>();
        for (var item : phoneBook.entrySet()) {
            list.put(item.getKey(), item.getValue());
        }
//        list.putAll(phoneBook);
        return list;

    }
}



