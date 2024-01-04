package Task.Task_1_10;

public class Task4 {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if( haystack.contains(needle)){
            return 0;
        }
        return -1;
    }
}
