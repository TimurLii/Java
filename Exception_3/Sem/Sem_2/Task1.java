package Exception_3.Sem.Sem_2;

import java.util.Scanner;

/**
 * Изучите данный код. Все ли с ним хорошо? Если нет,
 * скорректируйте код, попробуйте обосновать свое решение.
 */
public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(
                "Укажите индекс элемента массива, " +
                        "в который хотите записать значение 1");
        int index = 0;
        if (scanner.hasNextInt()) index = scanner.nextInt();
        else {
            System.err.println(("Вы ввели не число!"));
            return;
        }
        try {
            arr[index] = 1;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Указан индекс за пределами массива");
        }
//        catch (InputMismatchException e){
//            System.out.println("Вы ввели не число! ");
//        }
    }
}
