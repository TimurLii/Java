
package OOP_2.Homework.HomeWork_4;

public class MyLinkedList<T> implements LinkedList<T> {
    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    private static class Node<E> {
        E item;

        MyLinkedList.Node<E> next;

        MyLinkedList.Node<E> prev;

        Node(MyLinkedList.Node<E> prev, E element, MyLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    ", prev=" + prev +
                    '}';
        }
    }

    private MyLinkedList.Node<T> head;


    @Override
    public void addLast(T t) {
        MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(null, t, null);
        if (this.head == null) {
            this.head = newNode;
        } else {
            MyLinkedList.Node<T> current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;

    }

    @Override
    public void addFirst(T t) {
        MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(null, t, null);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
        size++;

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T getElementByIndex(int counter) {
        MyLinkedList.Node<T> current = this.head;
        for (int i = 0; i < counter; i++) {
            current = current.next;
        }
        return current.item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyLinkedList.Node<T> current = this.head;
        while (current != null) {
            sb.append(current.item + " ");
            current = current.next;
        }
        return sb.toString();
    }
}
