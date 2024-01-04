package Task.Task_1_10;

public class Task6 {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {
        String[] list = s.split(" ");
        return list[list.length - 1].length();
    }
}
