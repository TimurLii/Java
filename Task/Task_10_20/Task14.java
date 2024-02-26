package Task.Task_10_20;


import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        String s = "kaak";
        String t = "kaka";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnag(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        StringBuilder arrs = new StringBuilder(s);
        StringBuilder arrt = new StringBuilder(t);
        int k = 0;
        while (arrs.length()-1  !=k) {
            for (int i = 0; i < arrs.length(); i++) {
                for (int j = 0; j < arrs.length(); j++) {
                    if (arrs.charAt(i) == arrt.charAt(j)) {
                        arrt.deleteCharAt(j);
                        arrs.deleteCharAt(i);
                    }
                }
            }
            k++;
        }
        return arrt.isEmpty();

    }
    public static boolean isAnag(String s,String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
