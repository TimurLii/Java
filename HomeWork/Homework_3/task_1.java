package HomeWork.Homework_3;

import java.util.*;

public class task_1 {
    public static void main(String[] args) {
//        Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел
//        a и реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.


//        метод №1

        int[] a = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mergeSort(a)));


//        метод №2
        Arrays.sort(a);
        System.out.println(Arrays.toString((a)));
    }

    public static int[] mergeSort(int[] list) {
        //метод 1
//        Arrays.sort(list);
//        System.out.println(list);

        //метод 2
        if (list.length < 2) return list;
        int n = list.length;
        int mid = list.length / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = list[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = list[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {

        int l = left.length;
        int r = right.length;
        int[] newList = new int[l + r];
        int i = 0, j = 0, k = 0;
        while (i < l && j < r) {
            if (left[i] < right[i]) {
                newList[k++] = left[i++];
            } else {
                newList[k++] = right[j++];

            }
        }
        while (i < l) {
            newList[k++] = left[i++];
        }
        while (j < r) {
            newList[k++] = right[j++];
        }
        return newList;
    }
}
