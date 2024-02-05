package Exception_3.Sem.Sem_3;

import java.io.IOException;

/**
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 * внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 * можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 * при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 * При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable {
    int n = 0;
    boolean closed = false;

    public void add() throws IOException {
        if (closed) throw new IOException("Resource is closed");
        n++;
    }

    @Override
    public void close() throws Exception {
        if (!closed) closed = true;

    }

    public int getN() {
        return n;
    }
}

class main {
    public static void main(String[] args) throws Exception {

        try(Counter counter = new Counter()){
            System.out.println(counter.getN());
            counter.add();
            System.out.println(counter.getN());
            counter.add();
        }

//        System.out.println(counter.getN());
//        counter.add();
//        System.out.println(counter.getN());
//        counter.close();
//        counter.add();
    }
}