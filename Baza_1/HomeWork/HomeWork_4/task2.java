package Baza_1.HomeWork.HomeWork_4;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(10);
        queue.add(15);
        queue.add(5);
        queue.add(5);
        queue.add(queue.size(),99);
//        System.out.println(queue.remove(0));
//        System.out.println(queue.getFirst());
//        System.out.println(queue);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
//    В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
//    enqueue() - помещает элемент в конец очереди
//    dequeue() - возвращает первый элемент из очереди и удаляет его
//    first() - возвращает первый элемент из очереди, не удаляя
//    getElements() - возвращает все элементы в очереди
}
