package Baza_1.HomeWork.HomeWork_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Task_6 {
    public static void main(String[] args) {
        String str = "()";
        Map<String, String> map = new HashMap<String, String>();
        map.put("(", ")");
        map.put("{", "}");
        map.put("[", "]");
        map.put("<", ">");
        System.out.println(equals(str));


    }

    public static boolean equals(String str) {
        char[] result = str.toCharArray();
        int count = 1;
// Map<Character, Integer> bracks = new HashMap<>();
        Map<Character, Character> mapping = new HashMap<>();
        Deque<Character> res = new ArrayDeque<>();
        mapping.put('{', '}');
        mapping.put('[', ']');
        mapping.put('(', ')');
        mapping.put('<', '>');

        for (char element : result) {

            if (mapping.containsKey(element)) {
                res.push(element);
            } else if (mapping.containsValue(element)) {
                if (res.isEmpty()) {
                    return false;
                }
                res.remove();
            }

        }
        return true;
    }

}
