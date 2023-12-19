package youtube.baza;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;



//        int x = 4;
//        int y = 5;
////        int[] array = new int[2];
////        array[0] = x;
////        array[1] = y;
//
////        int[] array = new int[]{x,y};
//
//        int[] array = {x,y};
//        System.out.println(Arrays.toString(array));
//        System.out.println(array[0]);


//        int [] arr = {1,2,3};
//        int[] arr1 = new int[3];
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
//        arr[0] = 5;
//        arr1[0] = 7;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));


//        Практическая задача.
//        ответить на вопрос "Столица Катара" и записать в массив
//        char[] answer = {'Д','o','x','a'};
//        answer[0] = "Д";
//        answer[1] = "о";
//        answer[2] = "х";
//        answer[3] = "а";
//        System.out.println(answer);

        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 195, 193};
        int[][] multyArray = {group1, group2};
        upperFor:
        for (int[] array : multyArray) {
            for (int number : array) {
                if (number == 178) {
//                    System.out.println("Нашли вора " + number);
                    break upperFor;
                }
//                else System.out.println("Вора нет ");
            }

        }
    }
}

