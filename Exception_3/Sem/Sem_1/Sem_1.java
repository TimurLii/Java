package Exception_3.Sem.Sem_1;

public class Sem_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int min = 10;
        System.out.println(getArrLen(arr, min));

    }

    public static int getArrLen(int[] arr, int min) {
//Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум.
//Если длина массива меньше некоторого заданного минимума, метод возвращает - 1, в качестве кода
//ошибки, иначе - длину массива.
        if (arr.length < min) return -1;
        return arr.length;


    }
}
