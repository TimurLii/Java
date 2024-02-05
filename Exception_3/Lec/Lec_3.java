package Exception_3.Lec;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lec_3 {
    public static void main(String[] args) {
        try(FileReader test = new FileReader("C:\\Users\\moty2\\OneDrive\\Рабочий стол\\1.txt");
        FileWriter writer = new FileWriter("test")){
            while(test.ready()){
                writer.write(test.read());
            }
        }catch (RuntimeException | IOException e){
            System.out.println("Catch exception" + e.getClass().getSimpleName());
        }
        System.out.println("Copy successful");
    }
}
