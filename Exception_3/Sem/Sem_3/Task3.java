package Exception_3.Sem.Sem_3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) {
//        System.out.println(divide(2, 0));
        try {
            fileNotFound("asd");
        } catch (NonExistedFileException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int divide(int a, int b) throws DivideByZeroException{
        if( b == 0) throw new DivideByZeroException();
        return a/b;
    }
    public static void fileNotFound(String path) throws NonExistedFileException {
        try {
            FileReader fw = new   FileReader(path);
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException();
        }
    }
}
