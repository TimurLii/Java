package OOP_2.Seminar.Sem_4;

import java.util.List;

public class some <T>{
    public List<T> type;

    public some(List<T> type) {
        this.type = type;
    }
    public T add(T arg ) {
        type.add(arg);
        return arg;
    }
}
