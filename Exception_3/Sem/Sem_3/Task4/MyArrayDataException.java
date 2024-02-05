package Exception_3.Sem.Sem_3.Task4;

import java.util.List;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int a, int b) {
        super(String.format("In cell [%s][%s]  has invalid data ",a ,b ));
    }

    public MyArrayDataException(List<Point2D> point2DList) {
        super(String.format("In cells %s  has invalid data ",point2DList));
    }
}
