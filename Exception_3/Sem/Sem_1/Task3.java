package Exception_3.Sem.Sem_1;

public class Task3 {
    public static void main(String[] args) {
//        Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива.При этом накладываем на метод 2 ограничения:
//        метод может работать только с квадратными массивами(кол - во строк = кол - ву столбцов), и в каждой ячейке может
//        лежать только значение 0 или 1. Если нарушается одно из условий, метод должен бросить RuntimeException с
//        сообщением об ошибке.
        int[][] ints = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 1, 1,  1}
        };
        System.out.println(getSum(ints));
    }

    public static int getSum(int[][] matrix) {
        int rows = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != matrix.length) throw new RuntimeException("Массив не квадратный!");
            for (int j = 0; j < col; j++) {
                int current = matrix[i][j];
                if (current != 1 && current != 0) {
                    continue;
//                    throw new RuntimeException("В массиве должно быть 0 или 1.");
                }
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
