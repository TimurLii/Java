package Exception_3.Sem.Sem_3.Task4;

public class MyArraySizeException extends IllegalArgumentException{
    public MyArraySizeException() {
        super("Array size is not supported");
    }
}
