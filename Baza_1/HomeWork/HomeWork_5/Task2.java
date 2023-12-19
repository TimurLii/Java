package Baza_1.HomeWork.HomeWork_5;

import java.util.HashMap;

import static javax.swing.UIManager.get;

public class Task2 {
    public static HashMap<String, Integer> names = new HashMap<>();

    public static void main(String[] args) {
//Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу,
//которая принимает на вход пять имен пользователей (или использует имена по умолчанию,
//если аргументы не предоставлены) и подсчитывает, сколько раз каждое имя встречается.
//Программа должна использовать HashMap для хранения имен и их количества вхождений.
//По завершении, программа выводит результат в виде пар "имя - количество".
        add("Anton");
        add("Anton");
        add("Anton");
        add("Anton");
        add("Ivan");
        add("Ivan");
        add("Ivan");

        System.out.println(names);
        showNamesOccurrences();
    }

    public static void add(String str) {
//        int count = 1;
        if (names.containsKey(str)) {
//            count++;
            names.put(str, names.get(str) + 1);
        }else{
//            count++;
            names.put(str, 1);
        }

    }
    public static void showNamesOccurrences() {
        System.out.println(names);

    }
}


