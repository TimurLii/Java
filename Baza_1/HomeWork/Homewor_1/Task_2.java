package Baza_1.HomeWork.Homewor_1;
//Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
//
//        Напишите свой код в методе printPrimeNums класса Answer.
public class Task_2 {
    public static void main(String[] args) {

        int number = 1000;
        int counter = 0;
        System.out.printf("Простые числа в диапозоне от 1 до %d:\n", number);
        for (int i = 2; i <= number; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) counter++;
            }
            if (counter == 1) {
                System.out.println(i);
            }
            counter = 0;
        }
    }
}

//        int num = 1000;
//        for (int i = 2; i < num; i++) {
//            if (prostoe(i)) System.out.println(i);
//        }
//    }
//    public static boolean prostoe(int num){
//        if (num<=1) return false;
//        else if(num <=3) return true;
//        else if(num % 2 ==0 || num % 3 ==0) return false;
//        int n= 5;
//        while(n * n <= num ){
//            if ( num % n == 0 || num %(n + 2) == 0) return false;
//            n = n+6;
//        }
//        return true;
//    }
//}


