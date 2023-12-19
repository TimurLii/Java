package Baza_1.Lekcii.Lekcii5;

import java.util.*;

public class Ex002_HashMapEntry {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();// интерфейс <обобщение первый тип ключа, второй значения >
        db.putIfAbsent(1, "один");// этот метож делает проверку, если такой ключ есть , тогда ничего не будет добавлть
        db.put(2, "два");// метод put в качестве ключа указана 2, в качестве значения указана "два"
        db.put(3, "три");
        System.out.println(db); 

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}