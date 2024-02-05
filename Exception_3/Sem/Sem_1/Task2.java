package Exception_3.Sem.Sem_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int num = 4;
        int min = 3;
        getExeption(arr, min);
//        System.out.println(getIndex(arr,num,min));
//        Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//        Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        3. если вместо массива пришел null, метод вернет -3
//        4.Напишите метод, в котором реализуйте взаимодействие с пользователем.
//                То есть, этот метод запросит искомое число у пользователя, вызовет первый,
//                обработает возвращенное значение и покажет читаемый результат пользователю.
//                Например, если вернулся -2, пользователь увидит сообщение: “Искомый элемент не найден”.
    }

    public static int getIndex(int[] array, int num, int min) {
        if (array == null) return -3;
        if (array.length < min) return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) return i;
        }
        return -2;
    }

    public static void getExeption(int[] array, int num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое число:");
        int search = scanner.nextInt();
        int index = getIndex(array, search, num);
        if (index == -3) System.out.println("Вместо массива пришел null!!");
        if (index == -2) System.out.println("Искомый элемент не найден!");
        if (index == -1) System.out.println("Массив меньше минимума! ");
        else System.out.println("index = " + index ) ;

    }
}
