package HomeWork.Homewor_1;

//Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) над двумя числами и возвращать результат.
//В классе должен быть метод calculate, который принимает оператор и значения аргументов и возвращает результат вычислений.
//При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'

public class Task_3 {
    public static void main(String[] args) {
        double a = 5;
        double b = 2;
        char op = '/';
        double sum =0;
        if(op =='+') sum = a+b;
        else if(op == '-') sum = a - b;
        else if(op == '*') sum = a * b;
        else if(op == '/') sum = a /b;
        System.out.println(sum);
    }
}



























//        Scanner scanner = new Scanner(System.in);
//        int top = scanner.nextInt();
//        for (int i = 2; i < top; i++) {
//            if (checkSimple(i))
//                System.out.println(i);
//        }
//    }
//
//    public static boolean checkSimple(int i) {
//        if (i <= 1)
//            return false;
//        else if (i <= 3)
//            return true;
//        else if (i % 2 == 0 || i % 3 == 0)
//            return false;
//        int n = 5;
//        while (n * n <= i) {
//            if (i % n == 0 || i % (n + 2) == 0)
//                return false;
//            n = n + 6;
//        }
//        return true;
//    }
//}
