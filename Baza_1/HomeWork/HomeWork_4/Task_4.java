package Baza_1.HomeWork.HomeWork_4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task_4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1231, "Иванов");
        map.put(12324, "Иванов");
        map.put(121334, "Петров");
        map.put(123123, "Смирнов");
        map.put(123, "Сидоров");
        for (var item : map.entrySet()) {
            if (item.getValue().equals("Иванов")) {
//                System.out.println(item);
            }
        }
        String s1 = "paper";
        String s2 = "title";
        System.out.println(isIzomorf(s1, s2));
        System.out.println(searchLitter(s1, s2));
        System.out.println(isIsomorphic(s1, s2));
    }

    public static boolean isIzomorf(String str, String str1) {
        Map<Character,Character> map = new HashMap<>();

        if (str.length() != str1.length()) return false;
        String[] word1 = str.split("");
        String[] word2 = str1.split("");
        for (int i = 0; i < str.length(); i++) {
            char s1 = str.charAt(i);
            char s2 = str1.charAt(i);
            if (!map.containsKey(s1)) {
                if (!map.containsValue(s2)) {
                    map.put(s1, s2);
                } else {
                    return false;
                }
            } else {
                if (map.get(s1) != s2) {
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean searchLitter(String str, String str2) {
        if (str.length() != str2.length()) {
            return false;
        }
        char[] strArr = str.toCharArray();
        char[] strArr2 = str2.toCharArray();
        Map<Character, Character> result = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            if (result.get(strArr[i]) != null) {
                if (!result.get(strArr[i]).equals(strArr2[i])) {
                    return false;
                }
            } else {
                result.put(strArr[i], strArr2[i]);
            }
        }

        return true;

    }

    public static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (!map.containsKey(c1)) {
                if (!map.containsValue(c2)) {
                    map.put(c1, c2);
                } else {
                    return false;
                }
            } else {
                if (map.get(c1) != c2) {
                    return false;
                }
            }
        }

        return true;
    }
}
