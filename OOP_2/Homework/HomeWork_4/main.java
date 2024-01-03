package OOP_2.Homework.HomeWork_4;

public class main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(5);
        System.out.println(list);
        System.out.println(list.getElementByIndex(3));


    }
}
