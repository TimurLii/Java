package HomeWork.Homewor_2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Task_2 {
    public static void main(String[] args) {
        int[] arr = {9, 4, 8, 3, 1};
        sort(arr);
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            writeLog(arr);
        }
    }

    public static void writeLog(int[] arr) {
        try {
            FileWriter fileWriter = new FileWriter("log.txt", true);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String formattedDate = now.format(formatter);
            String logEntry = formattedDate + " " + java.util.Arrays.toString(arr) + "\n";
            fileWriter.write(logEntry);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



