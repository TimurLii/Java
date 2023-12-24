package Baza_1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Switch {
    static Map<Character, BinaryOperator<Double>> map = new HashMap<>();

    public static void fillMap() {
        map.put('*', (a, b) -> a * b);
        map.put('+', (a, b) -> a + b);
        map.put('-', (a, b) -> a - b);
        map.put('/', (a, b) -> a / b);
    }

    public static void main(String[] args) {
        fillMap();
        System.out.println(switchCase('+', 5, 4));
        System.out.println(switchToMap('*', 3.0, 3.0));

    }

    public static double switchCase(char op, int a, int b) {
        double result = 0;
        switch (op) {
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
            default:
//                return 0;
                break;
        }
        return result;
    }

    public static double switchToMap(char op, double a,  double b) {
        return map.get(op).apply(a, b);
    }

}
