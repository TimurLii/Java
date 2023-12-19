package Baza_1.L_Sem.Sem4;

import java.util.*;

public class programm_sem4 {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        Integer[] arr = {1, 2, 3, 4};
//        task4(arr);
        MyStack stack = new MyStack();
        stack.push(12);
        stack.push(11);
        stack.push(1);
        stack.push(14);
        stack.push(4);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.empty());

    }

    public static void task1() {
//        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
        long start = System.currentTimeMillis();//
        List<Integer> list = new ArrayList<>();  // create ArrayList
        List<Integer> list1 = new LinkedList<>();// create LinkedList
        for (int i = 0; i < 100000; i++) list.add(0, i);
        long middle = System.currentTimeMillis(); // переменная подсчёта времени Ё

        for (int i = 0; i < 100000; i++) list1.add(0, i);
        long finish = System.currentTimeMillis();

        System.out.println(middle - start);
        System.out.println(finish - middle);

    }

    public static void task2() {
// Реализовать консольное приложение, которое:
//1. Принимает от пользователя строку вида
//text~num
//1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("Пока!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
        }
    }

    public static void task3() {
//Реализовать консольное приложение, которое:
//1. Принимает от пользователя и “запоминает” строки.
//2. Если введено print, выводит строки так,
// чтобы последняя введенная была первой в списке, а первая - последней.
//3. Если введено revert, удаляет предыдущую введенную строку из памяти.
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            switch (line) {
                case "print":
                    ListIterator iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("Пока!");
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    break;

                default:
                    list.add(line);
                    break;
            }
        }
    }

    public static void task4(Integer[] arr) {
//        Написать метод, который принмает массив и помещает их в stack и выводит в консоль содержимое stack
//        Написать метод, который принмает массив и помещает их в очередь и выводит в консоль содержимое очередь
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(arr));
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("++++++++++++");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

}
