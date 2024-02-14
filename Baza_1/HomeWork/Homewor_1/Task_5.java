package Baza_1.HomeWork.Homewor_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println(getSolution("1.txt"));
        System.out.println(getResult(getSolution("1.txt")));

    }

    public static String getSolution(String str) {
        try (BufferedReader reader = new BufferedReader(new FileReader(str))) {
            return String.format("Given the equation: %s", reader.readLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getResult(String str) {
        String[] result = str.split(" ");
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals("?")) {
                result[i] = "1" ;
                int sum = Integer.parseInt(result[result.length - 1]);
                int num1 = Integer.parseInt(result[i]);
                int num2 = Integer.parseInt(result[2]);
                if(num1+ num2!= sum){
                    num1++;
                }else{
                    result[0] = String.valueOf(num1);
                }
            }
        }
        return String.format("Result: %s + %s = %s", result[0] , result[2] , result[result.length -1]);

    }
}
