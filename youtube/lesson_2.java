package youtube;

import java.util.Arrays;

public class lesson_2 {
    public static void main(String[] args) {
        var countApples = 2;
        System.out.println(countApples);
////      математические операции
        int x = 10;
        int y = 5;

        int sum = x + y;
        System.out.println(sum);

        int diff = x-y;
        System.out.println(diff);

        int multiply = x * y;
        System.out.println(multiply);

        int devide = x / y;
        System.out.println(devide);

        int ext = x * x;
        System.out.println(ext);

        x++;
        System.out.println(x);

        int modulo = 4 % 2;
        System.out.println(modulo);

        double rost = 1.74;
        double ves = 63.3;
        double indexmass = ves / (rost * rost);
        System.out.println(indexmass);


        int money = 100;
        int bread = 65;
        int moneyAfterShopping = money - bread;
        int childMoney = moneyAfterShopping >= 50 ? 10 : 5;
        moneyAfterShopping -= moneyAfterShopping >= 50 ? 10 : 5;

        System.out.println(childMoney);
        System.out.println(moneyAfterShopping);


        int number = 1;
        switch (number) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 ->System.out.println("Среда");
            default -> System.out.println(" Данного дня не существует ");

        }
//Практическое задание.

        boolean engine = true;
        boolean trans = true;
        boolean wheel1 = true;
        boolean wheel2 = true;
        boolean wheel3 = true;
        boolean wheel4 = false;
        int count_wheels = 0;
        count_wheels += wheel1 ? 1 : 0;
        count_wheels += wheel2 ? 1 : 0;
        count_wheels += wheel3 ? 1 : 0;
        count_wheels += wheel4 ? 1 : 0;

        if (engine && trans && (count_wheels >= 3)) {
            System.out.println("Машина готова к эксплуатации");
        }
        else System.out.println("Машина сломана");


    }
}
