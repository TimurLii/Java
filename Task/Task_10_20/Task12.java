package Task.Task_10_20;

public class Task12 {
    public static void main(String[] args) {
        String s = "1233211";
        System.out.print(isPalindrome(s));

    }

    public static boolean isPalindrome(String text) {
        // Convert the string to lowercase and remove all non-alphanumeric characters
        String processedText = text.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : processedText.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        processedText = sb.toString();

        // Check if the string reads the same forwards and backwards using a for loop
        for (int i = 0, j = processedText.length() - 1; i < j; i++, j--) {
            if (processedText.charAt(i) != processedText.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
