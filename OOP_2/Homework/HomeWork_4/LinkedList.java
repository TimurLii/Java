package OOP_2.Homework.HomeWork_4;

public interface LinkedList<T> {
    static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    void addLast(T t);
    void addFirst(T t);

    int getSize();
    T getElementByIndex(int counter);
    String toString();


}
