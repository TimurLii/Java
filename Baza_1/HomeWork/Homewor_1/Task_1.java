package Baza_1.HomeWork.Homewor_1;
//Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//        Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.

public class Task_1 {


    public static void main(String[] args) {
        int n = 4;
        int res = 0;
        int i = 0;
        while(i<=n){
            res +=i;
            i++;
        }
        System.out.println(res);
    }

}