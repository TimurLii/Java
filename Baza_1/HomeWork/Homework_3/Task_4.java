package Baza_1.HomeWork.Homework_3;

import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 6, 3, 7, 0, 6, 3, 1, 7, 0, 5, 2, 0, 5};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    public static int[] mergeSort(int[] array) {
        if(array.length<2) return array;

        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - left.length];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, left.length, right, 0, right.length);

        mergeSort(left);
        mergeSort(right);

        return merge(array, left, right);
    }

    public static int[] merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
        return array;
    }


}